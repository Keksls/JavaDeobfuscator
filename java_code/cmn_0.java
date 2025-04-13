/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmN
 */
public final class cmn_0
extends Pw {
    private int a = -1;

    public void b(int n) {
        this.a = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12536;
    }
}

