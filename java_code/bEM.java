/*
 * Decompiled with CFR 0.152.
 */
public class bEM
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new ben_0());

    public bFZ a() {
        bEL bEL2;
        try {
            bEL2 = (bEL)a.borrowObject();
            bEL.a(bEL2, a);
        }
        catch (Exception exception) {
            bEL.s.error((Object)"Erreur lors de l'extraction d'une RecycleMachine du pool", (Throwable)exception);
            bEL2 = new bEL();
        }
        return bEL2;
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

