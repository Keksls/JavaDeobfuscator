/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rW
 */
class rw_1
extends fo_1 {
    final /* synthetic */ rv_1 d;

    rw_1(rv_1 rv_12) {
        this.d = rv_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.d.a(byteBuffer);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la s\u00e9rialisation de CharacterSerializedPreviousPosition");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedPreviousPosition", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.d.a(byteBuffer, n);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedPreviousPosition");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedPreviousPosition", exception);
        }
    }

    @Override
    public int j() {
        return this.d.b();
    }
}

