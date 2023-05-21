<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
    <title>Product Order</title>
    <script>
        function submitForm() {
            document.getElementById("orderForm").submit();
        }

        function resetForm() {
            document.getElementById("orderForm").reset();
        }
    </script>
</head>
<body>
    <h1>Product Order</h1>
    <form id="orderForm" action="orderProduct.do" method="post">
        <label for="name">이름:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="blackPen">검정 펜 수량:</label>
        <input type="number" id="blackPen" name="blackPen" min="0" max="100" value="0"><br><br>
        
        <label for="redPen">빨간 펜 수량:</label>
        <input type="number" id="redPen" name="redPen" min="0" max="100" value="0"><br><br>
        
        <label for="bluePen">파란 펜 수량:</label>
        <input type="number" id="bluePen" name="bluePen" min="0" max="100" value="0"><br><br>
        
        <label for="white">화이트 수량:</label>
        <input type="number" id="white" name="white" min="0" max="100" value="0"><br><br>
        
        <button type="button" onclick="submitForm()">구매</button>
        <button type="button" onclick="resetForm()">초기화</button>
    </form>
</body>
</html>