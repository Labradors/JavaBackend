<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json使用</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript">
        function requestItems() {
                $.ajax({
                    url: "${pageContext.request.contextPath}/json/requestItems.action",
                    type: "post",
                    contentType: "application/json;charset=UTF-8",
                    data:'{"name": "手机","price": 19}',
                    success:function (data) {
                        console.log(data.toString())
                    }
                })
        }
        function requestJson() {
            $.ajax({
                url: "${pageContext.request.contextPath}/json/requestItemsJson.action",
                type: "post",
                contentType: "application/json;charset=UTF-8",
                data: "name=张三&price=10",
                success:function (data) {
                    console.log(data.toString())
                }
            })
        }

    </script>
</head>
<body>
<div class="container">
    <div><input type="button" value="请求json响应json" onclick="requestItems()"></div>
    <div><input type="button" value="请求key/value响应json" onclick="requestJson()"></div>
</div>
</body>
</html>
