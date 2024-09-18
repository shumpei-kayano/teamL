<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生管理システム</title>
<link rel="stylesheet" type="text/css" href="/teamL/css/reset.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/teamL/css/style.css">
</head>
<body class="d-flex justify-content-center align-items-center vh-100">

<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-4">
      <div class="text-start mb-4">
        <h1 class="h3">学生管理システム</h1>
      </div>
      <h4 class="text-center mb-4">ログインしてください</h4>

      <form action="●●.action" method="post">
        <div class="mb-3">
          <input type="text" class="form-control" name="id" placeholder="ID" required>
        </div>
        <div class="mb-3">
          <input type="password" class="form-control" name="pw" placeholder="PW" required>
        </div>
        <div class="d-grid mb-3">
          <button class="btn btn-primary btn-lg" type="submit">ログイン</button>
        </div>
       </form>

       <form action="●●.action" method="post">
        <div class="mb-3">
          <select class="form-select" name="school">
            <option value="">学校</option>
            <!-- 学校のオプションを追加 -->
            <option value="school1">学校1</option>
            <option value="school2">学校2</option>
          </select>
        </div>
        <div class="d-grid">
          <button class="btn btn-primary btn-lg" type="submit">選択</button>
        </div>
      </form>

    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+6EmtD0E7o2w1pDIksk0nsB9eKF6p" crossorigin="anonymous"></script>
</body>
</html>