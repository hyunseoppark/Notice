<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="/css/style.css">
</head>
<body>
<table>
    <thead>
        <tr>
            <th class="idx">번호</th>
            <th class="category">구분</th>
            <th class="title">제목</th>
            <th class="reg-date">등록일</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="notice" items="${noticeList}">
            <tr>
                <td class="idx">${notice.idx}</td>
                <td class="category">${notice.category}</td>
                <td class="title"><a>${notice.title}</a></td>
                <td class="reg-date">${notice.regDate}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
