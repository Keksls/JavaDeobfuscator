/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIu
 */
public abstract class fiu_2
extends fiq_2 {
    private fiq_2 e;
    private fiq_2 f;

    public fiu_2(fiq_2 fiq_22, fiq_2 fiq_23) {
        if (fiq_22 == null || fiq_23 == null) {
            fiq_2.e.error((Object)("Probl\u00e8me dans un " + this.getClass().getName() + " : un des Spring est null"));
        }
        this.e = fiq_22 != null ? fiq_22 : fiu_2.a(0);
        this.f = fiq_23 != null ? fiq_23 : fiu_2.a(0);
    }

    @Override
    public int getValue() {
        return this.a(this.e.getValue(), this.f.getValue());
    }

    @Override
    public void setValue(int n) {
        super.setValue(n);
        this.e.setValue(n);
        this.f.setValue(n);
    }

    public abstract int a(int var1, int var2);

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
        this.f = null;
    }
}

