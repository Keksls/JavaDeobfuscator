/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from aBx
 */
public class abx_2 {
    private static final int e = 10;
    protected byte[] a;
    protected int b;
    protected int c;
    protected int d;

    public abx_2() {
        this.a = new byte[10];
        this.b = 10;
        this.c = 0;
        this.d = 10;
    }

    public abx_2(abx_2 abx_22) {
        this.b = this.c = abx_22.c;
        this.a = new byte[abx_22.c];
        this.d = abx_22.d;
    }

    public abx_2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        this.a = new byte[n];
        this.b = n;
        this.c = 0;
        this.d = 10;
    }

    public abx_2(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("La taille du tableau doit \u00eatre >= 0");
        }
        if (n2 < 1) {
            throw new IllegalArgumentException("L'incr\u00e9ment de taille growth doit \u00eatre >= 1");
        }
        this.a = new byte[n];
        this.b = n;
        this.c = 0;
        this.d = n2;
    }

    public static abx_2 a(byte[] byArray) {
        if (byArray == null) {
            throw new IllegalArgumentException("Le tableau ne peut \u00eatre nul");
        }
        abx_2 abx_22 = new abx_2();
        abx_22.a = byArray;
        abx_22.b = byArray.length;
        abx_22.d = 10;
        abx_22.c = abx_22.b;
        return abx_22;
    }

    public final void a(byte by) {
        this.c(this.c + 1);
        this.a[this.c] = by;
        ++this.c;
    }

    public final void b(byte[] byArray) {
        int n = byArray.length;
        this.c(this.c + n);
        System.arraycopy(byArray, 0, this.a, this.c, n);
        this.c += n;
    }

    public final void a(byte[] byArray, int n) {
        this.c(this.c + n);
        System.arraycopy(byArray, 0, this.a, this.c, n);
        this.c += n;
    }

    public final void a(byte[] byArray, int n, int n2) {
        this.c(this.c + n2);
        System.arraycopy(byArray, n, this.a, this.c, n2);
        this.c += n2;
    }

    public final void a(abx_2 abx_22) {
        this.a(abx_22.a, 0, abx_22.c);
    }

    public final void a(boolean bl) {
        this.a(bl ? (byte)1 : 0);
    }

    public final void a(char c2) {
        this.c(this.c + 2);
        this.a[this.c] = (byte)(0xFF & c2 >> 8);
        ++this.c;
        this.a[this.c] = (byte)(0xFF & c2);
        ++this.c;
    }

    public final void a(short s2) {
        this.c(this.c + 2);
        this.a[this.c] = (byte)(0xFF & s2 >> 8);
        ++this.c;
        this.a[this.c] = (byte)(0xFF & s2);
        ++this.c;
    }

    public final void a(int n) {
        this.c(this.c + 4);
        this.a[this.c] = (byte)(0xFF & n >> 24);
        ++this.c;
        this.a[this.c] = (byte)(0xFF & n >> 16);
        ++this.c;
        this.a[this.c] = (byte)(0xFF & n >> 8);
        ++this.c;
        this.a[this.c] = (byte)(0xFF & n);
        ++this.c;
    }

    public final void a(long l) {
        this.c(this.c + 8);
        this.a[this.c] = (byte)(0xFFL & l >> 56);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l >> 48);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l >> 40);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l >> 32);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l >> 24);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l >> 16);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l >> 8);
        ++this.c;
        this.a[this.c] = (byte)(0xFFL & l);
        ++this.c;
    }

    public final boolean b(byte by) {
        for (int k = 0; k < this.c; ++k) {
            if (this.a[k] != by) continue;
            return true;
        }
        return false;
    }

    public final void a(float f2) {
        this.a(Float.floatToIntBits(f2));
    }

    public final void a(double d2) {
        this.a(Double.doubleToLongBits(d2));
    }

    public final void a(String string) {
        byte[] byArray = Cz.a(string);
        if (byArray.length > Short.MAX_VALUE) {
            throw new IllegalArgumentException("encoded string length (" + byArray.length + ") is not less than a short (32767)");
        }
        this.a((short)byArray.length);
        this.b(byArray);
    }

    public final void b(String string) {
        byte[] byArray = Cz.a(string);
        if (byArray.length > 127) {
            throw new IllegalArgumentException("encoded string length (" + byArray.length + ") is not less than a byte (127)");
        }
        this.a((byte)byArray.length);
        this.b(byArray);
    }

    public final byte b(int n) {
        if (n >= this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[n];
    }

    public final int a() {
        return this.c;
    }

    public final byte[] b() {
        return this.a;
    }

    public final byte[] c() {
        byte[] byArray = new byte[this.c];
        System.arraycopy(this.a, 0, byArray, 0, this.c);
        return byArray;
    }

    private void c(int n) {
        if (n > this.b) {
            this.b = n + this.d;
            byte[] byArray = new byte[this.b];
            System.arraycopy(this.a, 0, byArray, 0, this.c);
            this.a = byArray;
        }
    }

    public final void d() {
        Arrays.fill(this.a, (byte)0);
        this.c = 0;
    }
}

