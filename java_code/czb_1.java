/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czB
 */
public class czb_1
extends Pw {
    private final long a;
    private final long b;

    public czb_1(long l, long l2) {
        this.a = l;
        this.b = l2;
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
        return 15925;
    }
}

