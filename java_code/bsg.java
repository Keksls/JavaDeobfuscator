/*
 * Decompiled with CFR 0.152.
 */
public class bsg
implements ajh_1 {
    public static final String a = "text";
    public static final String b = "iconUrl";
    public static final String d = "visible";
    private final int f;
    private final bsf g;
    private boolean h = false;
    public static final String[] e = new String[]{"text", "visible"};

    public bsg(int n, bsf bsf2) {
        this.f = n;
        this.g = bsf2;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            switch (this.f) {
                case -2: {
                    return "[...]";
                }
                case -1: {
                    return bae.h().a("dialogEnd", new Object[0]);
                }
            }
            return bae.h().a(76, (long)this.f, new Object[0]);
        }
        if (string.equals(b)) {
            if (this.g == bsf.a) {
                return null;
            }
            return azs_0.a().o(this.g.a());
        }
        if (string.equals(d)) {
            return this.h;
        }
        return null;
    }

    public int a() {
        return this.f;
    }

    public void a(boolean bl) {
        this.h = bl;
        fis_1.a().a((ajf_1)this, d);
    }
}

