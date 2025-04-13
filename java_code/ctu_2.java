/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctU
 */
public class ctu_2
extends ctj_2 {
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 13, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12482;
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
        return emd_1.g;
    }
}

