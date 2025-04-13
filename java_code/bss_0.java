/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSs
 */
public abstract class bss_0<Id, Ref>
implements aiy_1,
ajh_1 {
    private static final Logger N = Logger.getLogger(bss_0.class);
    public static final String a = "name";
    public static final String b = "description";
    public static final String d = "iconUrl";
    public static final String e = "subtitle";
    public static final String f = "price";
    public static final String g = "originalPrice";
    public static final String h = "currency";
    public static final String i = "currencyId";
    public static final String j = "oneClickPrice";
    public static final String k = "oneClickOriginalPrice";
    public static final String l = "oneClickCurrency";
    public static final String m = "oneClickCurrencyId";
    public static final String n = "stock";
    public static final String o = "remainingTime";
    public static final String p = "content";
    public static final String q = "contents";
    public static final String r = "promotions";
    public static final String s = "hasPromotions";
    public static final String t = "canBeEquiped";
    public static final String u = "hasEnoughMoney";
    public static final String v = "isAvailable";
    public static final String w = "isServerRestrictionOK";
    protected final Id x;
    @Nullable
    private final String O;
    protected final String y;
    protected final String z;
    protected final String A;
    protected final Double B;
    protected final Double C;
    protected final bsz_1 D;
    protected Integer E;
    protected final Double F;
    protected final Double G;
    protected final bsz_1 H;
    protected final wt_0 I;
    protected final ArrayList<bSJ> J;
    protected final List<Ref> K;
    protected final ArrayList<bse_0> L;
    protected final ArrayList<bsg_2> M;
    private aix_1 P;
    private boolean Q;
    @Nullable
    private AtomicReference<bhy_0> R;
    @Nullable
    private List<bhy_0> S;

    protected bss_0(Id Id, @Nullable String string, String string2, String string3, String string4, Double d2, Double d3, bsz_1 bsz_12, Integer n, ArrayList<bSJ> arrayList, List<Ref> list, ArrayList<bsg_2> arrayList2, ArrayList<bse_0> arrayList3, wt_0 wt_02, Double d4, Double d5, bsz_1 bsz_13) {
        this.x = Id;
        this.O = string;
        this.y = string2;
        this.z = string3;
        this.A = string4;
        this.B = d2;
        this.C = d3;
        this.D = bsz_12;
        this.E = n;
        this.J = arrayList;
        this.K = list;
        this.L = arrayList3;
        this.M = arrayList2;
        this.Q = false;
        this.I = wt_02;
        this.F = d4;
        this.G = d5;
        this.H = bsz_13;
        this.y();
    }

    public Id a() {
        return this.x;
    }

    @Nullable
    public String b() {
        return this.O;
    }

    public String c() {
        return this.y;
    }

    public String e() {
        return this.z;
    }

    public String f() {
        return this.A;
    }

    public double g() {
        return this.B;
    }

    public wt_0 h() {
        return this.I;
    }

    public double i() {
        return this.C;
    }

    public bsz_1 j() {
        return this.D;
    }

    public int k() {
        return this.E;
    }

    public void l() {
        if (this.E > 0) {
            Integer n = this.E;
            Integer n2 = this.E = Integer.valueOf(this.E - 1);
            fis_1.a().a((ajf_1)this, n, v);
        }
    }

    public boolean a(bsx_0 bsx_02) {
        int n = this.J.size();
        for (int k = 0; k < n; ++k) {
            bSJ bSJ2 = this.J.get(k);
            if (bSJ2.e() != bsx_02) continue;
            return true;
        }
        return false;
    }

    public boolean a(String string) {
        int n = this.J.size();
        for (int k = 0; k < n; ++k) {
            bSJ bSJ2 = this.J.get(k);
            if (bSJ2.c(string) == null) continue;
            return true;
        }
        return false;
    }

    public ArrayList<bSJ> m() {
        return this.J;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.y;
        }
        if (string.equals(b)) {
            return this.z;
        }
        if (string.equals(d)) {
            return this.P == null ? null : this.P.a();
        }
        if (string.equals(e)) {
            return this.A;
        }
        if (string.equals(f)) {
            return this.n();
        }
        if (string.equals(g)) {
            return this.C != null && this.C > this.B ? new ani_2().c().a((CharSequence)bae.h().a(this.C)).r() : null;
        }
        if (string.equals(h)) {
            return this.D != null ? this.D.c() : null;
        }
        if (string.equals(i)) {
            return this.D != null ? Byte.valueOf(this.D.a()) : null;
        }
        if (string.equals(n)) {
            if (this.E == -1) {
                return null;
            }
            if (this.E == 0) {
                return bae.h().a("webShop.soldOut", new Object[0]);
            }
            return bae.h().a("playerGift.itemCount", this.E);
        }
        if (string.equals(o)) {
            return this.x();
        }
        if (string.equals(p)) {
            return this.u();
        }
        if (string.equals(q)) {
            return this.v();
        }
        if (string.equals(r)) {
            return this.L;
        }
        if (string.equals(s)) {
            return this.L != null && !this.L.isEmpty();
        }
        if (string.equals(t)) {
            return this.Q;
        }
        if (string.equals(u)) {
            bSO bSO2 = (bSO)fis_1.a().e("webShop");
            if (bSO2 == null) {
                return false;
            }
            if (this.D != null && this.D.e()) {
                return true;
            }
            return this.B != null && this.B <= (double)bSO2.a(this.D);
        }
        if (string.equals(v)) {
            return this.w();
        }
        if (string.equals(w)) {
            return this.o();
        }
        if (string.equals(k)) {
            return this.G != null && this.G > this.F ? new ani_2().c().a((CharSequence)bae.h().a(this.G)).r() : null;
        }
        if (string.equals(l)) {
            if (this.H == null) {
                return null;
            }
            return this.H.c();
        }
        if (string.equals(m)) {
            if (this.H == null) {
                return null;
            }
            return this.H.a();
        }
        if (string.equals(j)) {
            return this.F != null && this.F > 0.0 ? bae.h().a(this.F) : null;
        }
        return null;
    }

    @Nullable
    protected String n() {
        return this.B != null && this.B > 0.0 ? bae.h().a(this.B) : null;
    }

    public boolean o() {
        for (int k = 0; k < this.J.size(); ++k) {
            bSJ bSJ2 = this.J.get(k);
            if (!bSJ2.g()) continue;
            return true;
        }
        return false;
    }

    public boolean p() {
        return this.I != null && !this.I.c();
    }

    public void a(wu_0 wu_02, int n) {
        this.E = n;
        this.I.a(wu_02);
        fis_1.a().a((ajf_1)this, n, o, v);
    }

    private boolean w() {
        if (this.E == 0) {
            return false;
        }
        if (this.I == null || this.I.c()) {
            return true;
        }
        ww_0 ww_02 = wc_0.p().a().g(this.I);
        return ww_02.e();
    }

    private String x() {
        if (this.I.c()) {
            return null;
        }
        ww_0 ww_02 = wc_0.p().a().g(this.I);
        return ww_02.e() ? wa_0.c(ww_02) : bae.h().a("webShop.soldOut", new Object[0]);
    }

    private void y() {
        if (this.M == null) {
            return;
        }
        bsg_2 bsg_22 = bsi_2.a(this.M, 200, 200, "GALLERY");
        if (bsg_22 != null) {
            this.P = bsi_2.a(bsg_22, this, d);
        }
        int n = this.J.size();
        for (int k = 0; k < n; ++k) {
            Object r2;
            bSJ bSJ2 = this.J.get(k);
            int n2 = bSJ2.a();
            if (bSJ2.b() == null || (r2 = eyo_1.g().d(n2)) == null) continue;
            if (((ezr_0)r2).F().h().length != 0) {
                this.Q = true;
                break;
            }
            eyw_1 eyw_12 = ((ezr_0)r2).p();
            if (!(eyw_12 instanceof bjf_2)) continue;
            this.Q = true;
            break;
        }
    }

    @Override
    public void a(String string, String string2) {
        fis_1.a().a((ajf_1)this, string);
    }

    public void q() {
        if (!this.Q) {
            return;
        }
        int n = this.J.size();
        for (int k = 0; k < n; ++k) {
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(this.J.get(k).a());
            if (bjw_12 == null) continue;
            if (bjw_12.F().h().length != 0) {
                ddo_0.b.a(bjw_12);
                continue;
            }
            eyw_1 eyw_12 = bjw_12.p();
            if (!(eyw_12 instanceof bjf_2)) continue;
            bjf_2 bjf_22 = (bjf_2)eyw_12;
            bhd_1 bhd_12 = bhe_0.a().a(bjf_22.g());
            if (bhd_12 == null) continue;
            for (int n2 : bhd_12.k()) {
                bjw_1 bjw_13 = (bjw_1)eyo_1.g().d(n2);
                ddo_0.b.a(bjw_13);
            }
        }
    }

    public bsz_1 r() {
        return this.H;
    }

    public Double s() {
        return this.F;
    }

    public abstract boolean a(bsw_0 var1);

    public List<Ref> t() {
        return this.K;
    }

    @Nullable
    public bhy_0 u() {
        if (this.R == null) {
            bSJ bSJ2;
            bjw_1 bjw_12;
            bhy_0 bhy_02 = !this.J.isEmpty() ? ((bjw_12 = (bSJ2 = this.J.get(0)).b()) != null ? new bhy_0(bjw_12, bSJ2.c()) : null) : null;
            this.R = new AtomicReference<Object>(bhy_02);
        }
        return this.R.get();
    }

    @NotNull
    public List<bhy_0> v() {
        if (this.S == null) {
            ArrayList<bhy_0> arrayList = new ArrayList<bhy_0>();
            for (bSJ bSJ2 : this.J) {
                bjw_1 bjw_12 = bSJ2.b();
                if (bjw_12 == null) continue;
                arrayList.add(new bhy_0(bjw_12, bSJ2.c()));
            }
            this.S = Collections.unmodifiableList(arrayList);
        }
        return this.S;
    }
}

