/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csG
 */
public class csg_0
extends ps_0 {
    private short a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getShort();
        this.b = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.b);
        return true;
    }

    public short b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13072;
    }
}

