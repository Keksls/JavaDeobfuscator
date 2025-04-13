/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDB
 */
public class bdb_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bdc_0());

    public bFZ a() {
        bdz_0 bdz_02;
        try {
            bdz_02 = (bdz_0)a.borrowObject();
            bdz_0.a(bdz_02, a);
        }
        catch (Exception exception) {
            bdz_0.q.error((Object)"Erreur lors de l'extraction d'un HavenWorldEntrance du pool", (Throwable)exception);
            bdz_02 = new bdz_0();
        }
        return bdz_02;
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

