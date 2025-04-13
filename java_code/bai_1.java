/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAI
 */
public class bai_1
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new baj_1());

    public bFZ a() {
        bah_1 bah_12;
        try {
            bah_12 = (bah_1)a.borrowObject();
            bah_1.a(bah_12, a);
        }
        catch (Exception exception) {
            bah_1.q.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bah_12 = new bah_1();
        }
        return bah_12;
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

