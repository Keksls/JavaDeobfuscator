/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBu
 */
public class bbu_2
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bbv_1());

    public bFZ a() {
        bbs_1 bbs_12;
        try {
            bbs_12 = (bbs_1)a.borrowObject();
            bbs_1.a(bbs_12, a);
        }
        catch (Exception exception) {
            bbs_1.q.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bbs_12 = new bbs_1();
        }
        return bbs_12;
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

