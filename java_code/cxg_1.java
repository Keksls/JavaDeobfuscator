/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxg
 */
public class cxg_1
extends ps_0 {
    private long a;
    private dw_1 b;

    public long b() {
        return this.a;
    }

    public dw_1 c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.b = dw_1.a(byArray2);
        return false;
    }

    @Override
    public int a() {
        return 12596;
    }
}

