/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  org.apache.log4j.Layout
 *  org.apache.log4j.spi.LoggingEvent
 */
import com.google.gson.Gson;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aIk
 */
public class aik_1
extends Layout {
    private final Gson a = new Gson();

    public String format(LoggingEvent loggingEvent) {
        return this.a.toJson(loggingEvent.getMessage());
    }

    public boolean ignoresThrowable() {
        return false;
    }

    public void activateOptions() {
    }
}

