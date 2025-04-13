/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCM
 */
public class bcm_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bcn_1());

    public bFZ a() {
        bcl_1 bcl_12;
        try {
            bcl_12 = (bcl_1)a.borrowObject();
            bcl_1.a(bcl_12, a);
        }
        catch (Exception exception) {
            bcl_1.q.error((Object)"Erreur lors de l'extraction d'une DungeonLadderBoard du pool", (Throwable)exception);
            bcl_12 = new bcl_1();
        }
        return bcl_12;
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

