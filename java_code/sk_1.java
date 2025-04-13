/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from sk
 */
final class sk_1 {
    private long b = 0L;
    private long c = 0L;
    private short d = 0;
    private String e = null;
    private int f = 0;
    final /* synthetic */ si_1 a;

    sk_1(si_1 si_12) {
        this.a = si_12;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.d;
        this.a.f = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.e = new String(byArray, Charsets.UTF_8);
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.e = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10036013) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10058000) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

