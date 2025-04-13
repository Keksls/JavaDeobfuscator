/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEj
 */
public class bej_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bEk());

    public bFZ a() {
        bEh bEh2;
        try {
            bEh2 = (bEh)a.borrowObject();
            bEh.a(bEh2, a);
        }
        catch (Exception exception) {
            bEh.r.error((Object)"Erreur lors de l'extraction d'un MarketBoard du pool", (Throwable)exception);
            bEh2 = new bEh();
        }
        return bEh2;
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

