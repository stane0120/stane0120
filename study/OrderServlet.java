
public class OrderServlet {
String data1 = request.getParameter("data1");
String data2 = request.getParameter("data2");
String data3 = request.getParameter("data3");
String data4 = request.getParameter("data4");


int total = 0;
if (data1 != null) {
    total += Integer.parseInt(data1);
}
if (data2 != null) {
    total += Integer.parseInt(data2);
}

if (data3 != null) {
    total += Integer.parseInt(data3);
}

if (data4 != null) {
    total += Integer.parseInt(data4);
}


if (total != 0) {
   
    request.setAttribute("data1", data1);
    request.setAttribute("data2", data2);
    request.setAttribute("data3", data3);
    request.setAttribute("data4", data4);
    request.setAttribute("total", total);
    RequestDispatcher dispatcher = request.getRequestDispatcher("resultPage.jsp");
    dispatcher.forward(request, response);
} else {
    response.sendRedirect("error.do");
}
}