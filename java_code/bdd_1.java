/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDd
 */
public class bdd_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bde_0());

    public bFZ a() {
        bdb_0 bdb_02;
        try {
            bdb_02 = (bdb_0)a.borrowObject();
            bdb_0.a(bdb_02, a);
        }
        catch (Exception exception) {
            bdb_0.t.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bdb_02 = new bdb_0();
        }
        return bdb_02;
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

