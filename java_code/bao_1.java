/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAO
 */
class bao_1
extends fo_1 {
    final /* synthetic */ ban_1 d;

    bao_1(ban_1 ban_12, int n) {
        this.d = ban_12;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.w = new wt_0(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.getShort());
        this.d.J = new wt_0(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.getShort());
        this.d.v = byteBuffer.get() == 0;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

