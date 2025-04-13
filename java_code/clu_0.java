/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clu
 */
public class clu_0
extends Pw {
    private final long a;

    public clu_0(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        int n = 8;
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13302;
    }
}

