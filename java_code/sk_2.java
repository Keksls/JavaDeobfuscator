/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from sK
 */
final class sk_2 {
    private int b = 0;
    private int[] c = null;
    private int[] d = null;
    private String e = null;
    private int f = 0;
    final /* synthetic */ sj_1 a;

    sk_2(sj_1 sj_12) {
        this.a = sj_12;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.c = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.c[n] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        if ((n = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.d = new int[n];
            for (int k = 0; k < n; ++k) {
                this.d[k] = byteBuffer.getInt();
            }
        } else {
            this.d = null;
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        this.b = byteBuffer.getInt();
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.c = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.c[n2] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        if ((n2 = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.d = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.d[n] = byteBuffer.getInt();
            }
        } else {
            this.d = null;
        }
        n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.e = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10043003) {
            return false;
        }
        if (n < 10047000) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10056000) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

