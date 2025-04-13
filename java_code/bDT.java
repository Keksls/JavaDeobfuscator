/*
 * Decompiled with CFR 0.152.
 */
public class bDT
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bDU());

    public bFZ a() {
        bds_0 bds_02;
        try {
            bds_02 = (bds_0)a.borrowObject();
            bds_0.a(bds_02, a);
        }
        catch (Exception exception) {
            bds_0.r.error((Object)"Erreur lors de l'extraction d'un Board du pool", (Throwable)exception);
            bds_02 = new bds_0();
        }
        return bds_02;
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

