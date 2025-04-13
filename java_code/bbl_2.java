/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBL
 */
public class bbl_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bbm_1());

    public bbh_2 a() {
        bbh_2 bbh_22;
        try {
            bbh_22 = (bbh_2)a.borrowObject();
            bbh_2.a(bbh_22, a);
        }
        catch (Exception exception) {
            bbh_2.t.error((Object)"Erreur lors de l'extraction d'un Destructible du pool", (Throwable)exception);
            bbh_22 = new bbh_2();
        }
        return bbh_22;
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

