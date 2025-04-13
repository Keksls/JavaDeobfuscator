/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cti
 */
public class cti_2
extends ctj_1 {
    private byte b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.b = byteBuffer.get();
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        return true;
    }

    @Override
    public int a() {
        return 13406;
    }

    public byte b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }
}

