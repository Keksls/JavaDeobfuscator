/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cug
 */
public class cug_2
extends ctj_2 {
    private int c;
    private byte[] d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getInt();
        this.d = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.d);
        return true;
    }

    @Override
    public int a() {
        return 13337;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public emd_1 c() {
        return emd_1.s;
    }

    public int g() {
        return this.c;
    }

    public byte[] h() {
        return this.d;
    }
}

