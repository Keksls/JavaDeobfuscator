/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNg
 */
public class bng_0
extends bnl_0 {
    public static final String a = "temperatureIconUrl";
    public static final String b = "windIconUrl";
    private final int n;
    private final String o;
    private final String p;
    private int[] q;

    public bng_0(bni_0 bni_02, int n) {
        super(bni_02);
        this.n = n;
        Yc yc = eay_0.a.a(this.n);
        if (yc != null) {
            this.o = bae.h().a(52, (long)this.n, new Object[0]);
            this.p = bae.h().a(53, (long)this.n, new Object[0]);
            this.q = new int[2];
            this.q[0] = yc.b() > 0.0f ? 0 : (yc.b() < 0.0f ? 1 : -1);
            this.q[1] = yc.c() > 0.0f ? 4 : (yc.c() < 0.0f ? 5 : -1);
        } else {
            this.o = "";
            this.p = "";
        }
    }

    @Override
    public String a() {
        return this.o;
    }

    @Override
    public fgo_0 b() {
        return fgo_0.b;
    }

    @Override
    public Object b(String string) {
        if (string.equals("description")) {
            return this.p;
        }
        if (string.equals("name")) {
            return this.o;
        }
        if (string.equals("nameWithRemainingTime")) {
            Object object = this.g();
            if (object == null) {
                return this.a();
            }
            return new StringBuilder(this.o).append(" (").append(object).append(")");
        }
        if (string.equals("nameWithDuration")) {
            return new StringBuilder(this.o).append(" (").append(this.h()).append(")");
        }
        if (string.equals("iconUrl")) {
            return null;
        }
        if (string.equals(a)) {
            if (this.q[0] == -1) {
                return null;
            }
            return azs_0.a().a("climateBonusIconsPath", "defaultIconPath", this.q[0]);
        }
        if (string.equals(b)) {
            if (this.q[1] == -1) {
                return null;
            }
            return azs_0.a().a("climateBonusIconsPath", "defaultIconPath", this.q[1]);
        }
        return super.b(string);
    }

    public int c() {
        return this.n;
    }
}

