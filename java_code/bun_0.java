/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bUn
 */
public class bun_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "id";
    public static final String d = "selected";
    public static final String e = "style";
    public static final String[] f = new String[]{"name", "id", "selected", "style"};
    private byte g;
    private boolean h;

    public bun_0(byte by) {
        this.g = by;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.c();
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(e)) {
            return "filter" + this.g;
        }
        if (string.equals(d)) {
            return this.h;
        }
        return null;
    }

    private String c() {
        return bae.h().a("landMark.type." + this.g, new Object[0]);
    }

    public byte a() {
        return this.g;
    }

    public void a(byte by) {
        if (by == this.g) {
            return;
        }
        this.g = by;
        fis_1.a().a((ajf_1)this, a);
    }

    public boolean b() {
        return this.h;
    }

    public boolean a(fjg_1 fjg_12) {
        return this.h;
    }

    public void a(boolean bl) {
        if (bl == this.h) {
            return;
        }
        this.h = bl;
        fis_1.a().a((ajf_1)this, d);
    }
}

