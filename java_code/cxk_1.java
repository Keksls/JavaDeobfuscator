/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxk
 */
public class cxk_1
extends ps_0 {
    private long a;
    private byte b;

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        return true;
    }

    @Override
    public int a() {
        return 12788;
    }
}

