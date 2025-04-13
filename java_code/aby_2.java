/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

/*
 * Renamed from aBy
 */
public final class aby_2 {
    private static final int b = 8;
    private static final int c = 3;
    private byte[] d;

    private aby_2() {
    }

    public aby_2(aby_2 aby_22) {
        this.d = new byte[aby_22.d.length];
        System.arraycopy(aby_22.d, 0, this.d, 0, this.d.length);
    }

    public aby_2(int n) {
        this.d = new byte[aby_2.b(n)];
    }

    public aby_2(int n, boolean bl) {
        this.d = new byte[aby_2.b(n)];
        this.a(bl);
    }

    public final boolean a(int n) {
        return aby_2.a(this.d, n);
    }

    public final void a(int n, boolean bl) {
        aby_2.a(this.d, n, bl);
    }

    public final void a(boolean bl) {
        if (bl) {
            for (int k = 0; k < this.d.length; ++k) {
                this.d[k] = -1;
            }
        } else {
            for (int k = 0; k < this.d.length; ++k) {
                this.d[k] = 0;
            }
        }
    }

    private void c(int n) {
        assert (n >= this.d.length * 8) : "loosing data in BitSet (oldSize=" + this.d.length + " newSize=" + n + ")";
        byte[] byArray = new byte[(n + 7) / 8];
        System.arraycopy(this.d, 0, byArray, 0, this.d.length);
        this.d = byArray;
    }

    public final int a() {
        return this.d.length * 8;
    }

    private static byte d(int n) {
        assert (n < 8) : "bit index should be < 8 , found : " + n;
        return (byte)(1 << n);
    }

    public final byte[] b() {
        return this.d;
    }

    public final void a(OutputStream outputStream) {
        outputStream.write(this.d);
    }

    public static aby_2 a(byte[] byArray, int n, int n2) {
        aby_2 aby_22 = new aby_2();
        aby_22.d = new byte[n2];
        System.arraycopy(byArray, n, aby_22.d, 0, n2);
        return aby_22;
    }

    public static aby_2 a(byte[] byArray) {
        aby_2 aby_22 = new aby_2();
        aby_22.d = byArray;
        return aby_22;
    }

    public static boolean a(byte[] byArray, int n) {
        assert (n >> 3 < byArray.length) : "trying to get a bit index=" + n + " but only " + byArray.length * 8 + " available.";
        int n2 = n >> 3;
        int n3 = 7 - (n - (n2 << 3));
        return (byArray[n2] & aby_2.d(n3)) != 0;
    }

    public static void a(byte[] byArray, int n, boolean bl) {
        assert (n >> 3 < byArray.length) : "trying to set a bit index=" + n + " but only " + byArray.length * 8 + " available.";
        int n2 = n >> 3;
        int n3 = 7 - (n - (n2 << 3));
        if (bl) {
            int n4 = n2;
            byArray[n4] = (byte)(byArray[n4] | aby_2.d(n3));
        } else {
            int n5 = n2;
            byArray[n5] = (byte)(byArray[n5] & ~aby_2.d(n3));
        }
    }

    public static int b(int n) {
        return n + 7 >> 3;
    }
}

