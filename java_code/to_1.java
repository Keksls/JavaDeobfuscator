/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from to
 */
class to_1
extends fo_1 {
    final /* synthetic */ tn_1 d;

    to_1(tn_1 tn_12) {
        this.d = tn_12;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.d.a(byteBuffer);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la s\u00e9rialisation de NPCSerializedCollect");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de NPCSerializedCollect", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.d.a(byteBuffer, n);
            if (bl) {
                this.g();
            } else {
                this.a("Erreur lors de la d\u00e9s\u00e9rialisation de NPCSerializedCollect");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de NPCSerializedCollect", exception);
        }
    }

    @Override
    public int j() {
        return this.d.b();
    }
}

