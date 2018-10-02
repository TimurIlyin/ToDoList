<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <#include "/resources/styles.css">
    <link href="https://fonts.googleapis.com/css?family=Charmonman" rel="stylesheet">
    <title>Your events</title>
</head>
<body>
<div class="base">
    <h1>Daily routine</h1>
    <div class="block">
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
    </div>
    <a class="link" href="/events">All events     </a>    |
    <a class="link" href="/addEvent">    Create new event</a>
</div>
</body>
</html>