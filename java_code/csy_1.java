/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csy
 */
public class csy_1
extends ps_0 {
    private long a;
    private int b;
    private byte c;
    private long d;
    private long e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12457;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }
}

