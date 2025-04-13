/*
 * Decompiled with CFR 0.152.
 */
class daU
implements ajh_1,
cdz_0 {
    public static final String a = "name";
    public static final String b = "lastAdded";
    private final cDY d;
    private String e;

    daU(cDY cDY2) {
        this.d = cDY2;
        this.d.a(this);
    }

    public void a() {
        this.d.a((cdz_0)null);
    }

    @Override
    public void a(amj_1 amj_12) {
        this.e = amj_12.K();
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d.d();
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }
}

