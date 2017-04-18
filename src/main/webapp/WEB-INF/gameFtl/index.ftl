<#import "head.ftl" as h>
<@h.head title="">
<!-- 页面内容 开发时删除 -->
<div class="am-g am-g-fixed am-margin-top">
  <div class="am-u-sm-12">
    <h1>你好世界！小可 Amaze UI 模板。</h1>

    <p>这是一个基础的页面，引入 Amaze UI 的 css 、js
      文件。如果你已经熟读文档，使用时删除内容开始开发即可。建议使用前先阅读文档，以提高开发效率。</p>
  </div>
</div>
<div class="am-g am-g-fixed am-margin-top">
  <p class="am-u-sm-12">下载包里面有 4 个常见布局示例，供开发者参考。</p>

  <div class="am-u-sm-12">
    <div class="am-g">
      <div class="am-u-sm-12 am-u-md-3">
        <a href="landing.html"><img class="am-img-thumbnail"
                                    src="${staticsPath!'../'}assets/i/examples/landingPage.png"
                                    alt="展示页面"/></a>
      </div>
      <div class="am-u-sm-12 am-u-md-9">
        <h3>展示页面</h3>

        <p>
          CSS 部分：<a class="am-badge am-badge-success" href="/css/grid">网格</a> <a
          class="am-badge am-badge-success" href="/css/icon">图标</a> <a
          class="am-badge am-badge-success" href="/css/button">按钮</a> <a
          class="am-badge am-badge-success" href="/css/form">表单</a> <a
          class="am-badge am-badge-success" href="/css/article">文章页</a> <a
          class="am-badge am-badge-success" href="/css/topbar">导航条</a> <a
          class="am-badge am-badge-success" href="/css/utility">辅助类</a><br/>
          JS 插件部分：<a class="am-badge am-badge-primary"
                     href="/javascript/dropdown">下拉组件</a> <a
          class="am-badge am-badge-primary"
          href="/javascript/scrollspy">滚动侦测</a>
        </p>
      </div>
    </div>
    <div class="am-g am-margin-top">
      <div class="am-u-sm-12 am-u-md-3">
        <a href="login.html"><img class="am-img-thumbnail"
                                  src="${staticsPath!'../'}assets/i/examples/loginPage.png"
                                  alt="登录页面"/></a>
      </div>
      <div class="am-u-sm-12 am-u-md-9">
        <h3>登录页面</h3>

        <p>
          CSS 部分：<a class="am-badge am-badge-success" href="/css/grid">网格</a> <a
          class="am-badge am-badge-success" href="/css/icon">图标</a> <a
          class="am-badge am-badge-success" href="/css/button">按钮</a> <a
          class="am-badge am-badge-success" href="/css/button-group">按钮组</a> <a
          class="am-badge am-badge-success" href="/css/form">表单</a>
        </p>
      </div>
    </div>
    <div class="am-g am-margin-top">
      <div class="am-u-sm-12 am-u-md-3">
        <a href="blog.html"><img class="am-img-thumbnail"
                                 src="${staticsPath!'../'}assets/i/examples/blogPage.png"
                                 alt="博客页面"/></a>
      </div>
      <div class="am-u-sm-12 am-u-md-9">
        <h3>博客页面</h3>

        <p>
          CSS 部分：<a class="am-badge am-badge-success" href="/css/grid">网格</a> <a
          class="am-badge am-badge-success" href="/css/block-grid">等宽布局</a> <a
          class="am-badge am-badge-success" href="/css/icon">图标</a> <a
          class="am-badge am-badge-success" href="/css/button">按钮</a> <a
          class="am-badge am-badge-success" href="/css/panel">面板</a> <a
          class="am-badge am-badge-success" href="/css/list">列表</a> <a
          class="am-badge am-badge-success" href="/css/pagination">分页</a><br/>
          JS 插件部分：<a class="am-badge am-badge-primary"
                     href="/css/dropdown">下拉组件</a>
        </p>
      </div>
    </div>
    <div class="am-g am-margin-top">
      <div class="am-u-sm-12 am-u-md-3">
        <a href="sidebar.html"><img class="am-img-thumbnail"
                                    src="${staticsPath!'../'}assets/i/examples/sidebarPage.png"
                                    alt="博客侧栏页面"/></a>
      </div>
      <div class="am-u-sm-12 am-u-md-9">
        <h3>博客侧栏页面</h3>

        <p>
          CSS 部分：<a class="am-badge am-badge-success" href="/css/grid">网格</a> <a
          class="am-badge am-badge-success" href="/css/article">文章页</a> <a
          class="am-badge am-badge-success" href="/css/comment">评论列表</a> <a
          class="am-badge am-badge-success" href="/css/button">按钮</a> <a
          class="am-badge am-badge-success" href="/css/icon">图标</a> <a
          class="am-badge am-badge-success" href="/css/list">列表</a> <a
          class="am-badge am-badge-success" href="/css/utility">辅助类</a><br/>
          JS 插件部分：<a class="am-badge am-badge-primary"
                     href="/javascript/offcanvas">侧边栏组件</a>
        </p>
      </div>
    </div>
    <hr/>
    <h2>Web 组件示例</h2>
    <ul>
      <li><a href="widget.basic.html">widget.basic.html</a> 使用了 <a
        href="http://amazeui.org/widgets">Web 组件</a> 的 HTML 结构和样式，但没用使用模板在前端渲染数据，供通过后端渲染数据的用户参考。</li>
      <li><a href="widget.html">widget.html</a> 是 Web 组件的展示，更多细节查看：<a
        href="http://amazeui.org/widgets">Web 组件</a></li>
    </ul>
    <h3>开始创建你的网页吧。</h3>
  </div>
</div>

<footer class="am-margin-top">
  <hr/>
  <p class="am-text-center">
    <small>by The AmazeUI Team.</small>
  </p>
</footer>
<!-- 以上页面内容 开发时删除 -->
</@h.head>