/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbT
 */
public class bbt_0
extends ban {
    private static final int f = 5000;
    private final long g;
    private final aff_1 h;
    private final String i;
    private final String m;

    public bbt_0(int n, int n2, int n3, int n4, long l, aff_1 aff_12) {
        super(n, n2, n3, n4);
        this.g = l;
        this.h = aff_12;
        this.i = "AnimMouvementTeleport-Debut";
        this.m = "AnimMouvementTeleport-Fin";
    }

    public bbt_0(int n, int n2, int n3, int n4, long l, aff_1 aff_12, String string, String string2) {
        super(n, n2, n3, n4);
        this.g = l;
        this.h = aff_12;
        this.i = string;
        this.m = string2;
    }

    @Override
    protected long o() {
        blx_1 blx_12 = this.d(this.g);
        if (blx_12 == null) {
            a.warn((Object)("[Fight] Reception d'un message de teleportpour un fighter inconnu du client, qui devrait pourtant etre dans son combat.  FightID = " + this.p() + ", FighterID = " + this.g));
            return 0L;
        }
        biI biI2 = blx_12.bv();
        if (biI2.k(this.i)) {
            biI2.a(new bbu_0(this, blx_12));
            biI2.e(this.i);
            this.a(biI2);
        } else {
            this.b(blx_12);
        }
        int n = Math.min(Math.abs(biI2.j(this.i) + biI2.j(this.m)), 5000);
        return n;
    }

    protected void a(biI biI2) {
    }

    void b(blx_1 blx_12) {
        blx_12.b(this.h.d(), this.h.e(), this.h.f());
        biI biI2 = blx_12.bv();
        if (biI2.k(this.m)) {
            biI2.e(this.m);
            this.a(blx_12);
        }
    }

    protected void a(blx_1 blx_12) {
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

