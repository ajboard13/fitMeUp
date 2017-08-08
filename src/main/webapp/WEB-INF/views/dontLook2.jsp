<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 8/8/2017
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dontLook2</title>
</head>
<body>
<form name="temp" action="homePage">
    <input type="hidden" id="authToken" name="authToken" value="">
</form>


<script>
    var url_string = window.location.href;
    var url = new URL(url_string);
    var code = url.searchParams.get("access_token");
    document.getElementById('authToken').value = code;
</script>
</body>
</html>
