/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class QJ
extends ps_0 {
    private byte a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getInt();
        return true;
    }

    public byte b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public int a() {
        return 1142;
    }
}

