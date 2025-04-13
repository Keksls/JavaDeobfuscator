/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePQ
extends ePX {
    private boolean e = false;

    ePQ(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.d.r() ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.e = this.d.r() != bl;
        this.d.c(bl);
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

