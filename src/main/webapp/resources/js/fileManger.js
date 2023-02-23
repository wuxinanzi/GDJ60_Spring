//FileManger.js


const fileList = document.getElementById("fileList");
const fileAdd = document.getElementById("fileAdd");


let count = 0;
let max = 1;
let param='pic';

function setParam(p){
    param=p;
}

function setMax(m){
    max=m;
}

fileAdd.addEventListener("click",function(){

    if(count>=max){
        alert("첨부파일은 최대 " +max+ "까지만 가능");
        return;
    }
    
    count++;
    //Element, Text 들을 생성
    let d = document.createElement("div");//부모 DIV
    let l = document.createElement("label");//label
    let t = document.createElement("Image");
    let I = document.createElement("input");//input


    //Element들을 조합
    d.appendChild(l);
    d.appendChild(I);
    l.appendChild(t);
    
    //attribute 생성 적용
    //div
    let attr = document.createAttribute("class");
    attr.value = 'mb-3';
    d.setAttributeNode(attr);

    //label
    attr = document.createAttribute("class");
    attr.value='from-label';
    l.setAttributeNode(attr);
    
    attr = document.createAttribute("for");
    attr.value = 'files';
    l.setAttributeNode(attr);

    //input
    attr = document.createAttribute("type");
    attr.value = "file";
    I.setAttributeNode(attr);
    
    attr = document.createAttribute("class");
    attr.value = "form-control";
    I.setAttributeNode(attr);

    attr = document.createAttribute("id");
    attr.value = "files";
    I.setAttributeNode(attr);
       
    attr = document.createAttribute("name");
    attr.value = param;
    I.setAttributeNode(attr);



    fileAdd.append(d);
    

})   
  
    





