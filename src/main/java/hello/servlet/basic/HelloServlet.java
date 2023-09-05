package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String user = request.getParameter("user");
        System.out.println("user = " + user);

        response.setContentType("text/plain"); //http header에 들어가는 정보
        response.setCharacterEncoding("utf-8"); //http header에 들어가는 정보
        response.getWriter().write("hello" + user); //http body에 메시지가 담김

    }
}
