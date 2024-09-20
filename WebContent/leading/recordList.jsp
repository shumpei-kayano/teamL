<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.jsp"%>
<main class="content">
	<!-- 学生氏名と新規作成ボタン -->
	<div class="container border-box mt-5">

		<table class="table table-bordered text-center">
			<tr class="bg-primary fs-3">
				<th class="col-2">学生</th>
				<td class="col-2">大原太郎</td>
				<td class="col-2"><a class="btn btn-primary btn-lg"
					href="RecordRegist.action">新規</a></td>
			</tr>
		</table>

		<!-- 日付一覧と指導記録表示部分 -->
		<div class="row">

			<!-- 日付一覧部分 -->
			<div class="col-2 border-box text-center" >
				<div class="alert alert-light fs-5" role="alert">
  					日付一覧
				</div>
				<div class="row date-row overflow-auto sm-5" style="width: 100%; height: 220px; border: 1px black solid;">
				<% for(int i = 0; i < 20; i++){ %>
					<a href="#" class="mb-2">2024/●●/●●</a>
				<% } %>
				</div>
			</div>

			<!-- 指導記録表示部分 -->
			<div class="col-10 border-box">
				<div class="row date-row">
					<div class="col-1 border-box text-center d-flex align-items-center justify-content-center fs-6" style="border: 1px solid black;">日付</div>
					<div class="col-2 border-box text-center d-flex align-items-center justify-content-center fs-5" style="border: 1px solid black; margin-right: 5px">2024/9/15</div>
					<div class="col-1 border-box text-center d-flex align-items-center justify-content-center fs-6" style="border: 1px solid black;">入力者</div>
					<div class="col-2 border-box text-center d-flex align-items-center justify-content-center fs-5" style="border: 1px solid black;">黒澤崇将</div>
					<div class="col-2 border-box text-end d-flex align-items-center justify-content-center">
						<a class="btn btn-primary btn-lg" href="RecordUpdate.action">編集</a>
					</div>
					<div class="col-2 border-box text-end d-flex align-items-center justify-content-center">
						<a class="btn btn-danger btn-lg" href="RecordDelete.action">削除</a>
					</div>
				</div>

					<p class="fs-4 mt-2 mb-2">指導記録</p>
					<div class="row date-row overflow-auto" style="width: 100%; height: 200px; border: 1px black solid;">
						本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文文本文文本文文本文文本文
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文文本文文本文文本文文本文
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本
						文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文文本文本文本文文本文文本文文本

					</div>
					<br>

			</div>
		</div>

		<!-- 戻るボタン -->
		<div class="d-grid gap-2 d-md-flex justify-content-md-start mt-3">
			<a class="btn btn-secondary btn-lg" href="RecordList.action?id=${className}">戻る</a>
		</div>

	</div>
</main>
<%@include file="../footer.html"%>
