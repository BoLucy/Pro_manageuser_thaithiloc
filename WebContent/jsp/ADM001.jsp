<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
=======
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
>>>>>>> 3d78b550021ba647f62c22f7ca53ffcc0f0831d0
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" />
<title>ユーザ管理</title>
</head>
<<<<<<< HEAD
<body align="center">
	
	<form action="Login" method="post">
		<center>
			<table class="tbl_input" cellpadding="4" cellspacing="0"
				width="400px">
				<tr>
					<th width="120px">&nbsp;</th>
					<th></th>
				</tr>
				<tr>
					<th colspan="2" align="left">アカウント名およびパスワードを入力してください</th>
				</tr>
				<tr>
					<td colspan="2" class="errMsg"><c:forEach items="${lisError}"
							var="errStr">
							${errStr} <br>
						</c:forEach></td>
				</tr>
				<tr align="left">
					<td class="lbl_left">アカウント名:</td>
					<td align="left"><input class="txBox" type="text"
						name="loginId" value="${login}" size="20"
						onfocus="this.style.borderColor='#0066ff';"
						onblur="this.style.borderColor='#aaaaaa';" /></td>
				</tr>
				<tr>
					<td class="lbl_left">パスワード:</td>
					<td align="left"><input class="txBox" type="password"
						name="password" value="" size="22"
						onfocus="this.style.borderColor='#0066ff';"
						onblur="this.style.borderColor='#aaaaaa';" /></td>
				</tr>
				<tr>
					<td></td>
					<td align="left"><input class="btn btn_wider" type="submit"
						value="ログイン" /></td>
				</tr>
			</table>
		</center>
	</form>
	
=======
<body align="center" >
<form action="/LoginController" method="post">
<center>
	<table class="tbl_input" cellpadding="4" cellspacing="0" width="400px">
		<tr>
			<th width="120px">&nbsp;</th><th></th>
		</tr>
		<tr>
			<th colspan="2" align="left">アカウント名およびパスワードを入力してください</th>
		</tr>
		<c:forEach var="error" items = "${listError}">
		<tr>
			<td class="errMsg" colspan="2"><c:out value="${error}"></c:out></td>
		</tr>	
		</c:forEach>
		<tr align="left">
			<td class="lbl_left">アカウント名:</td>
			<td align="left">
				<input class="txBox" type="text" name="loginId" value="" size="20" onfocus="this.style.borderColor='#0066ff';"
				onblur="this.style.borderColor='#aaaaaa';" />
			</td>
		</tr>
		<tr>
			<td class="lbl_left">パスワード:</td>
			<td align="left">
				<input class="txBox" type="password" name="password" value=""	size="22" onfocus="this.style.borderColor='#0066ff';"
				onblur="this.style.borderColor='#aaaaaa';" />
			</td>
		</tr>
		<tr>
			<td></td>
			<td align="left">
				<input class="btn btn_wider" type="submit" value="ログイン" />				
			</td>
		</tr>
	</table>
	</center>
</form>
>>>>>>> 3d78b550021ba647f62c22f7ca53ffcc0f0831d0
</body>
</html>