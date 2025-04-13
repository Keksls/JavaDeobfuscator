/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFo
 */
public class bfo_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bfp_0());

    public bFZ a() {
        bfn_0 bfn_02;
        try {
            bfn_02 = (bfn_0)a.borrowObject();
            bfn_0.a(bfn_02, a);
        }
        catch (Exception exception) {
            bfn_0.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bfn_02 = new bfn_0();
        }
        return bfn_02;
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

