package ru.tuxoft.mapper;

import ru.tuxoft.entity.Event;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventMapper implements RowMapper<Event> {
    public Event mapRow(ResultSet resultSet, int i) throws SQLException {
        Event event = new Event();
        event.setId(resultSet.getInt("id"));
        event.setDate(resultSet.getObject("datevalue", Date.class));
        event.setEvent(resultSet.getString("eventname"));
        event.setComment(resultSet.getString("comment"));
        return event;
    }
}
