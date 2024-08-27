<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<main class="content p-2">

    <!-- 登録ボタン -->
    <!-- ボタンのtype属性をsubmitにすることで送る -->
    <button class="btn btn-success btn-lg" type="submit">登録</button>

    <!-- 削除ボタン -->
    <!-- 削除するべき主キーのidをhiddenで一緒に送る -->
    <input type="hidden" name="delete_id">
    <button class="btn btn-danger btn-lg" type="submit">削除</button>

    <!-- 戻るボタン -->
    <!-- 戻るときはデータを送る必要はないため、リンクで全ページに戻る -->
    <button class="btn btn-secondary btn-lg"><a href="●●.action" style="text-decoration:none;">戻る</a></button>

    <!-- 入力フォーム -->
    <!-- formタグのname属性を修正 -->
    <form method="post" action="●●.action">
        <div class="form-group">
            <label for="form-name">フォーム名</label>
            <input type="text" class="form-control" id="form-name" name="form-name">
        </div>
    </form>

    <!-- セレクトボックス -->
    <!-- name属性を修正。value属性が実際にサーブレットに送るデータ -->
    <select class="form-control" name="fruits" aria-label="Default select example">
        <option selected>選択してください</option>
        <option value="apple">りんご</option>
        <option value="banana">バナナ</option>
        <option value="melon">メロン</option>
    </select>

    <!-- ラジオボタン -->
    <!-- name属性を修正。すべてのラジオボタンでname属性は同じになる value属性が実際にサーブレットに送るデータ -->
    <div class="form-check">
        <input class="form-check-input" type="radio" name="fruits" id="radio1" value="apple">
        <label class="form-check-label" for="radio1">りんご</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="fruits" id="radio2" value="banana">
        <label class="form-check-label" for="radio2">バナナ</label>
    </div>

    <!-- チェックボックス -->
    <!-- name属性を修正。すべてのチェックボックスでname属性は同じになる value属性が実際にサーブレットに送るデータ -->
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="fruits" id="check1" value="apple">
        <label class="form-check-label" for="check1">りんご</label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="fruits" id="check2" value="banana">
        <label class="form-check-label" for="check2">バナナ</label>
    </div>

    <!-- 検索フォーム -->
    <form class="form-inline">
        <input type="text" class="form-control" placeholder="検索">
        <button type="submit" class="btn btn-primary btn-lg">検索</button>
    </form>
    <!-- テーブル -->
    <table class="table table-striped">
        <thead>
            <tr>
                <th>項目１</th>
                <th>項目２</th>
                <th>項目３</th>
                <th>項目４</th>
                <th>項目５</th>
            </tr>
        </thead>
        <tbody>
                <tr>
                    <td>データ１</td>
                    <td>データ２</td>
                    <td>データ３</td>
                    <td>データ４</td>
                    <td>データ５</td>
                </tr>
                <tr>
                    <td>データ６</td>
                    <td>データ７</td>
                    <td>データ８</td>
                    <td>データ９</td>
                    <td>データ１０</td>
                </tr>
        </tbody>
    </table>

</main>
<%@include file="../footer.html" %>