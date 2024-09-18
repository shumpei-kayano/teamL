<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<main class="content">

    <h2 class="content-title">成績管理</h2>
    <div>
   	    <ul>
	        <li><a href="/teamL/attend/AttendSelect.action">学番指定</a></li>
	        <li><a href="/teamL/grades/SelectClass.action">クラス指定</a></li>
        </ul>
    </div>
    <div>
    <form method="post" action="StudentGradesRegist.action">
    	<table>
    		<tr>
        	<td><label for="stu">学生番号</label></td>
            <td><input type="text" class="form-control" id="form-name" name="form-name"></td>
            <td><button class="btn btn-success btn-lg" type="submit">開始</button></td>
        	</tr>
        </table>
    </form>
	</div>

</main>
<%@include file="../footer.html" %>