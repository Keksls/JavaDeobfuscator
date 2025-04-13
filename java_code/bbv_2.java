/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBV
 */
public class bbv_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bbw_2());

    public bFZ a() {
        bbu_1 bbu_12;
        try {
            bbu_12 = (bbu_1)a.borrowObject();
            bbu_1.a(bbu_12, a);
        }
        catch (Exception exception) {
            bbu_1.v.error((Object)("Erreur lors de l'extraction d'un " + bbu_1.class.getName() + " du pool"), (Throwable)exception);
            bbu_12 = new bbu_1();
        }
        return bbu_12;
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

