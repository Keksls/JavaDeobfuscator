/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sA
 */
class sa_2
extends fo_1 {
    final /* synthetic */ sz_2 d;

    sa_2(sz_2 sz_22) {
        this.d = sz_22;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.d.a(byteBuffer);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la s\u00e9rialisation de CharacterSerializedSex");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedSex", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.d.a(byteBuffer, n);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedSex");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedSex", exception);
        }
    }

    @Override
    public int j() {
        return this.d.b();
    }
}

