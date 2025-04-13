/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDl
 */
public class bdl_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bDm());

    public bFZ a() {
        bdk_0 bdk_02;
        try {
            bdk_02 = (bdk_0)a.borrowObject();
            bdk_0.a(bdk_02, a);
        }
        catch (Exception exception) {
            bdk_0.q.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bdk_02 = new bdk_0();
        }
        return bdk_02;
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

