/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongIterator;
import org.apache.log4j.Logger;

public class bDZ
extends bFZ
implements bEw,
ezz_1 {
    protected static final Logger q = Logger.getLogger(bDZ.class);
    protected evi_1 r;

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.b(tv);
        this.a(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.w;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.w};
    }

    @Override
    public cSS[] az_() {
        if (this.r == null) {
            return cSS.k;
        }
        if (this.g == 1) {
            fii fii2 = fij.a().a(this.r.n());
            ctu_0 ctu_02 = (ctu_0)cSY.W.a();
            ctu_02.a(fii2.c());
            ctu_02.d("desc.mru." + fii2.d());
            this.a(ctu_02);
            ctu_02.b(this.aq());
            ctu_02.a(this.ap());
            cSS[] cSSArray = new cSS[]{ctu_02};
            return cSSArray;
        }
        return cSS.k;
    }

    public static boolean a(int n, int n2, int n3, boolean bl) {
        ewx_2 ewx_22;
        ewz_2 ewz_22;
        bjw_1 bjw_12 = bhb_0.d().a(n);
        bmr_1 bmr_12 = azu_0.j().k();
        if (!(bjw_12 == null || !bl && evl_2.a(bmr_12.R(), n) >= n2 || bmr_12.da().h(n) >= n2 || (ewz_22 = (ewx_22 = (ewx_2)bmr_12.a(ewl_1.a)).a(n)) != null && ewz_22.b() >= n2)) {
            return false;
        }
        return bmr_12.cq() >= (long)n3;
    }

    public static String b(int n, int n2, int n3, boolean bl) {
        ani_2 ani_22 = new ani_2();
        bjw_1 bjw_12 = bhb_0.d().a(n);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bjw_12 != null) {
            boolean bl2 = (n2 != 1 || bmr_12.dC().b(n) == null) && !bDZ.a(n, n2, bl);
            ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
            ewz_2 ewz_22 = ewx_22.a(n);
            ani_22.i().a(((bl2 &= ewz_22 == null || ewz_22.b() < n2) ? azf_2.h : azf_2.j).w());
            ani_22.a((CharSequence)"[").a((CharSequence)bjw_12.e()).a((CharSequence)"]").a((CharSequence)" x").d(n2);
            ani_22.j();
        }
        if (n3 > 0) {
            if (bjw_12 != null) {
                ani_22.m();
            }
            ani_22.i().a((bDZ.a(n3) ? azf_2.j : azf_2.h).w());
            ani_22.a((CharSequence)bae.h().a("kama.shortGain", n3)).j();
        }
        return ani_22.r();
    }

    public static void a(bFZ bFZ2, ctu_0 ctu_02, apc_2 apc_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (apc_22 != null && !apc_22.b(bmr_12, bFZ2, null, bmr_12.Q_())) {
            ctu_02.c(false);
            ctu_02.a(eDm.a((aot_2)apc_22));
        }
    }

    static boolean a(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        eyu_1 eyu_12 = bmr_12.dK();
        if (eyu_12 == null) {
            return false;
        }
        return eyu_12.a() >= l;
    }

    static boolean a(int n, int n2, boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bl && evl_2.a(bmr_12.R(), n) >= n2) {
            return true;
        }
        int n3 = n2;
        TLongIterator tLongIterator = euw_2.a.e(bmr_12.R()).iterator();
        while (tLongIterator.hasNext()) {
            bmr_1 bmr_13 = (bmr_1)euw_2.a.d(tLongIterator.next());
            if (n == 0) continue;
            int n4 = bmr_13.da().h(n);
            ewx_2 ewx_22 = (ewx_2)bmr_13.a(ewl_1.a);
            ewz_2 ewz_22 = ewx_22.a(n);
            if (ewz_22 == null) {
                n3 -= n4;
                continue;
            }
            short s2 = ewz_22.b();
            if (s2 >= n2) continue;
            return false;
        }
        return n3 <= 0;
    }

    private boolean ap() {
        if (this.r == null) {
            return false;
        }
        return bDZ.a(this.r.f(), this.r.g(), this.r.e(), this.r.h());
    }

    private String aq() {
        if (this.r == null) {
            return null;
        }
        return bDZ.b(this.r.f(), this.r.g(), this.r.e(), this.r.h());
    }

    private void a(ctu_0 ctu_02) {
        if (this.r == null) {
            return;
        }
        bDZ.a(this, ctu_02, this.r.a());
        bmr_1 bmr_12 = azu_0.j().k();
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        if (this.a_() == 14641L && ewx_22.a(12787) != null) {
            ctu_02.c(false);
            ctu_02.a(bae.h().a("lootChest.cantDrop", new Object[0]));
        }
    }

    @Override
    public fii Z() {
        return fij.a().a(this.r.n());
    }

    @Override
    public short ao() {
        return 3;
    }

    @Override
    public short aL() {
        return (short)((float)this.W() * 10.0f);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.c((short)Short.MIN_VALUE);
        this.b(true);
        this.g(true);
        this.k(true);
        this.m(true);
        this.i(true);
        assert (this.r == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.r = null;
    }

    @Override
    public String al_() {
        if (this.r == null) {
            return null;
        }
        Object object = bae.h().a(85, (long)this.r.m(), new Object[0]);
        if (this.r.e() > 0) {
            object = (String)object + " (" + this.r.e() + "\u00a7)";
        }
        if (this.r.i()) {
            object = (String)object + " (" + this.r.g() + " x " + bae.h().a(15, (long)this.r.f(), new Object[0]) + ")";
        }
        return object;
    }

    @Override
    public void ar_() {
        super.ar_();
        this.r = (evi_1)evl_1.a.a(evg_1.h, Integer.parseInt(this.l));
        if (this.r == null) {
            q.error((Object)("pas de param(paramId=" + this.l + ") trouv\u00e9 pour le lootChest " + this.a_()), (Throwable)new Exception());
        }
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public void aC_() {
        super.aC_();
        this.g = 0;
        this.aI_();
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    @Override
    public ezx_1 ay_() {
        return this.r;
    }

    @Override
    public String toString() {
        return "LootChest{m_param=" + this.r + "}";
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgh_1(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bDZ bDZ2, abm_1 abm_12) {
        bDZ2.a(abm_12);
    }
}

