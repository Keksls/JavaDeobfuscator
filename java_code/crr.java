/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crr
extends ps_0 {
    private byte[] a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(this.a);
        return true;
    }

    @Override
    public int a() {
        return 13248;
    }

    public byte[] b() {
        return this.a;
    }
}

