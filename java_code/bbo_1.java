/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBO
 */
public class bbo_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bbp_2());

    public bFZ a() {
        bbn_1 bbn_12;
        try {
            bbn_12 = (bbn_1)a.borrowObject();
            bbn_1.a(bbn_12, a);
        }
        catch (Exception exception) {
            bbn_1.q.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bbn_12 = new bbn_1();
        }
        return bbn_12;
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

