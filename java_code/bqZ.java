/*
 * Decompiled with CFR 0.152.
 */
public class bqZ
implements ajh_1 {
    public static final String a = "isAlphabeticalSorted";
    public static final String b = "isLevelSorted";
    public static final String d = "filterType";
    private bra_0 f = bra_0.a;
    private boolean g = false;
    private boolean h = false;
    public final String[] e = new String[]{"isAlphabeticalSorted", "isLevelSorted", "filterType"};

    @Override
    public String[] d() {
        return this.e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g;
        }
        if (string.equals(b)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.f.a();
        }
        return null;
    }

    public bra_0 a() {
        return this.f;
    }

    public void a(bra_0 bra_02) {
        this.f = bra_02;
    }

    public boolean b() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public boolean c() {
        return this.h;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public String e() {
        return this.g + "," + this.h + "," + this.f.a();
    }

    public void a(String string) {
        String[] stringArray = string.split(",");
        if (stringArray.length < 3) {
            return;
        }
        this.g = Boolean.parseBoolean(stringArray[0]);
        this.h = Boolean.parseBoolean(stringArray[1]);
        this.f = bra_0.a(Integer.parseInt(stringArray[2]));
    }
}

