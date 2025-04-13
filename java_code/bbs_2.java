/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBS
 */
public class bbs_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bbt_2());

    public bFZ a() {
        bbq_1 bbq_12;
        try {
            bbq_12 = (bbq_1)a.borrowObject();
            bbq_1.a(bbq_12, a);
        }
        catch (Exception exception) {
            bbq_1.q.error((Object)"Erreur lors de l'extraction d'un DimensionalBagAdminConsole du pool", (Throwable)exception);
            bbq_12 = new bbq_1();
        }
        return bbq_12;
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

