/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmx
extends Pw {
    private int a;
    private int b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12080;
    }

    public void b(int n) {
        this.a = n;
    }

    public void c(int n) {
        this.b = n;
    }
}

