/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFI
 */
public class bfi_0
extends abn_1<bFZ> {
    static final abm_1 a = new abm_1(bfc_0.q);

    public bFZ a() {
        bfc_0 bfc_02;
        try {
            bfc_02 = (bfc_0)a.borrowObject();
            bfc_0.a(bfc_02, a);
        }
        catch (Exception exception) {
            bfc_0.t.error((Object)"Erreur lors de l'extraction d'une DistributionMachine du pool", (Throwable)exception);
            bfc_02 = new bfc_0();
        }
        return bfc_02;
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

