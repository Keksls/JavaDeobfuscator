/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmM
 */
public class cmm_0
extends Pw {
    private final long a;
    private final boolean b;

    public cmm_0(long l, boolean bl) {
        this.a = l;
        this.b = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13851;
    }
}

