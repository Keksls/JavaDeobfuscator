/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePU
extends ePX {
    private byte[] e;

    public ePU(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.d.o());
        byteBuffer.putLong(this.d.f());
        byteBuffer.put((byte)this.e.length);
        byteBuffer.put(this.e);
        byteBuffer.putShort(this.d.c());
        byteBuffer.put((byte)(this.d.w() ? 1 : 0));
        byteBuffer.put(this.d.z());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.b(byteBuffer.getLong());
        this.d.c(byteBuffer.getLong());
        this.e = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(this.e);
        this.d.a(Cz.a(this.e));
        this.d.b(byteBuffer.getShort());
        this.d.d(byteBuffer.get() == 1);
        this.d.b(byteBuffer.get());
    }

    @Override
    public int j() {
        this.e = Cz.a(this.d.a());
        return 21 + this.e.length + 2 + 1;
    }
}

