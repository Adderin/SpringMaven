package cz.example.loggers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import cz.example.util.Event;

public class FileEventLogger {

    private String filename;
    private File file;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public FileEventLogger() {

    }

    //@Override
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void init() throws IOException {
        file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            file.createNewFile();
        }
    }
}
