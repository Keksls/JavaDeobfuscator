/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * Renamed from eWp
 */
final class ewp_1
implements ewx_2,
exa_2 {
    private final List<ewy_2> a = new ArrayList<ewy_2>();
    private boolean b;
    private final TIntObjectHashMap<ewz_2> c = new TIntObjectHashMap();

    ewp_1() {
    }

    @Override
    public boolean a(TObjectProcedure<ewz_2> tObjectProcedure) {
        return this.c.forEachValue(tObjectProcedure);
    }

    @Override
    public void a(Consumer<ewz_2> consumer) {
        this.c.valueCollection().forEach(consumer);
    }

    @Override
    public ewz_2 a(int n) {
        return (ewz_2)this.c.get(n);
    }

    void a(ewz_2 ewz_22) {
        this.c.put(ewz_22.a(), (Object)ewz_22);
        ewz_22.a(this);
        this.c(ewz_22);
    }

    void b(ewz_2 ewz_22) {
        this.c.remove(ewz_22.a());
        ewz_22.b(this);
        this.d(ewz_22);
    }

    void a() {
        this.c.clear();
    }

    private void c(ewz_2 ewz_22) {
        if (this.b) {
            return;
        }
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).a(ewz_22);
        }
    }

    private void d(ewz_2 ewz_22) {
        if (this.b) {
            return;
        }
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).b(ewz_22);
        }
    }

    @Override
    public void a(ewz_2 ewz_22, int n) {
        if (this.b) {
            return;
        }
        int n2 = this.a.size();
        for (int k = 0; k < n2; ++k) {
            this.a.get(k).a(ewz_22, n);
        }
    }

    @Override
    public boolean a(ewy_2 ewy_22) {
        return !this.a.contains(ewy_22) && this.a.add(ewy_22);
    }

    @Override
    public boolean b(ewy_2 ewy_22) {
        return this.a.remove(ewy_22);
    }

    @Override
    public void b() {
        this.a.clear();
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public String toString() {
        return "QuestItemInventory{m_items=" + this.c.size() + "}";
    }
}

