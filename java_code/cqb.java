/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqb
extends Pw {
    private String a;
    private byte b;
    private short c;

    public void a(String string) {
        this.a = string;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(short s2) {
        this.c = s2;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 + byArray.length);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put(this.b);
        byteBuffer.putShort(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12838;
    }
}

