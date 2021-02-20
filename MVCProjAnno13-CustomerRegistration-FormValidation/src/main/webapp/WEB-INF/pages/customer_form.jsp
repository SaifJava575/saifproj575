<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Customer Registration form</h1>

<form:form modelAttribute="cust">
<table align="center" bgcolor="cyan">
<tr>
	<td>Customer Name::</td>
	<td><form:input path="cname"/><form:errors cssStyle="color:red" path="cname"/></td>
</tr>

<tr>
	<td>Customer address::</td>
	<td><form:input path="cadd"/><form:errors cssStyle="color:red" path="cadd"/></td>
</tr>

<tr>
	<td>Customer billAmt::</td>
	<td><form:input path="billAmt"/><form:errors cssStyle="color:red" path="billAmt"/></td>
</tr>

<tr>
	<td colspan="2"><input type="submit" value="Register"></td>
</tr>
</table>
</form:form>