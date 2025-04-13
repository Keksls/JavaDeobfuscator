/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Renamed from BZ
 */
public class bz_0 {
    private int a;
    private int b;
    private int c;
    private short d;
    private int e;
    private int f;
    private int g;
    private String h;
    private boolean i;
    private byte j;

    public final String a() {
        return this.h;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final byte d() {
        return this.j;
    }

    public final boolean e() {
        return this.i;
    }

    public int f() {
        return this.c;
    }

    public short g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.f;
    }

    public int j() {
        return this.g;
    }

    public final byte[] k() {
        ByteBuffer byteBuffer = null;
        byte[] byArray = Cz.a(this.h);
        int n = byArray.length;
        byteBuffer = ByteBuffer.allocate(32 + n);
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.j);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put(this.i ? (byte)1 : 0);
        byteBuffer.putInt(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putInt(this.g);
        return byteBuffer.array();
    }

    public final void a(String string) {
        this.h = string;
    }

    public final void a(int n) {
        this.b = n;
    }

    public final void b(int n) {
        this.a = n;
    }

    public void a(byte by) {
        this.j = by;
    }

    public final void a(boolean bl) {
        this.i = bl;
    }

    public void c(int n) {
        this.c = n;
    }

    public void a(short s2) {
        this.d = s2;
    }

    public void d(int n) {
        this.e = n;
    }

    public void e(int n) {
        this.f = n;
    }

    public void f(int n) {
        this.g = n;
    }

    public final void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.j = byteBuffer.get();
        this.b = byteBuffer.getInt();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        try {
            this.h = new String(byArray2, "UTF-8").intern();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bw_0.F().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
        this.i = byteBuffer.get() == 1;
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
    }
}

