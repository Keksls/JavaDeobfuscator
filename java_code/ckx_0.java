/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckX
 */
public class ckx_0
extends ps_0 {
    private long a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.b);
        return false;
    }

    @Override
    public int a() {
        return 523;
    }

    public long b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }
}

