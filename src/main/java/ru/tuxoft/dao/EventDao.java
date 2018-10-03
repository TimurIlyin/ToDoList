package ru.tuxoft.dao;

import ru.tuxoft.entity.Event;

import java.util.List;

public interface EventDao {

    List<Event> findAll ();

    void save(Event event);

    List<Event> dailyRoutine();

    void delete(int id);
}
