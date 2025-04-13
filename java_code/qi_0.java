/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qi
 */
public class qi_0
extends qg_0 {
    private boolean a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length == 0) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.get() > 0;
        this.a = byteBuffer.get() > 0;
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        return super.a(byArray2);
    }

    @Override
    public int a() {
        return 760;
    }

    public boolean j() {
        return this.a;
    }

    public boolean k() {
        return this.b;
    }
}

