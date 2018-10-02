<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <#include "/resources/styles.css">
    <link href="https://fonts.googleapis.com/css?family=Charmonman" rel="stylesheet">
    <title>CREATE YOUR FUTURE EVENT</title>
</head>
<body>

<form name="event" action="/addEvent" method="post">
    <p>Date</p>
    <input class="editor" type="date" name="date">
    <p>Event</p>
    <input class="editor" type="text" name="event">
    <p>Comments</p>
    <input class="editor" type="text" name="comment">
    <br>
    <br>
    <input type="submit" value="OK">
</form>

</body>
</html>