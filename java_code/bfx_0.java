/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFx
 */
public class bfx_0
extends abn_1<bFZ> {
    public static final abm_1 a = new abm_1(new bFy());

    public bFZ a() {
        bfu_0 bfu_02;
        try {
            bfu_02 = (bfu_0)a.borrowObject();
            bfu_0.a(bfu_02, a);
        }
        catch (Exception exception) {
            bfu_0.r.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bfu_02 = new bfu_0();
        }
        return bfu_02;
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

