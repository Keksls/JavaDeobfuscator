/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class faZ
extends fbu_0 {
    final /* synthetic */ faX a;

    faZ(faX faX2) {
        this.a = faX2;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.a.p = byteBuffer.getShort();
        this.a.q = byteBuffer.getInt();
        this.a.r = byteBuffer.getInt();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a.p);
        byteBuffer.putInt(this.a.q);
        byteBuffer.putInt(this.a.r);
    }

    @Override
    public int bg_() {
        return 10;
    }
}

