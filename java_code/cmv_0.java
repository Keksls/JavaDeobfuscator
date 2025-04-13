/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmV
 */
public final class cmv_0
extends Pw {
    private final int a;
    private final boolean b;

    public cmv_0(int n, boolean bl) {
        this.a = n;
        this.b = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12212;
    }
}

