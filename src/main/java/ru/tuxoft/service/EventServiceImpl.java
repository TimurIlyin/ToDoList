package ru.tuxoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tuxoft.dao.EventDao;
import ru.tuxoft.entity.Event;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    public EventDao eventDao;

    public void save(Event event) {
        eventDao.save(event);
    }

    public List<Event> findAll() {
        return eventDao.findAll();
    }

    public List<Event> dailyRoutine() {
        return eventDao.dailyRoutine();
    }
}
