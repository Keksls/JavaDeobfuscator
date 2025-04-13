/*
 * Decompiled with CFR 0.152.
 */
public class bDI
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bdj_0());

    public bFZ a() {
        bdh_0 bdh_02;
        try {
            bdh_02 = (bdh_0)a.borrowObject();
            bdh_0.a(bdh_02, a);
        }
        catch (Exception exception) {
            bdh_0.q.error((Object)"Erreur lors de l'extraction d'un HavenWorldResourcesCollector du pool", (Throwable)exception);
            bdh_02 = new bdh_0();
        }
        return bdh_02;
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

