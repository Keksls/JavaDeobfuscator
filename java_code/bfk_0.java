/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bFK
 */
class bfk_0
extends fo_1 {
    final /* synthetic */ bFJ d;

    bfk_0(bFJ bFJ2, int n) {
        this.d = bFJ2;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.w = byteBuffer.get() == 1;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

