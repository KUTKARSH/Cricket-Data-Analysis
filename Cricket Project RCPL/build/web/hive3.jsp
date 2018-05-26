<%@page import="java.sql.*" %>
<center>
    <h1 style="background-color: black;color: limegreen;text-align:center;font-size: 300%">
        Players who scored half centuries
    </h1>
</center>
<center>
<table border ="1" width="80%">
    <tr>
        <th style="text-align:center">Player Name</th>
        <th style="text-align:center">Runs</th>
    </tr>
    <%! String id1;
    %>
    <%
        id1 = request.getParameter("n");
        session.setAttribute("n",id1);
        id1 = "\""+id1+"\"";
        String hql = "select pos,SUM(rb) as runs from ena where id ="+id1+" group by pos";
         ResultSet rs = RCPL.hadoop.getData(hql); 
while(rs.next())
{
    String pos = rs.getString(1);
    	 String runs = rs.getString(2);
    	 int r = Integer.parseInt(runs);
         
    	 if(r>=50&&r<100){
    	 
%>
    <tr>
        <td style="text-align:center"><%=pos%> </td>
       <td style="text-align:center"><%=r%></td>
                </tr>
                <%}}
%>
 
</table>

<img align="middle" src="half.jpg"  width="400" height="400" style="vertical-align: middle">
</center>