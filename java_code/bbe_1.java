/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBe
 */
public class bbe_1
extends abn_1<bFZ> {
    private static final abm_1 a = new abm_1(new bbf_1());

    public bFZ a() {
        bbb_2 bbb_22;
        try {
            bbb_22 = (bbb_2)a.borrowObject();
            bbb_2.a(bbb_22, a);
        }
        catch (Exception exception) {
            bbb_2.r.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bbb_22 = new bbb_2();
        }
        bft_0 bft_02 = new bft_0();
        ph_0 ph_02 = (ph_0)bft_02.b();
        ph_02.a(1);
        ph_02.b(0);
        ph_02.a((byte)3);
        bbb_22.a(ph_02);
        return bbb_22;
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

