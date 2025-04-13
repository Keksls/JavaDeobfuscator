/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpZ
extends Pw {
    private byte a;
    private String b;

    public void a(byte by) {
        this.a = by;
    }

    public void a(String string) {
        this.b = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.b);
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + byArray.length);
        byteBuffer.put(this.a);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12024;
    }
}

