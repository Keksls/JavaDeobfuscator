/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvy
 */
public class cvy_1
extends ps_0 {
    private eAW a;
    private mg_0 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eAW.a(byteBuffer.get());
        if (this.a != eAW.a) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.b = mg_0.a(byArray2);
        return false;
    }

    public mg_0 b() {
        return this.b;
    }

    public eAW c() {
        return this.a;
    }

    @Override
    public int a() {
        return 12743;
    }
}

