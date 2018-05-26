<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Score Card
    </h1>

<table border ="1" width="80%">
    <tr>
        <th>Match id</th>
        <th>Team's Name</th>
        <th>Total Runs</th>
        <th>Total overs</th>
    </tr>
    <%! String id1,id,name,totalRuns,totalOvers;      
            String hql;  
    %>
    <%   
        
        id1=request.getParameter("n");
        session.setAttribute("n",id1);
        hql = "select id,team,sum(runs)+sum(wide),max(ballcount) from ena where id="+ id1 +  " group by id,team";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
         id = rs.getString(1);
    	 name = rs.getString(2);
    	 totalRuns = rs.getString(3);
    	 totalOvers = rs.getString(4);
    	 
%>
    <tr>
        <td><%=id %> </td>
        <td><%=name %></td>
        <td><%=totalRuns %></td>
        <td><%=totalOvers %></td>
    </tr>
                <% }
%>
</table>
<a href="hive9.jsp">
<h3 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">Click here for detailed reports</h3>
</a>
</center>