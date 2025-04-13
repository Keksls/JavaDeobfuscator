/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bpI
 */
public class bpi_2
extends bpc_2 {
    private final bFf a;

    public bpi_2(bFf bFf2) {
        this.a = bFf2;
    }

    @Override
    public short ac_() {
        return 34;
    }

    @Override
    public boolean g() {
        return this.d != null && this.d.eE() == null;
    }

    @Override
    public void a() {
        if (this.d != null) {
            this.d.a(this);
        }
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (bl2) {
            this.a.a(Tv.n, azu_0.j().k());
        }
        return this.b();
    }

    @Override
    public boolean b() {
        if (azu_0.j().c(ddh_0.a())) {
            azu_0.j().b(ddh_0.a());
        }
        return true;
    }

    public bFf h() {
        return this.a;
    }
}

