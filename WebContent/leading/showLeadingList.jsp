<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.jsp"%>
<main class="content">
<div class="container border-box mt-5">
    <table class="table table-bordered">
        <tr class="bg-primary fs-5">
            <th class="text-center col-2">学生</th>
            <td class="text-center col-2">大原太郎</td>
            <td class="text-center col-2"><a class="btn btn-primary" href="RecordRegist.action">新規</a></td>
        </tr>
    </table>

    <div class="row">
        <div class="col-2 border-box text-center">
            <a href="#">2023/01/16</a><br>
            <a href="#">2023/01/18</a><br>
            <a href="#">2023/01/20</a><br>
            <a href="#">2023/02/13</a><br>
            <a href="#">2023/02/15</a><br>
            <a href="#">2023/02/22</a><br>
            <a href="#">2023/02/28</a><br>
            <a href="#">2023/03/20</a><br>
            <a href="#">2023/03/25</a><br>
            <a href="#">2023/04/05</a><br>
        </div>
        <div class="col-10 border-box">
            <div class="row date-row">
                <div class="col-2 border-box text-center">日付</div>
                <div class="col-4 border-box text-center">2024/5/29</div>
                <div class="col-2 border-box text-center">入力者</div>
                <div class="col-2 border-box text-center">編集</div>
                <div class="col-2 border-box text-center">削除</div>
            </div>
            <div class="row">
                <div class="col-12 border-box text-center">指導記録一件</div>
            </div>
        </div>
    </div>
    <div class="row list-row">
        <div class="col-2 border-box list-box text-center">日付一覧</div>
        <div class="col-10 border-box date-box">
            <p>以下日付ごとのデータが続く</p>
        </div>
    </div>
    <div class="row">
        <div class="col-12 text-center">
            <a class="btn btn-secondary btn-md" href="ShowStudentList.action?id=${className}">戻る</a>
        </div>
    </div>
</div>
</main>
<%@include file="../footer.html"%>
