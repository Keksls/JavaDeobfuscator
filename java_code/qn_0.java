/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qn
 */
public class qn_0
extends ps_0 {
    private short a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getShort();
        return true;
    }

    @Override
    public int a() {
        return 785;
    }

    public short b() {
        return this.a;
    }
}

