/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class cBb
extends ps_0 {
    private byte[] a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.a);
        return false;
    }

    public byte[] b() {
        return this.a;
    }

    @Override
    public int a() {
        return 15972;
    }
}

