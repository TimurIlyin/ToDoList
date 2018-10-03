package ru.tuxoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tuxoft.service.EventService;
import ru.tuxoft.entity.Event;

@Controller
@RequestMapping("/")
public class EventController {

    @Autowired
    public EventService eventService;

    @GetMapping("/delete/{event}")
    public String deleteEvent(@PathVariable("event") int id){
        eventService.delete(id);
        return "redirect:/events";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("events", eventService.dailyRoutine());
        return "index";
    }

    @GetMapping("/events")
    public String getAllEvents (Model model) {
        model.addAttribute("events", eventService.findAll());
        return "eventList";
    }

    @GetMapping("/addEvent")
    public String createEventPage(){
        return "createEvent";
    }

    @PostMapping("/addEvent")
    public String addEvent(@ModelAttribute("events") Event event) {
        eventService.save(event);
        return "redirect:/events";
    }
}
