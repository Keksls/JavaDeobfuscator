/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkr
 */
@Deprecated
public class bkr_2
implements ajh_1,
ezr_1 {
    public static final String a = "categories";
    public static final String b = "currentCategory";
    public static final String d = "sheetsList";
    public static final String e = "levelsList";
    public static final String f = "selectedSheetIndex";
    public static final String g = "activeSheetIndex";
    public static final String h = "isSheetListVisible";
    public static final String i = "isSheetModificationVisible";
    public static final String j = "currentSheet";
    public static final String k = "currentLevel";
    public static final String l = "remainPlace";
    public static final String m = "shouldBuy";
    public static final String n = "hasManySheets";
    public static final String o = "restatItemCount";
    public static final String p = "restatItemCountText";
    public static final String q = "validateInvalidityText";
    public static final String r = "lowestLevelAvailable";
    public static final String s = "hasChanges";
    public static final String t = "hasInfiniteRestat";
    public static final String[] u = new String[]{"categories", "currentCategory", "sheetsList", "isSheetListVisible", "isSheetModificationVisible", "selectedSheetIndex", "activeSheetIndex", "currentSheet", "currentLevel", "remainPlace", "hasManySheets", "restatItemCount", "restatItemCountText", "shouldBuy", "lowestLevelAvailable", "hasChanges", "hasInfiniteRestat"};
    public static final bkr_2 v = new bkr_2();
    private final List<bkq_2> w = new ArrayList<bkq_2>();
    private bmr_1 x;
    private ezy_2 y;
    private int z = -1;
    private int A = 0;
    private ezz_2 B;
    private final ArrayList<bkm_1> C = new ArrayList();
    private final TIntObjectHashMap<bkm_1> D = new TIntObjectHashMap();
    private bkm_1 E;
    private boolean F;
    private boolean G;
    private final TIntShortHashMap H = new TIntShortHashMap();
    private final Comparator<bkm_1> I = new bks_2(this);
    private short J = 0;

    public void a() {
        this.a(this.x != null ? this.x : azu_0.j().k());
    }

    public void a(bmr_1 bmr_12) {
        Map.Entry<Integer, ezx_2> entry;
        if (bmr_12 == null) {
            return;
        }
        this.C.clear();
        this.D.clear();
        this.w.clear();
        this.H.clear();
        this.y = bmr_12.dA();
        ezj_1 ezj_12 = bmr_12.dx().d();
        if (this.z < -1 || bmr_12 != this.x) {
            this.A = this.z = ezj_12.e();
        }
        this.x = bmr_12;
        Object object = this.y.b().entrySet().iterator();
        while (object.hasNext()) {
            entry = object.next();
            this.w.add(new bkq_2(Hw.b((long)entry.getKey().intValue()), entry.getValue()));
        }
        if (this.z >= this.y.a()) {
            this.z = -1;
        }
        if ((object = (ezu_1)this.y.a(this.z)) != null) {
            this.B = ((ezu_1)object).a();
            this.B.a(this);
        }
        ezi_2.a.a((ezw_2 ezw_22) -> {
            bkm_1 bkm_12 = new bkm_1((ezw_2)ezw_22, this.B);
            this.C.add(bkm_12);
            this.D.put(bkm_12.a(), (Object)bkm_12);
        });
        this.C.sort(this.I);
        this.E = this.C.get(0);
        entry = this.y.a(this.z);
        this.J = entry != null ? ((ezx_2)((Object)entry)).e() : (short)0;
    }

    public boolean a(blb_0 blb_02) {
        short s2 = blb_02.a();
        Object t = this.y.a(this.z);
        if (t == null) {
            return false;
        }
        return false;
    }

    public void a(short s2) {
        fis_1.a().a((ajf_1)this, k, d);
    }

    @Override
    public String[] d() {
        return u;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.C;
        }
        if (string.equals(b)) {
            return this.E;
        }
        if (string.equals(d)) {
            return this.w;
        }
        if (string.equals(j)) {
            if (this.z == -1) {
                // empty if block
            }
            return this.w.get(this.z);
        }
        if (string.equals(e)) {
            // empty if block
        }
        if (string.equals(k)) {
            if (this.z == -1) {
                return blc_0.a.a((short)this.x.dx().d().c());
            }
            return blc_0.a.a(this.B.e());
        }
        if (string.equals(n)) {
            return this.y.a() > 1;
        }
        if (string.equals(h)) {
            return this.F;
        }
        if (string.equals(i)) {
            return this.G;
        }
        if (string.equals(g)) {
            return this.x.dx().d().e();
        }
        if (string.equals(f)) {
            return (byte)this.A;
        }
        if (string.equals(o)) {
            return 1;
        }
        if (string.equals(p)) {
            return "x" + this.a(eyx_1.x);
        }
        if (string.equals(t)) {
            return true;
        }
        if (string.equals(r)) {
            return this.v();
        }
        if (string.equals(s)) {
            return this.b();
        }
        return null;
    }

    public boolean b() {
        Object t = this.y.a(this.z);
        return ((ezx_2)t).e() != this.J;
    }

    @Override
    public void a(int n, short s2) {
    }

    private void w() {
        this.B.a();
        this.H.clear();
        for (bkm_1 bkm_12 : this.C) {
            bkm_12.e();
        }
    }

    public void a(bkm_1 bkm_12) {
        if (this.E == bkm_12) {
            return;
        }
        this.E = bkm_12;
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(bko_2 bko_22) {
        if (!bko_22.g()) {
            return;
        }
        this.B.b(bko_22.a(), (short)1);
        this.H.adjustOrPutValue(bko_22.a(), (short)1, (short)1);
        this.c(bko_22);
    }

    public void b(bko_2 bko_22) {
        if (!bko_22.f()) {
            return;
        }
        this.B.b(bko_22.a(), (short)-1);
        short s2 = this.H.get(bko_22.a());
        if (s2 == 1) {
            this.H.remove(bko_22.a());
        } else {
            this.H.put(bko_22.a(), (short)(s2 - 1));
        }
    }

    public void c(bko_2 bko_22) {
        int n = ezi_2.a.b(bko_22.a());
        bko_22.e();
        bkm_1 bkm_12 = (bkm_1)this.D.get(n);
        bkm_12.f();
    }

    public void c() {
        cll_1 cll_12 = new cll_1();
        cll_12.a((byte)this.z);
        cll_12.a(this.x.a_());
        cll_12.a(this.H);
        azu_0.j().K().c(cll_12);
    }

    public void a(String string) {
        clk_0 clk_02 = new clk_0();
        clk_02.a((byte)this.z);
        clk_02.a(this.x.a_());
        clk_02.a(string);
        azu_0.j().K().c(clk_02);
        fis_1.a().a((ajf_1)this, d);
    }

    public void e() {
        clj_1 clj_12 = new clj_1();
        clj_12.a((byte)this.z);
        clj_12.a(this.x.a_());
        clj_12.a(this.B.e());
        azu_0.j().K().c(clj_12);
    }

    public void f() {
        this.w();
    }

    public boolean g() {
        return this.H.isEmpty();
    }

    public boolean h() {
        for (bkm_1 bkm_12 : this.C) {
            if (bkm_12.c() <= 0) continue;
            return true;
        }
        return false;
    }

    public void i() {
        this.j();
        this.J = 0;
    }

    public void j() {
        this.F = false;
        this.G = false;
        fis_1.a().a((ajf_1)this, h, i);
    }

    public void k() {
        this.F = true;
        this.G = false;
        fis_1.a().a((ajf_1)this, h, i);
    }

    public void b(short s2) {
        this.J = s2;
    }

    public void c(String string) {
        fis_1.a().a((ajf_1)this, q);
    }

    public String l() {
        return "m_newCurrentSheetName";
    }

    public short m() {
        return this.J;
    }

    public void n() {
        this.z = this.A;
        this.G = true;
        this.F = false;
        this.a();
    }

    public void o() {
        if (!this.F || this.G) {
            this.F = true;
            this.G = false;
        } else {
            this.F = false;
            this.G = false;
        }
        fis_1.a().a((ajf_1)this, h, i, d);
    }

    public void a(boolean bl) {
        if (bl) {
            this.F = true;
            this.G = false;
        } else {
            this.F = false;
            this.G = false;
        }
        fis_1.a().a((ajf_1)this, h, i, d);
    }

    public ezx_2 p() {
        return this.y.a(this.z);
    }

    public bkq_2 q() {
        return this.w.get(this.z);
    }

    public bmr_1 r() {
        return this.x;
    }

    public int s() {
        return this.z;
    }

    public void a(int n) {
        this.A = n;
        this.z = n;
        this.a();
    }

    protected int a(eyx_1 eyx_12) {
        exk_2[] exk_2Array;
        int n = 0;
        bmr_1 bmr_12 = this.x;
        for (exk_2 exk_22 : exk_2Array = bmr_12.da().e()) {
            eyw_1 eyw_12 = exk_22.T().p();
            if (eyw_12 == null || eyw_12.f() != eyx_12) continue;
            n += exk_22.e();
        }
        return n;
    }

    public List<bkm_1> t() {
        return this.C.subList(0, 1 + this.C.size() / 2);
    }

    public List<bkm_1> u() {
        return this.C.subList(1 + this.C.size() / 2, this.C.size());
    }

    public int v() {
        return 0;
    }
}

