/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Renamed from aJl
 */
public class ajl_1
extends Thread {
    private static final String f = "";
    private static final String g = "started";
    private static final String h = "completed";
    private static final String i = "stopped";
    private final aji_2 j;
    private final ais_2 k;
    private final aja_2 l;
    private final int m;
    private boolean n;
    private boolean o = false;
    private long p;
    private long q;
    private String r;
    private String s;
    private String t;
    long a;
    long b;
    long c;
    protected static final Logger d = Logger.getLogger("com.ankamagames.framework.net.torrent.TrackerClient");
    protected static final int e = 2;

    public ajl_1(aji_2 aji_22, ais_2 ais_22, aja_2 aja_22, int n) {
        super("TrackerClient-" + ajl_1.a(aja_22.a()));
        this.j = aji_22;
        this.k = ais_22;
        this.l = aja_22;
        this.m = n == -1 ? 9 : n;
        this.n = false;
    }

    public void a() {
        block2: {
            this.n = true;
            try {
                this.a(this.r, this.s, this.t, this.a, this.b, this.c, i);
            }
            catch (IOException iOException) {
                String string = iOException.getMessage();
                if (string.startsWith("Connection refused: connect")) break block2;
                System.err.println(iOException.getMessage() + " : " + this.k.e());
            }
        }
        this.interrupt();
    }

    public boolean b() {
        return this.o;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        this.r = this.k.a();
        this.s = ajl_1.a(this.k.b());
        this.t = ajl_1.a(this.l.a());
        this.a = this.l.f();
        this.b = this.l.g();
        this.c = this.l.e();
        boolean bl = false;
        boolean bl2 = this.l.b();
        boolean bl3 = false;
        if (bl2 && this.j != null) {
            this.j.k();
        }
        try {
            int n = 0;
            while (!bl3 && n < 2) {
                block30: {
                    try {
                        ajm_1 ajm_12 = this.a(this.r, this.s, this.t, this.a, this.b, this.c, g);
                        for (Object object2 : ajm_12.a()) {
                            this.l.b((aiu_2)object2);
                        }
                        bl3 = true;
                    }
                    catch (IOException iOException) {
                        if (bl) break block30;
                        d.log(Level.WARNING, "Could not contact tracker at '" + this.r + " for " + this.k.e());
                        if (this.j != null) {
                            this.j.y();
                        }
                        bl = true;
                    }
                }
                if (bl3) continue;
                ++n;
                d.log(Level.FINER, "     Retrying in 5s...");
                try {
                    Thread.sleep(5000L);
                }
                catch (InterruptedException interruptedException) {}
            }
            if (n >= 2) {
                throw new IOException("Could not establish initial connection");
            }
            int n2 = 0;
            while (!this.n) {
                Object object;
                ++n2;
                try {
                    Thread.sleep(10000L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                if (this.n) {
                    break;
                }
                if (!bl2 && this.l.b() || bl2 || this.l.b() || this.l.m().size() == 0) {
                    bl2 = true;
                    object = h;
                    this.j.k();
                } else {
                    object = f;
                }
                if (n2 % 30 != 0) continue;
                this.a = this.l.f();
                this.b = this.l.g();
                this.c = this.l.e();
                if (!((String)object).equals(h) && !this.l.i() && System.currentTimeMillis() <= this.q + this.p) continue;
                try {
                    Object object2;
                    object2 = this.a(this.r, this.s, this.t, this.a, this.b, this.c, (String)object);
                    for (Object e2 : ((ajm_1)object2).a()) {
                        this.l.b((aiu_2)e2);
                    }
                }
                catch (IOException iOException) {
                    if (bl) continue;
                    d.log(Level.WARNING, "Could not contact tracker at '" + this.r + " for " + this.k.e());
                    this.j.y();
                    bl = true;
                }
            }
        }
        catch (Throwable throwable) {
            d.log(Level.SEVERE, "Fatal exception in TrackerClient for " + this.k.e());
        }
        finally {
            try {
                if (bl3) {
                    this.a(this.r, this.s, this.t, this.a, this.b, this.c, i);
                }
            }
            catch (IOException iOException) {}
        }
        this.o = true;
    }

    private ajm_1 a(String string, String string2, String string3, long l, long l2, long l3, String string4) {
        String string5 = string + "?info_hash=" + string2 + "&peer_id=" + string3 + "&port=" + this.m + "&uploaded=" + l + "&downloaded=" + l2 + "&left=" + l3 + (String)(!string4.equals(f) ? "&event=" + string4 : f);
        URL uRL = new URL(string5);
        d.log(Level.FINE, "Sending TrackerClient request: " + uRL);
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.connect();
        InputStream inputStream = uRLConnection.getInputStream();
        if (uRLConnection instanceof HttpURLConnection) {
            int n = ((HttpURLConnection)uRLConnection).getResponseCode();
            if (n == 403) {
                throw new IOException("Tracker doesn't handle given info_hash");
            }
            if (n / 100 != 2) {
                throw new IOException("Loading '" + string5 + "' gave error code " + n + ", it probably doesn't exist");
            }
        }
        ajm_1 ajm_12 = new ajm_1(inputStream, this.l.a(), this.l.h());
        d.log(Level.FINE, "TrackerClient response: " + ajm_12);
        this.q = System.currentTimeMillis();
        String string6 = ajm_12.b();
        if (string6 != null) {
            throw new IOException(string6);
        }
        this.p = ajm_12.c() * 1000;
        return ajm_12;
    }

    static String a(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 3);
        for (byte by : byArray) {
            int n = by & 0xFF;
            stringBuilder.append('%');
            if (n < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(n));
        }
        return stringBuilder.toString();
    }

    public aji_2 c() {
        return this.j;
    }

    public void d() {
        try {
            this.a(this.r, this.s, this.t, this.a, this.b, this.c, i);
        }
        catch (IOException iOException) {
            String string = iOException.getMessage();
            if (string.startsWith("Connection refused: connect")) {
                System.err.println("Connection refused: connect");
            }
            if (string.startsWith("Connection timed out: connect")) {
                System.err.println("Connection timed out: connect");
            }
            d.log(Level.SEVERE, "Exception", iOException);
        }
    }

    public void e() {
        try {
            this.a(this.r, this.s, this.t, this.a, this.b, this.c, h);
        }
        catch (IOException iOException) {
            String string = iOException.getMessage();
            if (string.startsWith("Connection refused: connect")) {
                System.err.println("Connection refused: connect");
            }
            if (string.startsWith("Connection timed out: connect")) {
                System.err.println("Connection timed out: connect");
            }
            d.log(Level.SEVERE, "Exception", iOException);
        }
    }
}

