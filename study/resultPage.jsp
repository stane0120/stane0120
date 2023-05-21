<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<!DOCTYPE html>
<html>
<head>
    <title>물건 구매 페이지</title>
    <style>
        .center {
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>물건 구매 페이지</h1>
    
    <%-- 구매자 정보 입력 폼 --%>
    <div class="center">
        <form method="post" action="purchase.jsp">
            <label for="name">구매자 이름:</label>
            <input type="text" id="name" name="name" required>
            <br><br>
            <label for="item1">검정 펜:</label>
            <input type="number" id="item1" name="item1" min="0" required>
            <br><br>
            <label for="item2">빨간 펜:</label>
            <input type="number" id="item2" name="item2" min="0" required>
            <br><br>
            <label for="item3">파란 펜:</label>
            <input type="number" id="item3" name="item3" min="0" required>
            <br><br>
            <label for="item4">화이트:</label>
            <input type="number" id="item4" name="item4" min="0" required>
            <br><br>
            
            
            <input type="submit" value="구매">
        </form>
    </div>
    

    <div class="center">
        String name = request.getParameter("name");
        int item1 = Integer.parseInt(request.getParameter("item1"));
        int item2 = Integer.parseInt(request.getParameter("item2"));
        int item3 = Integer.parseInt(request.getParameter("item3"));
        int item4 = Integer.parseInt(request.getParameter("item4"));
        
        int totalAmount = item1 + item2 + item3 + item4;
        
        <h2>구매자 정보</h2>
        <p>이름: <%= name %></p>
        
        <h2>구매 목록</h2>
        <p>물건 1: <%= item1 %></p>
        <p>물건 2: <%= item2 %></p>
        <p>물건 3: <%= item3 %></p>
        <p>물건 4: <%= item4 %></p>
        
        <h2>결제 정보</h2>
        <p>총 결제 금액: <%= totalAmount %>원</p>
    </div>
</body>
</html>