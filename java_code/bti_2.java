/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bTI
 */
public class bti_2
implements ajh_1 {
    private static final Logger j = Logger.getLogger(bti_2.class);
    public static final String a = "baseBuilding";
    public static final String b = "evolvedBuilding";
    public static final String d = "canBeEvolved";
    public static final String e = "canPay";
    public static final String f = "guildName";
    public static final String g = "buildingDate";
    public static final String h = "hasRightToPay";
    public static final String[] i = new String[]{"baseBuilding", "evolvedBuilding", "canPay", "guildName", "buildingDate"};
    private wt_0 k;
    private long l;
    private final bth_2 m;
    private final buc_2 n;

    public bti_2(long l, etw_2 etw_22, etk_2 etk_22, fkc_0 fkc_02) {
        this(etw_22, etk_22, fkc_02);
        this.l = l;
    }

    @Override
    public String[] d() {
        return i;
    }

    public bti_2(etw_2 etw_22, etk_2 etk_22, fkc_0 fkc_02) {
        this.m = bua_2.a.a(etw_22);
        this.n = new buc_2(etk_22);
        if (fkc_02 != null) {
            fka_0 fka_02 = new fka_0(fkc_02);
            int n = this.n.h();
            this.n.a(fka_02.a(new cdj_1(0L, n, 0, Short.MIN_VALUE, Short.MIN_VALUE)));
            this.n.a(fka_02);
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.m;
        }
        if (string.equals(b)) {
            return this.n;
        }
        if (string.equals(e)) {
            bmr_1 bmr_12 = azu_0.j().k();
            bos_2 bos_22 = bmr_12.eV();
            erl_1 erl_12 = bos_22.a(bmr_12.a_());
            if (erl_12 == null) {
                return false;
            }
            ern_1 ern_12 = bos_22.c(erl_12.d());
            if (ern_12 == null) {
                return false;
            }
            return this.n.a() && this.n.j() && ern_12.a(eQt.i);
        }
        if (string.equals(f)) {
            return "-";
        }
        if (string.equals(g)) {
            return this.k == null ? null : this.k.s();
        }
        return null;
    }

    public void a(wt_0 wt_02) {
        this.k = wt_02;
    }

    public bth_2 a() {
        return this.m;
    }

    public buc_2 b() {
        return this.n;
    }

    public long c() {
        return this.l;
    }
}

