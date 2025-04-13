/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuf
 */
public class cuf_2
extends ctj_2 {
    private int d;
    byte[] c;
    private boolean e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.e = byteBuffer.get() == 1;
        this.d = byteBuffer.getInt();
        this.c = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.c);
        return true;
    }

    @Override
    public int a() {
        return 13274;
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public emd_1 c() {
        return emd_1.d;
    }

    public int g() {
        return this.d;
    }

    public byte[] h() {
        return this.c;
    }

    public boolean i() {
        return this.e;
    }
}

