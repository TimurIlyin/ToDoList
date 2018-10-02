package ru.tuxoft.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.tuxoft.entity.Event;
import ru.tuxoft.mapper.EventMapper;

import java.util.List;

@Service
public class EventDaoImpl implements EventDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public EventDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Event event){
        String sql = "INSERT INTO event (datevalue, eventname, comment) VALUES (?,?,?)";
        jdbcTemplate.update(sql, event.getDate(), event.getEvent(), event.getComment());
    }

    public List<Event> findAll() {
        String sql = "SELECT * FROM event";
        return jdbcTemplate.query(sql, new EventMapper());
    }

    public List<Event> dailyRoutine() {
        String sql = "SELECT * FROM event WHERE datevalue = current_date";
        return jdbcTemplate.query(sql, new EventMapper());
    }
}
