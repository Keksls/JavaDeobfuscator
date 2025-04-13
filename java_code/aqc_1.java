/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqc
 */
class aqc_1
extends aqa_1 {
    private final int[] a;

    aqc_1(int n, int n2) {
        this.a = new int[]{n, n2};
    }

    @Override
    public int[] a(int ... nArray) {
        return new int[]{nArray[0] + this.a[0], nArray[1] + this.a[1]};
    }

    @Override
    public int[] b(int ... nArray) {
        return new int[]{nArray[0] - this.a[0], nArray[1] - this.a[1]};
    }
}

