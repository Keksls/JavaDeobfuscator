/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyo
 */
public class cyo_1
extends ps_0 {
    private long a;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length < 8) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12416;
    }

    public long b() {
        return this.a;
    }
}

