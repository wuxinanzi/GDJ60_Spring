

//SELECTOR
const id = document.getElementById("id");
const idResult = document.getElementById("idResult");

const pw =document.getElementById("pw");
const pwResult = document.getElementById("pwResult");


const pwCheck = document.getElementById("pwCheck");
const pwCheckResult = document.getElementById("pwCheckResult");

const na = document.getElementById("na");
const naResult = document.getElementById("naResult");

const ph = document.getElementById("ph");
const phResult = document.getElementById("phResult");

const em = document.getElementById("em");
const emResult = document.getElementById("emResult");

const ad = document.getElementById("ad");
const adResult = document.getElementById("adResult");

const frm = document.getElementById("frm");
const btn = document.getElementById("btn");


// let idCheck = false;
// let pwLengthCheck = false;
// let pwNullChechk = false;
// let pwEqualCheck = false;
let checks = [false, false, false, false, false, false, false, false]

//ID 검증
id.addEventListener("blur", function(){
    if(id.value.length != 0){
        idResult.innerHTML="정상적인 ID";
        //idCheck = true;
        checks[0] = true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult");
    }else{
        idResult.innerHTML='ID는 필수 사항입니다.';
        checks[0] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
    }
});

//PW 검증
pw.addEventListener("keyup", function(){
    if(pw.value.length>5 && pw.value.length<13){
        pwResult.innerHTML='정상 비번'
        //pwLengthCheck = true;
        checks[1]=true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult");
    }else {
        pwResult.innerHTML='비번은 6글자 이상 12자 이하여야 합니다'
        checks[1] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
    }
})

pw.addEventListener("blur", function(){
    if(pw.value != ''){
        //pwNullChechk = true;
        checks[2] = true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult");
    }else{
        pwResult.innerHTML='pw는 필수입니다'
        checks[2] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
    }
})

pw.addEventListener("change",function(){
    checks[3] = false;
    pwCheck.value='';
    pwCheckResult.innerHTML="PW가 틀립니다";
    idResult.classList.add("blueResult");
    idResult.classList.remove("redResult");
})

//PW Equal 검증

pwCheck.addEventListener("blur",function(){
    if(pwCheck.value == pw.value){
        pwCheckResult.innerHTML="동일한 pw"
        //pwEqualCheck = ture;
        checks[3] = true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult");
    }else{
        pwCheckResult.innerHTML="PW가 틀립니다"
        checks[3] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
    }
})

//이름 검증
na.addEventListener("blur", function(){
    if(na.value.length == 0){
        console.log("비어 있음")
        naResult.innerHTML="성함은 필수 사항입니다."
        checks[4] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
        
    }else{
        naResult.innerHTML='올바른 성함입니다';
        checks[4] = true; 
        idResult.classList.add("blueResult");  
        idResult.classList.remove("redResult");
    }
});
//전화번호 검증
ph.addEventListener("blur", function(){
    if(ph.value.length == 0){
        console.log("비어 있음")
        phResult.innerHTML="전화번호는 필수 사항입니다."
        checks[5] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
        
    }else{
        phResult.innerHTML='올바른 전화번호 입니다.';
        checks[5] = true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult");
    }
});
//이메일 검증
em.addEventListener("blur", function(){
    if(em.value.length == 0){
        console.log("비어 있음")
        emResult.innerHTML="이메일은 필수 사항입니다."
        checks[6] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
    }else{
        emResult.innerHTML='올바른 이메일 입니다.';
        
        checks[6] = true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult");
        
    }
});
//주소 검증
ad.addEventListener("blur", function(){
    if(ad.value.length == 0){
        console.log("비어 있음")
        adResult.innerHTML="주소는 필수 사항입니다."
        checks[7] = false;
        idResult.classList.add("redResult");
        idResult.classList.remove("blueResult");
    }else{
        adResult.innerHTML='올바른 주소 입니다';
        checks[7] = true;
        idResult.classList.add("blueResult");
        idResult.classList.remove("redResult"); 
        
    }
});

// form 전송

btn.addEventListener("click", function(){
    //if(idCheck && pwLengthCheck && pwNullChechk && pwEqualCheck){
       if(!checks.includes(false)){
        alert("회원 가입 성공")
       //frm.submit();
    
    }else {
        alert("필수 사항을 입력하세요.")
    }
})

