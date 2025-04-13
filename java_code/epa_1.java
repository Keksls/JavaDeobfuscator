/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from ePa
 */
public class epa_1
extends rs_0 {
    protected static final Logger a = Logger.getLogger(epa_1.class);
    private final eps_0 i;
    private List<epi_0> j;
    private boolean k;
    public static final byte b = 12;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;

    public epa_1(eps_0 eps_02, int n, int n2) {
        this.i = eps_02;
        this.a(n, n2);
    }

    public eps_0 t() {
        return this.i;
    }

    public void a(epi_0 epi_02) {
        if (epi_02 == null) {
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList<epi_0>();
            this.j.add(epi_02);
        } else if (!this.j.contains(epi_02)) {
            this.j.add(epi_02);
        }
    }

    public boolean b(epi_0 epi_02) {
        if (this.j == null) {
            return false;
        }
        return this.j.remove(epi_02);
    }

    public boolean c(epi_0 epi_02) {
        if (this.j == null) {
            return false;
        }
        return this.j.contains(epi_02);
    }

    private void a(epb_0 epb_02, int n) {
        if (this.j != null && !this.j.isEmpty()) {
            for (epi_0 epi_02 : this.j) {
                try {
                    epi_02.a(epb_02, n);
                }
                catch (Exception exception) {
                    a.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public int a() {
        if (this.c > this.c()) {
            return this.c();
        }
        if (this.c < this.e()) {
            return this.e();
        }
        return this.c;
    }

    public int u() {
        return this.d;
    }

    public int v() {
        return this.e;
    }

    @Override
    public int c() {
        int n = this.d + this.d * this.h / 100;
        return Hw.a(n, this.g, this.f);
    }

    @Override
    public int d() {
        return this.d;
    }

    @Override
    public int e() {
        return Hw.a(this.e, this.g, this.f);
    }

    @Override
    public int a(int n) {
        int n2 = this.h;
        this.h += n;
        this.s();
        return this.h - n2;
    }

    public void i(int n) {
        this.h = n;
    }

    @Override
    public int f() {
        return this.h;
    }

    public int w() {
        return this.g;
    }

    public int x() {
        return this.f;
    }

    @Override
    public void b(int n) {
        this.a(n, true);
    }

    private void a(int n, boolean bl) {
        if (this.k) {
            return;
        }
        int n2 = this.a();
        this.c = this.i != null && this.i.x() ? Hw.a(n, this.e(), this.f) : Hw.a(n, this.e(), this.c());
        if (n2 != this.a()) {
            if (bl) {
                this.s();
            }
            if (this.a() > n2) {
                this.a(epb_0.a, this.a() - n2);
            } else {
                this.a(epb_0.b, n2 - this.a());
            }
        }
    }

    public void a(epa_1 epa_12) {
        if (epa_12.i != this.i) {
            a.error((Object)("Trying to assign a " + epa_12.i + " charac to a " + this.i + " one."));
            return;
        }
        this.k(epa_12.w());
        this.j(epa_12.x());
        this.g(epa_12.d);
        this.h = epa_12.h;
        this.h(epa_12.e());
        this.b(epa_12.a());
    }

    @Override
    public int c(int n) {
        if (this.k) {
            return 0;
        }
        int n2 = this.c;
        long l = (long)this.c() - (long)this.a();
        int n3 = this.c + n;
        if ((long)n > l) {
            this.b(this.c());
        } else {
            this.b(n3);
        }
        return this.c - n2;
    }

    @Override
    public int d(int n) {
        if (this.k) {
            return 0;
        }
        int n2 = this.c;
        long l = (long)this.a() - (long)this.e();
        if ((long)n > l) {
            this.b(this.e());
        } else {
            this.b(this.c - n);
        }
        return n2 - this.c;
    }

    @Override
    public void g(int n) {
        this.b(n, true);
    }

    private void b(int n, boolean bl) {
        this.d = n;
        int n2 = this.d = this.d > this.e ? this.d : this.e;
        if (!(this.k || this.c <= this.c() || this.i != null && this.i.x())) {
            this.c = this.c();
        }
        this.a(epb_0.c, this.c());
        if (bl) {
            this.s();
        }
    }

    @Override
    public void h(int n) {
        this.c(n, true);
    }

    private void c(int n, boolean bl) {
        this.e = n;
        int n2 = this.e = this.d < this.e ? this.d : this.e;
        if (!this.k && this.c < this.e()) {
            this.c = this.e();
        }
        if (bl) {
            this.s();
        }
        this.a(epb_0.d, this.e());
    }

    @Override
    public int e(int n) {
        if (this.d == Integer.MAX_VALUE) {
            return this.d;
        }
        this.g(this.d + n);
        return this.d;
    }

    @Override
    public int f(int n) {
        if (this.e == Integer.MIN_VALUE) {
            return this.e;
        }
        this.h(this.e + n);
        return this.e;
    }

    private void a(int n, int n2) {
        this.g = n < n2 ? n : n2;
        this.f = n > n2 ? n : n2;
    }

    public void j(int n) {
        this.f = Math.max(n, this.g);
    }

    public void k(int n) {
        this.g = Math.min(n, this.f);
    }

    @Override
    public void g() {
        this.c(this.i.h(), false);
        this.b(this.i.i(), false);
        this.c = 0;
        this.h = 0;
        this.a(this.i.j(), false);
        if (this.j != null) {
            this.j.clear();
        }
        this.s();
    }

    public void b(epa_1 epa_12) {
        this.g(epa_12.d);
        this.h(epa_12.e);
        this.b(epa_12.c);
    }

    public void c(epa_1 epa_12) {
        this.g(epa_12.d);
        this.h(epa_12.e);
        this.b(epa_12.c);
        this.h = epa_12.h;
    }

    public void a(epa_1 epa_12, int n) {
        this.g(epa_12.d * n / 100);
        this.h(epa_12.e * n / 100);
        this.b(epa_12.c * n / 100);
        this.h = epa_12.h * n / 100;
    }

    public void y() {
        this.k = true;
    }

    public void z() {
        this.k = false;
    }

    @Override
    public /* synthetic */ ru_0 p() {
        return this.t();
    }
}

