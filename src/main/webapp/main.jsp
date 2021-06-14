<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 14.06.2021
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>xml-parser</title>
    <style>

        body {
            margin: 0;
            padding: 0;
            background-color: #E9E7E7;
        }

        .container {
            max-width: 1200px;
        }

        .page_title {
            margin-top: 20px;
            text-align: center;
        }

        .file_form {
            display: flex;
            align-items: center;
            justify-content: center;
            margin-top: 50px;
        }


        .file_input {
            width: 300px;
            margin-right: 15px;
        }

        .select_form {
            margin-left: 15px;
        }

        .submit_button {
            margin: 0 auto;
            width: 100px;
        }

        .btn {
            margin-top: 20px;
        }

        h2 {
            margin-top: 60px;
            width: auto;
        }

        .invisible_text{
            color: red;
            position: absolute;
            bottom: 400px;
        }


    </style>
</head>
<body>

<div class="main_page">
    <div class="container">
        <div class="page_title">
            <h1>Xml-validator</h1>
        </div>
        <form action="${pageContext.request.contextPath}/main" method="post">
            <div class="file_form">
                <div class="file_input">
                    <label for="formFile" class="form-label">Please, choose your xml file!</label>
                    <input class="form-control" type="file" id="formFile" name="file">
                </div>
                <c:if test="${isVisible == false}" var="isVisible">
                    <div class="invisible_text">
                        <p>Choose the file please!</p>
                    </div>
                    <c:set var="isVisible" value="true"/>
                </c:if>
                <div class="select_form">
                    <label for="formFile" class="form-label">Please, choose your parser!</label>
                    <select class="form-select" name="selected_items" aria-label="Default select example">
                        <option name="selected_item" value="DOM" selected>DOM</option>
                        <option name="selected_item" value="SAX">SAX</option>
                        <option name="selected_item" value="STAX">STAX</option>
                    </select>
                </div>
            </div>
            <div class="submit_button">
                <button type="submit" name="submit" class="btn btn-primary">Parse it</button>
            </div>
        </form>
        <h2>Xml information: </h2>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Tariff</th>
                <th scope="col" class="table-danger">MTC-BONUS</th>
                <th scope="col">MTC-BONUS+</th>
                <th scope="col">MTC-NETWORK</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="col">Tariff price</th>
                <td class="table-danger">Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
            </tr>
            <tr>
                <th scope="col">Calls in network</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr>
                <th scope="col">Calls out of network</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr>
                <th scope="col">Stationary calls</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr>
                <th scope="col">Amount of favorite numbers</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr>
                <th scope="col">SMS price</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr>
                <th scope="col">Tariffication</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr>
                <th scope="col">Connection price</th>
                <td colspan="2" class="table-danger">Larry the Bird</td>
                <td>@twitter</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<footer class="text-muted">
    <div class="container">
        <p class="float-end mb-1">
        <p class="float-end mb-1">© 2021 zhenekq</p>
        </p>
        <p class="mb-1">Xml-validator</p>
        <p class="mb-0">Check my github-account <a href="https://github.com/zhenekq">Github account</a></p>
    </div>
</footer>
</body>
</html>
