/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from yo
 */
final class yo_2 {
    private long b = 0L;
    private String c = null;
    private boolean d = false;
    final /* synthetic */ yn_1 a;

    yo_2(yn_1 yn_12) {
        this.a = yn_12;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.get() == 1;
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10014) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

