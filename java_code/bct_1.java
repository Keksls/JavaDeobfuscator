/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCT
 */
public class bct_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bcu_2());

    public bFZ a() {
        bcr_1 bcr_12;
        try {
            bcr_12 = (bcr_1)a.borrowObject();
            bcr_1.a(bcr_12, a);
        }
        catch (Exception exception) {
            bcr_1.r.error((Object)("Erreur lors de l'extraction d'un " + bcr_1.class.getName() + " du pool"), (Throwable)exception);
            bcr_12 = new bcr_1();
        }
        return bcr_12;
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

