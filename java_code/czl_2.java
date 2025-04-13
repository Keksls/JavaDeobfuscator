/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czL
 */
public class czl_2
extends Pw {
    private final byte a;

    public czl_2(byte by) {
        this.a = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1);
        byteBuffer.put(this.a);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 15077;
    }
}

