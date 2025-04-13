/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.base.Preconditions
 *  org.apache.log4j.AppenderSkeleton
 *  org.apache.log4j.helpers.LogLog
 *  org.apache.log4j.spi.LoggingEvent
 */
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.PortUnreachableException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/*
 * Renamed from aIm
 */
public class aim_1
extends AppenderSkeleton {
    String a;
    int b;
    DatagramSocket c;

    public void a(String string) {
        this.a = string;
    }

    public void a(int n) {
        this.b = n;
    }

    public void activateOptions() {
        Preconditions.checkNotNull((Object)this.a, (Object)"[host] key must be defined");
        Preconditions.checkState((this.b > 0 ? 1 : 0) != 0, (Object)"[port] key must be defined");
        Preconditions.checkNotNull((Object)this.layout, (Object)"No defined layout");
        this.a();
        Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new ain_1(this), 0L, 5L, TimeUnit.SECONDS);
        super.activateOptions();
    }

    protected void append(LoggingEvent loggingEvent) {
        if (this.c == null || !this.c.isConnected()) {
            return;
        }
        String string = this.layout.format(loggingEvent);
        try {
            byte[] byArray = string.getBytes(Charsets.UTF_8);
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            this.c.send(datagramPacket);
        }
        catch (PortUnreachableException portUnreachableException) {
            LogLog.warn((String)"Detected problem with dataSocket trying to append Udp event : port unreachable", (Throwable)portUnreachableException);
        }
        catch (IOException iOException) {
            LogLog.warn((String)("Detected problem with UDP connection sending msg " + string), (Throwable)iOException);
        }
        catch (RuntimeException runtimeException) {
            LogLog.error((String)"Unable to send UDP packet", (Throwable)runtimeException);
        }
    }

    public void close() {
        this.a();
    }

    void a() {
        if (this.c == null) {
            return;
        }
        try {
            this.c.close();
        }
        catch (RuntimeException runtimeException) {
            LogLog.error((String)"Could not close socket.", (Throwable)runtimeException);
        }
        finally {
            this.c = null;
        }
    }

    public boolean requiresLayout() {
        return true;
    }
}

