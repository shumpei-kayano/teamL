<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.jsp"%>
<main class="content">
<form action="RecordRegistExecute.action" method="get">
	<div class="form-group">
		<label for="student_name">学生</label> <input type="text"
			class="form-control" id="student_name" name="student_name"
			value="大原太郎" required>
		<dl>
			<dt>欠席累計</dt>
			<dd>●●日</dd>
		</dl>
		<label for="date">日付</label> <input type="date" class="form-control"
			id="date" name="date" required>
		<div class="radio-group">
			<label for="condition">状況</label>
			<div class="form-check-inline">
				<input class="form-check-input" type="radio" name="condition"
					id="radio1" value="1"> <label class="form-check-label fs-5"
					for="radio1"> 欠席 </label>
			</div>
			<div class="form-check-inline">
				<input class="form-check-input" type="radio" name="condition"
					id="radio2" value="2"> <label class="form-check-label fs-5"
					for="radio2"> 遅刻 </label>
			</div>
			<div class="form-check-inline">
				<input class="form-check-input" type="radio" name="condition"
					id="radio3" value="3"> <label class="form-check-label fs-5"
					for="radio3"> 早退 </label>
			</div>
			<div class="form-check-inline">
				<input class="form-check-input" type="radio" name="condition"
					id="radio4" value="4"> <label class="form-check-label fs-5"
					for="radio4"> その他 </label>
			</div>
			<div class="form-check-inline">
				<input class="form-check-input" type="radio" name="condition"
					id="radio5" value="5"> <label class="form-check-label fs-5"
					for="radio5"> なし </label>
			</div>
		</div>
		<label for="content">記録</label>
		<textarea class="form-control" id="content" name="content"
			name="content"></textarea>

		<!-- ボタンのtype属性をsubmitにすることで送る -->
		<button class="btn btn-success btn-md" type="submit">登録</button>

	</div>
</form>

<!-- 戻るときはデータを送る必要はないため、リンクで全ページに戻る -->
<button class="btn btn-secondary btn-md">
	<a href="RecordList.action" style="text-decoration: none;">戻る</a>
</button>
</main>
<%@include file="../footer.html"%>