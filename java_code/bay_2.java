/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAy
 */
public class bay_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new baz_2());

    public bFZ a() {
        bax_2 bax_22;
        try {
            bax_22 = (bax_2)a.borrowObject();
            bax_2.a(bax_22, a);
        }
        catch (Exception exception) {
            bax_2.t.error((Object)("Erreur lors de l'extraction d'un " + bax_2.class.getName() + " du pool"), (Throwable)exception);
            bax_22 = new bax_2();
        }
        return bax_22;
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

