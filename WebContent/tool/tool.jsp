<%@page contentType="text/html; charset=UTF-8" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@include file="../header.jsp" %>
            <main class="content p-2">

                <!-- 各種ページタイトル -->
                <!-- 左側と上にマージンが設定されています。 -->
                <h2 class="content-title">各種ページタイトル</h2>

                <!-- 登録・実行ボタン -->
                <!-- ボタンのtype属性をsubmitにすることで送る -->
                <button class="btn btn-success btn-lg" type="submit">登録</button>

                <!-- 削除ボタン -->
                <!-- 削除するべき主キーのidをhiddenで一緒に送る -->
                <input type="hidden" name="delete_id">
                <button class="btn btn-danger btn-lg" type="submit">削除</button>

                <!-- 戻る・終了ボタン -->
                <!-- 戻るときはデータを送る必要はないため、リンクで全ページに戻る -->
                <button class="btn btn-secondary btn-lg"><a href="●●.action"
                        style="text-decoration:none;">戻る</a></button>

                <!-- 次へボタン -->
                <button class="btn btn-primary btn-lg" type="submit">次へ</button>    

                <!-- 訓告など -->
                <span class="badge bg-danger">訓告済</span>

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
                <div class="radio-group">
                    <div class="form-check-inline">
                        <input class="form-check-input" type="radio" name="condition" id="radio1" value="1">
                        <label class="form-check-label fs-5" for="radio1">
                            欠席
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <input class="form-check-input" type="radio" name="condition" id="radio2" value="2">
                        <label class="form-check-label fs-5" for="radio2">
                            遅刻
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <input class="form-check-input" type="radio" name="condition" id="radio3" value="3">
                        <label class="form-check-label fs-5" for="radio3">
                            早退
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <input class="form-check-input" type="radio" name="condition" id="radio4" value="4">
                        <label class="form-check-label fs-5" for="radio4">
                            その他
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <input class="form-check-input" type="radio" name="condition" id="radio5" value="5">
                        <label class="form-check-label fs-5" for="radio5">
                            なし
                        </label>
                    </div>
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

                <!-- マージンやパディング -->
                <div><a href="https://getbootstrap.jp/docs/5.3/utilities/spacing/">マージンやパディングの設定方法</a></div>
                <!-- サイズ調整 -->
                <div><a href="https://getbootstrap.jp/docs/5.3/utilities/sizing/">サイズの調整</a></div>

                <!-- テキストの色を変える -->
                <div><a class="text-danger" href="https://getbootstrap.jp/docs/5.3/utilities/colors/">テキストの色を変える</a>
                </div>

                <!-- mainタグ直下においてください。main（色塗り部分）を基準に右下40pxの余白を設定しています。 -->
                <button class="btn btn-success btn-lg right-bottom" type="submit">ボタンを右下に配置する</button>
            </main>
            <%@include file="../footer.html" %>