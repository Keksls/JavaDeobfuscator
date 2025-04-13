/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aca
 */
public class aca_0 {
    public static final String a = ".tgam";
    public static final String b = "";
    private static final aca_0 c = new aca_0(".tgam", false);
    private final String d;
    private final boolean e;
    private String f = "";

    protected aca_0(String string, boolean bl) {
        this.d = string;
        this.e = bl;
    }

    public static aca_0 a() {
        return c;
    }

    public final void a(String string) {
        this.f = string;
        if (!string.endsWith("/")) {
            this.f = this.f + "/";
        }
    }

    public ays_2 a(int n) {
        String string = this.b(n);
        long l = auc_1.d(string);
        if (this.e) {
            return ayu_2.a().b((aui_2)auj_1.a.a(), l, string, false);
        }
        return ayu_2.a().a((aui_2)auj_1.a.a(), l, string, false);
    }

    protected final String b(int n) {
        return gg_0.e(this.f + n + this.d);
    }
}

