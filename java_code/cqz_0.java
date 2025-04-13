/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqZ
 */
public final class cqz_0
extends ps_0 {
    private fjf_0 a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fjf_0.a(byteBuffer.get());
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12083;
    }

    public fjf_0 b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

