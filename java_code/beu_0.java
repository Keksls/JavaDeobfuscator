/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEU
 */
public class beu_0
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bEV());

    public bFZ a() {
        bES bES2;
        try {
            bES2 = (bES)a.borrowObject();
            bES.a(bES2, a);
        }
        catch (Exception exception) {
            bES.t.error((Object)("Erreur lors de l'extraction d'un " + bES.class.getName() + " du pool"), (Throwable)exception);
            bES2 = new bES();
        }
        return bES2;
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

