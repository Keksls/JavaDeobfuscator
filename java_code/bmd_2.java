/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmD
 */
final class bmd_2
extends eqk_2 {
    private final qo_2 b;
    final /* synthetic */ bmr_1 a;

    bmd_2(bmr_1 bmr_12, qo_2 qo_22) {
        this.a = bmr_12;
        this.b = qo_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.dW().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        this.a.dm.b(this.b.c);
    }

    public String toString() {
        return "LocalPlayerCharacterPartInventories{m_part=" + this.b + "} ";
    }
}

