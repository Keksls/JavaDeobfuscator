/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bCg
 */
class bcg_2
extends fo_1 {
    final /* synthetic */ bcf_1 d;

    bcg_2(bcf_1 bcf_12) {
        this.d = bcf_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        bcf_1.a(this.d, byteBuffer.getLong());
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        bcf_1.a(this.d).c(n2, n3, s2);
        this.d.K = byteBuffer.get() == 1;
        this.d.L = byteBuffer.get() == 1;
        uw_2 uw_22 = new uw_2();
        if (uw_22.b(byteBuffer)) {
            this.d.J = new bsx_2();
            if (!this.d.J.a(uw_22)) {
                a.error((Object)("Impossible de r\u00e9cup\u00e9rer les donn\u00e9es du RawDimensionalBag pour le sac id=" + this.d.a_()));
            }
        } else {
            a.error((Object)("Impossible de d\u00e9s\u00e9rialiser le RawDimensionalBag pour le sac id=" + this.d.a_()));
        }
        if ((bcf_1.b(this.d) == 2 || bcf_1.c(this.d) == 1) && this.d.x == 0) {
            this.d.aq();
        }
        this.d.x = bcf_1.d(this.d);
        this.d.ap();
    }
}

