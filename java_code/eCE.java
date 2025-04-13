/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class eCE {
    private final long a;
    private final long b;
    private eCL c;
    private final wt_0 d = new wt_0(wt_0.c);

    public eCE(long l, long l2) {
        this.a = l;
        this.b = l2;
    }

    public long a() {
        return this.a;
    }

    public eCL b() {
        return this.c;
    }

    public void a(eCL eCL2) {
        this.c = eCL2;
    }

    public wt_0 c() {
        return this.d;
    }

    public void a(wu_0 wu_02) {
        this.d.a(wu_02);
    }

    public long d() {
        return this.b;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.c.a());
        byteBuffer.putLong(this.d.h());
    }
}

