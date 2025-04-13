/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eNX
 */
public final class enx_1 {
    private boolean a;
    private final enw_1 b = new enw_1();
    private final Set<sr_0> c = new HashSet<sr_0>();
    private final Map<sr_0, Set<fir_0>> d = new HashMap<sr_0, Set<fir_0>>();

    public void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b.a();
        this.b.a(this.c, this.d);
    }

    public boolean b() {
        Set<sr_0> set = this.c;
        return !set.isEmpty();
    }

    public boolean c() {
        for (Set<fir_0> set : this.d.values()) {
            if (set.contains((Object)fir_0.f)) continue;
            return true;
        }
        return false;
    }

    public boolean d() {
        for (Set<fir_0> set : this.d.values()) {
            if (set.contains((Object)fir_0.r) || set.contains((Object)fir_0.f)) continue;
            return true;
        }
        return false;
    }

    public boolean e() {
        for (Set<fir_0> set : this.d.values()) {
            if (!set.isEmpty()) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public sr_0 f() {
        for (Map.Entry<sr_0, Set<fir_0>> entry : this.d.entrySet()) {
            if (!entry.getValue().isEmpty()) continue;
            return entry.getKey();
        }
        return null;
    }

    @Nullable
    public sr_0 g() {
        Set<sr_0> set = this.c;
        if (set.isEmpty()) {
            return null;
        }
        return set.iterator().next();
    }

    public void a(elv_0 elv_02, epq_2 epq_22, fio_0 fio_02, int n, int n2, aff_1 aff_12) {
        this.b.a(elv_02, epq_22, fio_02, n, n2, aff_12);
        this.a = false;
    }

    private void i() {
        this.b.b();
        this.a = false;
    }

    public void h() {
        this.i();
        this.d.clear();
        this.c.clear();
    }
}

