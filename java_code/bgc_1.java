/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bGc
 */
class bgc_1
extends fo_1 {
    final /* synthetic */ bFZ d;

    bgc_1(bFZ bFZ2) {
        this.d = bFZ2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        wz_2 wz_22 = new wz_2();
        wz_22.b(byteBuffer);
        this.d.aG_().a(wz_22);
    }
}

