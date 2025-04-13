/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bFv
extends fo_1 {
    final /* synthetic */ bfu_0 d;

    bFv(bfu_0 bfu_02) {
        this.d = bfu_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Pas de serialization dans le client");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.getInt();
        for (int k = 0; k < n2; ++k) {
            this.d.t.a(this.d.s.a(byteBuffer.getInt()));
        }
    }

    @Override
    public int j() {
        return 4 + this.d.t.a() * 4;
    }
}

