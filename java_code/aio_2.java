/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.Logger;

/*
 * Renamed from aIO
 */
public class aio_2
implements Runnable {
    protected static final Logger a = Logger.getLogger(aio_2.class);
    private final ServerSocket b;
    final aiv_2 c;
    private Thread d;
    private boolean e;
    private boolean f = false;

    public aio_2(ServerSocket serverSocket, aiv_2 aiv_22) {
        this.b = serverSocket;
        this.c = aiv_22;
        this.e = false;
    }

    public void a() {
        this.d = new Thread((Runnable)this, "Torrent-ConnectionAcceptor");
        this.d.start();
    }

    public void b() {
        Thread thread;
        this.e = true;
        ServerSocket serverSocket = this.b;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            }
            catch (IOException iOException) {
                a.error((Object)"IOException during halt", (Throwable)iOException);
            }
        }
        if ((thread = this.d) != null) {
            thread.interrupt();
        }
    }

    public boolean c() {
        return this.f;
    }

    public int d() {
        return this.b.getLocalPort();
    }

    @Override
    public void run() {
        while (!this.e) {
            try {
                Socket socket = this.b.accept();
                aip_2 aip_22 = new aip_2(this, "Connection-" + socket, socket);
                aip_22.start();
            }
            catch (IOException iOException) {
                a.error((Object)"Error while accepting", (Throwable)iOException);
                this.e = true;
            }
        }
        try {
            this.b.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.f = true;
    }
}

