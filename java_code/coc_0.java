/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coc
 */
public class coc_0
extends Pw {
    private final long a;
    private final big_1 b;

    public coc_0(long l, big_1 big_12) {
        this.a = l;
        this.b = big_12;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12 + this.b.b());
        byteBuffer.putInt(this.b.j());
        byteBuffer.putLong(this.a);
        this.b.a(byteBuffer);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13373;
    }
}

