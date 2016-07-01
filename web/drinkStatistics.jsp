<%@ page import="ua.kiev.prog.QuestionFoodServlet" %>
<%@ page import="ua.kiev.prog.QuestionDrinkServlet" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>DRINK choice Statistics</title>
  </head>
  <body>
       <h2>Answer on first question YES - <%= QuestionDrinkServlet.getGroup1Yes()%> , NO - <%= QuestionDrinkServlet.getGroup1No()%>
           <br>Answer on second question YES - <%= QuestionDrinkServlet.getGroup2Yes()%>, NO - <%= QuestionDrinkServlet.getGroup2No()%></h2><br>
        <a href="http://localhost:8080/choice_anket.html"><h3> Return to other ankets</h3></a>
  </body>
</html>
