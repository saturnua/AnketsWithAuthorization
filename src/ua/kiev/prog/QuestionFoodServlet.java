package ua.kiev.prog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 22.06.2016.
 */
public class QuestionFoodServlet extends HttpServlet {

    private static int group1Yes;
    private static int group1No;

    private static int group2Yes;
    private static int group2No;

    static final String TEMPLATE = "<html>" +
            "<head><title>Anketa</title></head>" +
            "<body><h2>Answer on first question YES - %s, NO - %s<h2><br>Answer on second question YES - %s, NO - %s<br>"+
            "<a href=\"http://localhost:8080/choice_anket.html\"><h3> Return to other ankets</h3></a></body></html>";

    public static int getGroup1Yes(){
        return group1Yes;
    }
    public static int getGroup1No(){
        return group1No;
    }
    public static int getGroup2Yes(){
        return group2Yes;
    }

    public static int getGroup2No() {
        return group2No;
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String group1Answer = req.getParameter("group1");
        String group2Answer = req.getParameter("group2");

        if(group1Answer.equalsIgnoreCase("yes")){
            group1Yes++;
        }else{group1No++;}

        if(group2Answer.equalsIgnoreCase("yes")){
            group2Yes++;
        }else{group2No++;}

        resp.setContentType("text/html"); // Content-Type: text/html
        resp.getWriter().println(String.format(TEMPLATE, group1Yes, group1No, group2Yes, group2No));
    }

}
