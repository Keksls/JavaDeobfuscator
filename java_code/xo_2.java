/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from xo
 */
final class xo_2 {
    private int b = 0;
    private String c = null;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private byte h = 0;
    private long i = 0L;
    private int j = 0;
    private long k = 0L;
    private long l = 0L;
    private int m = 0;
    private long n = 0L;
    private int o = 0;
    final /* synthetic */ xn_1 a;

    xo_2(xn_1 xn_12) {
        this.a = xn_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
        this.a.f = this.g;
        this.a.g = this.k;
        this.a.h = this.l;
        this.a.i = this.m;
        this.a.j = this.n;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.get();
        this.i = byteBuffer.getLong();
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.getLong();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.get();
        this.i = byteBuffer.getLong();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.getLong();
        this.m = byteBuffer.getInt();
        this.n = byteBuffer.getLong();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.get();
        this.i = byteBuffer.getLong();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.getLong();
        this.m = byteBuffer.getInt();
        this.n = byteBuffer.getLong();
        this.o = byteBuffer.getInt();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.get();
        this.i = byteBuffer.getLong();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.getLong();
        this.m = byteBuffer.getInt();
        this.n = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 313) {
            return false;
        }
        if (n < 315) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

