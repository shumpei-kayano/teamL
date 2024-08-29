<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<main class="content">
	<div class="d-flex align-items-center ms-3">
        <form action="ShowStudentList.action" method="GET">
            <div class="mb-3">
            <h2>指導記録</h2>
                <!-- ラベル -->
                <label for="classDropdown" class="form-label">クラス</label>
                <!-- プルダウンメニュー -->
                <select id="class" class="form-control" name="className" aria-label="Default select example" required>
                    <option value="" selected disabled>クラスを選択してください</option>
                    <option value="101">101</option>
                    <option value="102">102</option>
                    <option value="201">201</option>
                    <option value="202">202</option>
                </select>
            </div>
            <!-- 表示ボタン -->
            <button class="btn btn-primary" type="submit">表示</button>
        </form>
    </div>

</main>
<%@include file="../footer.html" %>