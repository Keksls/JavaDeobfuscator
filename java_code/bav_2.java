/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAv
 */
public class bav_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new baw_1());

    public bFZ a() {
        bau_2 bau_22;
        try {
            bau_22 = (bau_2)a.borrowObject();
            bau_2.a(bau_22, a);
        }
        catch (Exception exception) {
            bau_2.q.error((Object)"Erreur lors de l'extraction d'un AudioMarker du pool", (Throwable)exception);
            bau_22 = new bau_2();
        }
        return bau_22;
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

