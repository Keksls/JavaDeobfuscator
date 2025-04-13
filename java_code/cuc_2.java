/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuc
 */
public class cuc_2
extends ctj_2 {
    private long c;
    private int d;
    private int e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13079;
    }

    public long g() {
        return this.c;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.k;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }
}

