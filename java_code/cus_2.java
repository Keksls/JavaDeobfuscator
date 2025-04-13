/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cus
 */
public class cus_2
extends ps_0 {
    private byte[] a;
    private byte[] b;
    private long[] c;
    private esm_2 d;

    @Override
    public boolean a(byte[] byArray) {
        int n;
        short s2;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        short s3 = byteBuffer.getShort();
        if (s3 != 0) {
            this.a = new byte[s3];
            byteBuffer.get(this.a);
        }
        if ((s2 = byteBuffer.getShort()) != 0) {
            this.b = new byte[s2];
            byteBuffer.get(this.b);
        }
        if ((n = byteBuffer.getShort()) != 0) {
            this.c = new long[n];
            for (int k = 0; k < n; ++k) {
                this.c[k] = byteBuffer.getLong();
            }
        }
        this.d = esm_2.a(byteBuffer);
        return true;
    }

    public byte[] b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public long[] d() {
        return this.c;
    }

    public esm_2 e() {
        return this.d;
    }

    @Override
    public int a() {
        return 12447;
    }
}

