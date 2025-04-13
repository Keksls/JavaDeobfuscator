/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAq
 */
class baq_2
extends fo_1 {
    final /* synthetic */ bap_2 d;

    baq_2(bap_2 bap_22) {
        this.d = bap_22;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        bap_2.a(this.d).c(n2, n3, s2);
        this.d.a(aej_2.a(byteBuffer.get()));
        this.d.s = byteBuffer.getLong();
        this.d.q = byteBuffer.get() == 1;
        this.d.a(byteBuffer);
    }
}

