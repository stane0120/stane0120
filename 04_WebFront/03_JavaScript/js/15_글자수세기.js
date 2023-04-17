

document.getElementById("content").addEventListener("keyup", () => {
    
    document.getElementById("count").innerText = document.getElementById("content").value.length;

    if(document.getElementById("count").innerText > 100){
        document.getElementById("count").classList.add("error"); 
    } else {
        document.getElementById("count").classList.remove("error");
    }
});




/*
const count = document.getElemenyById("count");
const content = document.getElementById("content");

content.addEventListener("keyup", e => {

e.target : 이벤트가 발생한 요소 (== #content)
count.innerText = e.target.value.length;

if(e.target.value.length > 100) { // 100글자 초과 -> #count에 error 클래스 추가}
    count.classList.add("error");
} else { // 100글자 이하 -> #count에 error 클래스 제거
    count.classList.remove("error");
}
});
*/


/*
const count = document.getElemenyById("count");
const content = document.getElementById("content");

content.addEventListener("input", e => {
//input 이벤트 : 입력과 관련된 모든 행동
//                input, textarea 등 입력 가능한 요소에 값이 입력되면 인식


//e.target : 이벤트가 발생한 요소 (== #content)
count.innerText = e.target.value.length;

if(e.target.value.length > 100) { // 100글자 초과 -> #count에 error 클래스 추가}
    count.classList.add("error");
} else { // 100글자 이하 -> #count에 error 클래스 제거
    count.classList.remove("error");
}
});


// 요소.vlassList.toggle('클래스명')
// - 요소에 클래스가 없으면 추가 (true 반환)
// - 요소에 클래스가 있으면 제거 (false 반환)
*/

