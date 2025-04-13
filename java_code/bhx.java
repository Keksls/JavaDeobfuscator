/*
 * Decompiled with CFR 0.152.
 */
public abstract class bhx
implements ajh_1 {
    public static final String a = "iconUrl";
    public static final String b = "description";
    public static final String d = "isKnown";
    public static final String e = "usable";
    public static final String[] f = new String[]{"iconUrl", "description", "isKnown", "usable"};
    protected boolean g;
    protected final int h;
    protected final String i;
    private boolean j;

    protected bhx(int n, String string) {
        this.h = n;
        this.i = string;
    }

    public int k() {
        return this.h;
    }

    public String e() {
        return null;
    }

    public String l() {
        return this.i;
    }

    public String m() {
        ani_2 ani_22 = new ani_2();
        return ani_22.a().a((CharSequence)this.e()).b().a((CharSequence)(" (" + this.l() + ")")).r();
    }

    public abstract String f();

    public void a(boolean bl) {
        this.j = bl;
    }

    public boolean n() {
        return this.j;
    }

    public boolean o() {
        return this.g;
    }

    protected boolean g() {
        return true;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f();
        }
        if (string.equals(b)) {
            return this.m();
        }
        if (string.equals(d)) {
            return this.j;
        }
        if (string.equals(e)) {
            return this.g();
        }
        return null;
    }
}

