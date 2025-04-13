/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bFj
 */
class bfj_0
extends fo_1 {
    final /* synthetic */ bFi d;

    bfj_0(bFi bFi2, int n) {
        this.d = bFi2;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.t = byteBuffer.getLong();
        this.d.f(this.d.t == 0L);
        blx_1 blx_12 = bmf_2.a().c(this.d.t);
        if (blx_12 == null) {
            return;
        }
        ead_0 ead_02 = blx_12.fl();
        if (ead_02 == null || ead_02.ac_() != 16) {
            return;
        }
        bql_2 bql_22 = (bql_2)ead_02;
        bql_22.a(this.d);
    }
}

