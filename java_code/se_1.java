/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from se
 */
class se_1
extends fo_1 {
    final /* synthetic */ sd_2 d;

    se_1(sd_2 sd_22) {
        this.d = sd_22;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.d.a(byteBuffer);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la s\u00e9rialisation de CharacterSerializedProtoTemporaryInventory");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedProtoTemporaryInventory", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.d.a(byteBuffer, n);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedProtoTemporaryInventory");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedProtoTemporaryInventory", exception);
        }
    }

    @Override
    public int j() {
        return this.d.b();
    }
}

