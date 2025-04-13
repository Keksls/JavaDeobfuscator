/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brt
 */
public abstract class brt_1
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "hasBook";
    public static final String d = "bookIconUrl";
    public static final String e = "buttonIconUrl";
    public static final String f = "isInnate";
    public static final String g = "isConceptual";
    public static final String h = "isUnknown";
    public static final String i = "isCraftServiceEnabled";
    public static final String j = "craftServiceMinLevel";
    public static final String k = "idString";
    protected final int l;
    private final ece_0 m;
    private final bjw_1 n;

    protected brt_1(int n, ece_0 ece_02) {
        this.l = n;
        this.m = ece_02;
        this.n = (bjw_1)eyo_1.g().d(ecn_0.a.a(this.l).b());
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.b();
            }
            case "hasBook": {
                return this.n != null;
            }
            case "bookIconUrl": {
                return this.n != null ? this.n.b("iconUrl") : null;
            }
            case "buttonIconUrl": {
                return azs_0.a().k(this.l);
            }
            case "isUnknown": {
                return this.i();
            }
            case "isInnate": {
                return this.m();
            }
            case "isConceptual": {
                return this.n();
            }
            case "idString": {
                return String.valueOf(this.l);
            }
            case "isCraftServiceEnabled": {
                return this.f();
            }
            case "craftServiceMinLevel": {
                return this.g();
            }
        }
        return null;
    }

    public ece_0 a() {
        return this.m;
    }

    public String b() {
        return brt_1.a(this.l);
    }

    public static String a(int n) {
        return bae.h().a(43, (long)n, new Object[0]);
    }

    private boolean m() {
        return ecn_0.a.a(this.l).d();
    }

    private boolean n() {
        return ecn_0.a.a(this.l).e();
    }

    public void c() {
        if (this.n != null) {
            ((bim_1)this.n.p()).g();
        }
    }

    public int e() {
        return this.l;
    }

    public boolean f() {
        return this.a().o(this.l);
    }

    public int g() {
        return this.a().n(this.l);
    }

    public abstract short h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();
}

