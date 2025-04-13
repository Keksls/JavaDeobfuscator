/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCJ
 */
public class bcj_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bck_1());

    public bFZ a() {
        bch_2 bch_22;
        try {
            bch_22 = (bch_2)a.borrowObject();
            bch_2.a(bch_22, a);
        }
        catch (Exception exception) {
            bch_2.t.error((Object)("Erreur lors de l'extraction d'un " + bch_2.class.getName() + " du pool"), (Throwable)exception);
            bch_22 = new bch_2();
        }
        return bch_22;
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

