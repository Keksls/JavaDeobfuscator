/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCv
 */
public class bcv_2
extends abn_1<ph_0> {
    private static final abm_1 a = new abm_1(new bcw_2());

    public bcu_1 a() {
        bcu_1 bcu_12;
        try {
            bcu_12 = (bcu_1)a.borrowObject();
            bcu_1.a(bcu_12, a);
        }
        catch (Exception exception) {
            bcu_1.aL().error((Object)"Erreur lors de l'extraction d'un DimensionalBagView du pool", (Throwable)exception);
            bcu_12 = new bcu_1();
        }
        return bcu_12;
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

