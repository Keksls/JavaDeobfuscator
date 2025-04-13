/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cmE
 */
public class cme_0
extends Pw {
    private long a;

    @Override
    public byte[] b() {
        int n = 8;
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12620;
    }

    public void a(long l) {
        this.a = l;
    }
}

