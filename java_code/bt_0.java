/*
 * Decompiled with CFR 0.152.
 */
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/*
 * Renamed from BT
 */
public class bt_0 {
    private int a;
    private int b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final byte[] g() {
        ByteBuffer byteBuffer = null;
        try {
            byte[] byArray = this.e == null ? new byte[]{} : this.e.getBytes("UTF-8");
            byte[] byArray2 = this.f == null ? new byte[]{} : this.f.getBytes("UTF-8");
            byteBuffer = ByteBuffer.allocate(9 + byArray.length + 4 + 1 + 4 + byArray2.length);
            byteBuffer.putInt(this.a);
            byteBuffer.put(this.c ? (byte)1 : 0);
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.put(this.d ? (byte)1 : 0);
            byteBuffer.putInt(this.b);
            byteBuffer.putInt(byArray2.length);
            byteBuffer.put(byArray2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bs_0.v().error((Object)"UnsupportedEncodingException during serialize", (Throwable)unsupportedEncodingException);
        }
        return byteBuffer.array();
    }

    public final void a(boolean bl) {
        this.c = bl;
    }

    public final void b(boolean bl) {
        this.d = bl;
    }

    public final void a(int n) {
        this.a = n;
    }

    public final void b(int n) {
        this.b = n;
    }

    public final void a(String string) {
        this.f = string;
    }

    public final void b(String string) {
        this.e = string;
    }

    public final void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        try {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.e = new String(byArray2, "UTF-8").intern();
            this.d = byteBuffer.get() == 1;
            this.b = byteBuffer.getInt();
            byte[] byArray3 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray3);
            this.f = new String(byArray3, "UTF-8").intern();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            bs_0.w().error((Object)"UnsupportedEncodingException during unserialise", (Throwable)unsupportedEncodingException);
        }
    }
}

