<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<json:object name="result">
    <json:property name="code" value="${result.code}" />
    <json:property name="message" value="${result.message}" />
    <json:array name="data" var="stu" items="${result.data}">
        <json:property name="id" value="${stu.id}" />
        <json:property name="number" value="${stu.number}" />
        <json:property name="name" value="${stu.name}" />
        <json:property name="qq" value="${stu.qq}" />
        <json:property name="job" value="${stu.job}" />
        <json:property name="university" value="${stu.university}" />
        <json:property name="brother" value="${stu.brother}" />
        <json:property name="link" value="${stu.link}" />
        <json:property name="target" value="${stu.target}" />
        <json:property name="createTime" value="${stu.createTime}" />
        <json:property name="updateTime" value="${stu.updateTime}" />
    </json:array>

</json:object>


