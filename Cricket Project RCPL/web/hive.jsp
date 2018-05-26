<%@page import="java.sql.*" %>

<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Top 3 scorers
    </h1>
</center>

<center>
<table border ="1" width="80%" >
    <tr>
        <th style="text-align:center">Player On Strike</th>
        <th style="text-align:center">Runs</th>
    </tr>
    <%! String id1;
    %>
    <%
        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        id1="\""+id1+"\"";
        String hql = "select pos,sum(runs) as run from engvsaus where team ="+id1+" group by pos order by run desc limit 3";
         ResultSet rs = RCPL.hadoop.getData(hql); 
         
while(rs.next())
{
    String id = rs.getString(1);
    String name = rs.getString(2);

%>
    <tr>
        <td style="text-align:center"><%=id%> </td>
       <td style="text-align:center"><%=name%></td>
                </tr>
                <% }
%>
</table>
<br>
<img align="middle" src="hit.png"  width="400" height="400" style="vertical-align: middle">
</center>