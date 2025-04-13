/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEc
 */
public class aec_2
implements aea_2 {
    @NotNull
    private final abs_1 a;
    private long b = 0L;
    private long c = -1L;
    private long d = -1L;

    public aec_2(@NotNull abs_1 abs_12) {
        this.a = abs_12;
    }

    public aec_2() {
        this.a = abb_1.a;
    }

    public aec_2(long l) {
        this();
        this.b = l;
    }

    void d() {
        this.r();
        this.n();
    }

    public void b(long l) {
        this.r();
        this.b = l;
        this.n();
    }

    private void n() {
        this.c = this.a.s();
    }

    public void e() {
        if (!this.h()) {
            throw new aef_2();
        }
        this.c = -1L;
        this.d = -1L;
    }

    public void f() {
        if (!this.h() || this.j()) {
            throw new aed_2();
        }
        this.d = this.a.s();
    }

    public void g() {
        if (!this.h() || !this.j()) {
            throw new aed_2();
        }
        this.c += this.s();
        this.d = -1L;
    }

    public boolean h() {
        return this.c >= 0L;
    }

    public boolean i() {
        return this.h() && this.m() >= 1.0;
    }

    public boolean j() {
        return this.d != -1L;
    }

    public long k() {
        return this.h() ? this.o() : 0L;
    }

    private long o() {
        return this.j() ? this.d - this.c : this.a.s() - this.c;
    }

    public long l() {
        return this.h() ? this.p() : this.b;
    }

    private long p() {
        return this.b - this.o();
    }

    public double m() {
        return this.h() ? this.q() : 0.0;
    }

    private double q() {
        return (double)this.o() / (double)this.b;
    }

    private void r() {
        if (this.h()) {
            throw new aee_2();
        }
    }

    @Override
    public long a() {
        return this.c + (this.j() ? this.s() : 0L);
    }

    private long s() {
        return this.a.s() - this.d;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public boolean c() {
        throw new UnsupportedOperationException("onCoolDownExpired not implemented");
    }

    @Override
    @Deprecated
    public void a(long l) {
        throw new UnsupportedOperationException("setStartTime not implemented");
    }
}

