// 스크립트의 위치가 body태그 위에 있는 경우에
// 태그를 가져와서 사용해야 한다면
// 반드시 window가 load 한 다음에
// 태그 가져오기를 해야 한다.

window.onload=function(){

    // 가입 버튼 클릭 시
    // 필수 정보가 모두 입력되었는가 확인하기
    // 비밀번호와 비밀번호확인이 일치하는가
    // let id = document.getElementById("userId");
    // let pw = document.getElementById("userPw");
    // let pw2 = document.getElementById("userPwRe");
    // let name = document.getElementById("name");
    // let tel = document.getElementById("tel");

    // id.addEventListener("keyup", joinCheck);
    // pw.addEventListener("keyup", joinCheck);
    // pw2.addEventListener("keyup", joinCheck);
    // name.addEventListener("keyup", joinCheck);
    // tel.addEventListener("keyup", joinCheck);

    // 클래스명으로 태그 가져와서 이벤트 등록하기
    
    const 필수입력 = document.getElementsByClassName("essential")

    for (var input of 필수입력){
        input.addEventListener("keyup",joinCheck)
    }
    // queryselector - 자바스크립트로 태그를 가져오는 방법 (동적)
    // let id = document.querySelector("input")
    // 여러 태그 가져오려면
    // const input = document.querySelectorAll(".essential")

}

// 만약에 이름을 입력 안 했을 경우에 사용자에게
// 알려주고 싶다면 지금과 같은 방식은 어렵다(불가능은 아님)
// 지금의 방식은 누구를 입력 안 했다라고 표현하는 게 아니고
// 모두 입력했냐 안 했냐만 확인하기

function joinCheck(){
    let id = document.getElementById("userId");
    let pw = document.getElementById("userPw");
    let pw2 = document.getElementById("userPwRe");
    let name = document.getElementById("name");
    let tel = document.getElementById("tel");

    var count=0;
    if( id.value != '' ) count++;
    if(pw.value != '') count++;
    if(pw2.value != '')count++;
    if(name.value != '')count++;
    if(tel.value != '')count++;

    if(count ==5 ){// 필수 입력 모두 했다.
        if(pw.value != pw2.value){// 비밀번호와 비밀번호 확인이 다른 값
            alert("비밀번호를 다시 확인해주세요");
            pw.value=''; // 비밀번호 input 값 비우기
            pw2.value=''; // 비밀번호 확인 input 값 비우기
            return;
        }

        document.getElementById("joinBt").disabled = false;
    }else{//필수 입력 중에 하나 이상 입력 안 함
        document.getElementById("joinBt").disabled = true;
    }
}

