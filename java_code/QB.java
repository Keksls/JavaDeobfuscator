/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class QB
extends ps_0 {
    private long a = -1L;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 1191;
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

