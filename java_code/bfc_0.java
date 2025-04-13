/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bFC
 */
public class bfc_0
extends bFZ
implements ezz_1 {
    static final Logger t = Logger.getLogger(bfc_0.class);
    public static final abn_1<bfc_0> q = new bFD();
    public static final TObjectProcedure<epq_2> r = new bfe_0();
    private evs_1 u;

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case a: {
                evt_1 evt_12 = this.u.a(tF, tF, this, ((Tt)((Object)tF)).Q_());
                return this.a(tF, evt_12);
            }
        }
        t.error((Object)"Action invalide sur un teleporter", (Throwable)new IllegalArgumentException(tv.toString()));
        return false;
    }

    public boolean a(TF tF, evt_1 evt_12) {
        if (!(tF instanceof bmr_1)) {
            return false;
        }
        bgw_1 bgw_12 = new bgw_1(this.u, (bmr_1)tF);
        if (!bgw_12.a(tF)) {
            return true;
        }
        if (!bgw_12.b(evt_12)) {
            return false;
        }
        this.a(this.v());
        bmr_1 bmr_12 = (bmr_1)tF;
        biI biI2 = bmr_12.bv();
        if (biI2.bb() != null) {
            biI2.b(new bff_0(this, biI2, evt_12));
            return true;
        }
        this.a(biI2, evt_12);
        return true;
    }

    void a(biI biI2, evt_1 evt_12) {
        Object object;
        if (evt_12.g() > 0 && (object = aij_0.a().a(evt_12.g())) != null) {
            ((ParticleSystem)object).a(this.J(), (float)this.H(), (float)this.I());
            aik_0.a().b((IsoParticleSystem)object);
        }
        if ((object = fij.a().a(evt_12.f())) != null) {
            bOE.a(biI2, (fii)object);
        }
        this.a(this.a(biI2, (fii)object, evt_12), evt_12);
    }

    private int a(biI biI2, fii fii2, evt_1 evt_12) {
        int n;
        if (fii2 != null && evt_12.h() == 0 && (n = biI2.j(fii2.b())) != 0 && n != Integer.MAX_VALUE) {
            return n;
        }
        return evt_12.h();
    }

    private void a(int n, evt_1 evt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.n(false);
        ado_1.a().a(new bfg_0(this, bmr_12, evt_12), n, 1);
    }

    void a(bmr_1 bmr_12, evt_1 evt_12) {
        bmr_1 bmr_13 = azu_0.j().k();
        bmr_13.n(true);
        if (bmr_13.dn()) {
            return;
        }
        bmr_12.bv().bD();
        cnK cnK2 = new cnK();
        cnK2.a(this.a_());
        cnK2.b(evt_12.a());
        cnK2.a(evt_12.r());
        cnK2.c(evt_12.s());
        azu_0.j().K().c(cnK2);
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
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        assert (this.u == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.u = null;
    }

    @Override
    public void ar_() {
        try {
            this.u = (evs_1)evl_1.a.a(evg_1.j, Integer.parseInt(this.l));
        }
        catch (NumberFormatException numberFormatException) {
            t.error((Object)("Erreur de param\u00e9trage d'IE " + this), (Throwable)numberFormatException);
        }
        finally {
            if (this.u == null) {
                this.u = evs_1.a;
            }
        }
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray;
        if (this.aK_().isEmpty()) {
            return cSS.k;
        }
        TIntObjectHashMap<evt_1> tIntObjectHashMap = this.u.a();
        ArrayList<cub_0> arrayList = new ArrayList<cub_0>();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            cSSArray = (evt_1)tIntObjectIterator.value();
            bgw_1 bgw_12 = new bgw_1(this.u, azu_0.j().k());
            boolean bl = bgw_12.a((evt_1)cSSArray);
            if (cSSArray.f() <= 0 || cSSArray.b() && bl) continue;
            fii fii2 = fij.a().a(cSSArray.f());
            int n = cSSArray.t();
            bmr_1 bmr_12 = azu_0.j().k();
            fam_0 fam_02 = bmr_12.cB();
            far far2 = fam_02.d(n);
            ezb_2 ezb_22 = far2 == null ? null : ezd_2.a.a(far2.b());
            cUz cUz2 = ezb_22 == null ? new cub_0() : new ctx_0();
            arrayList.add(bgw_12.a(cUz2, fii2, (evt_1)cSSArray));
        }
        cSSArray = new cSS[arrayList.size()];
        arrayList.toArray(cSSArray);
        return cSSArray;
    }

    @Override
    public String al_() {
        return bae.h().a(89, (long)this.u.m(), new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public ezx_1 ay_() {
        return this.u;
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    @Override
    public String toString() {
        return "Teleporter{m_info=" + this.u + "}";
    }

    static /* synthetic */ void a(bfc_0 bfc_02, abm_1 abm_12) {
        bfc_02.a(abm_12);
    }
}

