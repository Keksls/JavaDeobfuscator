/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIt
 */
public class fit_2
extends fiq_2 {
    private fiq_2 e;

    public fit_2(fiq_2 fiq_22) {
        if (fiq_22 != null) {
            this.e = fiq_22;
        } else {
            fiq_2.e.error((Object)"Le Spring pass\u00e9 en param\u00e8tre est null");
            this.e = fit_2.a(0);
        }
    }

    @Override
    public int getValue() {
        return -this.e.getValue();
    }

    @Override
    public void setValue(int n) {
        this.e.setValue(n);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
    }
}

