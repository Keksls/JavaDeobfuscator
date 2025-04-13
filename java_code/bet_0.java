/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEt
 */
public class bet_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bEu());

    public bFZ a() {
        bes_0 bes_02;
        try {
            bes_02 = (bes_0)a.borrowObject();
            bes_0.a(bes_02, a);
        }
        catch (Exception exception) {
            bes_0.q.error((Object)"Erreur lors de l'extraction d'une NationSelectionBoard du pool", (Throwable)exception);
            bes_02 = new bes_0();
        }
        return bes_02;
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

