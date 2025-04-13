/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eCa
 */
public class eca_0 {
    private int a;
    private int b;

    eca_0() {
    }

    public eca_0 a(int n) {
        this.a = n;
        return this;
    }

    public eca_0 b(int n) {
        this.b = n;
        return this;
    }

    public ebz_0 a() {
        return new ebz_0(this.a, this.b);
    }

    public String toString() {
        return "CraftStepFees.CraftStepFeesBuilder(equipmentFees=" + this.a + ", componentFees=" + this.b + ")";
    }
}

