/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKv
 */
public class ckv_2
extends fqj {
    public static final String TAG = "InteractiveBubbleAppearance";
    private fbt_1 a = null;

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof fbt_1) {
            this.a = (fbt_1)fyb_02;
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fbt_1 getBubbleBorder() {
        return this.a;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.a = null;
    }
}

