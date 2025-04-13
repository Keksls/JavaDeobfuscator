/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCl
 */
public class bcl_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bcm_1());

    public bcj_2 a() {
        bcj_2 bcj_22;
        try {
            bcj_22 = (bcj_2)a.borrowObject();
            bcj_2.a(bcj_22, a);
        }
        catch (Exception exception) {
            bcj_2.q.error((Object)"Erreur lors de l'extraction d'un LootChest du pool", (Throwable)exception);
            bcj_22 = new bcj_2();
        }
        return bcj_22;
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

