/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bDP
 */
public class bdp_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdp_0.class);
    private evs_1 r;

    @Override
    public void ar_() {
        super.ar_();
        if (this.l == null || this.l.isEmpty()) {
            return;
        }
        int n = Integer.parseInt(this.l);
        Optional<bao_2> optional = ban_2.a.a(n);
        if (optional.isEmpty()) {
            return;
        }
        bao_2 bao_22 = optional.get();
        this.r = (evs_1)evl_1.a.a(evg_1.j, bao_22.c());
        this.c(bae.h().a(89, (long)this.r.m(), new Object[0]));
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.l};
    }

    @Override
    protected Tv ap_() {
        return Tv.l;
    }

    @Override
    public cSS[] az_() {
        if (this.r == null) {
            return cSS.k;
        }
        if (this.r.a().isEmpty()) {
            return cSS.k;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bgw_1 bgw_12 = new bgw_1(this.r, bmr_12);
        TIntObjectIterator tIntObjectIterator = this.r.a().iterator();
        ArrayList<cty_0> arrayList = new ArrayList<cty_0>();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            evt_1 evt_12 = (evt_1)tIntObjectIterator.value();
            fii fii2 = fij.a().a(evt_12.f());
            arrayList.add(bgw_12.a(new cty_0(), fii2, evt_12));
        }
        return arrayList.toArray(cSS.k);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (!(tF instanceof bmr_1)) {
            return false;
        }
        evt_1 evt_12 = this.r.a(tF, tF, this, ((Tt)((Object)tF)).Q_());
        bgw_1 bgw_12 = new bgw_1(this.r, (bmr_1)tF);
        if (!bgw_12.a(tF)) {
            return true;
        }
        if (!bgw_12.b(evt_12)) {
            return false;
        }
        this.a(tv);
        this.aI_();
        this.b(tv);
        cdw_0.n().c(600210L);
        return false;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
    }

    static /* synthetic */ void a(bdp_0 bdp_02, abm_1 abm_12) {
        bdp_02.a(abm_12);
    }
}

