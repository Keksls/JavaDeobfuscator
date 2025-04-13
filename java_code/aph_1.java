/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apH
 */
public class aph_1
extends app_1 {
    private final String e;

    public aph_1(String string) {
        this(string, true);
    }

    public aph_1(String string, boolean bl) {
        super(string);
        this.b = aon_1.g;
        this.e = bl && string.startsWith("\"") && string.endsWith("\"") ? string.substring(1, string.length() - 1) : string;
    }

    public String f() {
        return this.e;
    }

    @Override
    public /* synthetic */ Object u_() {
        return this.f();
    }
}

