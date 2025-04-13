/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAZ
 */
public class baz_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bba_2());

    public bax_1 a() {
        bax_1 bax_12;
        try {
            bax_12 = (bax_1)a.borrowObject();
            bax_1.a(bax_12, a);
        }
        catch (Exception exception) {
            bbb_2.r.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bax_12 = new bax_1();
        }
        bft_0 bft_02 = new bft_0();
        ph_0 ph_02 = (ph_0)bft_02.b();
        ph_02.a(1);
        ph_02.b(0);
        ph_02.a((byte)3);
        bax_12.a(ph_02);
        return bax_12;
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

