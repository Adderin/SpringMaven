package cz.example;

import cz.example.application.Client;
import cz.example.loggers.ConsoleEventLogger;
import cz.example.loggers.EventLogger;
import cz.example.util.Event;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    protected Client client;
    protected EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public App(Client client, ConsoleEventLogger consoleEventLogger, String s) {
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Event event = (Event) ctx.getBean("event");
        ctx.close();
    }

    public void logEvent(Event event) {
        eventLogger.logEvent(event);
    }

    public static void logEvent(String s) {
        System.out.println(s);
    }
}
