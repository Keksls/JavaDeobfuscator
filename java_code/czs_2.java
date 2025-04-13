/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czs
 */
public class czs_2
extends Pw {
    private long a;
    private wt_0 b;

    public void a(long l) {
        this.a = l;
    }

    public void a(wu_0 wu_02) {
        this.b = new wt_0(wu_02);
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b.h());
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 1103;
    }
}

