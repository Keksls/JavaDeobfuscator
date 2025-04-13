/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIw
 */
public class fiw_2
extends fiq_2 {
    private fvE e;

    public fiw_2(fvE fvE2) {
        this.e = fvE2;
    }

    @Override
    public int getValue() {
        if (this.e != null) {
            return this.e.getWidth();
        }
        return 0;
    }

    @Override
    public void setValue(int n) {
        this.e.setSize(n, this.e.m_size.height);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
    }
}

