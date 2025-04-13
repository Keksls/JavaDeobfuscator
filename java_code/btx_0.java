/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from btx
 */
public class btx_0
implements ajh_1 {
    private static final String b = "results";
    private static final String d = "isItemSearch";
    private static final String e = "isNotEmpty";
    private static final String f = "selectedSortType";
    public static final BiFunction<dfx_0, exk_2, Boolean> a = (dfx_02, exk_22) -> {
        if (exk_22.c() < dfx_02.q()) {
            return false;
        }
        if (exk_22.c() > dfx_02.r()) {
            return false;
        }
        if (exk_22.y() && exk_22.C().c().values().stream().noneMatch(eze_02 -> eze_02.c() != tc_0.a)) {
            return false;
        }
        if (exk_22.A() > dfx_02.p()) {
            return false;
        }
        if (exk_22.A() < dfx_02.o()) {
            return false;
        }
        if (!Cz.a(exk_22.N(), dfx_02.k())) {
            return false;
        }
        return true;
    };
    private final List<bty_0> g = new ArrayList<bty_0>();
    private boolean h;
    private byte i;
    private HashSet<exh_2> j;

    public static btx_0 a(btb_1 btb_12, dfx_0 dfx_02) {
        fhv_0 fhv_02 = new fhv_0();
        if (btb_12.g() == btu_1.g) {
            fhv_02.a(btb_12.h().aT_()).a(btb_12.h().a());
        }
        fhv_02.a((exk_2 exk_22) -> a.apply(dfx_02, (exk_2)exk_22));
        fhv_02.a(dfx_02.s());
        btx_0 btx_02 = new btx_0();
        btx_02.i = btb_12.k().i;
        return btx_02.a(new fhx_0(fhv_02, azu_0.j().k()).a());
    }

    btx_0 a(List<exk_2> list) {
        this.g.clear();
        this.h = true;
        list.forEach(exk_22 -> this.g.add(new bty_0().a((exk_2)exk_22)));
        return this;
    }

    btx_0 a(tc_0 tc_02) {
        this.g.clear();
        this.h = false;
        eZv.a.a().filter(entry -> tc_02 == tc_0.e || ((eZu)entry.getValue()).c() == tc_02).filter(entry -> !((eZu)entry.getValue()).a()).sorted((entry, entry2) -> {
            if (entry == null) {
                return -1;
            }
            if (entry2 == null) {
                return 1;
            }
            boolean bl = ((eZu)entry.getValue()).b().stream().anyMatch(this.j::contains);
            boolean bl2 = ((eZu)entry2.getValue()).b().stream().anyMatch(this.j::contains);
            if (bl && !bl2) {
                return -1;
            }
            if (!bl && bl2) {
                return 1;
            }
            return ((eZu)entry.getValue()).c().a() - ((eZu)entry2.getValue()).c().a();
        }).forEach(entry -> this.g.add(new bty_0().a((ezr_0)eyo_1.g().d((Integer)entry.getKey()))));
        return this;
    }

    void a(exh_2[] exh_2Array) {
        this.j = Sets.newHashSet((Object[])exh_2Array);
    }

    public void a(byte by) {
        this.i = by;
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public String[] d() {
        return new String[]{b};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.h;
        }
        if (string.equals(e)) {
            return !this.g.isEmpty();
        }
        if (string.equals(f)) {
            return this.i;
        }
        return null;
    }
}

