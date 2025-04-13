/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEq
 */
public class beq_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bEr());

    public bFZ a() {
        bEp bEp2;
        try {
            bEp2 = (bEp)a.borrowObject();
            bEp.a(bEp2, a);
        }
        catch (Exception exception) {
            bEp.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bEp2 = new bEp();
        }
        return bEp2;
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

