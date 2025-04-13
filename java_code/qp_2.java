/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qP
 */
class qp_2
extends fo_1 {
    final /* synthetic */ qo_2 d;

    qp_2(qo_2 qo_22) {
        this.d = qo_22;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.d.a(byteBuffer);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la s\u00e9rialisation de CharacterSerializedInventories");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedInventories", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.d.a(byteBuffer, n);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedInventories");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedInventories", exception);
        }
    }

    @Override
    public int j() {
        return this.d.b();
    }
}

