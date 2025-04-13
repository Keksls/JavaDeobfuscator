/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from bOq
 */
public class boq_0
extends fib
implements ajh_1 {
    public static final String a = "uid";
    public static final String b = "rid";
    public static final String d = "smallIconUrl";
    public static final String e = "type";
    public static final String f = "usable";
    public static final String g = "backgroundTypeIcon";
    public static final String h = "quantity";
    public static final String i = "cooldown";
    public static final String j = "particleFile";
    private byte w;
    public static final byte k = 0;
    public static final byte l = 1;
    public static final byte m = 2;
    public static final byte n = 3;
    public static final byte o = 4;
    public static final byte p = 5;
    private static final short[] x = new short[]{0, 0, 1, 1, 0, 0};
    public static final String[] q = new String[]{"uid", "rid", "smallIconUrl", "type", "usable", "backgroundTypeIcon", "quantity"};
    private boolean y = true;
    private static final ObjectPool z = new abm_1(new bOr());
    private final bOB A = new bOB();

    boq_0() {
    }

    public static boq_0 c() {
        boq_0 boq_02;
        try {
            boq_02 = (boq_0)z.borrowObject();
            boq_02.s = z;
        }
        catch (Exception exception) {
            boq_02 = new boq_0();
            boq_02.s = null;
            boq_02.onCheckOut();
            c.error((Object)("Erreur lors d'un checkOut sur un ShortCutItem : " + exception.getMessage()));
        }
        return boq_02;
    }

    public static boq_0 a(fie fie2, long l, int n, int n2) {
        boq_0 boq_02 = boq_0.c();
        boq_02.b(fie2, l, n, n2);
        return boq_02;
    }

    @Override
    public void release() {
        if (this.s != null) {
            try {
                this.s.returnObject((Object)this);
            }
            catch (Exception exception) {
                c.error((Object)("Exception dans le release de " + this.getClass().toString() + ". Normalement impossible"));
            }
            this.s = null;
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public Object b(String string) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.aT_();
        }
        if (string.equals(e)) {
            return this.n();
        }
        if (string.equals(d)) {
            switch (this.n()) {
                case e: {
                    bhx bhx2 = bhA.a.a(this.aT_());
                    if (bhx2 == null) {
                        return null;
                    }
                    return bhx2.f();
                }
                case a: {
                    return azs_0.a().g(this.o());
                }
                case d: 
                case c: 
                case b: {
                    return azs_0.a().d(this.o());
                }
                case f: {
                    return azs_0.a().n(String.valueOf(this.o()));
                }
            }
            return null;
        }
        if (string.equals(f)) {
            if (!this.y) {
                return false;
            }
            blx_1 blx_12 = cZa.a().d();
            if (blx_12 == null && bmr_12.ab_()) {
                return false;
            }
            if (blx_12 != null && blx_12.ab_()) {
                return false;
            }
            switch (this.n()) {
                case f: {
                    if (blx_12 != null) {
                        return new ezn_1().b(blx_12.a_(), this.aT_());
                    }
                    return new ezn_1().b(bmr_12.a_(), this.aT_());
                }
                case e: {
                    bhu bhu2 = bhA.a.c(this.aT_());
                    if (bhu2 == null) {
                        return true;
                    }
                    return bhu2.i() == null || bhu2.i().b(bmr_12, bmr_12.P_(), bhu2, bmr_12.Q_());
                }
                case a: {
                    bvx_2 bvx_22;
                    if (blx_12 == null || blx_12.gk() || !blx_12.bp()) {
                        blx_12 = bmr_12;
                    }
                    if ((bvx_22 = bmr_12.bz()) == null) {
                        bpl_0 bpl_02 = blx_12.c(this.a());
                        return bpl_02 == null;
                    }
                    bpl_0 bpl_03 = blx_12.c(this.a());
                    if (bpl_03 == null) {
                        return false;
                    }
                    if (!((bph_0)bpl_03.r()).y()) {
                        this.A.a(bvx_22);
                        fir_0 fir_02 = this.A.a(blx_12, bpl_03, null, true);
                        return fir_02 == fir_0.a;
                    }
                    exk_2 exk_22 = bmr_12.cG().a(bmr_12.dC(), exh_2.a(((bph_0)bpl_03.r()).z()));
                    fir_0 fir_03 = bvx_22.a((epq_2)blx_12, exk_22, bpl_03, null);
                    return fir_03 == fir_0.a;
                }
                case d: {
                    exk_2 exk_23;
                    bvx_2 bvx_23 = bmr_12.bz();
                    if (bvx_23 == null) {
                        return true;
                    }
                    if (this.aT_() != 2145) {
                        exk_23 = bmr_12.cG().a(bmr_12.dC(), exh_2.a((byte)(-(this.a() + 1L))));
                    } else {
                        Object r2 = eyo_1.g().d(2145);
                        exk_2 exk_24 = new exk_2(-1L);
                        exk_24.b((ezr_0)r2);
                        exk_24.a((short)1);
                        exk_23 = exk_24;
                        blx_1 blx_13 = cZa.a().d();
                        if (blx_13 == null) {
                            return false;
                        }
                    }
                    return exk_23 != null && exk_23.aU_() && bvx_23.a((epq_2)bmr_12, exk_23, null, true) == fir_0.a;
                }
                case b: {
                    Object r3 = eyo_1.g().d(this.aT_());
                    if (r3 == null) {
                        return false;
                    }
                    if (((ezr_0)r3).p() instanceof bjc_2) {
                        short s2 = ((bjc_2)((ezr_0)r3).p()).h();
                        int n = ((bjc_2)((ezr_0)r3).p()).g();
                        ece_0 ece_02 = bmr_12.eX();
                        return ece_02.e(n) && ece_02.f(n) >= s2 && this.e() > 0;
                    }
                    if (((ezr_0)r3).G() > bmr_12.dr()) {
                        return false;
                    }
                    bvx_2 bvx_24 = bmr_12.bz();
                    if (bvx_24 != null) {
                        if (bvx_24.e() == elp_0.b) {
                            return bhv_1.a(r3, bmr_12, bvx_24, this.a());
                        }
                        blx_1 blx_14 = cZa.a().d();
                        if (blx_14 == null) {
                            return false;
                        }
                        return bhv_1.a(r3, blx_14, bvx_24, this.a());
                    }
                    apc_2 apc_22 = ((ezr_0)r3).a(exz_1.a);
                    bmr_1 bmr_13 = bmr_12;
                    return (apc_22 == null || apc_22.b(bmr_13, bmr_13.P_(), null, bmr_13.ge())) && this.e() > 0;
                }
                case c: {
                    exk_2 exk_25 = bmr_12.da().i(this.a());
                    if (exk_25 != null && exk_25.aU_()) {
                        apc_2 apc_23;
                        if (exk_25.T().F().h().length == 0 || this.k() == 4) {
                            blx_1 blx_15;
                            apc_2 apc_24;
                            if (bmr_12.ak() && bmr_12.bz() != null && bmr_12.bz().e() != elp_0.b) {
                                apc_24 = exk_25.T().a(exz_1.b);
                                blx_15 = cZa.a().d();
                                if (blx_15 == null) {
                                    return false;
                                }
                            } else {
                                apc_24 = exk_25.T().a(exz_1.a);
                                blx_15 = bmr_12;
                            }
                            return (apc_24 == null || apc_24.b(blx_15, blx_15.P_(), exk_25, blx_15.ge())) && this.e() > 0;
                        }
                        blx_1 blx_16 = bmr_12;
                        if (bmr_12.ak()) {
                            if (!exk_25.T().a(exh_2.p) && !exk_25.T().a(exh_2.q)) {
                                return false;
                            }
                            blx_16 = cZa.a().d();
                            if (blx_16 == null) {
                                return false;
                            }
                        }
                        return ((apc_23 = exk_25.T().a(exz_1.c)) == null || apc_23.b(blx_16, blx_16.P_(), exk_25, blx_16.ge())) && this.e() > 0;
                    }
                    exk_25 = bmr_12.cG().a(bmr_12.dC(), this.aT_());
                    if (exk_25 != null && exk_25.aU_()) {
                        blx_1 blx_17;
                        apc_2 apc_25;
                        if (bmr_12.a(eoz_1.O)) {
                            return false;
                        }
                        if (bmr_12.ak() && !exk_25.V()) {
                            return false;
                        }
                        bvx_2 bvx_25 = bmr_12.bz();
                        if (bmr_12.ak() && bvx_25 != null && bvx_25.e() != elp_0.b) {
                            apc_25 = exk_25.T().a(exz_1.b);
                            blx_17 = cZa.a().d();
                            if (blx_17 == null) {
                                return false;
                            }
                        } else {
                            apc_25 = exk_25.T().a(exz_1.a);
                            blx_17 = bmr_12;
                        }
                        return (apc_25 == null || apc_25.b(blx_17, blx_17.P_(), exk_25, blx_17.ge())) && exk_25.T().t() <= blx_17.c(eps_0.c) && this.e() > 0;
                    }
                    return this.e() > 0;
                }
            }
        } else {
            if (string.equals(i)) {
                if (this.n() != fie.a) {
                    return "";
                }
                bvx_2 bvx_26 = bmr_12.bz();
                if (bvx_26 == null) {
                    return "";
                }
                blx_1 blx_18 = cZa.a().d();
                blx_1 blx_19 = blx_18 != null ? blx_18 : azu_0.j().k();
                bpl_0 bpl_04 = blx_19.c(this.a());
                if (bpl_04 == null) {
                    return "";
                }
                if (!((bph_0)bpl_04.r()).y()) {
                    fir_0 fir_04 = blx_19.gh().b((epq_2)blx_19, bpl_04, (int)bvx_26.A().u());
                    if (fir_04 == fir_0.a) {
                        return "";
                    }
                    if (fir_04 == fir_0.o) {
                        int n = blx_19.gh().a((epq_2)blx_19, (fio_0)bpl_04, (int)bvx_26.A().u());
                        if (n > 0) {
                            return String.valueOf(n);
                        }
                        return String.valueOf('\u221e');
                    }
                    if (fir_04 == fir_0.n) {
                        return "1";
                    }
                    return "";
                }
                exk_2 exk_26 = blx_19.cG().a(bmr_12.dC(), exh_2.a(((bph_0)bpl_04.r()).z()));
                fir_0 fir_05 = bvx_26.a((epq_2)blx_19, exk_26, bpl_04, null);
                if (fir_05 == fir_0.a) {
                    return "";
                }
                if (fir_05 == fir_0.o) {
                    return String.valueOf(blx_19.gh().a((epq_2)blx_19, (fio_0)bpl_04, (int)bvx_26.A().u()));
                }
                if (fir_05 == fir_0.n) {
                    return "1";
                }
                return "";
            }
            if (string.equals(g)) {
                try {
                    return String.format(azs_0.a().a("shortcutBackgroundPath"), x[this.w]);
                }
                catch (Exception exception) {
                    c.error((Object)exception);
                }
            } else {
                if (string.equals(h)) {
                    fie fie2 = this.n();
                    if (fie2 == fie.c || fie2 == fie.b) {
                        long l = this.g();
                        if (l > 99999L) {
                            ani_2 ani_22 = new ani_2();
                            ani_22.i().a((CharSequence)"99").a().a((CharSequence)"k+").b().j();
                            return ani_22.r();
                        }
                        if (l > 999L) {
                            ani_2 ani_23 = new ani_2();
                            ani_23.i().a(l / 1000L).a().a((CharSequence)"k").b().j();
                            return ani_23.r();
                        }
                        if (l == 0L) {
                            return null;
                        }
                        return l;
                    }
                    if (fie2 == fie.f) {
                        ezj_1 ezj_12 = bmr_12.dx().a((int)((byte)this.a()));
                        if (ezj_12 == null) {
                            return null;
                        }
                        if (ezj_12.c() == -1) {
                            return bae.h().a("real", new Object[0]);
                        }
                        return ezj_12.c();
                    }
                    return null;
                }
                if (string.equals(j)) {
                    return this.p();
                }
            }
        }
        return null;
    }

    private String p() {
        return null;
    }

    private static String b(int n) {
        return n + ".xps";
    }

    @Override
    public boolean a(yp_2 yp_22) {
        bph_0 bph_02;
        this.r = fie.a(yp_22.a);
        this.u = yp_22.b;
        this.t = yp_22.c;
        this.v = yp_22.d;
        if (this.v == -1 && this.r == fie.a && (bph_02 = bpp_0.a().a(this.t)) != null) {
            this.v = bph_02.h();
        }
        return this.r != null;
    }

    @Override
    public void b(fie fie2, long l, int n, int n2) {
        super.b(fie2, l, n, n2);
        fis_1.a().a((ajf_1)this, b, a, e, g, d);
    }

    @Override
    protected void a(int n, long l, int n2) {
        super.a(n, l, n2);
        fis_1.a().a((ajf_1)this, b, a, d);
    }

    @Override
    public void a(int n) {
        super.a(n);
        fis_1.a().a((ajf_1)this, d);
    }

    @Override
    public void a(short s2) {
        super.a(s2);
        fis_1.a().a((ajf_1)this, h);
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public void b(short s2) {
        super.b(s2);
        fis_1.a().a((ajf_1)this, h, f);
    }

    @Override
    public String[] d() {
        return q;
    }

    private ts_0 a(long l) {
        boq_0 boq_02 = boq_0.a(this.n(), l, this.aT_(), this.o());
        boq_02.a(this.w);
        boq_02.a(this.y);
        boq_02.a(this.e());
        return boq_02;
    }

    @Override
    public ts_0 aP_() {
        return this.a(abd_1.c());
    }

    @Override
    public ts_0 i() {
        return this.a(this.a());
    }

    public long g() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.n() == fie.b || this.n() == fie.c) {
            int n;
            long l = 0L;
            ArrayList<exk_2> arrayList = bmr_12.da().g(this.t);
            if (arrayList != null) {
                for (n = arrayList.size() - 1; n >= 0; --n) {
                    l += (long)arrayList.get(n).e();
                }
            }
            if (this.n() == fie.c && (arrayList = bmr_12.dC().c(this.t)) != null) {
                for (n = arrayList.size() - 1; n >= 0; --n) {
                    l += (long)arrayList.get(n).e();
                }
            }
            return l;
        }
        return 1L;
    }

    @Override
    public short e() {
        return Hw.c(this.g());
    }

    public byte k() {
        return this.w;
    }

    public void a(byte by) {
        this.w = by;
        fis_1.a().a((ajf_1)this, g);
    }

    public boolean l() {
        if (this.n() == fie.a) {
            return true;
        }
        if (this.n() == fie.d) {
            return true;
        }
        if (this.n() == fie.c) {
            switch (this.k()) {
                case 0: 
                case 1: 
                case 3: {
                    return false;
                }
                case 2: 
                case 4: 
                case 5: {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean m() {
        return this.y;
    }

    public void a(boolean bl) {
        this.y = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.y = true;
        this.w = 0;
        this.A.a();
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((yp_2)object);
    }
}

