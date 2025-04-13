/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cub
 */
public class cub_2
extends ctj_2 {
    private long c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12399;
    }

    public long g() {
        return this.c;
    }

    public long h() {
        return this.d;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.l;
    }
}

