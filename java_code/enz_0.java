/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from enz
 */
public final class enz_0 {
    public static final enz_0 a = new enz_0();
    private final enA b = new enA();

    private enz_0() {
    }

    public eny_0 a(long l, enu_0 enu_02) {
        if (enu_02 == enu_0.a) {
            return eny_0.d;
        }
        return this.b.a(l, enu_02.a());
    }

    public void a(long l, int n, eny_0 eny_02) {
        this.b.a(l, n, eny_02);
    }

    public String toString() {
        return "InstanceInteractionLevelManager{m_instanceInteractionLevelsDictionary=" + this.b + "}";
    }
}

