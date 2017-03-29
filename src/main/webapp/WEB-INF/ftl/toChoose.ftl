<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./layui/css/layui.css">
    <script src="./layui/jquery-3.1.1.min.js"></script>
    <script src="./layui/underscore-min.js"></script>
    <script src="./layui/layui.js"></script>
</head>
<body background="./layui/images/myImages/background.jpg">
<#if categoryList ?? && categoryList?size gt 0>
    <#list categoryList as category>
     <input type="hidden" value="${category!}"/>
    </#list>
</#if>
</body>
<script type="text/template" id="chooseForm">
    <form class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">下拉选择框</label>
            <div class="layui-input-block">
                <select name="interest" lay-filter="aihao">
                    <option value="0">写作</option>
                    <option value="1">阅读</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">复选框</label>
            <div class="layui-input-block">
                <input type="checkbox" name="like[write]" title="写作">
                <input type="checkbox" name="like[read]" title="阅读">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">开关关</label>
            <div class="layui-input-block">
                <input type="checkbox" lay-skin="switch">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">开关开</label>
            <div class="layui-input-block">
                <input type="checkbox" checked lay-skin="switch">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">单选框</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="0" title="男">
                <input type="radio" name="sex" value="1" title="女" checked>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">请填写描述</label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="*">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
        <!-- 更多表单结构排版请移步文档左侧【页面元素-表单】一项阅览 -->
    </form>
</script>
<script>
    $(function () {
        alert(12);
    })
</script>
</html>