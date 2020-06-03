<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生页面</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-2.2.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<form action="/student" method="post">
    <div class="form-group">
        <label >id</label>
        <input type="text" name="id" class="form-control"  >
    </div>
    <div class="form-group">
        <label >number</label>
        <input type="text" name="number" class="form-control"  >
    </div>
    <div class="form-group">
        <label >name</label>
        <input type="text" name="name" class="form-control"  >
    </div>
    <div class="form-group">
        <label >qq</label>
        <input type="text" name="qq" class="form-control"  >
    </div>
    <div class="form-group">
        <label >职业</label>
        <input type="text" name="job" class="form-control"  >
    </div>
    <div class="form-group">
        <label >院校</label>
        <input type="text" name="university" class="form-control"  >
    </div>
    <div class="form-group">
        <label >师兄</label>
        <input type="text" name="brother" class="form-control"  >
    </div>
    <div class="form-group">
        <label >链接</label>
        <input type="text" name="link" class="form-control"  >
    </div>
    <div class="form-group">
        <label >立志</label>
        <input type="text" name="target" class="form-control">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>
