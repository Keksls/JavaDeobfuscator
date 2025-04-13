/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCO
 */
public class bco_0
extends bFZ {
    static final Logger q = Logger.getLogger(bco_0.class);

    bco_0() {
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (!azu_0.j().c(cyq_0.a)) {
            azu_0.j().a(cyq_0.a);
        }
        this.a(tv);
        this.b(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray = new cSS[1];
        Object a2 = cSY.an.a();
        cSSArray[0] = a2;
        return cSSArray;
    }

    @Override
    public short aL() {
        return 60;
    }

    @Override
    public String al_() {
        return bae.h().a("enchantment.machine.name", new Object[0]);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(false);
        this.g(true);
        this.B = true;
        this.A = true;
    }

    static /* synthetic */ void a(bco_0 bco_02, abm_1 abm_12) {
        bco_02.a(abm_12);
    }
}

