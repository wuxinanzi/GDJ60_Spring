const replyAdd = document.getElementById("replyAdd");
const replyContents = document.getElementById("replyContents");
const commentListResult = document.getElementById("commentListResult");
//const pageLink = document.querySelectorAll(".page-link");


replyAdd.addEventListener("click", function(){
    let xhttp = new XMLHttpRequest();

    xhttp.open("POST","../bankBookComment/add");

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send("contents="+replyContents.value+"&bookNumber="+replyAdd.getAttribute('data-book-bookNumber'));


   xhttp.addEventListener('readystatechange', function(){
            if(this.readyState == 4 && this.status == 200){
                if(this.responseText.trim()==1){
                    alert('댓글이 잘 들어왔습니다.')
                    replyContents.innerHTML="";
                    getList();
                }else {
                    alert('댓글 등록에 실패 했습니다.')
                }
            }  
   })
})
getList();
//getList는 새로 불러 오는것

function getList(page){


    let count = 0;

    let xhttp = new XMLHttpRequest();

    xhttp.open("GET","/bankBookComment/list?bookNumber="+replyAdd.getAttribute('data-book-bookNumber')+"&page=");


    xhttp.addEventListener('readystatechange', function() {
        if(this.readyState==4 && this.status==200) {            
            commentListResult.innerHTML=this.responseText.trim();
            count++;
        }
    })
    xhttp.send();
    //0이 출력 : 비동기 방식이기 때문
    console.log("count : ",count);
}

//page
commentListResult.addEventListener("click", function(e){
        let pageLink = e.target
        if(pageLink.classList.contains("page-link")){
            pageLink.getAttribute("data-board-page");
            getList(page);
        }
        e.preventDefault();
});

commentListResult.addEventListener("click", function(e){
    let del = e.target
    if(del.classList.contains("del")){
       let xhttp = new XMLHttpRequest();
       xhttp.open("POST","../bankBookComment/delete");
       xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
       xhttp.send("num="+del.getAttribute("data-comment-num"));
       xhttp.addEventListener("readystatechange", function(){
        if(this.readyState == 4 && this.status == 200){
            let result = this.responseText.trim();
            if(result>0){
                alert('댓글이 삭제 되었습니다.');
                getList(1);
            }else{
                alert('삭제 실패');
            }
        }
    })     
    }
    e.preventDefault();
});

//UPDATE선생
commentListResult.addEventListener("click", function(parent){
    let updateButton = parent.target;
    if(updateButton.classList.contains('update')){
        //update버튼의 부모의 첫번째 형제 찾기. 내용/작성자/날짜 순인데 띄어쓰기도 형제 취급임.
        //console.log(updateButton.parentNode.previousSibling.previousSibling.previousSibling)
        let num = updateButton.getAttribute('data-comment-num')
        let contents = document.getElementById('contents'+num)
        // console.log(contents)
        // contents.innerHTML='<textarear>'+contents.innerHTML+'</textarear>' //1. textaria 덮어씌우기.

        //클릭시 readonly 지우기
        // document.querySelector('#contents'+num).firstChild.setAttribute('readonly', false)
        // document.querySelector('#contents'+num).firstChild.removeAttribute("readonly")
        contents.firstChild.removeAttribute("readonly");
        
        //클릭시 제출용 버튼 생성
        let btn = document.createElement('button')
        let attr = document.createAttribute('class')
        attr.value=('btn btn-primary')
        btn.setAttributeNode(attr);
        contents.appendChild(btn);
        attr = document.createTextNode('제출')
        btn.appendChild(attr);

        btn.addEventListener('click', function(){
            console.log(contents.firstChild.value)
            console.log(num)

            let xhttp = new XMLHttpRequest();
            xhttp.open("POST", "../bankBookComment/update")
            xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xhttp.send("num="+num+"&contents="+contents.firstChild.value);
            xhttp.addEventListener('readystatechange', function(){
                if(this.readyState==4 && this.status==200){
                    let result = this.responseText.trim();
                    if(result>0){
                        alert('수정 성공')
                        getList(1); //리로딩! //pager에서 long으로 안받고 Long으로 받음
                    }else{
                        alert('수정 실패')
                    }
                }
        
            })

        })
    }
    
    parent.preventDefault();
})


