/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBz
 */
public class bbz_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bba_1());

    public bbw_1 a() {
        bbw_1 bbw_12;
        try {
            bbw_12 = (bbw_1)a.borrowObject();
            bbw_1.a(bbw_12, a);
        }
        catch (Exception exception) {
            bbw_1.r.error((Object)"Erreur lors de l'extraction d'une Collector du pool", (Throwable)exception);
            bbw_12 = new bbw_1();
        }
        return bbw_12;
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

