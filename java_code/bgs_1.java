/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bGS
 */
class bgs_1
extends fo_1 {
    final /* synthetic */ bgr_1 d;

    bgs_1(bgr_1 bgr_12) {
        this.d = bgr_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.d.a = bl ? eEw.b(byteBuffer) : null;
        this.d.b().u();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

