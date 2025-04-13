/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.helpers.LogLog
 */
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import org.apache.log4j.helpers.LogLog;

/*
 * Renamed from aIn
 */
class ain_1
implements Runnable {
    final /* synthetic */ aim_1 a;

    ain_1(aim_1 aim_12) {
        this.a = aim_12;
    }

    @Override
    public void run() {
        try {
            if (this.a.c != null && !this.a.c.isConnected()) {
                this.a.a();
            }
            if (this.a.c == null) {
                this.a.c = new DatagramSocket();
            }
            this.a.c.connect(InetAddress.getByName(this.a.a), this.a.b);
        }
        catch (IOException iOException) {
            LogLog.error((String)("Could not open UDP Socket to " + this.a.a + ":" + this.a.b), (Throwable)iOException);
        }
    }
}

