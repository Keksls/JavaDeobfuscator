/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHB
 */
public final class bhb_0
extends eyo_1<bjw_1> {
    private final TIntHashSet d = new TIntHashSet();
    private final asz_2<asm_0> e;
    private final bjy_2 f;
    private List<bjw_1> g = null;
    private final TreeMap<String, bjw_1> h = new TreeMap();

    public bhb_0() {
        this.e = new asz_2<asm_0>(new asm_0());
        this.f = new bjy_2();
    }

    public List<bjw_1> a() {
        if (this.g == null) {
            this.g = this.l();
        }
        return Collections.unmodifiableList(this.g);
    }

    public Map<String, bjw_1> b() {
        return Collections.unmodifiableMap(this.h);
    }

    public void c() {
        this.g = null;
    }

    public static bhb_0 d() {
        return (bhb_0)eyo_1.g();
    }

    @Override
    @Nullable
    public bjw_1 a(int n) {
        if (n <= 0) {
            return null;
        }
        if (this.b.containsKey(n)) {
            return (bjw_1)this.b.get(n);
        }
        asm_0 asm_02 = this.e.a(n);
        if (asm_02 == null) {
            return null;
        }
        bjw_1 bjw_12 = this.f.b(asm_02);
        if (bjw_12 == null) {
            return null;
        }
        this.a(bjw_12);
        return bjw_12;
    }

    @Override
    public void a(bjw_1 bjw_12) {
        super.a(bjw_12);
        if (bjw_12.m()) {
            String string = Cz.e(bjw_12.e() + " " + bae.h().a("item.rarity." + bjw_12.M().name(), new Object[0]));
            this.h.put(string, bjw_12);
        }
    }

    private List<bjw_1> l() {
        ArrayList<bjw_1> arrayList = new ArrayList<bjw_1>();
        try {
            asw_2.a().a(new asm_0(), (T asm_02) -> {
                try {
                    bjw_1 bjw_12 = this.f.b(asm_02);
                    arrayList.add(bjw_12);
                }
                catch (Exception exception) {
                    a.error((Object)("Exception levee sur " + asm_02.c()), (Throwable)exception);
                }
            });
        }
        catch (Exception exception) {
            a.error((Object)"", (Throwable)exception);
        }
        return arrayList;
    }

    public boolean b(int n) {
        return this.d.contains(n);
    }

    public void c(int n) {
        this.d.add(n);
    }

    @Override
    @Nullable
    public /* synthetic */ ezr_0 d(int n) {
        return this.a(n);
    }

    @Override
    @Nullable
    public /* synthetic */ ewv_2 e(int n) {
        return this.a(n);
    }
}

