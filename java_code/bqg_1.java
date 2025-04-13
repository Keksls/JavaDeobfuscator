/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQg
 */
public class bqg_1
implements ajh_1,
bpy_0 {
    public static final String a = "content";
    public static final String b = "unlocked";
    public static final String d = "enabled";
    public static final String e = "index";
    public static final String f = "size";
    public static final String g = "unlockingText";
    public static final String h = "shortUnlockingText";
    public static final String i = "itemNeeded";
    public static final String j = "iconUrl";
    public static final String k = "displayed";
    public static final String l = "name";
    public static final String[] m = new String[]{"content", "enabled", "unlocked", "index", "size", "itemNeeded"};
    private final bqf_1 n = new bqf_1();
    private final erv_1 o;

    public bqg_1(erv_1 erv_12) {
        this.o = erv_12;
    }

    @Override
    public String[] d() {
        return m;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(e)) {
            return this.o.d();
        }
        if (string.equals(f)) {
            if (this.n == null) {
                return null;
            }
            return this.n.d();
        }
        if (string.equals(d)) {
            return this.n.c();
        }
        if (string.equals(g)) {
            switch (this.k()) {
                case b: {
                    return bqc_1.c.d();
                }
                case c: {
                    return bqc_1.d.d();
                }
                case a: {
                    return bqc_1.b.d();
                }
                case d: {
                    return bqc_1.e.d();
                }
            }
        }
        if (string.equals(h)) {
            switch (this.k()) {
                case b: {
                    return bqc_1.c.c();
                }
                case c: {
                    return bqc_1.d.c();
                }
                case a: {
                    return bqc_1.b.c();
                }
                case d: {
                    return bqc_1.e.c();
                }
            }
        }
        if (string.equals(i)) {
            return null;
        }
        if (string.equals(a)) {
            int n;
            if (this.n == null) {
                return null;
            }
            int n2 = this.j();
            ArrayList<ajh_1> arrayList = new ArrayList<ajh_1>(n2);
            bhz_1 bhz_12 = new bhz_1();
            ArrayList<eru_1> arrayList2 = this.n.b();
            int n3 = arrayList2.size();
            for (n = 0; n < n3; ++n) {
                eru_1 eru_12 = arrayList2.get(n);
                for (byte by = 0; by < eru_12.b(); by = (byte)(by + 1)) {
                    exk_2 exk_22 = eru_12.c(by);
                    ajf_1 ajf_12 = eru_12.f() ? (exk_22 == null ? bhz_12 : exk_22.v()) : (exk_22 == null ? new bhy_1(bhz_12) : new bhy_1(exk_22));
                    arrayList.add((ajh_1)ajf_12);
                }
            }
            for (n = arrayList.size(); n < n2; ++n) {
                arrayList.add(new bhy_1(bhz_12));
            }
            return arrayList;
        }
        if (string.equals(k)) {
            return this.b() || this.c();
        }
        if (string.equals(j)) {
            switch (this.k()) {
                case b: {
                    return bqc_1.c.b();
                }
                case c: {
                    return bqc_1.d.b();
                }
                case a: {
                    return bqc_1.b.b();
                }
                case d: {
                    return bqc_1.e.b();
                }
            }
            return null;
        }
        if (string.equals(l)) {
            switch (this.k()) {
                case b: {
                    return bqc_1.c.a();
                }
                case c: {
                    return bqc_1.d.a();
                }
                case a: {
                    return bqc_1.b.a();
                }
                case d: {
                    return bqc_1.e.a();
                }
            }
        }
        return null;
    }

    private int j() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.o.a(new bqh_1(this, atomicInteger));
        return atomicInteger.get();
    }

    private erx_1 k() {
        return erw_1.a(this.o.b()).b();
    }

    @Override
    public boolean b() {
        if (this.n.b().isEmpty()) {
            bql_1 bql_12 = (bql_1)ddi_0.d().e();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.o.a(new bqi_1(this, bql_12, atomicBoolean));
            return atomicBoolean.get();
        }
        return this.n.c();
    }

    @Override
    public boolean c() {
        if (this.n.b().isEmpty()) {
            bql_1 bql_12 = (bql_1)ddi_0.d().e();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.o.a(new bqj_1(this, bql_12, atomicBoolean));
            return atomicBoolean.get();
        }
        return true;
    }

    @Override
    public void a(ewb_2 ewb_22) {
        this.n.a((eru_1)ewb_22);
        fis_1.a().a((ajf_1)this, a, b, d);
    }

    @Override
    public void e() {
        this.n.a();
    }

    @Override
    public byte h() {
        return (byte)this.o.ordinal();
    }

    private boolean l() {
        boolean bl = byp_2.a().a(eQt.e) || byp_2.a().a(this.o.c());
        return bl;
    }

    public void a(evn_2 evn_22, eru_1 eru_12) {
        if (!(this.l() || evn_22.b() != evo_2.b && evn_22.b() != evo_2.e)) {
            String string = bae.h().a("group.error.accessDenied", new Object[0]);
            String string2 = cfn_0.a(4);
            fpm_0.b().a(string, string2, 515L, 102, 1);
            return;
        }
        cny_0 cny_02 = new cny_0(eru_12.i().M, evn_22);
        azu_0.j().K().c(cny_02);
    }

    @Override
    public void i() {
        cnw_0 cnw_02 = new cnw_0();
        cnw_02.b(this.o.b());
        azu_0.j().K().c(cnw_02);
    }

    @Override
    public void f() {
        fis_1.a().a((ajf_1)this, m);
    }

    @Override
    public void g() {
        cnx_0 cnx_02 = new cnx_0();
        cnx_02.b(this.a());
        azu_0.j().K().c(cnx_02);
        ddi_0.d().a(this);
    }

    public String toString() {
        return "GuildAggregatedCompartmentView{m_compartment=" + this.n + ", m_guildStorageCompartmentLinkType=" + this.o + "}";
    }

    public boolean b(exk_2 exk_22) {
        return this.n.b(exk_22);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        return this.n.a(exk_22.a()) != null;
    }

    public exk_2 a(byte by) {
        return this.n.c(by);
    }

    @Override
    public int a() {
        return this.h();
    }

    @Override
    public bqs_1 a(exk_2 exk_22, short s2, byte by) {
        if (by != -1) {
            return this.b(exk_22, s2, by);
        }
        short s3 = s2;
        byte by2 = this.n.d();
        for (byte by3 = 0; by3 < by2; by3 = (byte)(by3 + 1)) {
            exk_2 exk_23 = this.n.c(by3);
            if (exk_23 == null || !exk_23.a(exk_22) || exk_23.e() == exk_23.aR_()) continue;
            short s4 = Hw.c((long)(exk_23.aR_() - exk_23.e()));
            short s5 = Hw.c((long)Math.min(s3, s4));
            bqs_1 bqs_12 = this.b(exk_22, s5, by3);
            if (bqs_12 != bqs_1.a) {
                return bqs_12;
            }
            if ((s3 = (short)(s3 - s5)) != 0) continue;
            return bqs_1.a;
        }
        return this.b(exk_22, s3, this.n.f());
    }

    private bqs_1 b(exk_2 exk_22, short s2, byte by) {
        byte by2 = this.n.b(by);
        eru_1 eru_12 = this.n.a(by);
        if (!eru_12.f()) {
            return bqs_1.c;
        }
        evp_2 evp_22 = new evp_2(exk_22.a(), exk_22.aT_(), s2, by2);
        if (!this.n.b(exk_22)) {
            return bqs_1.c;
        }
        this.a(evp_22, eru_12);
        return bqs_1.a;
    }

    @Override
    public bqs_1 a(long l, byte by) {
        byte by2 = this.n.b(l);
        eru_1 eru_12 = this.n.a(by2);
        eru_1 eru_13 = this.n.a(by);
        byte by3 = this.n.b(by2);
        byte by4 = this.n.b(by);
        if (eru_12 == eru_13) {
            exk_2 exk_22 = this.n.c(by);
            if (exk_22 != null && exk_22.a() == l) {
                return bqs_1.c;
            }
            evv_2 evv_22 = new evv_2(l, by4);
            this.a(evv_22, eru_12);
        } else {
            cnv_0 cnv_02 = new cnv_0();
            cnv_02.b(eru_12.i().M);
            cnv_02.c(eru_13.i().M);
            cnv_02.b(by3);
            cnv_02.a(by4);
            azu_0.j().K().c(cnv_02);
        }
        return bqs_1.a;
    }

    @Override
    public bqs_1 a(long l, int n, short s2, long l2, byte by) {
        byte by2 = this.n.b(l);
        eru_1 eru_12 = this.n.a(by2);
        evx_2 evx_22 = new evx_2(l, n, s2, l2, by);
        this.a(evx_22, eru_12);
        return bqs_1.a;
    }
}

