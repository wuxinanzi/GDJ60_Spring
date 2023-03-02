//css 선택자 유형
const btn1 = document.querySelector("#btn1");          //document.getelemnetById("btn1")
const buttons = document.querySelectorAll(".buttons"); //getElementsByClassName("buttons");


//querySelector == querySelectorAll[0];

const d1 = document.querySelector("#d1 > .buttons li");

btn1.addEventListener("click",function(){
    console.log("btn1");
})


for(let b of buttons){
    b.addEventListener("click", function(){
        console.log("buttons");
    })
}