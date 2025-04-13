/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from ePc
 */
public class epc_0
implements eov_1<epa_1> {
    private static final Logger a = Logger.getLogger(epc_0.class);
    private final eoy_1 b = new eoy_1();

    public epc_0() {
        for (eps_0 eps_02 : eps_0.values()) {
            epa_1 epa_12 = new epa_1(eps_02, eps_02.c(), eps_02.g());
            this.b.a(eps_02.a(), epa_12);
        }
        this.a();
    }

    @Override
    public void a() {
        this.b.a(new epd_1(this));
    }

    @Override
    public void a(epc_0 epc_02) {
        this.b.a(new epe_1(this, epc_02));
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return ru_02 != null && this.b.a(ru_02.a());
    }

    public epa_1 e(ru_0 ru_02) {
        return this.b.b(ru_02.a());
    }

    @Override
    public int c(ru_0 ru_02) {
        return this.b.b(ru_02.a()).a();
    }

    @Override
    public int d(ru_0 ru_02) {
        return this.b.b(ru_02.a()).c();
    }

    public void a(TObjectProcedure<epa_1> tObjectProcedure) {
        this.b.a(tObjectProcedure);
    }

    @Override
    public boolean a(tw_2 tw_22) {
        tw_22.c();
        this.b.a(new epf_1(this, tw_22));
        return true;
    }

    @Override
    public boolean a(tw_2 tw_22, ru_0 ... ru_0Array) {
        tw_22.c();
        for (int k = 0; k < ru_0Array.length; ++k) {
            byte by = ru_0Array[k].a();
            epa_1 epa_12 = this.b.b(by);
            tx_1 tx_12 = new tx_1();
            tx_12.a = by;
            tx_12.b = epa_12.c;
            tx_12.c = epa_12.e;
            tx_12.d = epa_12.d;
            tx_12.e = epa_12.h;
            tw_22.a.add(tx_12);
        }
        return true;
    }

    @Override
    public boolean b(tw_2 tw_22) {
        boolean bl = true;
        for (tx_1 tx_12 : tw_22.a) {
            epa_1 epa_12 = this.b.b(tx_12.a);
            if (epa_12 != null) {
                epa_12.e = tx_12.c;
                epa_12.d = tx_12.d;
                epa_12.h = tx_12.e;
                epa_12.b(tx_12.b);
                continue;
            }
            a.error((Object)("Impossible de trouver la caract\u00e9ristique \u00e0 l'index " + tx_12.a));
            bl = false;
        }
        return bl;
    }

    public void a(rv_0 rv_02) {
        this.b.a(new epg_1(this, rv_02));
    }

    public void b(rv_0 rv_02) {
        this.b.a(new eph_1(this, rv_02));
    }

    @Override
    public /* synthetic */ rs_0 b(ru_0 ru_02) {
        return this.e(ru_02);
    }
}

