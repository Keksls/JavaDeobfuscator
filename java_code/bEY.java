/*
 * Decompiled with CFR 0.152.
 */
public class bEY
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bEZ());

    public bFZ a() {
        bew_0 bew_02;
        try {
            bew_02 = (bew_0)a.borrowObject();
            bew_0.a(bew_02, a);
        }
        catch (Exception exception) {
            bew_0.q.error((Object)"Erreur lors de l'extraction d'un SeedSpreader du pool", (Throwable)exception);
            bew_02 = new bew_0();
        }
        return bew_02;
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

