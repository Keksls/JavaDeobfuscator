/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWF
 */
public class bwf_2
extends bwd_2 {
    public bwf_2(int n, int n2, int n3) {
        super(n, n, n2, n3);
    }

    @Override
    protected String a() {
        return bae.h().a(37, (long)this.n, new Object[0]);
    }

    @Override
    protected boolean b() {
        return bwy_2.h().j().y().j(this.n);
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    protected String e() {
        return azs_0.a().a("ecosystemDifficultyIconsPath", "defaultIconPath", this.n, this.g() ? 2 : (this.f() ? 1 : 0));
    }

    @Override
    protected boolean f() {
        bRz bRz2 = bRD.c().a(this.n);
        return bRz2.a() < 0.2f;
    }

    @Override
    protected boolean g() {
        bRz bRz2 = bRD.c().a(this.n);
        return bRz2.a() < 0.05f && !bRz2.i();
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public String i() {
        return bae.h().a(100, (long)this.n, new Object[0]);
    }
}

