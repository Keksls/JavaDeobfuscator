/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqa
 */
public abstract class aqa_1 {
    public abstract int[] a(int ... var1);

    public abstract int[] b(int ... var1);

    static aqa_1 a(int n, int n2, aej_2 aej_22, boolean bl) {
        if (bl || aej_22 == aej_2.k || aej_22 == aej_2.b) {
            return new aqc_1(n, n2);
        }
        return new aqb_1(n, n2, aej_22);
    }
}

