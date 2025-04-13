/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDt
 */
public class bdt_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bdu_0());

    public bFZ a() {
        bdr_0 bdr_02;
        try {
            bdr_02 = (bdr_0)a.borrowObject();
            bdr_0.a(bdr_02, a);
        }
        catch (Exception exception) {
            bdr_0.q.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bdr_02 = new bdr_0();
        }
        return bdr_02;
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

