/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bym
 */
public class bym_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "blazon";
    public static final String d = "rank";
    public static final String e = "level";
    public static final String f = "guildPoints";
    public static final String g = "conquestPoints";
    public static final String h = "description";
    public static final String[] i = new String[]{"name", "blazon", "rank", "level", "guildPoints", "conquestPoints", "description"};
    private final bya_1 j;
    private final int k;

    public bym_2(bya_1 bya_12, int n) {
        this.j = bya_12;
        this.k = n;
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.j.c();
        }
        if (string.equals(b)) {
            eqd_2 eqd_22 = new eqd_2(this.j.b());
            if (eqd_22 == null) {
                return null;
            }
            bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
            ays_2 ays_22 = bxp_1.a().a(bxo_12);
            bxo_12.e();
            return ays_22;
        }
        if (string.equals(d)) {
            return this.k;
        }
        if (string.equals(e)) {
            return this.j.g();
        }
        if (string.equals(f)) {
            return this.j.e();
        }
        if (string.equals(g)) {
            return this.j.f();
        }
        if (string.equals(h)) {
            String string2 = this.j.d();
            return string2.length() == 0 ? null : string2;
        }
        return null;
    }
}

