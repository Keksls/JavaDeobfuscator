/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bBc
 */
class bbc_2
extends fo_1 {
    final /* synthetic */ bbb_2 d;

    bbc_2(bbb_2 bbb_22, int n) {
        this.d = bbb_22;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bbb_2.a(this.d).c(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.d.s = byteBuffer.getInt();
        this.d.u = byteBuffer.getInt();
        this.d.t = byteBuffer.getInt();
        this.d.u();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

