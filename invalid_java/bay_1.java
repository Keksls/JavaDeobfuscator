/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bAY
 */
class bay_1
extends fo_1 {
    final /* synthetic */ bax_1 d;

    bay_1(bax_1 bax_12, int n) {
        this.d = bax_12;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bax_1.a(this.d).c(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.d.s = byteBuffer.getInt();
        byte[] byArray = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray);
        String string = Cz.a(byArray);
        bax_1.a(this.d, string != null ? string.intern() : null);
        this.d.u();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

