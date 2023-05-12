<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <title>FAQ</title>

  
  <link rel="stylesheet" href="../css/FAQ.css">
</head>

<body>

  <header>
    <div class="logomenuicon">
      <div class="logo"><img id="logoimg" src="voteLogo2.png"></div>
      <div class="menu">
        <ul>
          <li><a id="startPetitions" href="#">Start a petition</a></li>
          <li><a id="myPetitions" href="#">My petitions</a></li>
          <li><a id="browse" href="#">Browse</a></li>
        </ul>
      </div>
      <div class="icon">
        <i class="fa-sharp fa-solid fa-magnifying-glass"></i>
        <i class="fa-sharp fa-solid fa-user"></i>
        <i class="fa-sharp fa-solid fa-bell"></i>
      </div>
    </div>
  </header>


  <main>
  <h1 id="title">질문해보세요</h1>

  <article class="search-area">

    <form action="#" method="GET"></form>
    <input type="search" name="query" id="query" autocomplete="off">
    <button id="searchBtn" class="fa-solid fa-magnifying-glass">검색</button>

  </article>

  <div class="faq-category">
  <button id="button1">청원</button>
  <button id="button1">신고</button>
  <button id="button1">개인정보</button>
  <button id="button1">전체</button>
  </div>

  <div id="Accordion_wrap">
    <div class="question">
      <span>신고는 어떻게 하나요</span>
      <div class="arrow-wrap">
        <span class="arrow-top">▲</span>
        <span class="arrow-bottom">▼</span>
      </div>

    </div>
    <div class="answer">
      <span>이렇게 하면 됩니다.</span>
    </div>
    <div class="question">
      <span>청원 글 작성은 어떻게 하나요</span>
      <div class="arrow-wrap">
        <span class="arrow-top">▲</span>
        <span class="arrow-bottom">▼</span>
      </div>
    </div>
    <div class="answer">
      <span>여기서 하면 됩니다.</span>
    </div>
    <div class="question">
      <span>비밀번호를 잃어버렸어요</span>
      <div class="arrow-wrap">
        <span class="arrow-top">▲</span>
        <span class="arrow-bottom">▼</span>
      </div>
    </div>
    <div class="answer">
      <span>잃어버린 비밀번호는 어쩔수 없어</span>
    </div>
  </div>

  <div class="center-btn">
  <a href="Q&A.html" id="button2"><i class="fa-solid fa-user fa-4x" id="ic"></i>1:1 문의</a>
  <a href="Q&A2.html" id="button2"><i class="fa-solid fa-scroll fa-4x" id="ic"></i>문의내역</a>
  <a href="chatbot.html" id="button2"><i class="fa-regular fa-comment fa-4x" id="ic"></i>챗봇</a>
  </div>

</main>

 <footer>
    <div class="footerList">
      <div>
        <h2>COMPANY</h2>
        <ul>
          <li>About</li>
          <li>Impact</li>
          <li>Careers</li>
          <li>Team</li>
        </ul>
      </div>
      <div>
        <h2>COMMUNITY</h2>
        <ul>
          <li>Blog</li>
          <li>Community Guidelines</li>
        </ul>
      </div>
      <div>
        <h2>SUPPORT</h2>
        <ul>
          <li>Help</li>
          <li>Guides</li>
          <li>Privacy</li>
          <li>Policies</li>
          <li>Cookies</li>
        </ul>
      </div>
      <div>
        <h2>CONNECT</h2>
        <ul>
          <li>Twitter</li>
          <li>Facebook</li>
        </ul>
      </div>
    </div>
    <div class="last">
      <a class="admin" href="/administrator/html/main_login.html">Copyright &copy; nojo.kr</a><br>
      <p>이 사이트는 reCAPTCHA로 보호되며 Google 개인정보 보호정책 및 서비스 약관이 적용됩니다.</p>
    </div>
  </footer>

  <script src="../js/FAQ.js"></script>
  <script src="https://kit.fontawesome.com/fa1a384c97.js" crossorigin="anonymous"></script>
</body>

</html>