/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from bjA
 */
public class bja_0
extends bjg_0 {
    public final float[] a;
    public final int b;

    public bja_0(efh_0 efh_02, float[] fArray, int n) {
        super(efh_02);
        this.a = bja_0.a(fArray);
        this.b = n;
    }

    private bja_0(bja_0 bja_02) {
        super(bja_02.c);
        this.b = bja_02.b;
        this.a = bja_02.a;
    }

    private static float[] a(float[] fArray) {
        return new float[]{fArray[0] * 1.25f, fArray[1] * 1.25f, fArray[2] * 1.25f, 1.0f};
    }

    @Override
    public void a(biI biI2) {
        this.a(biI2, true);
    }

    public void a(biI biI2, boolean bl) {
        biI2.a(this.b, this.a);
        if (bl) {
            biI2.bI().aQ();
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
        bja_0 bja_02 = (bja_0)object;
        if (this.b != bja_02.b) {
            return false;
        }
        return Arrays.equals(this.a, bja_02.a);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.a != null ? Arrays.hashCode(this.a) : 0);
        n = 31 * n + this.b;
        return n;
    }

    public bja_0 a() {
        return new bja_0(this);
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

