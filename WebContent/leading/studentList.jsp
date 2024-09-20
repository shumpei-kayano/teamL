<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.jsp"%>
<main class="content">
<div class="align-items-center ms-3">
	<form class="form-container" action="RecordList.action" method="GET">
		<div class="mb-3">
			<h2>指導記録</h2>
			<!-- ラベル -->
			<label for="classDropdown" class="form-label">クラス</label>
			<!-- プルダウンメニュー -->
			<select class="form-select" id="classDropdown" name="className" required>
				<option value="" selected disabled>選択してください</option>
				<option value="101">101</option>
				<option value="102">102</option>
				<option value="201">201</option>
				<option value="202">202</option>
			</select>
		</div>
		<!-- 表示ボタン -->
		<button class="btn btn-primary" type="submit">表示</button>
	</form>
	<p class="mt-3 ms-5 fs-5">現在選択されているクラスは <span class="badge text-bg-primary">${className}</span> です</p>


	<!-- テーブル -->
	<div class="row">
	<div class="col-6">
	<table class="table table-striped mt-3 ms-5 text-center">
		<thead>
			<tr>
				<th scope="col">学生番号</th>
				<th scope="col">氏名</th>
				<th scope="col">欠席累計</th>
				<th scope="col">指導記録</th>
			</tr>
		</thead>
		<tbody>
		<% for(int i=0; i < 29; i++){ %>
			<tr>
				<td>1234567</td>
				<td>山田太郎</td>
				<td>3</td>
				<td><button class="btn btn-primary btn-sm left-bottom">
					<a href="RecordListExecute.action" style="text-decoration: none;">参照</a>
					</button>
				</td>
			</tr>
		<% } %>
		</tbody>
	</table>
	</div>
	</div>
</div>

</main>
<%@include file="../footer.html"%>