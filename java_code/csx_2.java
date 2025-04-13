/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csX
 */
public abstract class csx_2
extends csy_2 {
    private long b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.c);
        return false;
    }

    public long b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }
}

