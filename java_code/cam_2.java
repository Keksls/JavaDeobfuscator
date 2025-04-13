/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cam
 */
final class cam_2
implements apv_2 {
    private final int a;
    private final int b;
    private final short c;

    cam_2(@NotNull aff_1 aff_12) {
        this.a = aff_12.d();
        this.b = aff_12.e();
        this.c = aff_12.f();
    }

    cam_2(apv_2 apv_22) {
        this.a = apv_22.G();
        this.b = apv_22.H();
        this.c = apv_22.I();
    }

    @Override
    public float J() {
        return this.G();
    }

    @Override
    public float K() {
        return this.H();
    }

    @Override
    public float L() {
        return this.I();
    }

    @Override
    public int G() {
        return this.a;
    }

    @Override
    public int H() {
        return this.b;
    }

    @Override
    public short I() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cam_2 cam_22 = (cam_2)object;
        if (this.a != cam_22.a) {
            return false;
        }
        if (this.b != cam_22.b) {
            return false;
        }
        return this.c == cam_22.c;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        n = 31 * n + this.c;
        return n;
    }
}

