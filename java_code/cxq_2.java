/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxQ
 */
public class cxq_2
extends ps_0 {
    private js a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.a = js.a(byArray2);
        return false;
    }

    public js b() {
        return this.a;
    }

    @Override
    public int a() {
        return 13009;
    }
}

