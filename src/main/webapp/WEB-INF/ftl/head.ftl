<#macro head title >
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>${title!}</title>
    <script src="./layui/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="./layui/css/layui.css">
    <script src="./layui/layui.js"></script>
</head>
<body background="./layui/images/myImages/background.jpg">
    <#nested>
</body>
</html>
</#macro>