/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortShortHashMap
 *  gnu.trove.procedure.TShortShortProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortShortHashMap;
import gnu.trove.procedure.TShortShortProcedure;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class enG
extends yg_0 {
    private static final Logger i = Logger.getLogger(enG.class);
    private final TShortShortHashMap j = new TShortShortHashMap();

    public enG(int n, int n2) {
        this.d = n * 18;
        this.e = n2 * 18;
    }

    public void a(int n, int n2, short s2) {
        assert (this.b(n, n2));
        short s3 = this.e(n, n2);
        this.j.put(s3, s2);
    }

    @Override
    public int a(int n, int n2, ys_0[] ys_0Array, int n3) {
        assert (this.a(n, n2, ys_0Array));
        ys_0 ys_02 = ys_0Array[n3];
        ys_02.a = n;
        ys_02.b = n2;
        ys_02.c = this.d(n, n2);
        boolean bl = this.a(n, n2);
        ys_02.z = (byte)(bl ? -1 : 7);
        ys_02.e = false;
        ys_02.d = (byte)(bl ? 127 : 0);
        ys_02.A = 0;
        ys_02.B = 0;
        return 1;
    }

    @Override
    public short c(int n, int n2) {
        return 0;
    }

    @Override
    public int a(int n, int n2, yt_0[] yt_0Array, int n3) {
        assert (this.a(n, n2, yt_0Array));
        yt_0 yt_02 = yt_0Array[n3];
        yt_02.a = n;
        yt_02.b = n2;
        yt_02.c = this.d(n, n2);
        yt_02.e = false;
        yt_02.d = (byte)(this.a(n, n2) ? 127 : 0);
        return 1;
    }

    public void a(abx_2 abx_22) {
        int n = this.j.size();
        abx_22.a((short)n);
        this.j.forEachEntry((TShortShortProcedure)new enH(this, abx_22));
    }

    public void a(ByteBuffer byteBuffer) {
        assert (this.j.isEmpty());
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            this.j.put(s2, s3);
        }
    }

    @Override
    public final boolean a(int n, int n2) {
        if (!this.j.contains(this.e(n, n2))) {
            return true;
        }
        return super.a(n, n2);
    }

    public final short d(int n, int n2) {
        short s2 = this.e(n, n2);
        short s3 = this.j.get(s2);
        if (s3 != 0) {
            return s3;
        }
        return this.j.contains(s2) ? s3 : (short)Short.MIN_VALUE;
    }

    private short e(int n, int n2) {
        byte by = (byte)(n - this.d);
        byte by2 = (byte)(n2 - this.e);
        return Hw.c(by, by2);
    }
}

