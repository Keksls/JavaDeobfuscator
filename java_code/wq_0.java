/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from Wq
 */
public abstract class wq_0
extends GregorianCalendar
implements wv_0,
Runnable {
    private static final Logger c = Logger.getLogger(wq_0.class);
    private static final boolean d = false;
    protected final wp_0 a = new wp_0();
    private final List<wr_0> e = new ArrayList<wr_0>();
    private final List<wr_0> f = new ArrayList<wr_0>();
    private final List<wf_0> g = new ArrayList<wf_0>();
    private final int h;
    private final int i;
    private wt_0 j;
    private long k;
    private long l;
    protected boolean b;

    protected wq_0(int n, int n2) {
        super(wt_0.a);
        this.h = n;
        this.i = n2;
    }

    public abstract float b();

    @Override
    public void run() {
        if (this.b) {
            this.c(this.e());
            this.i();
            this.e.removeAll(this.f);
            this.f.clear();
            int n = this.e.size();
            for (int k = 0; k < n; ++k) {
                this.e.get(k).onCalendarEvent(ws_0.a, this);
            }
        }
    }

    public void a(wr_0 wr_02) {
        if (!this.f.remove(wr_02) || !this.e.contains(wr_02)) {
            this.e.add(wr_02);
        }
    }

    public void a(wf_0 wf_02) {
        if (!this.g.contains(wf_02)) {
            this.g.add(wf_02);
        }
    }

    public abq_2<we_0> c() {
        return this.a.b();
    }

    public we_0 d() {
        return this.a.a();
    }

    public long e() {
        return (this.f() + this.k) * (long)this.i;
    }

    long f() {
        return (System.nanoTime() - this.l) / 1000000L;
    }

    public long g() {
        return this.f() + this.k;
    }

    public void a(we_0 we_02) {
        this.a.b(we_02);
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            this.e.get(k).onCalendarEvent(ws_0.d, this);
        }
    }

    public void b(wr_0 wr_02) {
        if (!this.f.contains(wr_02)) {
            this.f.add(wr_02);
        }
    }

    public void a(long l) {
        this.l = System.nanoTime();
        this.k = l;
        this.c(l);
        this.b = true;
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            this.e.get(k).onCalendarEvent(ws_0.b, this);
        }
    }

    private void c(long l) {
        this.setTimeInMillis(l);
        int n = this.h + this.get(1) - 1970;
        this.j = new wt_0(this.get(13), this.get(12), this.get(11), this.get(5), this.get(2) + 1, n);
    }

    public void b(long l) {
        this.h();
        ado_1.a().b(this);
        ado_1.a().a(this, l);
    }

    protected void h() {
        this.i();
    }

    public void b(we_0 we_02) {
        this.a.a(we_02);
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            this.e.get(k).onCalendarEvent(ws_0.c, this);
        }
    }

    protected void i() {
        if (!this.b) {
            return;
        }
        we_0 we_02 = this.a.a();
        while (we_02 != null && we_02.a().f(this.j) < 0) {
            this.c(we_02);
            this.d(we_02);
            this.e(we_02);
            this.p();
            we_02 = this.a.a();
        }
    }

    private void c(we_0 we_02) {
        try {
            we_02.a(this);
        }
        catch (Exception exception) {
            c.error((Object)"Exception levee lors de l'execution d'un evenement", (Throwable)exception);
        }
    }

    private void d(we_0 we_02) {
        int n = this.g.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.g.get(k).a(we_02);
                continue;
            }
            catch (Exception exception) {
                c.error((Object)"Exception levee lors de la notification d'un evenement aux observers", (Throwable)exception);
            }
        }
    }

    private void e(we_0 we_02) {
        wh_0 wh_02;
        this.a.b(we_02);
        if (we_02 instanceof wh_0 && (wh_02 = (wh_0)we_02).c() != null && (wh_02.b().c() || wh_02.b().f(this.j) > 0)) {
            this.a.a(we_02.a(wh_02.c()));
        }
    }

    private void p() {
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            try {
                this.e.get(k).onCalendarEvent(ws_0.e, this);
                continue;
            }
            catch (Exception exception) {
                c.error((Object)"Exception levee lors de la notification d'un evenement aux observers", (Throwable)exception);
            }
        }
    }

    @Override
    public wu_0 a() {
        return this.j;
    }

    public wt_0 j() {
        return new wt_0(this.j);
    }

    public boolean a(wu_0 wu_02) {
        return this.j.equals(wu_02);
    }

    public boolean b(wu_0 wu_02) {
        return this.j.b(wu_02);
    }

    public boolean c(wu_0 wu_02) {
        return this.j.c(wu_02);
    }

    public boolean d(wu_0 wu_02) {
        return this.j.d(wu_02);
    }

    public boolean e(wu_0 wu_02) {
        return this.j.e(wu_02);
    }

    public wy_0 k() {
        return wy_0.a(this.j);
    }

    public boolean l() {
        return this.b;
    }

    public wt_0 m() {
        wu_0 wu_02 = this.a();
        return wt_0.a(LocalDate.of(wu_02.o(), wu_02.m(), 1).plusMonths(1L));
    }

    public wt_0 n() {
        wu_0 wu_02 = this.a();
        return wt_0.a(LocalDateTime.of(wu_02.o(), wu_02.m(), wu_02.j(), 5, 0, 0).plusDays(1L));
    }

    public boolean o() {
        return true;
    }
}

