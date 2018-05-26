<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Players who scored fours
    </h1>
</center>
<center>
<table border ="1" width="80%">
    <tr>
        <th style="text-align:center">Number of fours</th>
    </tr>
    <%! String id1;
    %>
    <%
        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        String hql = "select count(bc) from ena where rb=4 and id = "+id1;
         ResultSet rs = RCPL.hadoop.getData(hql); 
         
while(rs.next())
{
    String count = rs.getString(1);
    	 
    	 
%>
    <tr>
        <td style="text-align:center"><%=count%> </td>
       
                </tr>
                <% }
%>

</table>

<img align="middle" src="four.jpg"  width="400" height="400" style="vertical-align: middle">
</center>