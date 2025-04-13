/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czl
 */
public class czl_1
extends Pw {
    private byte a;

    public void a(byte by) {
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
        return 1121;
    }
}

