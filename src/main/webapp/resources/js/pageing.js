const pl = document.getElementsByClassName("page-link");
const searchForm = document.getElementById("searchForm");
const page = document.getElementById("page");

//for
//for bf ---for(꺼낸타입명 변수명)

for(let p of pl){
    p.addEventListener("click",function(e){
        let v = p.getAttribute('date-board-page')
        page.value=v;
        searchForm.submit();
    })
}

let data='';
function setData(d){
    data=d;
}
