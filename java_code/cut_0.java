/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUT
 */
public class cut_0
implements rv_0,
ajh_1 {
    public static final String a = "characValue";
    public static final String b = "characMaxValue";
    public static final String d = "iconUrl";
    public static final String e = "isHp";
    public static final String f = "isInSameTeam";
    public static final String g = "isInBlueTeam";
    private static final String[] h = new String[]{"characValue", "iconUrl", "isInSameTeam"};
    private final epa_1 i;
    private final blx_1 j;

    public cut_0(epa_1 epa_12, blx_1 blx_12) {
        this.i = epa_12;
        this.i.a(this);
        this.j = blx_12;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public void a(rs_0 rs_02) {
        fis_1.a().a((ajf_1)this, b);
        fis_1.a().a((ajf_1)this, a);
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i.a();
        }
        if (string.equals(b)) {
            return this.i.c();
        }
        if (string.equals(e)) {
            return this.i.t() == eps_0.b;
        }
        if (!string.equals(d)) {
            if (string.equals(f)) {
                if (this.j == null) {
                    return false;
                }
                return this.j.aD();
            }
            if (string.equals(g)) {
                if (this.j == null) {
                    return false;
                }
                return this.j.aE();
            }
        }
        return null;
    }

    public String toString() {
        return "TimelineCellView{m_charac=" + this.i + "}";
    }
}

