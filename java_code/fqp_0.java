/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fqP
 */
public enum fqp_0 {
    a("default"),
    b("selected", a),
    c("disabled"),
    d(c),
    e("pressed"),
    f(e),
    g("mouseHover"),
    h(g);

    @NotNull
    private final String j;
    private final boolean k;
    @Nullable
    private final fqp_0 l;
    public static fqp_0[] i;

    private fqp_0(String string2) {
        this(string2, false, null);
    }

    private fqp_0(fqp_0 fqp_02) {
        this(fqp_02.c() + "Selected", true, fqp_02);
    }

    private fqp_0(String string2, fqp_0 fqp_02) {
        this(string2, true, fqp_02);
    }

    @NotNull
    public fqp_0 a() {
        if (this.k) {
            return this;
        }
        for (fqp_0 fqp_02 : i) {
            if (!fqp_02.d() || fqp_02.b() != this) continue;
            return fqp_02;
        }
        return a;
    }

    @NotNull
    public fqp_0 b() {
        if (this.l == null) {
            return this;
        }
        return this.l;
    }

    public static fqp_0 a(@Nullable String string) {
        if (string == null) {
            return a;
        }
        for (fqp_0 fqp_02 : i) {
            if (!string.equals(fqp_02.c())) continue;
            return fqp_02;
        }
        return a;
    }

    private fqp_0(@Nullable String string2, boolean bl, fqp_0 fqp_02) {
        if (string2 == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.j = string2;
        this.k = bl;
        this.l = fqp_02;
    }

    @NotNull
    public String c() {
        return this.j;
    }

    public boolean d() {
        return this.k;
    }

    static {
        i = fqp_0.values();
    }
}

