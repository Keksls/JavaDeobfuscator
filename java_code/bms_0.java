/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMS
 */
abstract class bms_0 {
    protected final int a;

    protected bms_0(int n) {
        this.a = n;
    }

    protected int a() {
        return this.a;
    }

    protected abstract bmr_0 b();

    protected bmr_0 c() {
        bmr_0 bmr_02 = this.b();
        bmr_02.b(this.a);
        return bmr_02;
    }
}

