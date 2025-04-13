/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJB
 */
public class bjb_1
implements ajh_1 {
    public static final bjb_1 a = new bjb_1();
    private static final String f = "sheetsList";
    private static final String g = "levelsList";
    private static final String h = "currentSheet";
    public static final String b = "currentLevel";
    private static final String i = "slotItemsView";
    private static final String j = "remainPlace";
    private static final String k = "hasManySheets";
    private static final String l = "shouldBuy";
    private static final String m = "isSheetListVisible";
    private static final String n = "isSheetModificationVisible";
    private static final String o = "validateInvalidityText";
    public static final String d = "activeSheetIndex";
    public static final String e = "hasChanges";
    private static final String[] p = new String[]{"sheetsList", "levelsList", "currentSheet", "currentLevel", "slotItemsView", "remainPlace", "isSheetListVisible", "isSheetModificationVisible", "hasManySheets", "shouldBuy", "validateInvalidityText", "activeSheetIndex", "hasChanges"};
    private bmr_1 q;
    private bji_1 r;
    private byte s = (byte)-2;
    private final List<bji_1> t = new ArrayList<bji_1>();
    private final bjz_1 u = new bjz_1();
    private final bqv_1 v = new bqv_1();
    private final bqx_1 w = new bqx_1();
    private final eZa x = new bjk_1(this.v);
    private final eZa y = new bjk_1(this.w);
    private boolean z;
    private boolean A;
    private byte B;
    private String C;
    private int D;
    private boolean E;

    public void a() {
        this.q = null;
        if (this.r != null) {
            this.r.e().b(this.x);
            this.r.e().b(this.y);
        }
        this.r = null;
        this.s = (byte)-2;
        this.B = (byte)-2;
        this.t.clear();
        this.u.a();
    }

    public void a(bmr_1 bmr_12) {
        this.t.clear();
        this.u.a();
        this.r = null;
        boolean bl = this.q == bmr_12;
        this.q = bmr_12;
        fis_1.a().a("localPlayer", (Object)bmr_12, "inventoryDialog");
        ezj_1 ezj_12 = bmr_12.dx().d();
        eZb eZb2 = bmr_12.dB();
        if (this.s < -1 || !bl) {
            this.s = (byte)ezj_12.e();
            this.B = (byte)ezj_12.e();
        }
        eZb2.a().forEach((n, eyz_02) -> {
            bji_1 bji_12 = new bji_1((int)n, (eyz_0)eyz_02, bmr_12.a_());
            this.t.add(bji_12);
            if (this.r == null && n == this.s) {
                this.r = bji_12;
            }
        });
        this.D = this.r.e().c();
        this.t();
        this.e();
        fis_1.a().a((ajf_1)this, p);
    }

    public bqv_1 b() {
        return this.v;
    }

    public bqx_1 c() {
        return this.w;
    }

    private void t() {
        this.v.a(this.q, this.r.e(), new exh_2[0]);
        this.r.e().a(this.x);
    }

    public void e() {
        this.w.a(this.q.en());
        this.w.a(this.q, this.r.e(), exh_2.r);
        this.r.e().a(this.y);
    }

    public void a(bja_1 bja_12) {
        this.u.a(bja_12);
        this.u.a(true);
        fis_1.a().a((ajf_1)this.u, this.u.d());
    }

    public void a(String string, int n, int n2) {
        this.u.a(string, n, n2);
        fis_1.a().a((ajf_1)this.u, this.u.d());
    }

    @Override
    public String[] d() {
        return p;
    }

    @Override
    @Nullable
    public Object b(String string) {
        eZb eZb2;
        if (string.equals(f)) {
            return this.t;
        }
        if (string.equals(g)) {
            // empty if block
        }
        if (string.equals(h)) {
            return this.r;
        }
        if (string.equals(b)) {
            if (this.s == -1) {
                return blc_0.a.a((short)this.q.dx().d().c());
            }
            return blc_0.a.a(this.r.e().c());
        }
        if (string.equals(i)) {
            return this.u;
        }
        if (string.equals(j) && (eZb2 = this.q.dB()) == null) {
            return false;
        }
        if (string.equals(l) && (eZb2 = this.q.dB()) == null) {
            return false;
        }
        if (string.equals(k)) {
            eZb2 = this.q.dB();
            if (eZb2 == null) {
                return false;
            }
            return eZb2.b() > 1;
        }
        if (string.equals(m)) {
            return this.z;
        }
        if (string.equals(n)) {
            return this.A;
        }
        if (string.equals(o)) {
            if (this.C.length() > 20) {
                return bae.h().a("sheet.name.too.long", new Object[0]);
            }
            return null;
        }
        if (string.equals(d)) {
            return this.q.dx().d().e();
        }
        if (string.equals(e)) {
            return this.f();
        }
        return null;
    }

    public boolean f() {
        eyz_0 eyz_02 = this.r.e();
        return eyz_02.c() != this.D;
    }

    public bmr_1 g() {
        return this.q;
    }

    public bji_1 h() {
        return this.r;
    }

    public bji_1 a(byte by) {
        return this.t.get(by);
    }

    public String i() {
        return this.C;
    }

    public int j() {
        return this.D;
    }

    public void b(byte by) {
        this.s = by;
    }

    public byte k() {
        return this.s;
    }

    public bjz_1 l() {
        return this.u;
    }

    public void a(boolean bl) {
        if (bl) {
            this.z = true;
            this.A = false;
        } else {
            this.z = false;
            this.A = false;
        }
        fis_1.a().a((ajf_1)this, m, n, f);
    }

    public void m() {
        if (!this.z || this.A) {
            this.z = true;
            this.A = false;
        } else {
            this.z = false;
            this.A = false;
        }
        fis_1.a().a((ajf_1)this, m, n, f);
    }

    public void n() {
        this.z = false;
        this.A = false;
        fis_1.a().a((ajf_1)this, m, n, f);
    }

    public void o() {
        this.s = this.B;
        this.A = true;
        this.z = false;
        this.a(this.q);
        fis_1.a().a((ajf_1)this, m, n, f);
    }

    public void a(int n) {
        this.B = (byte)n;
        this.s = (byte)n;
        this.a(this.q);
    }

    public void a(String string) {
        this.C = string;
        fis_1.a().a((ajf_1)this, o);
    }

    public void b(int n) {
        this.D = n;
    }

    public void b(boolean bl) {
        this.E = bl;
    }

    public boolean p() {
        return this.z || this.A;
    }

    public boolean q() {
        return this.E;
    }

    public void r() {
        this.n();
        this.C = "";
        this.D = 0;
    }

    public boolean s() {
        return fis_1.a().b("equipment.showEquipment", "inventoryDialog");
    }

    public void c(boolean bl) {
        fis_1.a().a("equipment.showEquipment", (Object)bl, "inventoryDialog");
    }
}

