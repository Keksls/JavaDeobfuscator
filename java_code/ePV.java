/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePV
extends ePX {
    private boolean e = false;

    ePV(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.d.k());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s2 = byteBuffer.getShort();
        this.e = this.d.k() != 0 && this.d.k() != s2;
        this.d.c(s2);
    }

    @Override
    public void b() {
        if (this.e) {
            super.b();
        }
        this.e = false;
    }
}

