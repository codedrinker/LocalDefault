<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath =
            request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                    + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <base href="<%=basePath%>">

    <title>Channel list</title>
    <%
        String path = request.getContextPath();
        String basePath =
                request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                        + path + "/";
    %>
    <base href="<%=basePath%>">
    ¬
    <link rel="stylesheet" type="text/css" href="<%=basePath%>vendor/jquery-easyui-1.4.4/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>vendor/jquery-easyui-1.4.4/themes/icon.css">
    <script type="text/javascript" src="<%=basePath%>vendor/jquery-easyui-1.4.4/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>vendor/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>vendor/jquery-easyui-1.4.4/locale/easyui-lang-en.js"></script>
    <script type="text/javascript" src="<%=basePath%>scripts/combotree.js"></script>
</head>
<body class="easyui-layout">

<table id="dataList" toolbar="#tb" style="border: 1px">

</table>

<div id="dynamicWin">
</div>

</body>
</html>
