/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIx
 */
public class fix_2
extends fiq_2 {
    private fvE e;

    public fix_2(fvE fvE2) {
        this.e = fvE2;
    }

    @Override
    public int getValue() {
        if (this.e != null) {
            return this.e.getX();
        }
        return 0;
    }

    @Override
    public void setValue(int n) {
        this.e.setX(n);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
    }
}

