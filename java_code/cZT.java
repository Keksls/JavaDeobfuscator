/*
 * Decompiled with CFR 0.152.
 */
public class cZT
implements ajh_1 {
    public static final String a = "title";
    public static final String b = "description";
    private final String d;
    private final String e;

    public cZT(String string, String string2) {
        this.d = string;
        this.e = string2;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }
}

