/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXJ
 */
public class exj_2
extends exk_2 {
    private exk_2 a;

    public exj_2(long l, ezr_0 ezr_02, exk_2 exk_22) {
        super(l);
        this.a = exk_22;
        this.b(ezr_02);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.a = null;
    }

    @Override
    public void release() {
        this.a = null;
    }

    public exk_2 k() {
        return this.a;
    }

    @Override
    public boolean aU_() {
        return false;
    }
}

