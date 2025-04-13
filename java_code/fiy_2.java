/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIy
 */
public class fiy_2
extends fiq_2 {
    private fvE e;

    public fiy_2(fvE fvE2) {
        this.e = fvE2;
    }

    @Override
    public int getValue() {
        if (this.e != null) {
            return this.e.getY();
        }
        return 0;
    }

    @Override
    public void setValue(int n) {
        this.e.setY(n);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
    }
}

