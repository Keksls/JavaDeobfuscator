/*
 * Decompiled with CFR 0.152.
 */
public class bEb
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bEc());

    public bDZ a() {
        bDZ bDZ2;
        try {
            bDZ2 = (bDZ)a.borrowObject();
            bDZ.a(bDZ2, a);
        }
        catch (Exception exception) {
            bDZ.q.error((Object)"Erreur lors de l'extraction d'un LootChest du pool", (Throwable)exception);
            bDZ2 = new bDZ();
        }
        return bDZ2;
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

