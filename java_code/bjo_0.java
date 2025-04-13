/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from bjO
 */
public class bjo_0
extends bjg_0 {
    public final float[] a;
    public final float b;
    public final boolean d;
    int e;

    public bjo_0(efh_0 efh_02, float[] fArray, float f2, boolean bl) {
        super(efh_02);
        this.a = fArray;
        this.b = f2;
        this.d = bl;
    }

    private bjo_0(bjo_0 bjo_02) {
        super(bjo_02.c);
        this.a = bjo_02.a;
        this.b = bjo_02.b;
        this.d = bjo_02.d;
    }

    public bjo_0 a() {
        return new bjo_0(this);
    }

    @Override
    public void a(biI biI2) {
        adS adS2 = (adS)avo_2.a.a();
        adS2.a(biI2);
        adS2.b(0.0f, 0.0f, 0.0f);
        adS2.c(this.a[0], this.a[1], this.a[2]);
        adS2.a(0.0f, 0.0f, 0.2f);
        adS2.a(this.b);
        aed.a.a(adS2);
        if (this.d) {
            adS2.b(500);
        } else {
            this.e = adS2.d();
        }
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
        bjo_0 bjo_02 = (bjo_0)object;
        if (this.d != bjo_02.d) {
            return false;
        }
        if (Float.compare(bjo_02.b, this.b) != 0) {
            return false;
        }
        return Arrays.equals(this.a, bjo_02.a);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a != null ? Arrays.hashCode(this.a) : 0);
        n = 31 * n + (this.b != 0.0f ? Float.floatToIntBits(this.b) : 0);
        n = 31 * n + (this.d ? 1 : 0);
        return n;
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

