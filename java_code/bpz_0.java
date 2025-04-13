/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPZ
 */
public class bpz_0
implements ajh_1,
bpy_0 {
    protected static final Logger a = Logger.getLogger(bpz_0.class);
    public static final String b = "itemNeeded";
    public static final String d = "content";
    public static final String e = "unlocked";
    public static final String f = "canBeUnlocked";
    public static final String g = "unlockingText";
    public static final String h = "shortUnlockingText";
    public static final String i = "index";
    public static final String j = "size";
    public static final String k = "iconUrl";
    public static final String l = "displayed";
    public static final String m = "name";
    public static final String[] n = new String[]{"itemNeeded", "content", "unlocked", "canBeUnlocked", "index", "size", "unlockingText", "displayed"};
    private byte o = 0;
    private fiv_0 p;
    private final evq_1 q;

    public bpz_0(evq_1 evq_12, byte by) {
        this.q = evq_12;
        this.o = by;
    }

    public bpz_0(evq_1 evq_12, byte by, fiv_0 fiv_02) {
        this.q = evq_12;
        this.p = fiv_02;
        this.o = by;
    }

    @Override
    public String[] d() {
        return n;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.k();
        }
        if (string.equals(e)) {
            return this.b();
        }
        if (string.equals(f)) {
            return this.j();
        }
        if (string.equals(i)) {
            return this.o + 1;
        }
        if (string.equals(j)) {
            return this.q.b();
        }
        if (string.equals(g)) {
            return this.m();
        }
        if (string.equals(h)) {
            return this.m();
        }
        if (string.equals(d)) {
            if (this.p == null) {
                return null;
            }
            ArrayList<bhz_1> arrayList = new ArrayList<bhz_1>(this.p.d());
            bhz_1 bhz_12 = new bhz_1();
            for (byte by = 0; by < this.p.d(); by = (byte)(by + 1)) {
                exk_2 exk_22 = this.p.c(by);
                arrayList.add((bhz_1)(exk_22 == null ? bhz_12 : exk_22.v()));
            }
            return arrayList;
        }
        if (string.equals(l)) {
            return this.b() || this.c();
        }
        if (string.equals(k)) {
            return bqc_1.a.b();
        }
        if (string.equals(m)) {
            return bqc_1.a.a();
        }
        return null;
    }

    private String m() {
        bjw_1 bjw_12 = this.k();
        if (bjw_12 == null) {
            return null;
        }
        return bae.h().a("storageBox.unlockingInfo", bjw_12.e());
    }

    public boolean j() {
        bjw_1 bjw_12 = this.k();
        return bjw_12 == null || azu_0.j().k().da().d(bjw_12.n()) != null;
    }

    @Override
    public boolean b() {
        return this.k() == null || this.p != null;
    }

    @Override
    public boolean c() {
        return this.b();
    }

    @Override
    public void a(ewb_2 ewb_22) {
        this.p = (fiv_0)ewb_22;
    }

    @Override
    public void e() {
        this.p = null;
    }

    @Override
    public void f() {
        fis_1.a().a((ajf_1)this, n);
    }

    @Override
    public void g() {
        bjw_1 bjw_12 = this.k();
        if (!this.j()) {
            a.error((Object)("impossible de d\u00e9bloquer le compartiment d'index=" + this.h()));
            return;
        }
        if (this.b()) {
            return;
        }
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("storageBox.unlockQuestion", bjw_12.e()), azs_0.a().f(bjw_12.C()), 25L, 102, 1);
        fzm_02.a(new bqa_0(this));
    }

    @Override
    public byte h() {
        return this.o;
    }

    public void a(evn_2 evn_22) {
        cqO cqO2 = new cqO(this.a(), evn_22, azu_0.j().k().fc());
        azu_0.j().K().c(cqO2);
    }

    @Override
    public void i() {
        cqN cqN2 = new cqN();
        cqN2.b(this.a());
        azu_0.j().K().c(cqN2);
    }

    @Override
    public int a() {
        return this.q.a();
    }

    public bjw_1 k() {
        return (bjw_1)eyo_1.g().d(this.q.c());
    }

    public evq_1 l() {
        return this.q;
    }

    public void a(fiv_0 fiv_02) {
        this.p = fiv_02;
    }

    public String toString() {
        return "CompartmentViewImpl{m_index=" + this.o + ", m_inventory=" + this.p + ", m_compartment=" + this.q + "}";
    }

    public boolean b(exk_2 exk_22) {
        return this.p.b(exk_22);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        return this.p.a(exk_22.a()) != null;
    }

    public exk_2 a(byte by) {
        return this.p.c(by);
    }

    @Override
    public bqs_1 a(exk_2 exk_22, short s2, byte by) {
        evp_2 evp_22 = new evp_2(exk_22.a(), exk_22.aT_(), s2, by);
        bmr_1 bmr_12 = azu_0.j().k();
        ezr_0<?> ezr_02 = exk_22.T();
        if (ezr_02.a(exz_1.d) != null && !ezr_02.a(exz_1.d).b(bmr_12, by, ezr_02, bmr_12.ge())) {
            return bqs_1.b;
        }
        if (!this.b(exk_22)) {
            a.warn((Object)"Impossible d'ajouter l'item");
            return bqs_1.c;
        }
        this.a(evp_22);
        return bqs_1.a;
    }

    @Override
    public bqs_1 a(long l, byte by) {
        exk_2 exk_22 = this.a(by);
        if (exk_22 != null && exk_22.a() == l) {
            a.error((Object)"Impossible de drop un item sur le meme slot");
            return bqs_1.c;
        }
        evv_2 evv_22 = new evv_2(l, by);
        this.a(evv_22);
        return bqs_1.a;
    }

    @Override
    public bqs_1 a(long l, int n, short s2, long l2, byte by) {
        evx_2 evx_22 = new evx_2(l, n, s2, l2, by);
        this.a(evx_22);
        return bqs_1.a;
    }
}

