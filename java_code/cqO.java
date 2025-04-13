/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqO
extends Pw {
    private final int a;
    private final evn_2 b;
    private final long c;

    public cqO(int n, evn_2 evn_22, long l) {
        this.a = n;
        this.b = evn_22;
        this.c = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5 + this.b.a() + 8);
        byteBuffer.putInt(this.a);
        byteBuffer.put((byte)this.b.b().ordinal());
        this.b.a(byteBuffer);
        byteBuffer.putLong(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13758;
    }
}

