/*
 * Decompiled with CFR 0.152.
 */
public class bFl
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bfm_0());

    public bFZ a() {
        bFi bFi2;
        try {
            bFi2 = (bFi)a.borrowObject();
            bFi.a(bFi2, a);
        }
        catch (Exception exception) {
            bFi.s.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bFi2 = new bFi();
        }
        return bFi2;
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

