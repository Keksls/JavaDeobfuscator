/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePT
extends ePX {
    ePT(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.d.p());
        byteBuffer.putInt(this.d.q());
        byteBuffer.putInt(this.d.d());
        byteBuffer.putInt(this.d.t());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.b(byteBuffer.getInt());
        this.d.c(byteBuffer.getInt());
        this.d.a(byteBuffer.getInt());
        this.d.d(byteBuffer.getInt());
        this.b();
    }

    @Override
    public int j() {
        return 16;
    }
}

