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
 * Renamed from aId
 */
public class aid_1
extends Layout {
    private static final String a = "wakfu.item";
    private final Gson b = new Gson();

    public String format(LoggingEvent loggingEvent) {
        gt_2 gt_22 = new gt_2();
        gt_22.a(a);
        gt_22.a(new Date(loggingEvent.getTimeStamp()));
        gt_22.b(os_2.a.a());
        gt_22.c(ot_2.a.a());
        gt_22.a((gv_2)loggingEvent.getMessage());
        return this.b.toJson((Object)gt_22);
    }

    public boolean ignoresThrowable() {
        return false;
    }

    public void activateOptions() {
    }
}

