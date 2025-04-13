/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czy
 */
public final class czy_2
extends Pw {
    private final int a;

    public czy_2(int n) {
        this.a = n;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 15763;
    }
}

