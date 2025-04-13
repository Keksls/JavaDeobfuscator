/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEC
 */
public class bec_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bed_0());

    public bFZ a() {
        bEA bEA2;
        try {
            bEA2 = (bEA)a.borrowObject();
            bEA.a(bEA2, a);
        }
        catch (Exception exception) {
            bEA.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bEA2 = new bEA();
        }
        return bEA2;
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

