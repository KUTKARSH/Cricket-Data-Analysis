<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Match-Wise Team Scores
    </h1>
</center>
<center>
<table border ="1" width="80%">
    <tr>
        <th style="text-align:center">Team's Name</th>
        <th style="text-align:center">Total Runs</th>
    </tr>
    
    <%
        String hql = "Select team,sum(rb)+sum(ew) as runs from ena group by team";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
    String name = rs.getString(1);
    String score = rs.getString(2);
    	 
    	 
%>
    <tr>
        <td style="text-align:center"><%=name%> </td>
        <td style="text-align:center"><%=score%></td>
                </tr>
                <% }
%>
</table>
<img align="middle" src="teamwise.jpg"  width="400" height="400" style="vertical-align: middle">
 </center>