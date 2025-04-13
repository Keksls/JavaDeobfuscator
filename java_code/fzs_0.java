/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from fzS
 */
public final class fzs_0 {
    private static final fzs_0 a = new fzs_0();
    private final TIntObjectHashMap<ArrayList<fzm_0>> b = new TIntObjectHashMap();

    private fzs_0() {
    }

    public static fzs_0 a() {
        return a;
    }

    public fzm_0 a(fzn_0 fzn_02) {
        Object object;
        if (fzn_02.k() && (object = this.a(fzn_02.a())) != null) {
            int n = ((ArrayList)object).size();
            for (int k = 0; k < n; ++k) {
                fzm_0 fzm_02 = (fzm_0)((ArrayList)object).get(k);
                if (fzm_02.d() >= fzn_02.b()) {
                    return null;
                }
                if (!fzm_02.e()) continue;
                fzm_02.f();
                break;
            }
        }
        object = fpm_0.b().b(fzn_02);
        this.b((fzm_0)object);
        return object;
    }

    private void b(fzm_0 fzm_02) {
        ahx_2.a(this.b, fzm_02.c(), fzm_02);
    }

    public void a(fzm_0 fzm_02) {
        ArrayList arrayList = (ArrayList)this.b.get(fzm_02.c());
        if (arrayList == null) {
            return;
        }
        arrayList.remove(fzm_02);
    }

    private ArrayList<fzm_0> a(int n) {
        return (ArrayList)this.b.get(n);
    }

    public Optional<fzm_0> a(int n, String string) {
        ArrayList<fzm_0> arrayList = this.a(n);
        if (arrayList == null || arrayList.isEmpty()) {
            return Optional.empty();
        }
        return arrayList.stream().filter(fzm_02 -> fzm_02.b() != null && string.equals(fzm_02.b().g())).findFirst();
    }
}

