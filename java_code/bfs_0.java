/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFs
 */
public class bfs_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bFt());

    public bFZ a() {
        bfq_0 bfq_02;
        try {
            bfq_02 = (bfq_0)a.borrowObject();
            bfq_0.a(bfq_02, a);
        }
        catch (Exception exception) {
            bfq_0.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bfq_02 = new bfq_0();
        }
        return bfq_02;
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

