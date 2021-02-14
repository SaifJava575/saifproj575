<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
	<c:when test="${!empty listDTO }">
		<table border="1" bgcolor="cyan" align="center">
		<tr bgcolor="blue">
		<th>SrNo</th><th>EmpNo</th><th>EmpName</th><th>Desg</th><th>Salary</th>
		</tr>
		<c:forEach var="dto" items="${listDTO }">
		<tr bgcolor="yellow">
		<td>${dto.srNo}</td>
		<td>${dto.empNo}</td>
		<td>${dto.ename}</td>
		<td>${dto.job}</td>
		<td>${dto.sal}</td>
		
		</tr>
		</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
	<h1 style="color:red;text-align:center">No Records founds</h1>
	</c:otherwise>
</c:choose>
<br><br>
<h3><a href="welcome">home</a></h3>