/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aLW
 */
public abstract class alw_1 {
    protected static final Logger a = Logger.getLogger(alw_1.class);
    protected final amj_1 b;
    protected final alo_1 c;
    private boolean e = false;
    protected final float d;
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private long i = -1L;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private float m = 0.0f;
    private long n = 0L;
    private float o = -1.0f;
    private long p;
    private final afr_2 q = new afr_2();

    public static alw_1 a(amj_1 amj_12, alo_1 alo_12, float f2, boolean bl, boolean bl2, float f3) {
        if (bl) {
            return new alx_1(amj_12, alo_12, f2, bl2, f3);
        }
        return new alv_1(amj_12, alo_12, f2, bl2, f3);
    }

    public alw_1(amj_1 amj_12, alo_1 alo_12, float f2, boolean bl, float f3) {
        this.b = amj_12;
        this.c = alo_12;
        this.d = f2;
        this.j = false;
        this.k = true;
        this.l = bl;
        this.m = f3;
        this.p = -1L;
    }

    public void a(int n, int n2) {
        this.f = n * 1000;
        this.g = n2 * 1000;
        long l = System.currentTimeMillis();
        this.i = l + (long)Hw.a(this.g - this.f) + (long)this.f;
    }

    public amj_1 a() {
        return this.b;
    }

    public void a(long l, afr_2 afr_22, float f2, boolean bl, int n) {
        if (bl) {
            this.h = bl;
        } else if (!this.h) {
            return;
        }
        if (this.p == -1L) {
            this.p = l;
        }
        if (l - this.p > (long)this.b.x() && !this.b.g()) {
            this.b(true);
            return;
        }
        if (this.o == -1.0f) {
            this.o = this.b.a();
        }
        this.q.a(this.c.o(), this.c.p(), this.c.q());
        if (!this.c.r()) {
            this.q.c(afr_22);
        }
        float f3 = this.q.f();
        if (this.l && f3 > this.d || this.b.o()) {
            this.b(true);
            return;
        }
        this.b.d(this.c.s());
        if (f3 <= this.d) {
            this.j = false;
        } else if (f3 > this.d) {
            if (!this.j) {
                this.j = true;
                if (this.b.l()) {
                    this.b.h(true);
                    this.b.a(0.0f, this.m);
                }
            } else if (this.b.G()) {
                this.b(true);
            }
            if (this.k) {
                return;
            }
        }
        if (this.i == -1L) {
            if (this.k || !this.b.p()) {
                try {
                    if (this.k) {
                        if (!this.b.h()) {
                            this.b(true);
                            return;
                        }
                        if (this.n > 0L) {
                            this.b.d(this.n);
                        }
                        this.b.c(0.0f);
                        this.b.a(this.o, this.m);
                        this.k = false;
                    }
                    this.b.k();
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during PositionedSound update", (Throwable)exception);
                }
            }
            this.a(this.q);
            switch (this.b.b(l)) {
                case 0: 
                case 2: {
                    this.n = this.b.D();
                    break;
                }
                case 1: {
                    this.b(true);
                    break;
                }
                case 3: {
                    this.k = true;
                }
            }
        } else if (this.i < l) {
            if (this.k || !this.b.p()) {
                try {
                    if (this.k) {
                        if (!this.b.h()) {
                            this.b(true);
                            return;
                        }
                        if (this.n != -1L) {
                            this.b.d(this.n);
                        }
                        this.b.c(0.0f);
                        this.b.a(this.o, this.m);
                        this.k = false;
                    }
                    this.b.k();
                }
                catch (Exception exception) {
                    a.error((Object)"Exception during PositionedSound update", (Throwable)exception);
                }
            }
            this.a(this.q);
            switch (this.b.b(l)) {
                case 0: 
                case 2: {
                    this.n = this.b.D();
                    break;
                }
                case 1: {
                    this.i = l + (long)Hw.a(this.g - this.f) + (long)this.f;
                    break;
                }
                case 3: {
                    this.k = true;
                    this.n = this.b.D();
                }
            }
        }
    }

    public boolean b() {
        return this.e;
    }

    public void c() {
        this.e = true;
    }

    public void a(float f2) {
        this.b.a(f2);
    }

    public void b(float f2) {
        this.b.b(f2);
    }

    public void d() {
        this.b.v();
    }

    public void e() {
        this.b.w();
    }

    public void c(float f2) {
        this.b.h(f2);
    }

    public void d(float f2) {
        this.b.e(f2);
    }

    public void a(boolean bl) {
        this.b.d(bl);
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public abstract void a(afr_2 var1);

    public String toString() {
        return this.b.toString();
    }
}

