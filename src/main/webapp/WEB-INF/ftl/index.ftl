<#import "head.ftl" as h>
<@h.head title="">
<script>
    layui.use('layer', function () {
        var layer = layui.layer;
        layer.open({
            type: 1
            ,title: false //不显示标题栏
            ,closeBtn: false
            ,area: '300px;'
            ,shade: 0.8
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,resize: false
            ,btn: ['去选择', '退出']
            ,btnAlign: 'c'
            ,moveType: 1 //拖拽模式，0或者1
            ,content: '<div style="padding: 50px; line-height: 100px; background-color: #393D49; color: #fff; font-weight: 300;">小环环的菜单食谱<br>想不出来今天晚上要吃啥吗？我来帮你选吧。。。</div>'
            ,success: function(layero){
                var btn = layero.find('.layui-layer-btn');
                btn.find('.layui-layer-btn0').attr({
                    href: 'toChoose'
                    ,target: '_self'
                });
            },
            btn2:function(index){
                window.close();
            },
            cancel:function(){
                window.close();
            }
        });
    });
</script>
</@h.head>