<#import "head.ftl" as h>
<@h.head title="">
<div style="margin-left: 50px;margin-top: 100px;" id="toolBar">
    <div class="layui-btn-group">
        <button class="layui-btn layui-btn-big" datafld="add">
            <i class="layui-icon">&#xe654;</i>
        </button>
        <button class="layui-btn layui-btn-big" datafld="edit">
            <i class="layui-icon">&#xe642;</i>
        </button>
        <button class="layui-btn layui-btn-big" datafld="delete">
            <i class="layui-icon">&#xe640;</i>
        </button>
        <button class="layui-btn layui-btn-big" datafld="done">
            <i class="layui-icon">&#xe602;</i>
        </button>
    </div>
</div>
<section style="margin-left: 50px;margin-top: 10px;">
    <#if categoryList ?? && categoryList?size gt 0>
    <#list categoryList as category>
    <#if (category_index+1) % 5 == 0>
        <hr>
    </#if>
        <div style="float: left;margin-right: 10px;margin-top: 5px"><button class="layui-btn  layui-btn-normal" datafld="${(category.id)!}">${(category.foodName)!}(${(category.selectCount)!'0'})&nbsp;&nbsp;&nbsp;+1</button></div>
    </#list>
</#if>
</section>

<script>
    $(function () {
        $("section .layui-btn").click(function(e){
            $(this).toggleClass("layui-btn-normal");
            $(this).toggleClass("layui-btn-warm");
        });
        $(".layui-btn-group .layui-btn-big").click(function(e){
            var dataType = $(this).attr("datafld");
            if ($("section").find(".layui-btn-warm").length <= 0 && dataType != "add"){
                layui.use('layer', function(){
                    var layer = layui.layer;
                    layer.msg('小环环，请选择菜谱~~');
                });
                return false;
            }

            var dataIdList = '';
            $("section").find(".layui-btn-warm").each(function(i,n){
                if (dataIdList.indexOf(',') == -1){
                    dataIdList = n.getAttribute("datafld")+",";
                }else{
                    dataIdList += n.getAttribute("datafld")+",";
                }

            });
            if (dataType === 'add'){
                layui.use('layer', function(){
                    var layer = layui.layer;
                    layer.open({
                        type:2,
                        content:"toAdd",
                        scrollbar:false
                    })
                });
            }else if(dataType === 'edit'){
                layui.use('layer', function(){
                    var layer = layui.layer;
                    layer.open({
                        type:2,
                        content:"toEdit?categoryIds="+dataIdList
                    })
                });

            }else if(dataType === 'delete'){
                $.post("toDelete",{categoryIds:dataIdList},function(d){
                    location.reload();
                })
            }else if(dataType === 'done'){
                $.post("/game/done?categoryIds="+dataIdList,function(d){

                })
            }

        });
    })
</script>
</@h.head>