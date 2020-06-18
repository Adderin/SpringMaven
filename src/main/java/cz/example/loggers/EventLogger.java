package cz.example.loggers;

import cz.example.util.Event;

public interface EventLogger {
    void logEvent(Event event);

    String getName();
}
