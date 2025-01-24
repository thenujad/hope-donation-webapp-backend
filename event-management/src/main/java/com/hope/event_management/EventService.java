package com.hope.event_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Create a new event
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    // Get event details by ID
    public Event getEventById(String id) {
        return eventRepository.findById(id).orElse(null);
    }

    // List all events
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }
}
