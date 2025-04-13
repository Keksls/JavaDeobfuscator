/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from blk
 */
public abstract class blk_1
implements ajh_1 {
    private static final Logger j = Logger.getLogger(blk_1.class);
    public static final String a = "item";
    public static final String b = "quantity";
    public static final String d = "xp";
    public static final String e = "boosterXp";
    public static final String f = "kama";
    public static final String g = "xpIconUrl";
    public static final String h = "rankDescription";
    public static final String[] i = new String[]{"item", "quantity", "xpIconUrl", "xp", "kama", "rankDescription"};

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.b();
        }
        if (string.equals(d)) {
            return this.c();
        }
        if (string.equals(f)) {
            return this.e();
        }
        if (string.equals(g)) {
            return this.f();
        }
        if (string.equals(h)) {
            return this.g();
        }
        return null;
    }

    protected abstract ezr_0 a();

    protected abstract int b();

    protected abstract int c();

    protected abstract int e();

    protected abstract String f();

    protected abstract String g();
}

