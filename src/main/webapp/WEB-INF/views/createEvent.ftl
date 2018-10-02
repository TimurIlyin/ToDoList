<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <#include "/resources/styles.css">
    <link href="https://fonts.googleapis.com/css?family=Charmonman" rel="stylesheet">
    <title>CREATE YOUR FUTURE EVENT</title>
</head>
<body>
<div class="base">
<form name="event" action="/addEvent" method="post">
    <p>Date</p>
    <input class="editor" type="date" name="date">

    <label for="inp" class="inp">
    <input class="editor" id="inp" type="text" name="event" placeholder="&nbsp;" maxlength=254>
    <span class="label">Event</span>
        <span class="border"></span>
    </label>

    <label for="inp" class="inp">
    <input class="editor" id="inp" type="text" name="comment" placeholder="&nbsp;" maxlength=254>
    <span class="label">Comments</span>
        <span class="border"></span>
    </label>


    <br>
    <br>
    <input type="submit" value="OK">
</form>
    <a href="/">To start page</a>
</div>

</body>
</html>