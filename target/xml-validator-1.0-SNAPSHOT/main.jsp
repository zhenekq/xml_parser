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
            display: flex;
            margin: 0 auto;
            width: 210px;
        }

        .btn {
            margin-top: 30px;
            width: 120px;
        }

        h2 {
            margin-top: 60px;
            width: auto;
        }

        .invisible_text {
            color: red;
            position: absolute;
            bottom: 360px;
        }

        .parsed_info {
            position: absolute;
            bottom: 466px;
            right: 200px;
            color: darkgreen;
        }

        #parse {
            margin-right: 20px;
        }

        #currentXML {
            margin-top: 5px;
            margin-bottom: 20px;
            background-color: #DEB887;
        }

        .information {
            display: grid;
            gap: 10px;
            grid-template-columns: repeat(2, 1fr)
        }

        #resultXML {
            background-color: #BC8F8F;
        }

    </style>
</head>
<body>

<div class="main_page">
    <div class="container">
        <div class="page_title">
            <h1>Xml-validator</h1>
        </div>
        <form action="${pageContext.request.contextPath}/main" method="post" enctype="multipart/form-data">
            <div class="file_form">
                <div class="file_input">
                    <label for="formFile" class="form-label">Please, choose your xml file!</label>
                    <input class="form-control" type="file" accept=".xml" id="formFile" name="file">
                    <input type="hidden" value="/tmp" name="destination"/>
                </div>
                <c:if test="${isVisible == false}" var="isVisible">
                    <div class="invisible_text">
                        <p>Choose the file please!</p>
                    </div>
                </c:if>
                <c:if test="${isVisible == false}">
                    <div class="parsed_info">
                        <p>Name of parsed file:
                            <strong><c:out value=" ${parsed_file}"/></strong>
                        </p>

                        <p>Parsing tool:
                            <strong><c:out value="${parsing_tool}"/></strong>
                        </p>
                    </div>
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
                <button type="submit" name="parse" class="btn btn-primary" id="parse">Parse it</button>
                <button type="submit" name="check" class="btn btn-primary" id="checkIsValid">Is valid?</button>
            </div>
        </form>
        <div class="information">
            <div class="file_data">
                <i><h2>Current file:</h2></i>
                <c:set var="amount" scope="session" value="42"/>
                <c:if test="${isVisible == false}" var="isVisible">
                    <div class="form-group">
                        <textarea class="form-control" disabled id="currentXML" rows="${amount}">
                            <c:out value="${xml_data}"/>
                        </textarea>
                    </div>
                </c:if>
            </div>
            <div class="parsing_data">
                <strong><i><h2>Parsing info:</h2></i></strong>
                <c:if test="${isVisible != false}" var="isVisible">
                    <div class="form-group">
                        <textarea class="form-control" disabled id="resultXML" rows="${amount}">
                            <c:out value="${parsed_xml}"/>
                        </textarea>
                    </div>
                </c:if>
            </div>
        </div>
    </div>
</div>
<footer class="text-muted border-top border-2">
    <div class="container">
        <p class="float-end mb-1">
        <p class="float-end mb-1">© 2021 zhenekq</p>
        <p class="mb-1">Xml-validator</p>
        <p class="mb-0">Check my github-account <a href="https://github.com/zhenekq" target="_blank">Github account</a>
        </p>
    </div>
</footer>
</body>
</html>
