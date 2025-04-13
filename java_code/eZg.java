/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eZg
implements emy_0 {
    private long a;

    @Override
    public byte[] d() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        return abx_22.c();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
    }

    @Override
    public end_0 e() {
        return end_0.g;
    }

    public long a() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }
}

