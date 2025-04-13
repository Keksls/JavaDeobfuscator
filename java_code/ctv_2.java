/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctv
 */
public class ctv_2
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
        return 13225;
    }

    public byte[] b() {
        return this.b;
    }
}

