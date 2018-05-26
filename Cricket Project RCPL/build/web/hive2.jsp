<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Top 3 wicket takers
    </h1>
</center>
<center>
<table border ="1" width="80%" align="middle">
    <tr>
        <th style="text-align:center">Baller Name</th>
        <th style="text-align:center">Wickets</th>
    </tr>
    <%! String name1;
    %>
    <%
        name1 = request.getParameter("n");
        session.setAttribute("n",name1);
        name1 = "\""+name1+"\"";
        String hql = "select bn,count(wf) as wickets from ena where wf!=' ' and  team = "+name1+" group by bn order by wickets desc limit 3";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
    String bn = rs.getString(1);
    String wk = rs.getString(2);

%>
    <tr>
        <td style="text-align:center"><%=bn%> </td>
       <td style="text-align:center"><%=wk%></td>
                </tr>
                <% }
%>
</table>
<img align="middle" src="out.jpg"  width="400" height="400" style="vertical-align: middle">
</center>
