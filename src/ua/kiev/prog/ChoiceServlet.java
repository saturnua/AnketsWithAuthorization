package ua.kiev.prog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChoiceServlet extends HttpServlet {

      public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String group1Answer = req.getParameter("group1");

        switch (group1Answer){
            case "anket1":
                resp.sendRedirect("anket_food.html");
                break;
            case "anket2":
                resp.sendRedirect("anket_drink.html");
                break;
            case "anket3":
                resp.sendRedirect("anket_animal.html");
                break;
            default:
                System.out.println("Somthing wrong :)");
                break;
        }
    }

}
