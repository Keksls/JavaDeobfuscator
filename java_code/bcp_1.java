/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCP
 */
public class bcp_1
extends abn_1<bFZ> {
    public static abm_1 a = new abm_1(new bcq_2());

    public bFZ a() {
        bco_0 bco_02;
        try {
            bco_02 = (bco_0)a.borrowObject();
            bco_0.a(bco_02, a);
        }
        catch (Exception exception) {
            bco_0.q.error((Object)"Erreur lors de l'extraction d'une EnchantmentMachine du pool", (Throwable)exception);
            bco_02 = new bco_0();
        }
        return bco_02;
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

