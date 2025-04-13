/*
 * Decompiled with CFR 0.152.
 */
public class bFP
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bFQ());
    private final fjv b;

    public bFP(fjv fjv2) {
        this.b = fjv2;
    }

    public bFZ a() {
        bFN bFN2;
        try {
            bFN2 = (bFN)a.borrowObject();
            bFN.a(bFN2, a);
        }
        catch (Exception exception) {
            bFN.s.error((Object)"Erreur lors de l'extraction d'une DistributionMachine du pool", (Throwable)exception);
            bFN2 = new bFN();
        }
        bFN2.q = this.b;
        return bFN2;
    }

    @Override
    public /* synthetic */ abo_1 b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.a();
    }
}

