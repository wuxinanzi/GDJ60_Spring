
const d1 = document.getElementById("d1");


let n = 'iu'
var old ='iu2'
//function 선언

function f1 (){
    console.log("function Test");
    console.log(n);
    var old = "winter";
}
//매개변수 선언시 let, const는 생략해야 함
function f2 (n1, n2){
    let name = 'iu'
    return n1+n2;
}

//function 호출
f1();

let result = f2(1,2)
console.log(result);
console.log(name);
// console.log(n1);
console.log("old : "+old);

//익명함수
let fun = function (){
    console.log('익명함수');
    return 1;
}


fun();

function f3(f){
    console.log("f3 : ", f,1);
} 

f3(fun())


let callbakc2 = function (){
    console.log("CallBack2")
}



//다른곳에서도 같은 함수를 사용하고 싶을때
//d1.addEventListener("click", callbakc1);
//d1.addEventListener("click", callbakc2);

//여기에서만 사용하는 함수
d1.addEventListener("click",function(){
    callback1();
    callbakc2();
});

function callBack1(){
    console.log("CallBack1");
    
}
function callback1(){
    console.log("CallBack1");
}
