/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxU
 */
public class cxu_2
extends ps_0 {
    private short a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getShort();
        return true;
    }

    public short b() {
        return this.a;
    }

    @Override
    public int a() {
        return 13511;
    }
}

