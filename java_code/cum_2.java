/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuM
 */
public class cum_2
extends ps_0 {
    private byte a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        return false;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13485;
    }
}

