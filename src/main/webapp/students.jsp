<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<div class="container">
<div class="row">
    <table class="table table-hover table-striped">
        <tr>
            <th>id</th>
            <th>number</th>
            <th>姓名</th>
            <th>职业</th>
            <th>qq</th>
            <th>院校</th>
            <th>链接</th>
            <th>师兄</th>
            <th>立志</th>
            <th>创建时间</th>
            <th>修改时间</th>
        </tr>
        <c:forEach var="stu" items="${student}">
        <tr>
            <th>${stu.id}</th>
            <th>${stu.number}</th>
            <th>${stu.name}</th>
            <th>${stu.job}</th>
            <th>${stu.qq}</th>
            <th>${stu.university}</th>
            <th>${stu.link}</th>
            <th>${stu.brother}</th>
            <th>${stu.target}</th>
            <th>${stu.createTime}</th>
            <th>${stu.updateTime}</th>
        </tr>
        </c:forEach>
    </table>
</div>
</div>
