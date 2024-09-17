<%@page contentType="text/html; charset=UTF-8" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.Calendar" %>
        <%@include file="../header.jsp" %>
            <style>
                .table-responsive {
                    max-height: 80vh;
                    overflow-x: auto;
                }

                th {
                    position: sticky;
                    top: 0;
                    background-color: #f8f9fa;
                    white-space: nowrap;
                }

                th:first-child,
                td:first-child {
                    position: sticky;
                    left: 0;
                    background-color: #f8f9fa;
                    z-index: 1;
                    min-width: 100px;
                }

                select.form-select-sm {
                    width: 70px;
                }
            </style>
            <main class="content">
                <!-- データを受け取って表示 -->
                <h2 class="content-title">出欠管理：
                    <c:out value="${month}" />月出欠入力　
                    <c:out value="${ent_year}" />年度生　
                    <c:out value="${classNum}" />クラス
                </h2>
                <form action="AttendRegistExecute.action" method="post">
                    <div class="container-fluid mt-5">
                        <div class="table-responsive">
                            <table id="calendarTable" class="table table-striped table-hover">
                                <thead>
                                    <tr id="headerRow">
                                        <th>学生名</th>
                                        <!-- 日付はここに動的に追加されます -->
                                    </tr>
                                </thead>
                                <tbody>
                                    <!-- 学生の行はここに動的に追加されます -->
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <button class="btn btn-success btn-lg right-bottom" type="submit">登録</button>
                </form>
                <script>
                    // サーブレットから送られてきた月を使用
                    const month = <%= request.getAttribute("month") %>;
                    const year = <%= Calendar.getInstance().get(Calendar.YEAR) %>; // 現在の年を使用

                    // 学生のサンプルデータ
                    const students = ["田中", "佐藤", "鈴木", "高橋", "渡辺"];

                    // カレンダーの日付を生成し、ヘッダー行に追加
                    function generateCalendarHeader() {
                        const daysInMonth = new Date(year, month, 0).getDate();
                        const headerRow = document.getElementById('headerRow');

                        for (let day = 1; day <= daysInMonth; day++) {
                            const date = new Date(year, month - 1, day); // 月は0から始まるため、-1する
                            const th = document.createElement('th');
                            th.textContent = date.toLocaleDateString('ja-JP', { month: 'short', day: 'numeric' });
                            headerRow.appendChild(th);
                        }
                    }

                    // 学生ごとの行を生成
                    function generateStudentRows() {
                        const tbody = document.querySelector('tbody');
                        const daysInMonth = new Date(year, month, 0).getDate();

                        students.forEach(student => {
                            const row = document.createElement('tr');

                            // 学生名セル
                            const nameCell = document.createElement('th');
                            nameCell.textContent = student;
                            row.appendChild(nameCell);

                            // 各日付のセレクトボックス
                            for (let day = 1; day <= daysInMonth; day++) {
                                const date = new Date(year, month - 1, day); // 月は0から始まるため、-1する
                                const cell = document.createElement('td');
                                const select = document.createElement('select');
                                select.className = 'form-select form-select-sm';
                                select.name = `rating_${student}_${date.toISOString().split('T')[0]}`;

                                // オプションを追加
                                select.innerHTML = `
                                        <option value="">-</option>
                                        <option value="1">遅</option>
                                        <option value="2">欠</option>
                                        <option value="3">早</option>
                                        <option value="4">他</option>
                                    `;

                                cell.appendChild(select);
                                row.appendChild(cell);
                            }

                            tbody.appendChild(row);
                        });
                    }

                    // カレンダーを生成
                    generateCalendarHeader();
                    generateStudentRows();
                </script>

                <!-- Bootstrap JS (optional, but needed for some Bootstrap features) -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
            </main>
            <%@include file="../footer.html" %>