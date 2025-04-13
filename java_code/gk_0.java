/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/*
 * Renamed from Gk
 */
public class gk_0
implements gh_0 {
    private OutputStream a;
    private ByteArrayOutputStream b;
    private int c;
    private int d;
    private boolean e = false;
    private long f;
    private boolean g;

    public gk_0(OutputStream outputStream) {
        this.a = outputStream;
    }

    public gk_0() {
        this.b = new ByteArrayOutputStream();
        this.a = this.b;
        this.g = true;
    }

    public gk_0(int n) {
        this.b = new ByteArrayOutputStream(n);
        this.a = this.b;
        this.g = true;
    }

    public byte[] a() {
        if (!this.g) {
            throw new IllegalStateException("Use this method only with memory streams!");
        }
        try {
            this.a.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return this.b.toByteArray();
    }

    public static int a(double d2) {
        if (d2 == 0.0) {
            return 1;
        }
        long l = (long)(d2 * 65536.0);
        return gk_0.a(l);
    }

    public long b() {
        return this.f;
    }

    public static int a(long l) {
        int n = l == 0L ? 0 : (int)(Math.floor(Math.log(Math.abs(l)) / Math.log(2.0)) + 2.0);
        return n;
    }

    public static int b(long l) {
        if (l < 1L) {
            return 0;
        }
        return (int)(Math.floor(Math.log(l) / Math.log(2.0)) + 1.0);
    }

    public void c() {
        if (this.d > 0) {
            this.a.write(this.c);
            ++this.f;
            this.d = 0;
            this.c = 0;
        }
    }

    public void d() {
        this.c();
        this.a.close();
    }

    public void e() {
        if (!this.e) {
            this.a = new BufferedOutputStream(new DeflaterOutputStream(this.a, new Deflater(9)));
            this.e = true;
        }
    }

    public void f() {
        this.a.flush();
    }

    public void a(boolean bl) {
        this.b(bl ? 1L : 0L, 1);
    }

    public void a(byte[] byArray) {
        this.c();
        if (byArray == null) {
            return;
        }
        this.a.write(byArray);
        this.f += (long)byArray.length;
    }

    public void b(double d2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putDouble(d2);
        this.a(byteBuffer.array());
    }

    public void c(double d2) {
        this.a((short)(d2 * 256.0));
    }

    public void a(double d2, int n) {
        long l = (long)(d2 * 65536.0);
        this.a(l, n);
    }

    @Override
    public void a(float f2) {
        this.a(Float.floatToIntBits(f2));
    }

    public void b(float f2) {
        int n = Float.floatToIntBits(f2);
        int n2 = Math.abs((n & Integer.MIN_VALUE) >> 31);
        int n3 = (n & 0x7F800000) >> 23;
        int n4 = n & 0x7FFFFF;
        int n5 = 0;
        if (n3 != 0) {
            n5 = n3 == 255 ? 31 : n3 - 127 + 15;
        }
        int n6 = 0;
        if (n5 < 0) {
            n5 = 0;
        } else if (n5 > 31) {
            n5 = 31;
        } else {
            n6 = n4 >> 13;
        }
        int n7 = n2 << 15;
        n7 |= n5 << 10;
        this.b(n7 |= n6);
    }

    @Override
    public void a(short s2) {
        this.c();
        this.a.write(s2 & 0xFF);
        this.a.write(s2 >> 8);
        this.f += 2L;
    }

    @Override
    public void a(int n) {
        this.c();
        this.a.write(n & 0xFF);
        this.a.write(n >> 8);
        this.a.write(n >> 16);
        this.a.write(n >> 24);
        this.f += 4L;
    }

    public void c(long l) {
        this.c();
        this.a.write((byte)(l & 0xFFL));
        this.a.write((byte)(l >> 8));
        this.a.write((byte)(l >> 16));
        this.a.write((byte)(l >> 24));
        this.a.write((byte)(l >> 32));
        this.a.write((byte)(l >> 40));
        this.a.write((byte)(l >> 48));
        this.a.write((byte)(l >> 56));
        this.f += 8L;
    }

    @Override
    public void a(byte by) {
        this.c();
        this.a.write(by);
        ++this.f;
    }

    public void a(long l, int n) {
        int n2 = gk_0.a(l);
        if (n < n2) {
            throw new IOException("At least " + n2 + " bits needed for representation of " + l);
        }
        this.c(l, n);
    }

    @Override
    public void a(String string) {
        this.a(Cz.a(string));
        this.a.write(0);
        ++this.f;
    }

    public void b(int n) {
        this.c();
        this.a.write(n & 0xFF);
        this.a.write(n >> 8);
        this.f += 2L;
    }

    public void d(long l) {
        this.c();
        this.a.write((int)(l & 0xFFL));
        this.a.write((int)(l >> 8));
        this.a.write((int)(l >> 16));
        this.a.write((int)(l >> 24));
        this.f += 4L;
    }

    public void b(short s2) {
        this.c();
        this.a.write(s2);
        ++this.f;
    }

    public void b(long l, int n) {
        int n2 = gk_0.b(l);
        if (n < n2) {
            throw new IOException("At least " + n2 + " bits needed for representation of " + l + ". Used bits: " + n);
        }
        this.c(l, n);
    }

    private void c(long l, int n) {
        for (int k = n; k > 0; --k) {
            ++this.d;
            if ((1L << k - 1 & l) != 0L) {
                this.c |= 1 << 8 - this.d;
            }
            if (this.d != 8) continue;
            this.a.write(this.c);
            ++this.f;
            this.d = 0;
            this.c = 0;
        }
    }

    public void a(byte[] byArray, int n, int n2) {
        this.c();
        if (byArray == null) {
            return;
        }
        this.a.write(byArray, n, n2);
        this.f += (long)n2;
    }
}

