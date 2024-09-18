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

	<p class="m-3 fs-5">現在選択されているクラスは <span class="badge text-bg-primary">${className}</span> です</p>

	<!-- テーブル -->
	<table class="table table-striped m-3">
		<thead>
			<tr>
				<th>学生番号</th>
				<th>氏名</th>
				<th>欠席累計</th>
				<th>指導記録</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1234567</td>
				<td>山田太郎</td>
				<td>3</td>
				<td><button class="btn btn-primary btn-sm left-bottom">
						<a href="RecordListExecute.action" style="text-decoration: none;">参照</a>
					</button>
				</td>
			</tr>
			<tr>
				<td>1234567</td>
				<td>大原花子</td>
				<td>5</td>
				<td><button class="btn btn-primary btn-sm left-bottom">
						<a href="RecordListExecute.action" style="text-decoration: none;">参照</a>
					</button>
				</td>
			</tr>
		</tbody>
	</table>
</div>

</main>
<%@include file="../footer.html"%>