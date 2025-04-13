/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Pp
extends ps_0 {
    private boolean a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.b = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.b);
        return true;
    }

    @Override
    public int a() {
        return 36;
    }

    public boolean b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }
}

