/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agQ
 */
public enum agq_0 implements agt_0
{
    a("language", ags_0.a),
    b("resolution", ags_0.a),
    c("UIScale", ags_0.a),
    d("hideFlyingValues", ags_0.a),
    e("accountPreferencesLoaded", ags_0.a);

    private final String f;
    private final ags_0 g;

    private agq_0(String string2, ags_0 ags_02) {
        this.f = string2;
        this.g = ags_02;
    }

    @Override
    public String b() {
        return this.f;
    }

    @Override
    public ajb_1 a(agk_0<?, ?> agk_02) {
        return agk_02.a(this.g);
    }

    public static agp_0 a(String string) {
        for (agq_0 agq_02 : agq_0.values()) {
            if (!agq_02.b().equals(string)) continue;
            return agq_02;
        }
        return null;
    }
}

