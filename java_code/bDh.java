/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class bDh
extends fo_1 {
    final /* synthetic */ bDg d;

    bDh(bDg bDg2, int n) {
        this.d = bDg2;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bDg.a(this.d).c(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        int n2 = this.d.r;
        this.d.r = byteBuffer.getInt();
        this.d.t = byteBuffer.getInt();
        this.d.s = byteBuffer.getInt();
        if (this.d.s == -1) {
            this.d.i(false);
        } else {
            this.d.i(true);
        }
        if (n2 != this.d.r) {
            this.d.Z();
        }
        this.d.aI_();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

