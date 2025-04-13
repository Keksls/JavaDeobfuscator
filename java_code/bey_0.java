/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEy
 */
public class bey_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bez_0());

    public bFZ a() {
        bex_0 bex_02;
        try {
            bex_02 = (bex_0)a.borrowObject();
            bex_0.a(bex_02, a);
        }
        catch (Exception exception) {
            bex_0.u.error((Object)("Erreur lors de l'extraction d'un " + bex_0.class.getName() + " du pool"), (Throwable)exception);
            bex_02 = new bex_0();
        }
        return bex_02;
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

