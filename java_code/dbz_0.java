/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbz
 */
class dbz_0
extends fjh_2 {
    private final int a;
    private final int o;
    private final boolean p;

    dbz_0(int n, int n2, fvE fvE2, int n3, int n4, fjw_2 fjw_22, boolean bl) {
        super(null, null, fvE2, n3, n4, fjw_22);
        this.a = n;
        this.o = n2;
        this.p = bl;
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            fvE fvE2 = this.c();
            int n2 = frs_0.h.a(fvE2.getWidth(), fvE2.getContainer().getWidth());
            int n3 = (int)this.c.a(this.a, this.o, this.d, this.e);
            this.c().setPosition(n2, n3, true);
        }
        return true;
    }

    @Override
    public void a() {
        fvE fvE2 = (fvE)this.m;
        int n = frs_0.h.a(fvE2.getWidth(), fvE2.getContainer().getWidth());
        this.c().setPosition(n, this.o, true);
        this.c().setVisible(this.p);
        super.a();
    }
}

