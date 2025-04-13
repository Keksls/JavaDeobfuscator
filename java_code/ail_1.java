/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Layout
 *  org.apache.log4j.spi.LoggingEvent
 */
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aIl
 */
public class ail_1
extends Layout {
    public String format(LoggingEvent loggingEvent) {
        gv_2 gv_22 = (gv_2)loggingEvent.getMessage();
        return "itemTracker: " + gv_22.a() + "," + gv_22.b() + "," + gv_22.c() + "," + gv_22.d() + "," + gv_22.f() + "," + gv_22.g() + "," + gv_22.e() + "," + gv_22.h() + "," + gv_22.i() + "," + gv_22.j() + "," + gv_22.k() + "," + gv_22.l() + "," + gv_22.m() + "," + gv_22.n() + "," + gv_22.o() + "," + gv_22.p();
    }

    public boolean ignoresThrowable() {
        return false;
    }

    public void activateOptions() {
    }
}

