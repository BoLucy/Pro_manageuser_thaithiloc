<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div>
	<div>
		<table>
			<tr>
				<td width="80%"><img
					src="${pageContext.request.contextPath}/images/logo-manager-user.gif"
					alt="Luvina" />


					<td><t d align="left"><a href="ADM001.html">ログアウト</a> &nbsp; <a
					href="${pageContext.request.contextPath}/logout">トップ</a>
Welcome ${loginedUser.login_name}

				<td>

			</tr>
</table>
</div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<div>
<div>
<table>
<tr>
<td width="80%"><img src="${pageContext.request.contextPath}/images/logo-manager-user.gif"
alt="Luvina" />
<td>
<td align="left"><a href="ADM001.html">ログアウト</a> &nbsp; <a
href="${pageContext.request.contextPath}/logout">トップ</a>
Welcome ${loginedUser.login_name}
<td>
</tr>
</table>
</div>
</div></body>
					</html>