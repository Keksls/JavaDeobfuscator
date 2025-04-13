/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aFk
 */
public class afk_2 {
    public static final int a = 16;
    public int b;
    public int c;
    public int d;
    public int e;

    public afk_2(afk_2 afk_22) {
        this.a(afk_22);
    }

    public afk_2(int n, int n2, int n3, int n4) {
        this.a(n, n2, n3, n4);
    }

    public afk_2() {
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MAX_VALUE;
    }

    public final ByteBuffer a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
        return byteBuffer;
    }

    public final ByteBuffer b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        return byteBuffer;
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    public final void a(afk_2 afk_22) {
        this.b = afk_22.b;
        this.c = afk_22.c;
        this.d = afk_22.d;
        this.e = afk_22.e;
    }

    public final void a(int n, int n2) {
        this.b += n;
        this.c += n;
        this.d += n2;
        this.e += n2;
    }

    public final int a() {
        return this.b;
    }

    public final void a(int n) {
        this.b = n;
    }

    public final int b() {
        return this.c;
    }

    public final void b(int n) {
        this.c = n;
    }

    public final int c() {
        return this.d;
    }

    public final void c(int n) {
        this.d = n;
    }

    public final int d() {
        return this.e;
    }

    public final void d(int n) {
        this.e = n;
    }

    public final int e() {
        return this.c - this.b + 1;
    }

    public final int f() {
        return this.e - this.d + 1;
    }

    public final boolean b(int n, int n2) {
        return n >= this.b && n <= this.c && n2 >= this.d && n2 <= this.e;
    }

    public final boolean b(afk_2 afk_22) {
        return this.b(afk_22.b, afk_22.c, afk_22.d, afk_22.e);
    }

    public final boolean b(int n, int n2, int n3, int n4) {
        if (n > this.c) {
            return false;
        }
        if (n2 < this.b) {
            return false;
        }
        if (n3 > this.e) {
            return false;
        }
        return n4 >= this.d;
    }

    public final void c(int n, int n2) {
        this.b = Math.min(n, this.b);
        this.c = Math.max(n, this.c);
        this.d = Math.min(n2, this.d);
        this.e = Math.max(n2, this.e);
    }

    public final void c(afk_2 afk_22) {
        this.b = Math.min(afk_22.b, this.b);
        this.c = Math.max(afk_22.c, this.c);
        this.d = Math.min(afk_22.d, this.d);
        this.e = Math.max(afk_22.e, this.e);
    }

    public String toString() {
        return "(" + this.b + ", " + this.d + ") - (" + this.c + ", " + this.e + ")";
    }

    public double g() {
        return (double)(this.b + this.c) * 0.5;
    }

    public double h() {
        return (double)(this.d + this.e) * 0.5;
    }
}

