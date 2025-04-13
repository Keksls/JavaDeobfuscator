/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cux
 */
public class cux_2
extends ps_0 {
    private ese_1 a;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = esw_2.d(byteBuffer);
        return true;
    }

    public ese_1 b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12558;
    }
}

