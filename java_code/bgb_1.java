/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bGb
 */
class bgb_1
extends fo_1 {
    final /* synthetic */ bFZ d;

    bgb_1(bFZ bFZ2) {
        this.d = bFZ2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.a(byteBuffer.getShort());
        this.d.f(byteBuffer.get() == 1);
        this.d.d(byteBuffer.get() == 1);
        this.d.e(byteBuffer.get() == 1);
        this.d.g(byteBuffer.get() == 1);
        this.d.b(byteBuffer.get() == 1);
        this.d.a_(byteBuffer.get());
        int n2 = byteBuffer.getInt();
        for (int k = 0; k < n2; ++k) {
            this.d.a(eud_1.a(byteBuffer.get()));
        }
    }
}

