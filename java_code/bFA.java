/*
 * Decompiled with CFR 0.152.
 */
public class bFA
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bFB());

    public bFZ a() {
        bfz_0 bfz_02;
        try {
            bfz_02 = (bfz_0)a.borrowObject();
            bfz_0.a(bfz_02, a);
        }
        catch (Exception exception) {
            bfz_0.r.error((Object)"Erreur lors de l'extraction d'un StreetLight du pool", (Throwable)exception);
            bfz_02 = new bfz_0();
        }
        return bfz_02;
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

