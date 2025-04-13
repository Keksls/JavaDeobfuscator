/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bDv
 */
public class bdv_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdv_0.class);
    private evg_2 r;
    long s;

    @Override
    protected fo_1 ad() {
        return new bDw(this);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        this.b(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.C;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.C, Tv.u};
    }

    @Override
    public void ar_() {
        this.r = (evg_2)evl_1.a.a(evg_1.y, Integer.parseInt(this.l));
    }

    @Override
    public cSS[] az_() {
        fii fii2 = fij.a().a(this.r.n());
        ArrayList<cTF> arrayList = new ArrayList<cTF>();
        ctk_0 ctk_02 = new ctk_0("informations", cUL.d.aH);
        ctk_02.b(Tv.C);
        arrayList.add(ctk_02);
        if (azu_0.j().k().N_().a(emq_0.bg)) {
            cTF cTF2 = new cTF();
            cTF2.b(Tv.u);
            cTF2.a("XXX---> 3V01U7!0N <---XXX");
            cTF2.a(cUL.Y.aH);
            arrayList.add(cTF2);
        }
        return arrayList.toArray(new cSS[arrayList.size()]);
    }

    @Override
    public String al_() {
        return "TODO";
    }

    public long Z() {
        return this.s;
    }

    public evg_2 ao() {
        return this.r;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.r = null;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.r = null;
    }

    static /* synthetic */ void a(bdv_0 bdv_02, abm_1 abm_12) {
        bdv_02.a(abm_12);
    }
}

