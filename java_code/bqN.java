/*
 * Decompiled with CFR 0.152.
 */
public abstract class bqN
implements ajh_1 {
    public static final String a = "content";
    public static final String b = "kama";
    public static final String d = "name";
    public static final String e = "locked";
    public static final String f = "valid";
    public static final String g = "freeBagSlotsSize";
    public static final String h = "freeBagSlotsSize";
    private static final String[] k = new String[]{"content", "kama", "name", "locked", "valid", "freeBagSlotsSize"};
    protected final bqI i;
    protected bqP j;

    public bqN(bqI bqI2) {
        this.i = bqI2;
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            return this.i.b().al_();
        }
        if (string.equals(e)) {
            return this.i.a().d();
        }
        if (string.equals(f)) {
            return this.b();
        }
        return null;
    }

    public bqI a() {
        return this.i;
    }

    protected abstract boolean b();

    public abstract void c();

    public abstract long e();
}

