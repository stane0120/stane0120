<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%-- map에 저장된 값들을 각각 변수에 저장 --%>
<c:set var="pagination" value="${map.pagination}"/>
<c:set var="boardList" value="${map.boardList}"/>
<c:set var="boardName" value="${boardTypeList[boardCode-1].BOARD_NAME}"/>

<%-- <c:forEach items="${boardTypeList}" var="boardType">
    <c:if test="${boardType.BOARD_CODE == boardCode}" >
        <c:set var="boardName" value="${boardType.BOARD_NAME}"/>
    </c:if>
</c:forEach> --%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${boardName}</title>

    <link rel="stylesheet" href="../css/Q&A3.css">

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
        <jsp:include page="/WEB-INF/views/common/header.jsp"/>

        
        <section class="board-list">

            <h1 class="board-name">${boardName}</h1>


            <div class="list-wrapper">
                <table class="list-table">
                    
                    <thead>
                        <tr>
                            <th></th>
                            <th>분류</th>
                            <th>제목</th>
                            <th>답변여부</th>
                            <th>작성일</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:choose>
                            <c:when test="${empty boardList}">
                                <%-- 조회된 게시글 목록이 비어있거나 null인경우 --%>
                                
                                <!-- 게시글 목록 조회 결과가 비어있다면 -->
                            
                                <tr>
                                    <th colspan="6">게시글이 존재하지 않습니다.</th>
                                </tr>
                            </c:when>

                            <c:otherwise>
						<!-- 게시글 목록 조회 결과가 있다면 -->
                            <c:forEach items="${boardList}" var="board">                       
                                <tr>
                                    <td>${board.boardNo}</td>
                                    <td> 
                                    <%-- 썸네일이 있을 경우 --%>
                                    <c:if test="${not empty board.thumbnail}" >
                                        <img class="list-thumbnail" src="${board.thumbnail}">
                                    </c:if>

                                    <%-- ${boardCode} : @Pathvariable로 request scope에 추가된 값 --%>
                                        <a href="/board/${boardCode}/${board.boardNo}?cp=${pagination.currentPage}">${board.boardTitle}</a>   
                                        [${board.commentCount}]                        
                                    </td>
                                    <td>${board.memberNickname}</td>
                                    <td>${board.boardCreateDate}</td>
                                    <td>${board.readCount}</td>
                                    <td>${board.likeCount}</td>
                                </tr>
                                </c:forEach>
                            </c:otherwise>
                        </c:choose>
                    
                    </tbody>
                </table>
            </div>


            <div class="btn-area">

				
                <c:if test="${not empty loginMember}" >
                    <!-- 로그인 상태일 경우 글쓰기 버튼 노출 -->
                <button id="insertBtn">글쓰기</button> 
                
                </c:if>
            

            </div>


            <div class="pagination-area">


                <ul class="pagination">
                
                    <!-- 첫 페이지로 이동 -->
                    <li><a href="/board/${boardCode}?cp=1">&lt;&lt;</a></li>

                    <!-- 이전 목록 마지막 번호로 이동 -->
                    <li><a href="/board/${boardCode}?cp=${pagination.prevPage}">&lt;</a></li>

					
                    <!-- 특정 페이지로 이동 -->
                    <c:forEach var="i" begin="${pagination.startPage}"
                            end="${pagination.endPage}" step="1">

                        <c:choose>
                            <c:when test="${i == pagination.currentPage}">
                                <!-- 현재 보고있는 페이지 -->
                                <li><a class="current">${i}</a></li>
                            </c:when>
                        
                            <c:otherwise>
                                <!-- 현재 페이지를 제외한 나머지 -->
                                <li><a href="/board/${boardCode}?cp=${i}">${i}</a></li>
                            </c:otherwise>
                        </c:choose>
        
                    </c:forEach>


                    <!-- 다음 목록 시작 번호로 이동 -->
                    <li><a href="/board/${boardCode}?cp=${pagination.nextPage}">&gt;</a></li>

                    <!-- 끝 페이지로 이동 -->
                    <li><a href="/board/${boardCode}?cp=${pagination.maxPage}">&gt;&gt;</a></li>

                </ul>
            </div>


			<!-- 검색창 -->
            <form action="#" method="get" id="boardSearch">

                <select name="key" id="searchKey">
                    <option value="t">제목</option>
                    <option value="c">내용</option>
                    <option value="tc">제목+내용</option>
                    <option value="w">작성자</option>
                </select>

                <input type="text" name="query"  id="searchQuery" placeholder="검색어를 입력해주세요.">

                <button>검색</button>
            </form>

        </section>
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
    
    <!-- 썸네일 클릭 시 모달창 출력 -->
    <div class="modal">
        <span id="modalClose">&times;</span>
        <img id="modalImage" src="/resources/images/user.png">
    </div>



<script src="../js/Q&A3.js"></script>
<script src="https://kit.fontawesome.com/fa1a384c97.js" crossorigin="anonymous"></script>
</body>
</html>