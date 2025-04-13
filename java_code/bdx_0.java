/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDX
 */
public class bdx_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bDY());

    public bFZ a() {
        bDV bDV2;
        try {
            bDV2 = (bDV)a.borrowObject();
            bDV.a(bDV2, a);
        }
        catch (Exception exception) {
            bDV.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bDV2 = new bDV();
        }
        return bDV2;
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

