package cz.example.loggers;

import cz.example.util.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger{

    private int cacheSize;
    List<Event> cache = new ArrayList<>();

    public CacheFileEventLogger(int cacheSize) {
        super();
        this.cacheSize = cacheSize;
    }

    public CacheFileEventLogger(String str) {
        super();
    }

    public void logEvent(Event event){
        cache.add(event);

        if(cache.size() == cacheSize) {
            writeEventFromCache();
            cache.clear();
        }
    }

    public void destroy(){
        if(!cache.isEmpty()) {
            writeEventFromCache();
        }
    }

    private void writeEventFromCache() {
    }
}
