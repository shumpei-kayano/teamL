<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.jsp" %>
<main class="content">

  <div class="row justify-content-center">
    <div class="col-md-4">
      <h4 class="text-center mb-4">パスワード変更</h4>
      <form action="●●.action" method="post">
        <div class="mb-3">
          <input type="password" class="form-control" name="oldpass" placeholder="現在のパスワード" required>
        </div>
        <div class="mb-3">
          <input type="password" class="form-control" name="new1pass" placeholder="新しいパスワード" required>
        </div>
        <div class="mb-3">
          <input type="password" class="form-control" name="new2pass" placeholder="新しいパスワード" required>
        </div>
        <div class="d-grid mb-3">
          <button class="btn btn-success btn-lg" type="submit">変更</button>
        </div>
       </form>
     </div>
    </div>

</main>
<%@include file="../footer.html" %>

