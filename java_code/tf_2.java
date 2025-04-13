/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tf
 */
class tf_2
extends fo_1 {
    final /* synthetic */ te_1 d;

    tf_2(te_1 te_12) {
        this.d = te_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.d.a(byteBuffer);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la s\u00e9rialisation de CharacterSerializedXpCharacteristics");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedXpCharacteristics", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.d.a(byteBuffer, n);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedXpCharacteristics");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedXpCharacteristics", exception);
        }
    }

    @Override
    public int j() {
        return this.d.b();
    }
}

