/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cox
extends Pw {
    private long a;
    private short b;
    private long c;
    private faO e;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putLong(this.c);
        byteBuffer.put(this.e.a());
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13488;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void b(long l) {
        this.c = l;
    }

    public void a(faO faO2) {
        this.e = faO2;
    }
}

