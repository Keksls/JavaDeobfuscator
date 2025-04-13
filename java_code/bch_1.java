/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCh
 */
public class bch_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bci_2());

    public bFZ a() {
        bcf_1 bcf_12;
        try {
            bcf_12 = (bcf_1)a.borrowObject();
            bcf_1.a(bcf_12, a);
        }
        catch (Exception exception) {
            bcf_1.s.error((Object)("Erreur lors de l'extraction d'un " + bcf_1.class.getName() + " du pool"), (Throwable)exception);
            bcf_12 = new bcf_1();
        }
        return bcf_12;
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

