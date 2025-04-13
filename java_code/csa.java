/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csa
extends ps_0 {
    private long a;
    private byte b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        return false;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13062;
    }
}

