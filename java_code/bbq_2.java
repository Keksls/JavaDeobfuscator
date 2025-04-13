/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBq
 */
public class bbq_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bbr_1());

    public bFZ a() {
        bbo_2 bbo_22;
        try {
            bbo_22 = (bbo_2)a.borrowObject();
            bbo_2.a(bbo_22, a);
        }
        catch (Exception exception) {
            bbo_2.s.error((Object)"Erreur lors de l'extraction d'un Chest du pool", (Throwable)exception);
            bbo_22 = new bbo_2();
        }
        return bbo_22;
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

