/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from bAU
 */
class bau_1
extends fo_1 {
    final /* synthetic */ bat_2 d;

    bau_1(bat_2 bat_22) {
        this.d = bat_22;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        tl_2 tl_22 = new tl_2();
        tl_22.b(byteBuffer);
        ArrayList<tm_2> arrayList = tl_22.a;
        this.d.s = new int[arrayList.size()];
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            this.d.s[k] = arrayList.get((int)k).a;
        }
        this.d.u();
    }
}

