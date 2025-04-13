/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctu
 */
public class ctu_1
extends csy_2 {
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.b);
        return true;
    }

    @Override
    public int a() {
        return 12522;
    }

    public byte[] b() {
        return this.b;
    }
}

