/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eLz
extends fo_1 {
    final /* synthetic */ eLu d;

    eLz(eLu eLu2) {
        this.d = eLu2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        wu_0 wu_02 = this.d.b.m();
        if (wu_02 != null) {
            byteBuffer.putLong(wu_02.h());
        } else {
            byteBuffer.putLong(0L);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.d.b == null) {
            this.d.b = eLu.j.b();
        }
        long l = byteBuffer.getLong();
        this.d.b.b(wt_0.b(l));
    }

    @Override
    public int j() {
        return 8;
    }
}

