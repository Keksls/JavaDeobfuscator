/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public class enF {
    private static final Logger e = Logger.getLogger(enF.class);
    public static final short a = -1;
    public static final int b = 0;
    public static final int c = (int)Math.ceil(40.5);
    private final byte[] f;
    private final int[] g;

    public enF() {
        this(new byte[c], null);
    }

    public enF(byte[] byArray, int[] nArray) {
        assert (byArray.length == c);
        this.f = byArray;
        this.g = nArray;
    }

    public enF(enF enF2) {
        this.f = (byte[])enF2.f.clone();
        this.g = enF2.g == null ? null : (int[])enF2.g.clone();
    }

    public boolean a(byte by, byte by2, short s2) {
        boolean bl;
        assert (by >= 0 && by < 18);
        assert (by2 >= 0 && by2 < 18);
        int n = by + by2 * 18;
        int n2 = 128 >> n % 8;
        boolean bl2 = bl = (this.f[n / 8] & n2) != 0;
        if (this.g == null || !bl) {
            return bl;
        }
        int n3 = enF.b(by, by2, s2);
        if (this.g.length < 16) {
            return ArrayUtils.contains((int[])this.g, (int)n3);
        }
        return Arrays.binarySearch(this.g, n3) >= 0;
    }

    public static int b(byte by, byte by2, short s2) {
        return by | by2 << 8 | s2 << 16;
    }

    public static void a(enF enF2, gk_0 gk_02) {
        if (enF2 == null) {
            gk_02.a((short)-1);
            return;
        }
        int n = enF2.g == null ? 0 : enF2.g.length;
        gk_02.a((short)n);
        gk_02.a(enF2.f);
        if (n != 0) {
            for (int k = 0; k < n; ++k) {
                gk_02.a(enF2.g[k]);
            }
        }
    }

    public static enF a(arf_1 arf_12) {
        int[] nArray;
        int n = arf_12.b();
        if (n == -1) {
            return null;
        }
        byte[] byArray = arf_12.a(c);
        if (n == 0) {
            nArray = null;
        } else {
            nArray = new int[n];
            for (int k = 0; k < n; ++k) {
                nArray[k] = arf_12.c();
            }
        }
        return new enF(byArray, nArray);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        enF enF2 = (enF)object;
        return this.a(enF2);
    }

    public boolean a(enF enF2) {
        return Arrays.equals(this.f, enF2.f) && Arrays.equals(this.g, enF2.g);
    }
}

