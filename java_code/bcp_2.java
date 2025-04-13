/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCp
 */
public class bcp_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bcq_1());

    public bFZ a() {
        bcn_0 bcn_02;
        try {
            bcn_02 = (bcn_0)a.borrowObject();
            bcn_0.a(bcn_02, a);
        }
        catch (Exception exception) {
            bcn_0.r.error((Object)("Erreur lors de l'extraction d'un " + bcn_0.class + " du pool"), (Throwable)exception);
            bcn_02 = new bcn_0();
        }
        return bcn_02;
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

