/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class bMy
extends fgn_0<bMn> {
    public static final bMy a = new bMy();
    protected static final Logger b = Logger.getLogger(bMy.class);

    protected bMy() {
    }

    @Override
    public void a(bMn bMn2, xc_1 xc_12) {
    }

    @Override
    public void b(bMn bMn2, xc_1 xc_12) {
    }

    @Override
    public void a(bMn bMn2, xt_1 xt_12) {
    }

    @Override
    public void b(bMn bMn2, xt_1 xt_12) {
    }

    @Override
    public void a(bMn bMn2, xs_2 xs_22) {
    }

    @Override
    public void b(bMn bMn2, xs_2 xs_22) {
        bMn2.a(xs_22.b);
    }

    @Override
    public void a(bMn bMn2, xe_1 xe_12) {
    }

    @Override
    public void b(bMn bMn2, xe_1 xe_12) {
        int n;
        int n2;
        Object object;
        TIntArrayList tIntArrayList = bMn2.q();
        tIntArrayList.clear();
        ArrayList<xy_2> arrayList = xe_12.a.a;
        for (int k = 0; k < arrayList.size(); ++k) {
            object = arrayList.get(k);
            if (((xy_2)object).b == Integer.MAX_VALUE) continue;
            tIntArrayList.add(((xy_2)object).a);
        }
        xz_2 xz_22 = xe_12.a.b;
        object = xz_22 != null ? xz_22.a : null;
        bMn2.s().clear();
        if (object == null) {
            bMn2.s().ensureCapacity(tIntArrayList.size());
            n2 = tIntArrayList.size();
            for (n = 0; n < n2; ++n) {
                bMn2.s().add(tIntArrayList.get(n));
            }
        } else {
            n2 = ((ArrayList)object).size();
            for (n = 0; n < n2; ++n) {
                bMn2.s().add(((ya_2)((ArrayList)object).get((int)n)).a);
            }
        }
        ArrayList<xy_2> arrayList2 = xe_12.c.a;
        TIntArrayList tIntArrayList2 = bMn2.t();
        tIntArrayList2.clear();
        int n3 = arrayList2.size();
        for (int k = 0; k < n3; ++k) {
            tIntArrayList2.add(arrayList2.get((int)k).a);
        }
        fis_1.a().a((ajf_1)bwy_2.h(), "boughtChallenges");
    }

    @Override
    public void a(bMn bMn2, xa_2 xa_22) {
    }

    @Override
    public void b(bMn bMn2, xa_2 xa_22) {
        bnh_0 bnh_02 = bMn2.h();
        if (bnh_02 == null) {
            bnh_02 = new bnh_0(xa_22.a.a, bnk_0.b, eyk_1.f, 99, 1, false, fgo_0.a);
            bMn2.a(bnh_02);
        }
        bnh_02.a(xa_22.a);
        bMn2.i();
        bnh_0 bnh_03 = bMn2.o();
        if (bnh_03 == null) {
            bnh_03 = new bnh_0(xa_22.b.a, bnk_0.b, eyk_1.g, 99, 1, true, fgo_0.b);
            bMn2.b(bnh_03);
        }
        bnh_03.a(xa_22.b);
        b.info((Object)("#### MerchantInventory (challenges) du protecteur id=" + bMn2.B()));
        for (bni_0 bni_02 : bnh_02) {
            b.info((Object)("####   refId=" + bni_02.aT_() + " price=" + bni_02.p() + " type=" + bni_02.c().name() + " featureReferenceId=" + bni_02.d()));
        }
        b.info((Object)("#### MerchantInventory (buffs) du protecteur id=" + bMn2.B()));
        for (bni_0 bni_02 : bnh_03) {
            b.info((Object)("####   refId=" + bni_02.aT_() + " price=" + bni_02.p() + " type=" + bni_02.c().name() + " featureReferenceId=" + bni_02.d()));
        }
    }

    @Override
    public void a(bMn bMn2, xo_1 xo_12) {
    }

    @Override
    public void b(bMn bMn2, xo_1 xo_12) {
        bmd_0 bmd_02 = (bmd_0)bMn2.l();
        if (bmd_02 == null) {
            bmd_02 = new bmd_0(bMn2, bwv_2.a);
            bMn2.a(bmd_02);
        }
        bmd_02.b(xo_12);
        b.info((Object)("#### Wallet du protecteur id=" + bMn2.B() + " : cashAmount=" + bmd_02.a()));
    }

    @Override
    public void a(bMn bMn2, xj_2 xj_22) {
    }

    @Override
    public void b(bMn bMn2, xj_2 xj_22) {
    }

    @Override
    public void a(bMn bMn2, xk_2 xk_22) {
    }

    @Override
    public void b(bMn bMn2, xk_2 xk_22) {
        EnumMap<fjb_0, fja_0> enumMap = bMn2.u();
        ArrayList<xl_2> arrayList = xk_22.a;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            zr_1 zr_12 = arrayList.get((int)k).a;
            fjb_0 fjb_02 = fjb_0.a(zr_12.a);
            enumMap.put(fjb_02, new fja_0(fjb_02, zr_12.b));
        }
        daw.h();
    }

    @Override
    public void a(bMn bMn2, xq_1 xq_12) {
    }

    @Override
    public void b(bMn bMn2, xq_1 xq_12) {
        ArrayList<xr_2> arrayList = xq_12.a;
        bMn2.p().clear();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            xr_2 xr_22 = arrayList.get(k);
            wt_0 wt_02 = wt_0.b(xr_22.a);
            Yc yc = eay_0.a.a(xr_22.b);
            if (yc != null) {
                Yi yi = new Yi(yc, wt_02);
                bMn2.p().add(yi);
                continue;
            }
            b.error((Object)("Modificateur m\u00e9t\u00e9o ignor\u00e9 -- pas/plus de bonus de climat d'ID=" + xr_22.b + ", pour le protecteur ID=" + bMn2.B()));
        }
    }

    @Override
    protected void a(bMn bMn2, xg_1 xg_12) {
    }

    @Override
    protected void b(bMn bMn2, xg_1 xg_12) {
        bMw bMw2 = bMn2.v();
        ArrayList<xh_1> arrayList = xg_12.a;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            xh_1 xh_12 = arrayList.get(k);
            bMw2.b(xh_12.a.a, new aeo_2(xh_12.a.b, xh_12.a.c));
        }
    }

    @Override
    protected void a(bMn bMn2, xy_1 xy_12) {
    }

    @Override
    protected void b(bMn bMn2, xy_1 xy_12) {
        bMw bMw2 = bMn2.v();
        ArrayList<xz_1> arrayList = xy_12.a;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            xz_1 xz_12 = arrayList.get(k);
            bMw2.a(xz_12.a.a, new aeo_2(xz_12.a.b, xz_12.a.c));
        }
    }

    @Override
    protected void a(bMn bMn2, xi_2 xi_22) {
        fgk_0 fgk_02 = fgk_0.a(xi_22.a);
        if (fgk_02 != null) {
            bMn2.v().a(fgk_02);
        } else {
            b.error((Object)("Erreur \u00e0 la d\u00e9serialisation de la satisfaction du protecteur id=" + bMn2.B() + " niveau de satisfaction id=" + xi_22.a + " inexistant"));
        }
    }

    @Override
    protected void b(bMn bMn2, xi_2 xi_22) {
    }

    @Override
    protected void a(bMn bMn2, xv_2 xv_22) {
        bMq bMq2 = bMn2.y();
        ArrayList<xw_2> arrayList = xv_22.a;
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            bMq2.k(arrayList.get((int)k).a);
        }
        ArrayList<xx_2> arrayList2 = xv_22.b;
        int n2 = arrayList2.size();
        for (n = 0; n < n2; ++n) {
            bMq2.l(arrayList2.get((int)n).a);
        }
    }

    @Override
    protected void b(bMn bMn2, xv_2 xv_22) {
    }

    @Override
    protected void a(bMn bMn2) {
        try {
            atg_0 atg_02 = new atg_0();
            if (!asw_2.a().a(bMn2.B(), atg_02)) {
                b.error((Object)("le protector " + bMn2.B() + " non trouv\u00e9"));
                return;
            }
            TIntArrayList tIntArrayList = bMn2.r();
            tIntArrayList.clear();
            aQT aQT2 = new aQT();
            if (!asw_2.a().a(atg_02.e(), aQT2)) {
                return;
            }
            fat<blx_2> fat2 = new fat<blx_2>();
            for (aqu_0 aqu_02 : aQT2.d()) {
                blx_2 blx_22 = new blx_2(aqu_02.a(), 1, eyS.c(aqu_02.b()));
                fat2.a(blx_22);
                tIntArrayList.add(aqu_02.a());
            }
            bMn2.a(fat2);
        }
        catch (Exception exception) {
            b.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    protected /* synthetic */ void a(fgy_0 fgy_02, xv_2 xv_22) {
        this.b((bMn)fgy_02, xv_22);
    }

    @Override
    protected /* synthetic */ void b(fgy_0 fgy_02, xv_2 xv_22) {
        this.a((bMn)fgy_02, xv_22);
    }

    @Override
    protected /* synthetic */ void a(fgy_0 fgy_02, xi_2 xi_22) {
        this.b((bMn)fgy_02, xi_22);
    }

    @Override
    protected /* synthetic */ void b(fgy_0 fgy_02, xi_2 xi_22) {
        this.a((bMn)fgy_02, xi_22);
    }

    @Override
    protected /* synthetic */ void a(fgy_0 fgy_02, xy_1 xy_12) {
        this.b((bMn)fgy_02, xy_12);
    }

    @Override
    protected /* synthetic */ void b(fgy_0 fgy_02, xy_1 xy_12) {
        this.a((bMn)fgy_02, xy_12);
    }

    @Override
    protected /* synthetic */ void a(fgy_0 fgy_02, xg_1 xg_12) {
        this.b((bMn)fgy_02, xg_12);
    }

    @Override
    protected /* synthetic */ void b(fgy_0 fgy_02, xg_1 xg_12) {
        this.a((bMn)fgy_02, xg_12);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xq_1 xq_12) {
        this.b((bMn)fgy_02, xq_12);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xq_1 xq_12) {
        this.a((bMn)fgy_02, xq_12);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xk_2 xk_22) {
        this.b((bMn)fgy_02, xk_22);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xk_2 xk_22) {
        this.a((bMn)fgy_02, xk_22);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xo_1 xo_12) {
        this.b((bMn)fgy_02, xo_12);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xo_1 xo_12) {
        this.a((bMn)fgy_02, xo_12);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xa_2 xa_22) {
        this.b((bMn)fgy_02, xa_22);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xa_2 xa_22) {
        this.a((bMn)fgy_02, xa_22);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xe_1 xe_12) {
        this.b((bMn)fgy_02, xe_12);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xe_1 xe_12) {
        this.a((bMn)fgy_02, xe_12);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xs_2 xs_22) {
        this.b((bMn)fgy_02, xs_22);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xs_2 xs_22) {
        this.a((bMn)fgy_02, xs_22);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xt_1 xt_12) {
        this.b((bMn)fgy_02, xt_12);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xt_1 xt_12) {
        this.a((bMn)fgy_02, xt_12);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xc_1 xc_12) {
        this.b((bMn)fgy_02, xc_12);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xc_1 xc_12) {
        this.a((bMn)fgy_02, xc_12);
    }

    @Override
    public /* synthetic */ void a(fgy_0 fgy_02, xj_2 xj_22) {
        this.b((bMn)fgy_02, xj_22);
    }

    @Override
    public /* synthetic */ void b(fgy_0 fgy_02, xj_2 xj_22) {
        this.a((bMn)fgy_02, xj_22);
    }
}

