/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwZ
 */
public class cwz_1
extends ps_0 {
    private byte a;
    private long b;

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        if (this.a == 0) {
            byte[] byArray2 = new byte[byteBuffer.getShort() & 0xFFFF];
            byteBuffer.get(byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 12578;
    }
}

