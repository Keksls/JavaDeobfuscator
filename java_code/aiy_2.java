/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aIY
 */
class aiy_2
implements Runnable {
    private final aiu_2 b;
    private final DataInputStream c;
    private Thread d;
    private boolean e;
    protected static final Logger a = Logger.getLogger("com.ankamagames.framework.net.torrent.peer");

    public aiy_2(aiu_2 aiu_22, DataInputStream dataInputStream) {
        this.b = aiu_22;
        this.c = dataInputStream;
        this.e = false;
    }

    void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        Thread thread = this.d;
        if (thread != null) {
            thread.interrupt();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        this.d = Thread.currentThread();
        try {
            aje_2 aje_22 = this.b.a;
            block17: while (!this.e && aje_22 != null) {
                int n = this.c.readInt();
                if (n < 0) {
                    throw new IOException("Unexpected length prefix: " + n);
                }
                if (n == 0) {
                    aje_22.a();
                    continue;
                }
                byte by = this.c.readByte();
                air_2 air_22 = new air_2();
                air_22.k = by;
                switch (by) {
                    case 0: {
                        aje_22.a(true);
                        continue block17;
                    }
                    case 1: {
                        aje_22.a(false);
                        continue block17;
                    }
                    case 2: {
                        aje_22.b(true);
                        continue block17;
                    }
                    case 3: {
                        aje_22.b(false);
                        continue block17;
                    }
                    case 4: {
                        int n2 = this.c.readInt();
                        aje_22.a(n2);
                        continue block17;
                    }
                    case 5: {
                        byte[] byArray = new byte[n - 1];
                        this.c.readFully(byArray);
                        aje_22.a(byArray);
                        continue block17;
                    }
                    case 6: {
                        int n2 = this.c.readInt();
                        int n3 = this.c.readInt();
                        int n4 = this.c.readInt();
                        aje_22.a(n2, n3, n4);
                        continue block17;
                    }
                    case 7: {
                        byte[] byArray;
                        int n2 = this.c.readInt();
                        int n3 = this.c.readInt();
                        int n4 = n - 9;
                        ajf_2 ajf_22 = aje_22.b(n2, n3, n4);
                        if (ajf_22 != null) {
                            byArray = ajf_22.b;
                            this.c.readFully(byArray, n3, n4);
                            aje_22.a(ajf_22);
                            continue block17;
                        }
                        byArray = new byte[n4];
                        this.c.readFully(byArray);
                        continue block17;
                    }
                    case 8: {
                        int n2 = this.c.readInt();
                        int n3 = this.c.readInt();
                        int n4 = this.c.readInt();
                        aje_22.c(n2, n3, n4);
                        continue block17;
                    }
                }
                byte[] byArray = new byte[n - 1];
                this.c.readFully(byArray);
                aje_22.a(by, byArray);
            }
        }
        catch (IOException iOException) {
        }
        catch (Throwable throwable) {
            a.log(Level.SEVERE, this.b + " failed", throwable);
        }
        finally {
            this.b.c();
        }
    }
}

