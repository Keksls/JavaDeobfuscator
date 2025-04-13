/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctT
 */
public class ctt_1
extends ctj_2 {
    private long c;
    private aej_2 d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = aej_2.a(byteBuffer.get());
        return true;
    }

    @Override
    public int a() {
        return 12910;
    }

    public long g() {
        return this.c;
    }

    public aej_2 h() {
        return this.d;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.h;
    }
}

