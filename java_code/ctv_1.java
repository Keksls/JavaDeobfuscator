/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctV
 */
public class ctv_1
extends ctj_2 {
    private long c;
    private long[] d;
    private aff_1 e;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 29, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        long l = byteBuffer.getLong();
        this.e = apb_2.a(l);
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            A.warn((Object)"Aucun fighter le d\u00e9tecte l'invisibilit\u00e9 ?");
        }
        if (!this.a(byteBuffer.remaining(), 8 * n, true)) {
            return false;
        }
        this.d = new long[n];
        for (int n2 = 0; n2 < n; n2 = (int)((byte)(n2 + 1))) {
            this.d[n2] = byteBuffer.getLong();
        }
        return true;
    }

    @Override
    public int a() {
        return 12003;
    }

    public long g() {
        return this.c;
    }

    public long[] h() {
        return this.d;
    }

    public aff_1 i() {
        return this.e;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.M;
    }
}

