/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.procedure.TObjectIntProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from bGU
 */
class bgu_1
extends fo_1 {
    final /* synthetic */ bgt_1 d;

    bgu_1(bgt_1 bgt_12) {
        this.d = bgt_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n2) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.d.a = fcq_0.b(byteBuffer);
        }
        this.d.a();
        if (bl) {
            biZ.a(fcu_0.a, this.d.a.c(), (TObjectIntProcedure<exh_2>)((TObjectIntProcedure)(exh_22, n) -> {
                this.d.a(exh_22.A, n);
                return true;
            }));
        }
        this.d.b().u();
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => pas de s\u00e9rialisation");
    }
}

