/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBK
 */
public final class cbk_0
extends ps_0 {
    private byte[] a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.a);
        return true;
    }

    @Override
    public int a() {
        return 22671;
    }

    public byte[] b() {
        return this.a;
    }
}

