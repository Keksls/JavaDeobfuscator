/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class faW
implements Runnable {
    private static final boolean a = false;
    private static final Logger b = Logger.getLogger(faW.class);
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;
    @Nullable
    private aeb_2 h;

    protected faW(long l) {
        this.f = l;
    }

    @Override
    public void run() {
        this.d = 0L;
        if (this.c > 0L) {
            this.a();
        } else if (this.h != null) {
            this.h.a();
        }
    }

    public void a(long l, long l2) {
        if (this.g) {
            if (this.c() + l2 <= this.f) {
                this.a(l2);
                if (this.h != null) {
                    this.h.b();
                }
            }
        } else {
            this.a(l);
            this.a();
            if (this.h != null) {
                this.h.a(l);
            }
        }
    }

    public void a() {
        this.e = System.currentTimeMillis();
        this.g = true;
        this.d = this.c;
        ado_1.a().a(this, this.c, 1);
        this.c = 0L;
    }

    public void b() {
        this.h();
        if (this.h != null) {
            this.h.c();
        }
    }

    private void h() {
        ado_1.a().b(this);
    }

    public void a(aeb_2 aeb_22) {
        this.h = aeb_22;
    }

    private void a(long l) {
        this.c += l;
        if (this.c < 0L) {
            ado_1.a().b(this);
            this.c = this.c() + this.c;
            this.a();
        }
    }

    public long c() {
        return this.g ? this.c + this.d - (System.currentTimeMillis() - this.e) : 0L;
    }

    public long d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public void f() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = null;
        this.g = false;
    }

    public void g() {
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
        this.h = null;
        this.g = false;
    }
}

