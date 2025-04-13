/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class fcY
extends fbu_0 {
    final /* synthetic */ fcm_0 a;

    public fcY(fcm_0 fcm_02) {
        this.a = fcm_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.getInt();
        for (int k = 0; k < n2; ++k) {
            long l = byteBuffer.getLong();
            long l2 = byteBuffer.getLong();
            this.a.c(l, l2);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("[NATION] Pas de s\u00e9rialization de la part VoteUpdatePart de base, cel\u00e0 ne se fait que dans le global");
    }

    @Override
    public int bg_() {
        return 0;
    }
}

