/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmA
 */
final class bma_1
extends eqk_2 {
    private final pk_2 b;
    final /* synthetic */ bmr_1 a;

    bma_1(bmr_1 bmr_12, pk_2 pk_22) {
        this.a = bmr_12;
        this.b = pk_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.dT().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        if (this.a.dr != null) {
            this.a.dr.B();
        }
        this.a.dr = new bsx_2();
        this.a.dr.v().a(azu_0.j().n().u());
        if (!this.a.dr.b(this.b.c)) {
            bmr_1.dU().error((Object)"Erreur durant la r\u00e9cup\u00e9ration des donn\u00e9es du sac dimensionel du joueur.");
        }
        if (!this.a.cX()) {
            this.a.dK().a(this.a);
        }
    }

    public String toString() {
        return "LocalPlayerCharacterPartDimensionalBagForClient{m_part=" + this.b + "}";
    }
}

