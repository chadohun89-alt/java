// login.js
// id가 loginBt인 버튼 태그를 클리하면 signIn.html 이동

// 1. 태그에 이벤트 발생 시 동작할 함수 연결 - 이벤트 등록이라고 한다.
//      ( addEventListener )

// id가 loginBt인 태그 가져오기 - document.getElementById()
window.onload=function(){
    let bt = document.getElementById("loginBt")
    console.log( bt ) // 개발자 도구의 콘솔(결과하면)에 출력
    // 태그(객체)를 가져왔으면 어떤 이벤트에 대해 등록할 것인가
    // .addEventListner("이벤트 명", "함수명")
    bt.addEventListener("click", 로그인페이지);
}

function 로그인페이지(){
    // signIn.html로 이동
    location.href="signIn.html"
}



// (function(){ //HTML 구조를 완벽하게 파악이 안 될 수 있다.
//     })
