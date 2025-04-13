/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from ccN
 */
public class ccn_2 {
    private static final Logger b = Logger.getLogger(ccn_2.class);
    public static final byte[] a = null;
    private final byte c;
    private final byte d;
    private final byte e;
    private final byte f;
    private final boolean g;
    private final byte h;
    private final agD i;
    private final byte[] j;
    private final int k;
    private final short l;

    ccn_2(int n, byte by, byte by2, byte by3, byte by4, boolean bl, int n2, short s2, byte by5, byte[] byArray) {
        this.c = by;
        this.d = by2;
        this.e = by3;
        this.f = by4;
        this.g = bl;
        this.k = n2;
        this.l = s2;
        this.i = agE.a(n);
        if (this.i == null) {
            b.error((Object)("l'element " + n + " n'a pas \u00e9t\u00e9 export\u00e9"));
        }
        this.h = by5;
        this.j = byArray;
    }

    public static ccn_2 a(arf_1 arf_12) {
        int n = arf_12.c();
        byte by = arf_12.a();
        byte by2 = arf_12.a();
        byte by3 = arf_12.a();
        byte by4 = arf_12.a();
        boolean bl = arf_12.a() != 0;
        int n2 = arf_12.c();
        short s2 = arf_12.b();
        byte by5 = arf_12.a();
        boolean bl2 = arf_12.a() != 0;
        byte[] byArray = bl2 ? arf_12.a(3) : a;
        return new ccn_2(n, by, by2, by3, by4, bl, n2, s2, by5, byArray);
    }

    public static byte[] a(int n, byte by, byte by2, byte by3, byte by4, boolean bl, int n2, short s2, byte by5, byte[] byArray) {
        gk_0 gk_02 = new gk_0();
        gk_02.a(n);
        gk_02.a(by);
        gk_02.a(by2);
        gk_02.a(by3);
        gk_02.a(by4);
        gk_02.a(bl ? (byte)1 : 0);
        gk_02.a(n2);
        gk_02.a(s2);
        gk_02.a(by5);
        if (Arrays.equals(byArray, a)) {
            gk_02.a((byte)0);
        } else {
            gk_02.a((byte)1);
            gk_02.a(byArray);
        }
        return gk_02.a();
    }

    public agD a() {
        return this.i;
    }

    public byte b() {
        return this.c;
    }

    public byte c() {
        return this.d;
    }

    public byte d() {
        return this.e;
    }

    public byte[] e() {
        return this.j;
    }

    public byte f() {
        return this.h;
    }

    public byte g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public int i() {
        return this.k;
    }

    public short j() {
        return this.l;
    }
}

