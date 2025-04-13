/*
 * Decompiled with CFR 0.152.
 */
public class bDx
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bdy_0());

    public bFZ a() {
        bdv_0 bdv_02;
        try {
            bdv_02 = (bdv_0)a.borrowObject();
            bdv_0.a(bdv_02, a);
        }
        catch (Exception exception) {
            bdv_0.q.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bdv_02 = new bdv_0();
        }
        return bdv_02;
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

