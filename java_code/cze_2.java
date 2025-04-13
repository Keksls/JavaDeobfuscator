/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czE
 */
public class cze_2
extends Pw {
    private final long a;

    public cze_2(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14415;
    }
}

