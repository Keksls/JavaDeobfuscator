/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwy
 */
public class cwy_2
extends ps_0 {
    private fcu_0 a;

    public fcu_0 b() {
        return this.a;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = fcu_0.a(byteBuffer.getLong());
        return true;
    }

    @Override
    public int a() {
        return 12678;
    }
}

