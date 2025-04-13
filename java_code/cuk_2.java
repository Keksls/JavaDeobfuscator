/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuk
 */
public class cuk_2
extends ctj_2 {
    private short c;
    private byte[] d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getShort();
        if (byteBuffer.remaining() > 0) {
            this.d = new byte[byteBuffer.getShort()];
            byteBuffer.get(this.d);
        }
        return true;
    }

    public byte[] g() {
        return this.d;
    }

    @Override
    public int a() {
        return 13930;
    }

    public short h() {
        return this.c;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.m;
    }
}

