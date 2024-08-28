<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<main class="content">
	<div class="d-flex align-items-center ms-3">
        <form action="#" method="GET">
            <div class="mb-3">
                <!-- ラベル -->
                <label for="classDropdown" class="form-label">クラス</label>
                <!-- プルダウンメニュー -->
                <select class="form-select" id="classDropdown" name="class" required>
                    <option value="" selected disabled>クラスを選択してください</option>
                    <option value="1">クラス 1</option>
                    <option value="2">クラス 2</option>
                    <option value="3">クラス 3</option>
                </select>
            </div>
            <!-- 表示ボタン -->
            <button class="btn btn-primary" type="submit">表示</button>
        </form>
    </div>

</main>
<%@include file="../footer.html" %>