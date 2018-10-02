<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <#include "/resources/styles.css">
    <link href="https://fonts.googleapis.com/css?family=Charmonman" rel="stylesheet">
    <title>Your events</title>
</head>
<body>
    <h1>Event list</h1>
    <table>
        <tr>
            <th>Date</th>
            <th>Event</th>
            <th>Comments</th>
        </tr>
        <#list events as Event>
            <tr>
                <td>${Event.date}</td>
                <td>${Event.event}</td>
                <td>${Event.comment}</td>
            </tr>
        </#list>
    </table>

<a href="/addEvent">CREATE NEW EVENT</a>
</body>
</html>