/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cna
extends Pw {
    private long a;
    private aej_2 b;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.a);
        byteBuffer.put((byte)this.b.l);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12348;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(aej_2 aej_22) {
        this.b = aej_22;
    }
}

