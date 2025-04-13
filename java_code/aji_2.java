/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.apache.log4j.Logger;

/*
 * Renamed from aJi
 */
public class aji_2
extends aip_1
implements aiq_2,
ajh_2 {
    public static final short k = 0;
    public static final short l = 2;
    protected static final Logger m = Logger.getLogger(aji_2.class);
    private ais_2 r;
    private aja_2 s;
    private aio_2 t;
    private ajl_1 u;
    private ajg_2 v;
    private boolean w = false;
    private boolean x = false;
    private long y = -1L;
    private URL z;
    private Properties A;
    private boolean B;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    boolean q = true;

    public ais_2 p() {
        return this.r;
    }

    @Override
    public void a(URL uRL, Properties properties, long l, long l2, long l3) {
        if (this.w) {
            throw new RuntimeException("TorrentClient d\u00e9j\u00e0 d\u00e9marr\u00e9");
        }
        if (this.x) {
            throw new RuntimeException("Impossible de red\u00e9marrer un client Torrent");
        }
        this.h.a(this);
        this.z = uRL;
        this.A = properties;
        ajj_2 ajj_22 = new ajj_2(uRL.toString().startsWith("file://") ? uRL.toString().substring(7) : uRL.toString(), null, -1, new ajr_1(), null, this);
        try {
            ajj_22.h();
            this.h.b(this);
            ajj_22.c(this.i);
        }
        catch (IOException iOException) {
            if (iOException.getMessage().contains("Allocation de m\u00e9moire impossible")) {
                this.A();
            }
            System.exit(-1);
        }
        this.r = ajj_22.g;
        this.v = ajj_22.h;
        this.u = ajj_22.d();
        this.s = ajj_22.i;
        this.w = true;
    }

    @Override
    public String j() {
        return this.r.e();
    }

    @Override
    public int n() {
        return 2;
    }

    public aio_2 q() {
        return this.t;
    }

    public ajg_2 r() {
        return this.v;
    }

    public ajl_1 s() {
        return this.u;
    }

    public aja_2 t() {
        return this.s;
    }

    public URL u() {
        return this.z;
    }

    public Properties v() {
        return this.A;
    }

    @Override
    public void i() {
        this.w = false;
        this.x = true;
        if (this.t != null) {
            this.t.b();
        }
        if (this.u != null) {
            this.u.a();
        }
        if (this.s != null) {
            this.s.j();
        }
        if (this.v != null) {
            try {
                this.v.f();
            }
            catch (IOException iOException) {
                m.fatal((Object)"Impossible de fermer correctement : ", (Throwable)iOException);
            }
        }
    }

    @Override
    public long a() {
        if (this.r != null) {
            return this.r.i();
        }
        return 0L;
    }

    @Override
    public long b() {
        try {
            return this.v.h();
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    @Override
    public long c() {
        try {
            return this.r.i() - (long)(this.v.c() * this.r.a(0));
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    @Override
    public long d() {
        return this.w ? this.s.e() : 0L;
    }

    @Override
    public long e() {
        return -1L;
    }

    @Override
    public long f() {
        return this.w ? this.s.f() : 0L;
    }

    @Override
    public long g() {
        return -1L;
    }

    @Override
    public long h() {
        return this.w ? System.currentTimeMillis() - this.y : -1L;
    }

    @Override
    public void a(URL uRL, Properties properties) {
        if (this.w) {
            throw new RuntimeException("TorrentClient d\u00e9j\u00e0 d\u00e9marr\u00e9");
        }
        if (this.x) {
            throw new RuntimeException("Impossible de red\u00e9marrer un client Torrent");
        }
        this.h.a(this);
        this.z = uRL;
        this.A = properties;
        ajj_2 ajj_22 = new ajj_2(uRL.toString().startsWith("file://") ? uRL.toString().substring(7) : uRL.toString(), null, -1, new ajr_1(), null, this);
        try {
            ajj_22.h();
            ajj_22.c(this.i);
        }
        catch (IOException iOException) {
            System.exit(-1);
        }
        this.r = ajj_22.g;
        this.v = ajj_22.h;
        this.u = ajj_22.d();
        this.s = new aja_2(ajj_22.q, this.r, this.v, this);
        this.w = true;
        this.y = System.currentTimeMillis();
    }

    @Override
    public void a(aja_2 aja_22, aiu_2 aiu_22, aiw_2 aiw_22, long l) {
    }

    @Override
    public void a(ajg_2 ajg_22, String string, long l) {
        this.n = true;
    }

    @Override
    public void a(ajg_2 ajg_22, long l) {
        this.n = true;
    }

    @Override
    public void a(ajg_2 ajg_22, int n, boolean bl) {
        this.n = false;
        if (!this.o && !this.p) {
            ajg_22.b();
            this.p = true;
        }
    }

    public void w() {
        this.y = System.currentTimeMillis();
        this.v.i();
    }

    @Override
    public void a(ajg_2 ajg_22) {
        this.o = true;
        this.p = false;
    }

    @Override
    public void k() {
        if (this.u != null) {
            this.u.e();
        }
        if (this.h != null) {
            this.h.a(this, true);
        }
    }

    public void x() {
        if (this.h != null) {
            this.h.d(this);
        }
        if (this.u != null) {
            this.u.d();
        }
    }

    void y() {
        this.B = true;
        this.h.d(this);
        this.a = false;
    }

    public void a(ajl_1 ajl_12) {
        this.u = ajl_12;
    }

    public void a(aio_2 aio_22) {
        this.t = aio_22;
    }

    public boolean z() {
        return !this.B;
    }

    public void A() {
        this.h.e(this);
    }

    public long B() {
        return this.y;
    }
}

