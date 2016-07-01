<%@ page import="ua.kiev.prog.QuestionFoodServlet" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>FOOD choice Statistics</title>
  </head>
  <body>
       <h2>Answer on first question YES - <%= QuestionFoodServlet.getGroup1Yes()%> , NO - <%= QuestionFoodServlet.getGroup1No()%>
           <br>Answer on second question YES - <%= QuestionFoodServlet.getGroup2Yes()%>, NO - <%= QuestionFoodServlet.getGroup2No()%></h2><br>
        <a href="http://localhost:8080/choice_anket.html"><h3> Return to other ankets</h3></a>
  </body>
</html>
