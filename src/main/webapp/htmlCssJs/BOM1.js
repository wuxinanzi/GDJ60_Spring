const btn = document.getElementById("btn");
const btn2 = document.getElementById("btn2")
const btn3 = document.getElementById("btn3");



btn.addEventListener("click",function(){
    let c2 = window.document.getElementById("c2");
    console.log(c2.innerText);
    console.log(c2.innerHTML);
    //c2.innerText='test';
    c2.innerHTML='<img src="../resources/images/iu.jpg">';

})

let c1 = window.document.getElementById("c1");
// alert(c1);
// console.log(c1);

console.log(c1.innerText);

console.log(c1.innerHTML);
//c1.innerText='change Text';
btn2.addEventListener("click",function(){
    let c3 = window.document.getElementById("c3");
    let v = c3.title
    v = c3.getAttribute("title");
    console.log(v);

})

btn3.addEventListener("click",function(){
    let input1 = window.document.getElementById("btn3");
    console.log(input1.value);
    

})