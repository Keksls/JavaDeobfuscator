/*
 * Decompiled with CFR 0.152.
 */
public final class bbJ
extends ban {
    private final long f;
    private final aff_1 g;

    public bbJ(int n, int n2, int n3, int n4, long l, aff_1 aff_12) {
        super(n, n2, n3, n4);
        this.f = l;
        this.g = aff_12;
    }

    @Override
    protected long o() {
        blx_1 blx_12 = this.d(this.f);
        if (blx_12 == null) {
            a.warn((Object)("[Fight] Reception d'un message de synchronisation de position pour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + this.p() + ", FighterID = " + this.f));
            return 0L;
        }
        a.info((Object)("Resynchronisation de la position d'un fighter dans notre combat.  FightID = " + this.p() + ", FighterID = " + this.f + " \u00e0 la position " + this.g));
        blx_12.a(this.g);
        return 0L;
    }

    @Override
    protected void l() {
        blx_1 blx_12;
        bwh_0 bwh_02 = this.n();
        if (bwh_02 instanceof bvx_2 && (blx_12 = ((bvx_2)bwh_02).A().H()) != null && blx_12.bp()) {
            cYT.a().g();
            cYT.a().f();
        }
        super.l();
    }
}

