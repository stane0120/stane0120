<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 프로젝트</title>

    <link rel="stylesheet" href="/resources/css/main-style.css">

    <script src="https://kit.fontawesome.com/f7459b8054.js" crossorigin="anonymous"></script>
</head>
<body>
    <main>
            
            <%-- header.jsp 추가 --%>
    <%-- 추가하는 법은 <jsp:include page="jsp파일경로"> --%>
    <jsp:include page="/WEB-INF/views/common/practice3.jsp" />

    <section class="content">
        <section class="content-1">

        <h3>로그인된 회원 정보</h3>

        ${sessionScope.loginMember}

        </section>

        <section class="content-2">

        <c:choose>
        <%-- choose 코드 내부에는 c:when, c:otherwise, jsp 주석만 작성 가능하다 --%>
        <%-- c.when, c:otherwise 내부에는 다른 코드를 작성 가능하다 --%>

        <%-- EL empty 연산자 : 비어 있거나 null 이면 true --%>
        <c:when test="${empty sessionScope.loginMember}">

        <form action="/member/login" method="POST" id="loginForm"> 
        <%-- method="POST" : 제출 되는 값이 주소에 안보임--%>
        <fieldset class="id-pw-area">
        <section>
            <input type="text" name="inputEmail" placeholder="이메일" autocomplete="off">
            <input type="password" name="inputPw" placeholder="비밀번호">
        </section>
        <section>
            <button>로그인</button>
        </section>
    </fieldset>

    <label>
        <input type="checkbox" name="saveId"> 아이디 저장
    </label>  
    
    <article>
            <a href="#">회원가입</a>
            <span>|</span>
            <a href="#">ID/PW 찾기</a>
    </article>
</form>
    </c:when>

    <%-- 로그인 되었을 때 --%>
    <c:otherwise>
    <article class="login-area">

    <a href="#">
        <img src=/resources/images/user.png id="memberProfile">
    </a>

    <div class="my-info">
    <div>
    <a href="#" id="nickname">${sessionScope.loginMember.memberNickname}</a>

    <a href="/member/logout" id="logoutBtn">로그아웃</a>
    </div>
    
    <p>${loginMember.memberEmail}<p>
    
    </div>
    </article>
    </c:otherwise>
    </c:choose>
    </section>
    </section>
    </main>


    <%-- footer jsp 추가--%>
    <jsp:include page="/WEB-INF/views/common/practice2.jsp"/>

    </body>
    </html>
