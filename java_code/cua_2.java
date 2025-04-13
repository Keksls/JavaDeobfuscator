/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cua
 */
public class cua_2
extends ctj_2 {
    private long c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 28, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12787;
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
        return emd_1.e;
    }
}

