/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYj
 */
class cyj_0
implements ajh_1 {
    public static final String a = "text";
    public static final String b = "dungeonType";
    public static final String d = "positionResult";
    public static final String e = "buffs";
    public static final String f = "medalStyle";
    public final String[] g = new String[]{"text", "dungeonType", "positionResult", "buffs", "medalStyle"};
    private final eEy h;
    private String i;
    private short j = (short)-1;

    public cyj_0(eEy eEy2) {
        this.h = eEy2;
    }

    public void a(String string) {
        this.i = string;
        fis_1.a().a((ajf_1)this, a);
    }

    public String a() {
        return this.i;
    }

    @Override
    public String[] d() {
        return this.g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.h.ordinal();
        }
        if (string.equals(d)) {
            return this.j;
        }
        if (string.equals(f)) {
            switch (this.j) {
                case 0: {
                    return "GoldMedal";
                }
                case 1: {
                    return "SilverMedal";
                }
                case 2: {
                    return "BronzeMedal";
                }
            }
            return "BronzeMedal";
        }
        if (string.equals(e)) {
            if (this.j != 0) {
                return "";
            }
            return null;
        }
        return null;
    }

    public void a(short s2) {
        this.j = s2;
        fis_1.a().a((ajf_1)this, f, d, e);
    }
}

