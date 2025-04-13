/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIs
 */
public class fis_2
extends fiq_2 {
    private fvE e;

    public fis_2(fvE fvE2) {
        this.e = fvE2;
    }

    @Override
    public int getValue() {
        if (this.e != null) {
            return this.e.getHeight();
        }
        return 0;
    }

    @Override
    public void setValue(int n) {
        this.e.setSize(this.e.m_size.width, n);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
    }
}

