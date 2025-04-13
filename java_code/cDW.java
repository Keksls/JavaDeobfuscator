/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class cDW
extends cDY<alu_1> {
    private boolean m = false;
    private alo_1 n;
    private int o;

    @Override
    protected cDY j() {
        return new cDW();
    }

    @Override
    protected void b(cdr_0 cdr_02) {
        super.b(cdr_02);
        cDW cDW2 = (cDW)cdr_02;
        cDW2.m = this.m;
        cDW2.o = this.o;
        cDW2.n = this.n;
    }

    public alo_1 k() {
        return this.n;
    }

    @Override
    public void a(alo_1 alo_12) {
        this.n = alo_12;
    }

    public int l() {
        return this.o;
    }

    public void b(int n) {
        this.o = n;
    }

    public boolean m() {
        return this.m;
    }

    @Override
    public void a(boolean bl) {
        this.m = bl;
    }

    @Override
    protected void a(cey_2 cey_22) {
        super.a(cey_22);
        cey_22.x = this.o;
    }

    @Override
    protected amj_1 a(long l, boolean bl) {
        alw_1 alw_12;
        alo_1 alo_12;
        amx_1 amx_12;
        if (!((alu_1)this.l).o()) {
            return null;
        }
        try {
            if (((alu_1)this.l).h() == null) {
                return null;
            }
            amx_12 = ((alu_1)this.l).h().a(l);
        }
        catch (IOException iOException) {
            return null;
        }
        if (amx_12 == null) {
            return null;
        }
        if (this.m) {
            float f2 = Hw.b(6, 9) * (Hw.c() ? -1 : 1);
            float f3 = Hw.b(6, 9) * (Hw.c() ? -1 : 1);
            alo_12 = new alz_1(f2, f3, 0.0f, true, 0);
        } else {
            alo_12 = this.n;
            if (alo_12 == null) {
                c.error((Object)("On essaye de cr\u00e9er une source audio sans avoir d'ObservedSource dans le container " + this.d() + " (" + this.c() + "). V\u00e9rifier le param\u00e9trage du container"));
                return null;
            }
        }
        aly_1 aly_12 = null;
        if (this.o >= 0) {
            aly_12 = ((alu_1)this.l).g().h(this.o);
        }
        if (aly_12 == null) {
            aly_12 = aly_1.a;
        }
        if ((alw_12 = ((alu_1)this.l).a(amx_12, 1.0f, 1.0f, alo_12, aly_12.b(), aly_12.c(), aly_12.a(), 0, 0, bl, false, false, 0.0f, -1L)) == null) {
            return null;
        }
        return alw_12.a();
    }
}

