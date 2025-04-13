/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpF
extends Pw {
    private String a;
    private short b;

    public void a(String string) {
        this.a = string;
    }

    public void a(short s2) {
        this.b = s2;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(3 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.putShort(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13484;
    }
}

