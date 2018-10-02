package ru.tuxoft.service;

import ru.tuxoft.entity.Event;

import java.util.List;

public interface EventService {

    List<Event> findAll();

    void save(Event event);

    List<Event> dailyRoutine();

}
