/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bCE
 */
class bce_1
extends fo_1 {
    final /* synthetic */ bcd_1 d;

    bce_1(bcd_1 bcd_12, int n) {
        this.d = bcd_12;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => client par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bcd_1.a(this.d, byteBuffer.getShort());
        boolean bl = byteBuffer.get() == 1;
        this.d.f(bl);
        this.d.g(bl);
    }
}

