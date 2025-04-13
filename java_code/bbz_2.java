/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBZ
 */
public class bbz_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bca_1());

    public bFZ a() {
        bbx_1 bbx_12;
        try {
            bbx_12 = (bbx_1)a.borrowObject();
            bbx_1.a(bbx_12, a);
        }
        catch (Exception exception) {
            bbx_1.q.error((Object)("Erreur lors de l'extraction d'un " + bbx_1.class + " du pool"), (Throwable)exception);
            bbx_12 = new bbx_1();
        }
        return bbx_12;
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

