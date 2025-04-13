/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePR
extends ePX {
    private boolean e = false;

    ePR(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.d.l());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s2 = byteBuffer.getShort();
        this.e = s2 != -1 && s2 != this.d.l();
        this.d.a(s2);
    }

    @Override
    public void b() {
        if (this.e) {
            super.b();
        }
        this.e = false;
    }
}

