/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cud
 */
public class cud_2
extends ctj_2 {
    private long c;

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.o;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12747;
    }

    public long g() {
        return this.c;
    }
}

