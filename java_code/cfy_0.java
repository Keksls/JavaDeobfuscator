/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFy
 */
class cfy_0
implements ajh_1 {
    private bog_2 l;
    private final atm_1 m;
    public static final String a = "currentColor";
    public static final String b = "red";
    public static final String d = "green";
    public static final String e = "blue";
    public static final String f = "red255";
    public static final String g = "green255";
    public static final String h = "blue255";
    public static final String i = "name";
    public static final String j = "floatString";
    public static final String[] k = new String[]{"currentColor", "red", "green", "blue", "red255", "green255", "blue255", "name", "floatString"};

    public cfy_0(bog_2 bog_22, atm_1 atm_12) {
        this.l = bog_22;
        this.m = atm_12;
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.l;
        }
        if (string.equals(b)) {
            return Float.valueOf(this.l.a());
        }
        if (string.equals(d)) {
            return Float.valueOf(this.l.b());
        }
        if (string.equals(e)) {
            return Float.valueOf(this.l.c());
        }
        if (string.equals(f)) {
            return (int)(this.l.a() * 255.0f);
        }
        if (string.equals(g)) {
            return (int)(this.l.b() * 255.0f);
        }
        if (string.equals(h)) {
            return (int)(this.l.c() * 255.0f);
        }
        if (string.equals(i)) {
            return this.m.name();
        }
        if (string.equals(j)) {
            return Hw.a(this.l.a(), 2) + "f, " + Hw.a(this.l.b(), 2) + "f, " + Hw.a(this.l.c(), 2) + "f";
        }
        return null;
    }

    public void a(float f2) {
        this.l = new bog_2(f2, this.l.b(), this.l.c());
        fis_1.a().a((ajf_1)this, k);
    }

    public void b(float f2) {
        this.l = new bog_2(this.l.a(), f2, this.l.c());
        fis_1.a().a((ajf_1)this, k);
    }

    public void c(float f2) {
        this.l = new bog_2(this.l.a(), this.l.b(), f2);
        fis_1.a().a((ajf_1)this, k);
    }

    public void a(frO frO2) {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        bog_2.a(this.l, (abu)biI2, this.m, true);
        biI2.i(true);
        fis_1.a().a((ajf_1)bmr_12, bmr_12.d());
    }
}

