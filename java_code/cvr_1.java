/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvr
 */
public class cvr_1
extends ps_0 {
    private byte a;
    private vf_2 b;
    private short c;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.c = byteBuffer.getShort();
        if (byteBuffer.hasRemaining()) {
            this.b = new vf_2();
            this.b.b(byteBuffer);
        }
        return true;
    }

    @Override
    public int a() {
        return 12945;
    }

    public vf_2 b() {
        return this.b;
    }

    public short c() {
        return this.c;
    }

    public byte d() {
        return this.a;
    }
}

