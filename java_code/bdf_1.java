/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDF
 */
public class bdf_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bdg_0());

    public bFZ a() {
        bdd_0 bdd_02;
        try {
            bdd_02 = (bdd_0)a.borrowObject();
            bdd_0.a(bdd_02, a);
        }
        catch (Exception exception) {
            bdd_0.q.error((Object)"Erreur lors de l'extraction d'un DimensionalBagExitTrigger du pool", (Throwable)exception);
            bdd_02 = new bdd_0();
        }
        return bdd_02;
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

