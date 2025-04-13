/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAq
extends ps_0 {
    private byte a;
    private long b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    @Override
    public int a() {
        return 1185;
    }
}

