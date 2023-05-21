@WebServlet("/error.do")
public class ErrorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("errorPage.jsp");
        dispatcher.forward(request, response);
    }
}