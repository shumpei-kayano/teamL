<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.jsp"%>
<main class="content">
<div class="container">
<form action="RecordRegistExecute.action" method="get">
	<div class="form-group">
		<div class="row">
			<!-- 氏名フィールド -->
			<div class="col-3">
				<label for="student_name">学生</label>
				<input type="text" class="form-control" id="student_name" name="student_name" value="大原太郎" required>
			</div>

			<!-- 欠席累計 -->
			<div class="col-1">
				<dl>
					<dt>欠席累計</dt>
					<dd>●●日</dd>
				</dl>
			</div>

			<!-- 日付フィールド -->
			<div class="col-3">
				<label for="date">日付</label>
				<input type="date" class="form-control" id="date" name="date" required>
			</div>

			<!-- 状況ラジオボタン -->
			<div class="col-5">
				<p id="condition">状況</p>
				<div class="form-check-inline">
					<input class="form-check-input" type="radio" name="condition" id="radio1" value="1">
					<label class="form-check-label fs-5" for="radio1"> 欠席 </label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="radio" name="condition" id="radio2" value="2">
					<label class="form-check-label fs-5" for="radio2"> 遅刻 </label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="radio" name="condition" id="radio3" value="3">
					<label class="form-check-label fs-5" for="radio3"> 早退 </label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="radio" name="condition" id="radio4" value="4">
					<label class="form-check-label fs-5" for="radio4"> その他 </label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="radio" name="condition" id="radio5" value="5">
					<label class="form-check-label fs-5" for="radio5"> なし </label>
				</div>
			</div>
		</div>

		<!-- 記録フィールド -->
		<label for="content">記録</label>
		<textarea class="form-control" id="content" name="content"></textarea>

		<!-- 登録ボタン -->
		<button class="btn btn-success btn-md" type="submit">登録</button>
	</div>
</form>

<!-- 戻るボタン -->
<button class="btn btn-secondary btn-md">
	<a href="RecordList.action" style="text-decoration: none;">戻る</a>
</button>
</div>
</main>
<%@include file="../footer.html"%>
