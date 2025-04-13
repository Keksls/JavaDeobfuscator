/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuN
 */
public class cun_1
extends ctj_2 {
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getInt();
        return true;
    }

    public int g() {
        return this.c;
    }

    @Override
    public int a() {
        return 13941;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.as;
    }
}

