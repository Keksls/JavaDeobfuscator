/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmc
extends Pw {
    private int a;
    private int b;
    private short c;
    private short e;

    public void a(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public void a(short s2, short s3) {
        this.c = s2;
        this.e = s3;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.e);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12766;
    }
}

