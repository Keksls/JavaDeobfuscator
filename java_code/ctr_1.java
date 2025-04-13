/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctR
 */
public class ctr_1
extends ctj_2 {
    private jk_0 c;

    @Override
    public int b() {
        return 13680;
    }

    @Override
    public emd_1 c() {
        return emd_1.N;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = jk_0.a(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 13680;
    }

    public jk_0 g() {
        return this.c;
    }
}

