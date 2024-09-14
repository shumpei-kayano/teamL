<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.jsp"%>
<main class="content">
<div class="container border-box mt-5">
	<table class="table table-bordered">
		<tr class="bg-primary fs-5">
			<th class="text-center col-2">学生</th>
			<td class="text-center col-2">大原太郎</td>
			<td class="text-center col-2"><a class="btn btn-primary"
				href="RecordRegist.action">新規</a></td>
		</tr>
	</table>

	<div class="row">
		<div class="col-2 border-box text-center bg-success">
			<p>日付一覧</p>
			<a href="#">2023/01/16</a><br> <a href="#">2023/01/18</a><br>
			<a href="#">2023/01/20</a><br> <a href="#">2023/02/13</a><br>
			<a href="#">2023/02/15</a><br> <a href="#">2023/02/22</a><br>
			<a href="#">2023/02/28</a><br> <a href="#">2023/03/20</a><br>
			<a href="#">2023/03/25</a><br> <a href="#">2023/04/05</a><br>
		</div>
		<div class="col-10 border-box bg-info">
			<div class="row date-row">
				<div class="col-3 border-box text-center">日付: 2024/9/15</div>
				<div class="col-3 border-box text-center">入力者: 黒澤崇将</div>
				<div class="col-2 border-box text-center">
					<a class="btn btn-primary btn-md" href="RecordUpdate.action">編集</a>
				</div>
				<div class="col-2 border-box text-center">
					<a class="btn btn-danger btn-md" href="RecordDelete.action">削除</a>
				</div>
                <div>
                    本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文本文
                </div>
			</div>

		</div>
	</div>
	<div class="row">
		<div class="col-12 text-center">
			<a class="btn btn-secondary btn-md"
				href="RecordList.action?id=${className}">戻る</a>
		</div>
	</div>
</div>
</main>
<%@include file="../footer.html"%>
