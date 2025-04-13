/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Layout
 *  org.apache.log4j.spi.LoggingEvent
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aHE
 */
public class ahe_1
extends Layout {
    private static final SimpleDateFormat a = new SimpleDateFormat("H:mm:ss", new Locale("fr", "FR"));

    public String format(LoggingEvent loggingEvent) {
        return a.format(new Date()) + ";" + loggingEvent.getMessage().toString() + "\r\n";
    }

    public boolean ignoresThrowable() {
        return true;
    }

    public void activateOptions() {
    }
}

