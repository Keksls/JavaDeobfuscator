/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;

/*
 * Renamed from bnx
 */
final class bnx_1
extends eqk_2 {
    private final rg_1 b;
    private final TIntArrayList c = new TIntArrayList();
    final /* synthetic */ bnh_1 a;

    bnx_1(bnh_1 bnh_12, rg_1 rg_12) {
        this.a = bnh_12;
        this.b = rg_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("[NATION] La Part NationEnemy ne devrait pas \u00e9tre s\u00e9rialis\u00e9e par le client.");
    }

    @Override
    public void b() {
        int n;
        int n2;
        bUH bUH2 = (bUH)this.a.fE();
        ArrayList<rj_1> arrayList = this.b.c;
        this.c.add(bUH2.E());
        for (rj_1 rj_12 : arrayList) {
            n2 = rj_12.a;
            n = rj_12.b;
            int n3 = bUH2.b(n2, n);
            ahx_2.a(this.c, n2);
            if (n3 == n) continue;
            bUH2.a(n2, n3);
            this.a(n2, n3, n);
        }
        int n4 = this.c.size();
        for (int k = 0; k < n4; ++k) {
            n2 = this.c.get(k);
            n = bUH2.b(n2, 0);
            bUH2.a(n2, n);
        }
        this.c.clear();
        bUH2.i();
    }

    private void a(int n, int n2, int n3) {
        fbm_0 fbm_02;
        if (this.a.bo()) {
            return;
        }
        int n4 = azu_0.j().k().bM();
        if (n4 == 0) {
            return;
        }
        if (n4 != this.a.fI()) {
            return;
        }
        if (n4 != n) {
            return;
        }
        fbm_0 fbm_03 = fbo_0.a().a(n2);
        if (fbm_03 == (fbm_02 = fbo_0.a().a(n3))) {
            return;
        }
        if (!fbm_03.a(fbs_0.g) && fbm_02.a(fbs_0.g)) {
            String string = bae.h().a(fbm_02.a(), new Object[0]);
            String string2 = bae.h().a("nation.remoteCriminal", this.a.dp(), string);
            aul_0.a().e(string2);
        }
    }
}

