/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cnI
extends Pw {
    private long a;
    private aff_1 b;
    private int c;

    public void a(long l) {
        this.a = l;
    }

    public void a(aff_1 aff_12) {
        this.b = aff_12;
    }

    public void b(int n) {
        this.c = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(22);
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b.d());
        byteBuffer.putInt(this.b.e());
        byteBuffer.putShort(this.b.f());
        byteBuffer.putInt(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12254;
    }
}

