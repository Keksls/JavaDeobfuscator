/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxH
 */
public class cxh_2
extends ps_0 {
    private long a;
    private byte[] b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.b);
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        return true;
    }

    @Override
    public int a() {
        return 13244;
    }

    public long b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public byte[] d() {
        return this.c;
    }
}

