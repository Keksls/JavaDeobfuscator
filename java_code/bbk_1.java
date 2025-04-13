/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBk
 */
public class bbk_1
extends abn_1<ph_0> {
    private static final abm_1 a = new abm_1(new bbl_1());

    public bbj_1 a() {
        bbj_1 bbj_12;
        try {
            bbj_12 = (bbj_1)a.borrowObject();
            bbj_1.a(bbj_12, a);
        }
        catch (Exception exception) {
            bbj_1.aK().error((Object)"Erreur lors de l'extraction d'un CharacterStatueViewFactory du pool", (Throwable)exception);
            bbj_12 = new bbj_1();
        }
        return bbj_12;
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

