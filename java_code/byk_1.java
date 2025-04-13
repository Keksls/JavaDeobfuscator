/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from byK
 */
class byk_1
implements agw {
    final /* synthetic */ long a;
    final /* synthetic */ byj_1 b;

    byk_1(byj_1 byj_12, long l) {
        this.b = byj_12;
        this.a = l;
    }

    @Override
    public void a(byte[] byArray) {
        azk_2 azk_22 = this.a(byArray, this.a);
        if (azk_22 == null) {
            return;
        }
        long l = this.a();
        ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), l, azk_22, true);
        this.b.p.a(this.a, l);
        azk_22.u();
        this.a(this.a, ays_22, null);
    }

    private long a() {
        return auc_1.d("CharacterImage-" + byj_1.m++);
    }

    private azk_2 a(byte[] byArray, long l) {
        azk_2 azk_22 = azk_2.a(byArray, "PNG");
        if (azk_22 == null) {
            this.a(l, null, "Impossible de charger l'image.");
            return null;
        }
        return azk_22;
    }

    private void a(long l, ays_2 ays_22, String string) {
        ArrayList<byl_1> arrayList = this.b.o.e(l);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            byl_1 byl_12 = arrayList.get(k);
            byl_12.a(ays_22, string);
        }
    }
}

