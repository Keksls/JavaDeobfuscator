/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bza
 */
public final class bza_1
implements ePO {
    public static final int a = -1;
    private int b = -1;
    private short c = (short)-1;

    @Override
    public void a(epm_0 epm_02) {
        if (this.b == -1) {
            this.b = epm_02.k();
            return;
        }
        if (this.b < epm_02.k() && azu_0.j().k().a_() != epm_02.f()) {
            aUh.b("infoPop.levelUp", epm_02.k(), epm_02.a());
        }
        this.b = epm_02.k();
        cxq_0.a.f();
    }

    @Override
    public void b(epm_0 epm_02) {
        short s2 = epm_02.l();
        if (s2 == this.c) {
            return;
        }
        if (this.c <= 0 && s2 <= 0) {
            return;
        }
        this.c = s2;
        if (this.c <= 0) {
            aUh.b("infoPop.downscaleDisable", this.b, epm_02.a());
            return;
        }
        aUh.b("infoPop.downscaleLevelChange", this.c, epm_02.a());
        cxq_0.a.f();
    }

    @Override
    public void c(epm_0 epm_02) {
        this.g(epm_02);
    }

    @Override
    public void d(epm_0 epm_02) {
        this.g(epm_02);
    }

    private void g(epm_0 epm_02) {
        dbO.a().f(epm_02.f());
    }

    @Override
    public void e(epm_0 epm_02) {
    }

    @Override
    public void f(epm_0 epm_02) {
    }
}

