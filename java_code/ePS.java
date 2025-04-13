/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePS
extends ePX {
    private boolean e = false;

    ePS(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.d.s() ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.e = this.d.s() != bl;
        this.d.b(bl);
    }

    public void a() {
    }

    @Override
    public void b() {
        if (this.e) {
            super.b();
        }
        this.e = false;
    }
}

