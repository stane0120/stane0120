// 로고 클릭시 메인페이지
document.getElementById("logoimg").addEventListener("click", () => {
    window.location.href = '/vote/mainFrame.html';
  });
  
  
  // 프레임 불러오기
  document.getElementById("startPetitions").addEventListener("click",function () {
      document.getElementById("mf").innerHTML = '<iframe id="iframe" onload="iframeLoaded()" frameborder = "0" src="startPetitions/start_a_petition.html"></iframe>';
  });
  
  document.getElementById("myPetitions").addEventListener("click",function () {
    document.getElementById("mf").innerHTML = '<iframe id="iframe" onload="iframeLoaded()" frameborder = "0" src="/vote/myPetitions/myPetitions/login_mypettitions.html"></iframe>';
  });
  
  document.getElementById("browse").addEventListener("click",function () {
    document.getElementById("mf").innerHTML = '<iframe id="iframe" onload="iframeLoaded()" frameborder = "0" src="browse/browser.html"></iframe>';
  });
  
  // 프레임 크기 변동
  function iframeLoaded() {
    let frame = document.getElementById('iframe');
    let mheight = document.getElementById('mf');
    let height = frame.contentWindow.document.body.scrollHeight;
    let width = frame.contentWindow.document.body.scrollWidth;
  
    mheight.height = height + "px";
    mheight.width = width + "px";
  
    frame.height = height + 100 + "px";
    frame.width = width + 100 + "px"
  }

          // 부모 -> 자식 값을 전달
        // == 자식이 부모의 값을 가져오기

        // 부모창에 작성된 #parentInput의 값 얻어오기
        // opener == 부모창
        const category = document.getElementById("category");
        const moni = document.getElementById("moni");
        const imageInput = document.getElementById("imageInput");


        // #message에 부모로 부터 얻어온 값 출력하기
        document.querySelector("#message").innerText = category;
        document.querySelector("#message").innerText = moni;
        document.querySelector("#message").innerText = imageInput;
    
        // 부모창으로 값 전달하기
        const childInput = document.getElementById("childInput");
        const sendParent = document.getElementById("sendParent");

        // #sendParent 버튼 클릭 시
        sendParent.addEventListener("click", () => {

            // 부모창의 #result (input 태그)에
            // #childInput에 작성된 값 대입
            opener.document.getElementById("result").value
                = childInput.value;
            
            window.close(); // 현재 창 닫기
        });