/*
 * Decompiled with CFR 0.152.
 */
public class bEQ
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new ber_0());

    public bFZ a() {
        beo_0 beo_02;
        try {
            beo_02 = (beo_0)a.borrowObject();
            beo_0.a(beo_02, a);
        }
        catch (Exception exception) {
            beo_0.q.error((Object)"Erreur lors de l'extraction d'un Phenix du pool", (Throwable)exception);
            beo_02 = new beo_0();
        }
        return beo_02;
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

