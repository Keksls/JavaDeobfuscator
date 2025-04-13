/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWB
 */
public class bwb_2
extends bwd_2 {
    public bwb_2(int n, int n2, int n3) {
        super(n, epx_1.b().a(n).e(), n2, n3);
    }

    @Override
    protected String a() {
        return bae.h().a(38, (long)this.n, new Object[0]);
    }

    @Override
    protected boolean b() {
        return bwy_2.h().j().y().i(this.n);
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    protected String e() {
        if (this.g()) {
            return boi_2.h.a(this.o);
        }
        if (this.f()) {
            return boi_2.g.a(this.o);
        }
        return boi_2.f.a(this.o);
    }

    @Override
    protected boolean f() {
        bRz bRz2 = bRC.c().a(this.n);
        return bRz2.a() < 0.2f;
    }

    @Override
    protected boolean g() {
        bRz bRz2 = bRC.c().a(this.n);
        return bRz2.a() < 0.05f && !bRz2.i();
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public String i() {
        return bae.h().a(100, (long)eAJ.e.b(), new Object[0]);
    }
}

