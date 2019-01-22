<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/demo/js/jquery-3.3.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="/demo/user/login">
账号：<input type="text" name="code" value='111'/><br>
密码：<input type="password" name="pass"/><br>
<input type="submit" value="提交"/>
</form>
<button onclick="aa()">AA</button>
<script type="text/javascript">
function aa(){
	$.ajax({
		type: "get",
        url: "/demo/user/login2",
        dataType: "text",//json:返回JSON数据 。text:返回纯文本字符串
        data:{code:$("[name='code']").val(),pass:$("[name='pass']").val()}, //data发送到服务器的数据。
        success: function(data){
            console.log(typeof data);console.log(data);
        }
	})
}
</script>
</body>
</html>