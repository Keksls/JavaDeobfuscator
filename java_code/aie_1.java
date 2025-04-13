/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  org.apache.log4j.Layout
 *  org.apache.log4j.spi.LocationInfo
 *  org.apache.log4j.spi.LoggingEvent
 *  org.apache.log4j.spi.ThrowableInformation
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.Gson;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LocationInfo;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aIe
 */
public class aie_1
extends Layout {
    private static final String a = "wakfu.log";
    private static final String b = aie_1.a();
    private final Gson c = new Gson();

    private static String a() {
        try {
            return InetAddress.getLocalHost().getHostName();
        }
        catch (UnknownHostException unknownHostException) {
            return "?";
        }
    }

    public String format(LoggingEvent loggingEvent) {
        gu_2 gu_22 = new gu_2();
        gu_22.a(a);
        gu_22.a(new Date(loggingEvent.getTimeStamp()));
        gu_22.c(b);
        gu_22.d(os_2.a.a());
        gu_22.e(ot_2.a.a());
        gu_22.f(loggingEvent.getThreadName());
        gu_22.g(loggingEvent.getLevel().toString());
        LocationInfo locationInfo = loggingEvent.getLocationInformation();
        gu_22.h(locationInfo.getFileName());
        gu_22.i(locationInfo.getClassName());
        gu_22.j(locationInfo.getMethodName());
        gu_22.k(locationInfo.getLineNumber());
        gu_22.m(aie_1.a(loggingEvent));
        gu_22.l(loggingEvent.getMessage().toString());
        return this.c.toJson((Object)gu_22);
    }

    @Nullable
    private static String a(LoggingEvent loggingEvent) {
        ThrowableInformation throwableInformation = loggingEvent.getThrowableInformation();
        if (throwableInformation == null) {
            return null;
        }
        Throwable throwable = throwableInformation.getThrowable();
        if (throwable == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        return stringWriter.toString();
    }

    public boolean ignoresThrowable() {
        return false;
    }

    public void activateOptions() {
    }
}

