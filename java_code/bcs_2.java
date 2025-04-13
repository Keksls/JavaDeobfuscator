/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCs
 */
public class bcs_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bct_2());

    public bcr_2 a() {
        bcr_2 bcr_22;
        try {
            bcr_22 = (bcr_2)a.borrowObject();
            bcr_2.a(bcr_22, a);
        }
        catch (Exception exception) {
            bcr_2.s.error((Object)"Erreur lors de l'extraction d'un DimensionalBagShelf du pool", (Throwable)exception);
            bcr_22 = new bcr_2();
        }
        return bcr_22;
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

