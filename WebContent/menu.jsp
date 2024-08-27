<%@page pageEncoding="UTF-8" %>
<header>
    <div class="header-container">
        <div class="header-left">
            <h1><a href="/teamL">学生管理システム</a></h1>
        </div>
        <div class="header-right">
            <p>ようこそ●●さん</p>
            <div class="login-btn">
                <a href="/teamL/login/Logout.action">ログアウト</a>
                <a href="/teamL/login/PWUpdate.action">パスワード変更</a>
            </div>
        </div>
    </div>
    <div class="global-nav">
        <nav>
            <ul>
                <li><a href="/teamL/attend/AttendSelect.action">出欠管理</a></li>
                <li><a href="/teamL/leading/RecordList.action">指導記録</a></li>
                <li><a href="/teamL/grades/GradesList.action">成績管理</a></li>
                <li><a href="/teamL/report/ReportList.action">帳票出力</a></li>
                <li><a href="/teamL/admin/Auth.action">管理職機能</a></li>
            </ul>
        </nav>
    </div>
</header>
<hr>
