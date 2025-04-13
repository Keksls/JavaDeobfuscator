/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEG
 */
public class aeg_2 {
    public float a;
    public float b;
    public float c;
    public float d;

    public aeg_2() {
    }

    public aeg_2(aeg_2 aeg_22) {
        this.b(aeg_22);
    }

    public aeg_2(float f2, float f3, float f4, float f5) {
        this.a(f2, f3, f4, f5);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public final void a(aeg_2 aeg_22) {
        this.b(aeg_22);
    }

    public final void a(float f2) {
        this.a = f2;
    }

    public final void b(float f2) {
        this.b = f2;
    }

    public final void c(float f2) {
        this.c = f2;
    }

    public final void d(float f2) {
        this.d = f2;
    }

    public final void b(aeg_2 aeg_22) {
        this.a = aeg_22.a;
        this.b = aeg_22.b;
        this.c = aeg_22.c;
        this.d = aeg_22.d;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final boolean c(aeg_2 aeg_22) {
        return Hw.d(this.a, aeg_22.a) && Hw.d(this.b, aeg_22.b) && Hw.d(this.c, aeg_22.c) && Hw.d(this.d, aeg_22.d);
    }
}

