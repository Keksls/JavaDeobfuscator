/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bEX
extends fo_1 {
    final /* synthetic */ bew_0 d;

    bEX(bew_0 bew_02) {
        this.d = bew_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas passer par ici");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        ((bgj_0)this.d.aG_()).a(byteBuffer.getShort());
    }
}

