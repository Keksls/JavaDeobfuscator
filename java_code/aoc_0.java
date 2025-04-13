/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aOC
 */
public class aoc_0
extends aet_0 {
    private static final Logger o = Logger.getLogger(aoc_0.class);
    public static final int l = 0;
    protected xk_0 m;
    private float p;
    private long q;
    private long r;
    private long s;
    private long t;
    private enB u;

    @Override
    public byte d() {
        return 0;
    }

    public final boolean j() {
        return enB.b(this.u);
    }

    public boolean a(int n, int n2, short s2) {
        return this.b(n, n2, s2) == null;
    }

    public aej_2 b(int n, int n2, short s2) {
        if (this.u == null) {
            return aej_2.k;
        }
        if (this.u.a()) {
            enC enC2 = (enC)this.u;
            aej_2 aej_22 = enC2.a(n, n2, s2);
            return aej_22;
        }
        enD enD2 = (enD)this.u;
        return this.a(enD2.c(), n, n2, s2) ? null : aej_2.k;
    }

    private boolean a(enF enF2, int n, int n2, short s2) {
        if (enF2 == null) {
            return false;
        }
        byte by = (byte)(n - this.a * 18);
        byte by2 = (byte)(n2 - this.b * 18);
        return enF2.a(by, by2, s2);
    }

    public final boolean b(int n, int n2, int n3) {
        int n4 = n - this.a * 18;
        int n5 = n2 - this.b * 18;
        return this.c(n4, n5, n3);
    }

    public final boolean c(int n, int n2, int n3) {
        return this.e(n, n2, n3) == 0;
    }

    public final short d(int n, int n2, int n3) {
        int n4 = n - this.a * 18;
        int n5 = n2 - this.b * 18;
        return this.e(n4, n5, n3);
    }

    public short e(int n, int n2, int n3) {
        return eov_0.a().a(n, n2, n3, this.m);
    }

    public float k() {
        return this.p;
    }

    public long l() {
        return this.q;
    }

    public long m() {
        return this.r;
    }

    public long n() {
        return this.s;
    }

    public long o() {
        return this.t;
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        super.a(arf_12);
        this.d(arf_12);
        this.p = (float)arf_12.a() / 100.0f;
        this.q = arf_12.j();
        this.r = arf_12.j();
        this.s = arf_12.j();
        this.t = arf_12.j();
        this.e(arf_12);
    }

    private void d(arf_1 arf_12) {
        this.m = xk_0.a(arf_12, (short)0);
    }

    private void e(arf_1 arf_12) {
        this.u = enB.a(arf_12);
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        super.a(gk_02);
        this.b(gk_02);
        gk_02.a((byte)(this.p * 100.0f));
        gk_02.c(this.q);
        gk_02.c(this.r);
        gk_02.c(this.s);
        gk_02.c(this.t);
        this.c(gk_02);
    }

    public final void a(xk_0 xk_02) {
        this.m = xk_02;
    }

    public void a(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        this.p = f2;
    }

    public void a(long l) {
        this.q = l;
    }

    public void b(long l) {
        this.r = l;
    }

    public void c(long l) {
        this.s = l;
    }

    public void d(long l) {
        this.t = l;
    }

    private void b(gk_0 gk_02) {
        if (this.m == null) {
            gk_02.a((byte)0);
            return;
        }
        this.m.a(gk_02);
    }

    public void a(enB enB2) {
        this.u = enB2;
    }

    private void c(gk_0 gk_02) {
        enB.a(gk_02, this.u);
    }

    @Override
    public void c() {
        super.c();
        this.m = null;
        this.p = 0.0f;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
        this.t = 0L;
        this.u = null;
    }
}

