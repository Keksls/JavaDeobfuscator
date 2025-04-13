/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czw
 */
public class czw_2
extends Pw {
    long a;
    long b;

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1135;
    }
}

