/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuu
 */
public class cuu_1
extends ps_0 {
    private esd_1 a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = cdj_1.a(byteBuffer);
        return true;
    }

    public esd_1 b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12610;
    }
}

