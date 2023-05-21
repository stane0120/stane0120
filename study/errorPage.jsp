<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<!DOCTYPE html>
<html>
<head>
    <title>물건 구매 페이지</title>
    <style>
        .center {
            text-align: center;
            color: red;
        }
    </style>
</head>
<body>
    <h1>물건 구매 페이지</h1>
    
    <form method="post" action="purchase.jsp">
        <label for="item">물건 선택:</label>
        <select id="item" name="item">
            <option value="item1">물건 1</option>
            <option value="item2">물건 2</option>
            <option value="item3">물건 3</option>
            <option value="item4">물건 4</option>
            <!-- 필요한 만큼 물건 옵션을 추가할 수 있습니다 -->
        </select>
        
        <br><br>
        
        <input type="submit" value="구매">
    </form>
    
    <%-- 구매 완료 후 메시지 출력 --%>
    <div class="center">
        <% String selectedItem = request.getParameter("item");
           if (selectedItem != null) {
               out.println("선택한 물건: " + selectedItem);
           }
        %>
    </div>
</body>
</html>