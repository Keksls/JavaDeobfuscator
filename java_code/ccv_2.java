/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ccv
 */
public class ccv_2 {
    final int a;
    final int[] b;
    final int[] c;

    public ccv_2(int n, int[] nArray, int[] nArray2) {
        this.a = n;
        this.b = nArray;
        this.c = nArray2;
    }

    ccv_2(ByteBuffer byteBuffer) {
        int n;
        this.a = byteBuffer.getInt();
        this.b = new int[byteBuffer.getInt()];
        for (n = 0; n < this.b.length; ++n) {
            this.b[n] = byteBuffer.getInt();
        }
        this.c = new int[byteBuffer.getInt()];
        for (n = 0; n < this.c.length; ++n) {
            this.c[n] = byteBuffer.getInt();
        }
    }

    public void a(gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a(this.b.length);
        for (int n : this.b) {
            gk_02.a(n);
        }
        gk_02.a(this.c.length);
        for (int n : this.c) {
            gk_02.a(n);
        }
    }

    public int[] a() {
        return this.b;
    }

    public int[] b() {
        return this.c;
    }
}

