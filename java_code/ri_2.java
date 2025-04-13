/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rI
 */
final class ri_2 {
    private int[] b = null;
    private int[] c = null;
    private int[] d = null;
    final /* synthetic */ rg_2 a;

    ri_2(rg_2 rg_22) {
        this.a = rg_22;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.b = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.b[n] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        if ((n = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.c = new int[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10026000) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

