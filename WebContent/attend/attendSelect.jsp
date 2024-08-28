<%@page contentType="text/html; charset=UTF-8" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@include file="../header.jsp" %>
            <main class="content">
                <h2 class="content-title">出欠管理</h2>
                <div class="form-container">
                    <form method="post" action="AttendRegist.action">
                        <div class="form-group">
                            <label for="form-name">入学年度</label>
                            <input type="text" class="form-control" id="form-name" name="ent_year" required>
                        </div>
                        <div class="form-group">
                            <label for="month">月</label>
                            <select id="month" class="form-control" name="month" aria-label="Default select example" required>
                                <option value="">選択してください</option>
                                <c:forEach var="month" begin="1" end="12">
                                    <option value="${month}">${month}月</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="class">クラス</label>
                            <select id="class" class="form-control" name="class" aria-label="Default select example" required>
                                <option value="">選択してください</option>
                                <option value="101">101</option>
                                <option value="102">102</option>
                                <option value="201">201</option>
                                <option value="202">202</option>
                            </select>
                        </div>
                        <button class="btn btn-primary btn-lg attend-btn-next" type="submit">次へ</button>    
                    </form>
                </div>
            </main>
            <%@include file="../footer.html" %>