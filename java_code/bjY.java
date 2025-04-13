/*
 * Decompiled with CFR 0.152.
 */
public class bjY
extends bjg_0 {
    private final float a;

    public bjY(efh_0 efh_02, float f2) {
        super(efh_02);
        this.a = f2;
    }

    public bjY(bjY bjY2) {
        super(bjY2.c);
        this.a = bjY2.a;
    }

    @Override
    public void a(biI biI2) {
        biI2.a(this.a);
    }

    public float a() {
        return this.a;
    }

    public bjY b() {
        return new bjY(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bjY bjY2 = (bjY)object;
        return Float.compare(bjY2.a, this.a) == 0;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a == 0.0f ? 0 : Float.floatToIntBits(this.a));
        return n;
    }

    public /* synthetic */ bjg_0 c() {
        return this.b();
    }
}

