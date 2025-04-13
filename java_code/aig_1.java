/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  org.apache.log4j.Layout
 *  org.apache.log4j.spi.LoggingEvent
 */
import com.google.gson.Gson;
import java.util.Date;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aIg
 */
public class aig_1
extends Layout {
    private static final String a = "wakfu.moderation";
    private final Gson b = new Gson();

    public String format(LoggingEvent loggingEvent) {
        aif_1 aif_12 = new aif_1();
        aif_12.a(a);
        aif_12.a(new Date(loggingEvent.getTimeStamp()));
        aif_12.b(os_2.a.a());
        aif_12.c(ot_2.a.a());
        aif_12.a(loggingEvent.getMessage());
        return this.b.toJson((Object)aif_12);
    }

    public boolean ignoresThrowable() {
        return false;
    }

    public void activateOptions() {
    }
}

