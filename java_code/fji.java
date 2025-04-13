/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class fji {
    public static final long a = TimeUnit.MILLISECONDS.convert(5L, TimeUnit.SECONDS);
    private fjj_0 b = fjj_0.a;
    private epq_2 c;
    private long d = a;
    private Runnable e;
    private Runnable f;
    private Runnable g;

    public boolean a() {
        if (this.b != fjj_0.a) {
            return false;
        }
        if (this.c.hI()) {
            return false;
        }
        this.b = fjj_0.b;
        this.c.a(this);
        if (this.g != null) {
            this.g.run();
        }
        ado_1.a().a(this::c, this.d, 1);
        return true;
    }

    public void b() {
        if (this.b == fjj_0.a) {
            return;
        }
        if (this.b == fjj_0.d) {
            return;
        }
        this.b = fjj_0.c;
        this.d();
        if (this.e == null) {
            return;
        }
        this.e.run();
    }

    public void c() {
        if (this.b != fjj_0.b) {
            return;
        }
        this.b = fjj_0.d;
        this.d();
        if (this.f == null) {
            return;
        }
        this.f.run();
    }

    private void d() {
        this.c.a((fji)null);
    }

    private fji() {
    }

    public static fji a(@NotNull epq_2 epq_22) {
        fji fji2 = new fji();
        fji2.c = epq_22;
        return fji2;
    }

    public fji a(long l) {
        this.d = l;
        return this;
    }

    public fji a(Runnable runnable) {
        this.e = runnable;
        return this;
    }

    public fji b(Runnable runnable) {
        this.f = runnable;
        return this;
    }

    public fji c(Runnable runnable) {
        this.g = runnable;
        return this;
    }
}

