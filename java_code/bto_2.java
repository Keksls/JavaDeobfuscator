/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from bTO
 */
public class bto_2
implements ajh_1,
esr_1 {
    private static final Logger l = Logger.getLogger(bto_2.class);
    public static final String a = "categories";
    public static final String b = "selectedCategory";
    public static final String d = "sidoaText";
    public static final String e = "isDirty";
    public static final String f = "quotation";
    public static final String g = "totalPrice";
    public static final String h = "resources";
    public static final String i = "resourcesCost";
    public static final String j = "usedSidoas";
    public static final String[] k = new String[]{"categories", "selectedCategory", "sidoaText", "isDirty", "quotation", "totalPrice", "resources", "resourcesCost", "usedSidoas"};
    private final TIntObjectHashMap<btj_2> m = new TIntObjectHashMap();
    final ArrayList<btd_2> n = new ArrayList();
    private byte o;
    private boolean p;
    private final fkc_0 q;

    @Override
    public String[] d() {
        return k;
    }

    public bto_2(fkc_0 fkc_02) {
        this.q = fkc_02;
        this.l();
        this.k();
        this.o = (byte)btu_2.b.c();
    }

    private btj_2 a(btu_2 btu_22) {
        byte by = (byte)btu_22.c();
        btj_2 btj_22 = (btj_2)this.m.get((int)by);
        if (btj_22 == null) {
            btj_22 = new btj_2(btu_22);
            this.m.put((int)by, (Object)btj_22);
        }
        return btj_22;
    }

    private void k() {
        btj_2 btj_22 = this.a(btu_2.a);
        eti_2.a.a(new btp_2(this, btj_22));
    }

    private void l() {
        btj_2 btj_22 = this.a(btu_2.b);
        btj_2 btj_23 = this.a(btu_2.c);
        btj_2 btj_24 = this.a(btu_2.d);
        for (etk_2 etk_22 : eti_2.a.a()) {
            if (!etk_22.f()) continue;
            switch (eoD.a(etk_22)) {
                case 1: {
                    bto_2.a(etk_22, btu_2.b, btj_22);
                    break;
                }
                case 2: {
                    bto_2.a(etk_22, btu_2.c, btj_23);
                    break;
                }
                case 3: {
                    bto_2.a(etk_22, btu_2.d, btj_24);
                    break;
                }
            }
        }
    }

    static void a(etl_2 etl_22, btu_2 btu_22, btj_2 btj_22) {
        bue_2 bue_22 = bua_2.a.a(etl_22);
        int n = etl_22.j();
        btm_2 btm_22 = btj_22.a(n);
        if (btm_22 == null) {
            btm_22 = new btm_2(btu_22, n);
            btj_22.a(btm_22);
        }
        btm_22.a(bue_22);
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            ArrayList<btj_2> arrayList = new ArrayList<btj_2>();
            Object[] objectArray = this.m.values();
            for (int k = 0; k < objectArray.length; ++k) {
                arrayList.add((btj_2)objectArray[k]);
            }
            arrayList.sort(new btq_2(this));
            return arrayList;
        }
        if (string.equals(b)) {
            return this.m.get((int)this.o);
        }
        if (string.equals(d)) {
            return this.q.h() + "/" + this.q.d();
        }
        if (string.equals(e)) {
            return this.p;
        }
        if (string.equals(f)) {
            return this.b();
        }
        if (string.equals(g)) {
            return bae.h().a(this.q.b());
        }
        if (string.equals(j)) {
            return this.q.f();
        }
        if (string.equals(h)) {
            return bae.h().a((long)this.q.k());
        }
        if (string.equals(i)) {
            return bae.h().a(this.q.j());
        }
        return null;
    }

    public int a() {
        return this.n.size();
    }

    public ArrayList<btd_2> b() {
        return new ArrayList<btd_2>(this.n);
    }

    public boolean a(btd_2 btd_22) {
        if (this.n.size() >= 50) {
            return false;
        }
        if (btd_22.c() instanceof cLj) {
            this.a((cLj)btd_22.c());
        }
        this.n.add(btd_22);
        this.p = true;
        return true;
    }

    private void a(cLj cLj2) {
        Iterator<btd_2> iterator = this.n.iterator();
        while (iterator.hasNext()) {
            btd_2 btd_22 = iterator.next();
            cLm cLm2 = btd_22.c();
            if (!(cLm2 instanceof cLj)) continue;
            fkw fkw2 = (fkw)((cLj)cLm2).e();
            fkw fkw3 = (fkw)cLj2.e();
            if (fkw2.e() != fkw3.e() || fkw2.g() != fkw3.g()) continue;
            iterator.remove();
        }
    }

    public void b(btd_2 btd_22) {
        this.n.remove(btd_22);
        this.p = !this.n.isEmpty();
        fis_1.a().a((ajf_1)this, k);
    }

    public btd_2 a(cLm cLm2) {
        Object t = cLm2.e();
        return this.a(t.d(), t.a());
    }

    public btd_2 a(long l, fks_0 fks_02) {
        int n = this.n.size();
        for (int k = 0; k < n; ++k) {
            btd_2 btd_22 = this.n.get(k);
            Object t = btd_22.c().e();
            if (t.d() != l || t.a() != fks_02) continue;
            return btd_22;
        }
        return null;
    }

    public int a(short s2) {
        int n = 0;
        for (btd_2 btd_22 : this.n) {
            bue_2 bue_22 = btd_22.b();
            if (!(bue_22 instanceof buc_2) || ((buc_2)bue_22).f().a() != s2) continue;
            ++n;
        }
        return n;
    }

    public fks_0 c() {
        for (btu_2 btu_22 : btu_2.values()) {
            if (btu_22.c() != this.o) continue;
            return btu_22.d();
        }
        return null;
    }

    public byte e() {
        return this.o;
    }

    public void a(byte by) {
        this.o = by;
        fis_1.a().a((ajf_1)this, b);
    }

    public void f() {
        fis_1.a().a((ajf_1)this, k);
    }

    public fkc_0 g() {
        return this.q;
    }

    public boolean h() {
        return this.p;
    }

    public void i() {
        this.j();
        this.o = (byte)-1;
        this.m.clear();
    }

    public void j() {
        this.n.clear();
        this.p = false;
        fis_1.a().a((ajf_1)this, k);
    }

    public boolean a(bue_2 bue_22) {
        btj_2 btj_22 = (btj_2)this.m.get(bue_22.g().c());
        if (btj_22 == null) {
            return true;
        }
        btm_2 btm_22 = (btm_2)btj_22.h.get(((etl_2)bue_22.i()).j());
        if (btm_22 == null) {
            return true;
        }
        ArrayList<ajf_1> arrayList = btm_22.f;
        if (arrayList == null) {
            return true;
        }
        for (ajf_1 ajf_12 : arrayList) {
            if (!(bue_22 instanceof bug_2) || !(ajf_12 instanceof bug_2)) continue;
            etn_2 etn_22 = (etn_2)((bug_2)ajf_12).i();
            etn_2 etn_23 = (etn_2)((bug_2)bue_22).i();
            if (etn_22.b() != etn_23.b()) continue;
            return ((bug_2)ajf_12).j();
        }
        return true;
    }

    public void a(fkc_0 fkc_02) {
        this.m.forEachValue((TObjectProcedure)new btr_2(this, fkc_02));
    }

    boolean b(short s2) {
        etn_2 etn_22 = eti_2.a.d(s2);
        if (etn_22 == null) {
            return false;
        }
        return eoD.u.contains(etn_22.j());
    }

    @Override
    public void a(int n) {
        fis_1.a().a((ajf_1)this, h);
    }
}

