/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFL
 */
public class bfl_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bFM());

    public bFZ a() {
        bFJ bFJ2;
        try {
            bFJ2 = (bFJ)a.borrowObject();
            bFJ.a(bFJ2, a);
        }
        catch (Exception exception) {
            bFJ.r.error((Object)"Erreur lors de l'extraction d'une DistributionMachine du pool", (Throwable)exception);
            bFJ2 = new bFJ();
        }
        return bFJ2;
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

