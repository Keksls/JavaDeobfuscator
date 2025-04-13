/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bCS
 */
class bcs_1
extends fo_1 {
    final /* synthetic */ bcr_1 d;

    bcs_1(bcr_1 bcr_12) {
        this.d = bcr_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        up_2 up_22 = new up_2();
        up_22.b(byteBuffer);
        int n2 = this.d.w;
        this.d.w = up_22.a;
        this.d.a(n2, this.d.w, up_22.b);
    }
}

