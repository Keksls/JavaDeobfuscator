/*
 * Decompiled with CFR 0.152.
 */
public class bEn
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bEo());

    public bFZ a() {
        bel_0 bel_02;
        try {
            bel_02 = (bel_0)a.borrowObject();
            bel_0.a(bel_02, a);
        }
        catch (Exception exception) {
            bel_0.s.error((Object)("Erreur lors de l'extraction d'un " + bel_0.class.getName() + " du pool"), (Throwable)exception);
            bel_02 = new bel_0();
        }
        return bel_02;
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

