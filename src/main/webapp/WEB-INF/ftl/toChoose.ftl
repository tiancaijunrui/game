<#import "head.ftl" as h>
<@h.head title="">
<section>
    <#if categoryList ?? && categoryList?size gt 0>
    <#list categoryList as category>
        <div ><button class="layui-btn">${(category.foodName)!}</button></div>
        <div class="layui-progress layui-progress-big" lay-filter="demo" lay-showPercent="true" >
            <div class="layui-progress-bar" lay-percent="${(category.selectCount)!0}%"></div>
        </div>

    </#list>
</#if>

</section>

<script>
    //注意进度条依赖 element 模块，否则无法进行正常渲染和功能性操作
    layui.use('element', function(){
        var element = layui.element();
//        element.init();
    });
</script>
<script>
    $(function () {
    })
</script>
</@h.head>