/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBF
 */
public class bbf_2
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bbg_2());

    public bFZ a() {
        bbe_2 bbe_22;
        try {
            bbe_22 = (bbe_2)a.borrowObject();
            bbe_2.a(bbe_22, a);
        }
        catch (Exception exception) {
            bbe_2.s.error((Object)("Erreur lors de l'extraction d'un " + bbe_2.class.getName() + " du pool"), (Throwable)exception);
            bbe_22 = new bbe_2();
        }
        return bbe_22;
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

