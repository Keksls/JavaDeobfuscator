/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cBc
extends ps_0 {
    private long a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        return false;
    }

    public long b() {
        return this.a;
    }

    @Override
    public int a() {
        return 14564;
    }
}

