<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./layui/css/layui.css">
    <script src="./layui/layui.js"></script>
    <script src="./layui/jquery-3.1.1.min.js"></script>
</head>
<body>
<form class="layui-form" action="/game/add">
    <#if category??>
        <input type="hidden" name="categoryId" value="${(category.id)!}">
        <div class="layui-form-item">
            <label class="layui-form-label">菜名：</label>
            <div class="layui-input-block">
                <input type="text" name="foodName" required  lay-verify="required" placeholder="这只菜叫什么名字?" value="${(category.foodName)!}" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">有肉吗?:</label>
            <div class="layui-input-block">
                <#if category.isMeat == "true" || category.isMeat == true>
                    <input type="checkbox" name="isMeat" lay-skin="switch" lay-text="有的|木有"
                           value="true" checked>
                <#else>
                    <input type="checkbox" name="isMeat" lay-skin="switch" lay-text="有的|木有"
                           value="true">
                </#if>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    <#else>
        <div class="layui-form-item">
            <label class="layui-form-label">菜名：</label>
            <div class="layui-input-block">
                <input type="text" name="foodName" required  lay-verify="required" placeholder="这只菜叫什么名字?" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">有肉吗?:</label>
            <div class="layui-input-block">
                <input type="checkbox" name="isMeat" lay-skin="switch" lay-text="有的|木有" value="true">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </#if>

</form>
<script>
    layui.use('form', function(){
        var form = layui.form();
        //监听提交
        form.on('submit(formDemo)', function(data){
            $.post("/game/add",$(".layui-form").serialize(),function(d){
                parent.location.reload();
            });
            return false;
        });
    });
</script>
</body>
</html>