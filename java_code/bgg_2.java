/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bGg
 */
public class bgg_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bgh_2());

    public bFZ a() {
        bge_1 bge_12;
        try {
            bge_12 = (bge_1)a.borrowObject();
            bge_1.a(bge_12, a);
        }
        catch (Exception exception) {
            bge_1.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bge_12 = new bge_1();
        }
        return bge_12;
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

