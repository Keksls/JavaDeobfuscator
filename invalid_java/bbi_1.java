/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bBI
 */
class bbi_1
extends fo_1 {
    final /* synthetic */ bbh_2 d;

    bbi_1(bbh_2 bbh_22, int n) {
        this.d = bbh_22;
        super(n);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => client par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.a(byteBuffer);
        switch (bbh_2.a(this.d)) {
            case 0: 
            case 1: {
                this.d.b(true);
                this.d.g(true);
                this.d.a(TI.b);
                break;
            }
            case 2: {
                this.d.b(false);
                this.d.g(false);
                bwh_0 bwh_02 = bwj_1.a().a(this.d.H);
                tg_0 tg_02 = bwh_02.g();
                if (!this.d.a(bwh_02)) {
                    if (bwh_02 instanceof bvx_2) {
                        ((bvx_2)bwh_02).k(this.d.a_());
                    }
                    return;
                }
                baa_0.a().a(this.d.H, (aku_1)new bbj_2(this, alc_1.q(), 0, 0, tg_02));
                this.d.a(TI.a);
            }
        }
    }
}

