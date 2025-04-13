/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUt
 */
public abstract class but_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "enabled";
    public static final String[] d = new String[]{"name", "enabled"};
    protected final int e;
    protected boolean f;

    public but_0(int n) {
        if (n == 2) {
            this.f = true;
        }
        this.e = n;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.f;
        }
        return null;
    }

    public String a() {
        return bae.h().a("temporaryAmaknaArchipelagoName." + this.e, new Object[0]);
    }

    public int b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }
}

