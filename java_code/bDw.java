/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bDw
extends fo_1 {
    final /* synthetic */ bdv_0 d;

    bDw(bdv_0 bdv_02) {
        this.d = bdv_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas passer par ici");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.s = byteBuffer.getLong();
    }
}

