/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cpY
extends Pw {
    private final int a;
    private final long b;
    private final int c;
    private final int e;
    private final short f;
    private final int g;

    public cpY(int n, long l, int n2, int n3, short s2, int n4) {
        this.a = n;
        this.b = l;
        this.c = n2;
        this.e = n3;
        this.f = s2;
        this.g = n4;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
        byteBuffer.putShort(this.f);
        byteBuffer.putInt(this.g);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12343;
    }
}

