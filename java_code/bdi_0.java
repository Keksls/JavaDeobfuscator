/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDi
 */
public class bdi_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bDj());

    public bDg a() {
        bDg bDg2;
        try {
            bDg2 = (bDg)a.borrowObject();
            bDg.a(bDg2, a);
        }
        catch (Exception exception) {
            bDg.q.error((Object)"Erreur lors de l'extraction d'un LootChest du pool", (Throwable)exception);
            bDg2 = new bDg();
        }
        return bDg2;
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

