<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<main class="content">

    <h2 class="content-title">成績管理</h2>
    <div>
   	    <ul>
	        <li><a href="/teamL/grades/SelectStudent.action">学番指定</a></li>
	        <li><a href="/teamL/grades/SelectClass.action">クラス指定</a></li>
        </ul>
    </div>

</main>
<%@include file="../footer.html" %>