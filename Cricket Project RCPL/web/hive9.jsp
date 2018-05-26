<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Player-Wise individual scores
    </h1>

<table border ="1" width="80%">
    <tr>
        <th>Match id</th>
        <th>Team's Name</th>
        <th>Player</th>
        <th>Total Runs</th>
    </tr>
    <%! String id1,id,name,totalRuns,playerName;       
    %>
    <%   
        id1=request.getParameter("n");
        session.setAttribute("n",id1);
        String hql = "select id,team,pos,sum(rb) as run from ena where id="+id+" group by id,team,pos";
         ResultSet rs = RCPL.hadoop.getData(hql); 
        while(rs.next())
        {
                 id = rs.getString(1);
                 name = rs.getString(2);
                 playerName = rs.getString(3);
                 totalRuns= rs.getString(4);

        %>
            <tr>
                <td><%=id %> </td>
                <td><%=name %></td>
                <td><%=playerName %></td>
                <td><%=totalRuns %></td>
            </tr>
                        <% }
%>
</table>

</center>