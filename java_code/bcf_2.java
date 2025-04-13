/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCF
 */
public class bcf_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bcg_1());

    public bFZ a() {
        bcd_1 bcd_12;
        try {
            bcd_12 = (bcd_1)a.borrowObject();
            bcd_1.a(bcd_12, a);
        }
        catch (Exception exception) {
            bcd_1.q.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bcd_12 = new bcd_1();
        }
        return bcd_12;
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

