/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuT
 */
public class cut_1
extends ps_0 {
    private long a;
    private byte[] b;

    public long d() {
        return this.a;
    }

    public byte[] e() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        return true;
    }

    protected void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.b = new byte[n];
            byteBuffer.get(this.b);
        } else {
            this.b = null;
        }
    }

    @Override
    public int a() {
        return 12274;
    }
}

