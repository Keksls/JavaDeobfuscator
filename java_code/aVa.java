/*
 * Decompiled with CFR 0.152.
 */
public class aVa
extends auz_0
implements ajf_1 {
    public static final String a = "notify";
    public static final String[] b = new String[]{"notify"};
    public static final String[] d = new String[b.length + auz_0.v.length];
    private boolean e;

    public aVa(String string, String string2, boolean bl, long l, boolean bl2) {
        super(string, string2, bl, l);
        this.e = bl2;
    }

    public boolean a() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        return super.b(string);
    }

    @Override
    public String[] d() {
        return d;
    }

    static {
        System.arraycopy(b, 0, d, 0, b.length);
        System.arraycopy(auz_0.v, 0, d, b.length, auz_0.v.length);
    }
}

