/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBh
 */
public class bbh_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bbi_2());

    public bFZ a() {
        bbg_1 bbg_12;
        try {
            bbg_12 = (bbg_1)a.borrowObject();
            bbg_1.a(bbg_12, a);
        }
        catch (Exception exception) {
            bbg_1.r.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bbg_12 = new bbg_1();
        }
        return bbg_12;
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

