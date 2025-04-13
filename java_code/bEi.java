/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bEi
extends fo_1 {
    final /* synthetic */ bEh d;

    bEi(bEh bEh2, int n) {
        this.d = bEh2;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.s = byteBuffer.getInt();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

