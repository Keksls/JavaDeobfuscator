/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ePt
 */
public class ept_0
implements eov_1<epa_1> {
    private final TObjectProcedure<epa_1> b = new epu_0(this);
    eoy_1 a;
    private final epy_0 c;
    private final int d;

    public ept_0(epy_0 epy_02, int n) {
        this.c = epy_02;
        this.d = n;
    }

    @Override
    public void a() {
        this.a = null;
    }

    @Override
    public void a(epc_0 epc_02) {
        epc_02.a(this.b);
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return ru_02 != null && (this.a != null && this.a.a(ru_02.a()) || this.c.b(ru_02));
    }

    @Nullable
    public epa_1 e(ru_0 ru_02) {
        this.c();
        epa_1 epa_12 = this.a.b(ru_02.a());
        if (epa_12 != null) {
            return epa_12;
        }
        if (this.c.b(ru_02)) {
            return this.a((eps_0)ru_02);
        }
        return null;
    }

    private epa_1 a(eps_0 eps_02) {
        epa_1 epa_12 = this.b(eps_02);
        return this.a(epa_12);
    }

    private epa_1 a(epa_1 epa_12) {
        eps_0 eps_02 = epa_12.t();
        epa_12.h(eps_02.h());
        if (eps_02.k()) {
            epa_12.g(this.c.a(eps_02, this.d));
            epa_12.n();
        } else {
            epa_12.g(eps_02.i());
            epa_12.b(this.c.a(eps_02, this.d));
        }
        return epa_12;
    }

    private epa_1 b(eps_0 eps_02) {
        epa_1 epa_12 = new epa_1(eps_02, eps_02.c(), eps_02.g());
        this.a.a(eps_02.a(), epa_12);
        return epa_12;
    }

    @Override
    public int c(ru_0 ru_02) {
        epa_1 epa_12;
        if (this.a != null && (epa_12 = this.a.b(ru_02.a())) != null) {
            return epa_12.a();
        }
        if (this.c.b(ru_02)) {
            return this.c.a((eps_0)ru_02, this.d);
        }
        return -1;
    }

    @Override
    public int d(ru_0 ru_02) {
        epa_1 epa_12;
        if (this.a != null && (epa_12 = this.a.b(ru_02.a())) != null) {
            return epa_12.c();
        }
        if (this.c.b(ru_02)) {
            if (ru_02.k()) {
                return this.c.a((eps_0)ru_02, this.d);
            }
            return ru_02.i();
        }
        return -1;
    }

    @Override
    public boolean a(tw_2 tw_22) {
        tw_22.c();
        if (this.a != null) {
            this.a.a(new epv_0(this, tw_22));
        }
        return true;
    }

    @Override
    public boolean a(tw_2 tw_22, ru_0 ... ru_0Array) {
        tw_22.c();
        if (this.a != null) {
            for (int k = 0; k < ru_0Array.length; ++k) {
                byte by = ru_0Array[k].a();
                epa_1 epa_12 = this.a.b(by);
                if (epa_12 == null) continue;
                tx_1 tx_12 = new tx_1();
                tx_12.a = by;
                tx_12.b = epa_12.c;
                tx_12.c = epa_12.e;
                tx_12.d = epa_12.d;
                tx_12.e = epa_12.h;
                tw_22.a.add(tx_12);
            }
        }
        return true;
    }

    @Override
    public boolean b(tw_2 tw_22) {
        if (!tw_22.a.isEmpty()) {
            this.c();
        }
        for (tx_1 tx_12 : tw_22.a) {
            eps_0 eps_02 = eps_0.a(tx_12.a);
            epa_1 epa_12 = this.a.b(eps_02.a());
            if (epa_12 == null) {
                epa_12 = new epa_1(eps_02, eps_02.c(), eps_02.g());
                this.a.a(eps_02.a(), epa_12);
            }
            epa_12.c = tx_12.b;
            epa_12.e = tx_12.c;
            epa_12.d = tx_12.d;
            epa_12.h = tx_12.e;
        }
        return true;
    }

    private void c() {
        if (this.a == null) {
            this.a = new eoy_1();
        }
    }

    public epy_0 b() {
        return this.c;
    }

    private void d() {
        this.c();
        for (eps_0 eps_02 : eps_0.values()) {
            if (this.a.a(eps_02.a())) continue;
            this.a(eps_02);
        }
    }

    public void a(rv_0 rv_02) {
        this.d();
        this.a.a(new epw_0(this, rv_02));
    }

    public void b(rv_0 rv_02) {
        if (this.a == null) {
            return;
        }
        this.a.a(new epx_0(this, rv_02));
    }

    @Override
    @Nullable
    public /* synthetic */ rs_0 b(ru_0 ru_02) {
        return this.e(ru_02);
    }
}

