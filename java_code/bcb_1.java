/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCB
 */
public class bcb_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bcc_2());

    public bFZ a() {
        bcx_2 bcx_22;
        try {
            bcx_22 = (bcx_2)a.borrowObject();
            bcx_2.a(bcx_22, a);
        }
        catch (Exception exception) {
            bcx_2.t.error((Object)"Erreur lors de l'extraction d'un Door du pool", (Throwable)exception);
            bcx_22 = new bcx_2();
        }
        return bcx_22;
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

