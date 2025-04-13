/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class Pq
extends Pw {
    private String a;
    private byte b;

    @Override
    public byte[] b() {
        byte[] byArray = this.a.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.allocate(byArray.length + 2);
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
        return this.a(this.b, byteBuffer.array());
    }

    @Override
    public int a() {
        return 394;
    }

    public void a(String string) {
        this.a = string;
    }

    public void a(byte by) {
        this.b = by;
    }
}

