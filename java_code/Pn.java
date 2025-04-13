/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Pn
extends ps_0 {
    private final byte[] a = new byte[4];

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 4, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.get(this.a);
        return true;
    }

    @Override
    public int a() {
        return 369;
    }

    public byte[] b() {
        return this.a;
    }
}

