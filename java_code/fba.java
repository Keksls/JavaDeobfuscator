/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class fba
extends fbu_0 {
    final /* synthetic */ faX a;

    fba(faX faX2) {
        this.a = faX2;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.a.b(byteBuffer.getInt());
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a.c());
    }

    @Override
    public int bg_() {
        return 4;
    }
}

