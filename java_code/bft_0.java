/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFT
 */
public class bft_0
extends abn_1<ph_0> {
    private static final abm_1 a = new abm_1(new bFU());

    public bfr_0 a() {
        bfr_0 bfr_02;
        try {
            bfr_02 = (bfr_0)a.borrowObject();
            bfr_0.a(bfr_02, a);
        }
        catch (Exception exception) {
            bfr_0.aQ().error((Object)"Erreur lors de l'extraction d'un WakfuClientInteractiveAnimatedElementSceneView du pool", (Throwable)exception);
            bfr_02 = new bfr_0();
        }
        return bfr_02;
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

