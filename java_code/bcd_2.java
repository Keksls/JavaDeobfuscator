/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCd
 */
public class bcd_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bce_2());

    public bFZ a() {
        bcb_2 bcb_22;
        try {
            bcb_22 = (bcb_2)a.borrowObject();
            bcb_2.a(bcb_22, a);
        }
        catch (Exception exception) {
            bcb_2.q.error((Object)"Erreur lors de l'extraction d'un DimensionalBagExitTrigger du pool", (Throwable)exception);
            bcb_22 = new bcb_2();
        }
        return bcb_22;
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

