/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TShortArrayList;
import java.util.Arrays;

/*
 * Renamed from XK
 */
public class xk_0 {
    public static final int a = 16;
    private final short c;
    private final short[] d;
    private final byte[] e;

    public xk_0(xk_0 xk_02) {
        this.c = xk_02.c;
        if (xk_02.d != null) {
            this.d = new short[xk_02.d.length];
            System.arraycopy(xk_02.d, 0, this.d, 0, xk_02.d.length);
        } else {
            this.d = null;
        }
        if (xk_02.e != null) {
            this.e = new byte[xk_02.e.length];
            System.arraycopy(xk_02.e, 0, this.e, 0, xk_02.e.length);
        } else {
            this.e = null;
        }
    }

    public xk_0(short s2, short[] sArray, byte[] byArray) {
        this.c = s2;
        this.d = sArray;
        this.e = byArray;
    }

    final int a() {
        return this.d.length;
    }

    short a(int n) {
        return this.d[n];
    }

    public short b(int n) {
        int n2 = this.d.length;
        if (n2 == 1) {
            return this.d[0];
        }
        if (n2 > 16) {
            assert (false) : "ne devrait pas arriver, export foireux(?)";
            return this.c;
        }
        int n3 = 2;
        int n4 = 15;
        if (n2 <= 4) {
            n3 = 4;
            n4 = 3;
        }
        if (n2 <= 2) {
            n3 = 8;
            n4 = 1;
        }
        int n5 = n % n3 * (8 / n3);
        int n6 = (this.e[n / n3] & 0xFF) >>> n5 & n4;
        return this.d[n6];
    }

    public static xk_0 a(TShortArrayList tShortArrayList, short[] sArray, short s2) {
        int n = tShortArrayList.size();
        if (n == 1) {
            return new xk_0(s2, tShortArrayList.toArray(), null);
        }
        int n2 = 2;
        if (n <= 4) {
            n2 *= 2;
        }
        if (n == 2) {
            n2 *= 2;
        }
        int n3 = (sArray.length + (n2 - 1)) / n2;
        byte[] byArray = new byte[n3];
        int n4 = 8 / n2;
        for (int k = 0; k < sArray.length; ++k) {
            int n5;
            byte by = (byte)tShortArrayList.indexOf(sArray[k]);
            int n6 = k % n2 * n4;
            int n7 = n5 = k / n2;
            byArray[n7] = (byte)(byArray[n7] | (by & 0xF) << n6);
        }
        return new xk_0(s2, tShortArrayList.toArray(), byArray);
    }

    public void a(gk_0 gk_02) {
        int n = this.d.length;
        assert (n < 255);
        gk_02.a((byte)(n & 0xFF));
        for (int k = 0; k < n; ++k) {
            gk_02.a(this.d[k]);
        }
        if (n != 1) {
            gk_02.a((byte)(this.e.length & 0xFF));
            gk_02.a(this.e);
        }
    }

    public static xk_0 a(arf_1 arf_12, short s2) {
        byte[] byArray;
        int n = arf_12.a() & 0xFF;
        if (n == 0) {
            return null;
        }
        short[] sArray = arf_12.b(n);
        if (n != 1) {
            int n2 = arf_12.a() & 0xFF;
            byArray = arf_12.a(n2);
        } else {
            byArray = null;
        }
        return new xk_0(s2, sArray, byArray);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof xk_0)) {
            return false;
        }
        xk_0 xk_02 = (xk_0)object;
        return (this.d == null ? xk_02.d == null : Arrays.equals(this.d, xk_02.d)) && (this.e == null ? xk_02.e == null : Arrays.equals(this.e, xk_02.e));
    }
}

