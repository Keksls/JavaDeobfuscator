/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuZ
 */
public class cuz_1
extends ps_0 {
    private long a;
    private byte b;
    private long c;
    private byte d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        if (byteBuffer.get() == 1) {
            this.c = byteBuffer.getLong();
            this.d = byteBuffer.get();
        } else {
            this.c = -1L;
            this.d = (byte)-1;
        }
        return true;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public boolean d() {
        return this.c != -1L && this.d != -1;
    }

    public long e() {
        return this.c;
    }

    public byte f() {
        return this.d;
    }

    @Override
    public int a() {
        return 13600;
    }
}

