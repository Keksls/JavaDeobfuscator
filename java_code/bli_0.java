/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bli
 */
class bli_0 {
    static final String a = ",";
    private final ble_0 b;
    private final List<ble_0> c = new ArrayList<ble_0>();
    @Nullable
    private List<ble_0> d;
    @Nullable
    private String e;
    private boolean f = true;
    @NotNull
    private bzn_2 g = bzn_2.a;

    public bli_0(ble_0 ble_02, bmr_1 bmr_12) {
        this.b = ble_02;
        this.f = bli_0.a(bmr_12);
    }

    private static boolean a(bmr_1 bmr_12) {
        bvp_0 bvp_02 = ((bvx_0)ans_0.D().h()).a(bmr_12);
        if (!bvp_02.l(bWe.aU.b())) {
            return true;
        }
        return bvp_02.n(bWe.aU.b());
    }

    void a(ble_0 ble_02) {
        this.c.add(ble_02);
    }

    @Unmodifiable List<ble_0> a() {
        if (this.d != null) {
            return Collections.unmodifiableList(this.d);
        }
        return Collections.unmodifiableList(this.c);
    }

    String b() {
        return this.c.stream().filter(ble_02 -> ble_02.c() > 0).map(ble_02 -> String.valueOf(ble_02.c())).collect(Collectors.joining(a));
    }

    @NotNull
    bzn_2 c() {
        return this.g;
    }

    boolean b(ble_0 ble_02) {
        if (this.d != null) {
            return false;
        }
        int n = this.c.indexOf(ble_02);
        this.c.remove(ble_02);
        this.c.add(n - 1, ble_02);
        this.g = bzn_2.a;
        return true;
    }

    boolean c(ble_0 ble_02) {
        if (this.d != null) {
            return false;
        }
        int n = this.c.indexOf(ble_02);
        if (n >= this.c.size() - 1) {
            return false;
        }
        this.c.remove(ble_02);
        this.c.add(n + 1, ble_02);
        this.g = bzn_2.a;
        return true;
    }

    boolean a(int n, ble_0 ble_02) {
        if (this.d != null) {
            return false;
        }
        ble_0 ble_03 = this.c.get(n);
        int n2 = this.c.indexOf(ble_02);
        int n3 = Hw.a(n2, 0, this.c.size() - 1);
        this.c.remove(ble_03);
        this.c.add(n3, ble_03);
        this.g = bzn_2.a;
        return true;
    }

    void a(@Nullable String string) {
        this.e = string == null || string.isEmpty() ? null : Cz.e(string);
        this.e();
    }

    private void e() {
        this.d = this.e == null && this.f ? null : this.c.stream().filter(this::d).collect(Collectors.toList());
    }

    private boolean d(ble_0 ble_02) {
        if (ble_02.c() == this.b.c()) {
            return true;
        }
        if (ble_02.c() == cZI.a().J()) {
            return true;
        }
        if (!this.f && ble_02.f()) {
            return false;
        }
        return this.e == null || Cz.e(ble_02.e()).contains(this.e);
    }

    void a(bli_0 bli_02) {
        this.e = bli_02.e;
        this.e();
    }

    public void a(boolean bl, bmr_1 bmr_12) {
        this.f = bl;
        this.e();
        String string = bWe.aU.b();
        ((bvx_0)ans_0.D().h()).a(bmr_12).b(string, this.f);
        ((bvx_0)ans_0.D().h()).c(string);
    }

    boolean a(@NotNull bzn_2 bzn_22) {
        if (this.g == bzn_22) {
            return false;
        }
        this.g = bzn_22;
        Comparator<ble_0> comparator = this.f();
        if (comparator == null) {
            return true;
        }
        this.c.sort(comparator);
        this.e();
        return true;
    }

    Set<Integer> a(Set<Integer> set) {
        HashSet<Integer> hashSet = new HashSet<Integer>(set);
        for (ble_0 ble_02 : this.c) {
            hashSet.remove(ble_02.c());
        }
        hashSet.remove(0);
        return hashSet;
    }

    void b(Set<Integer> set) {
        if (set.isEmpty()) {
            return;
        }
        this.c.sort(Comparator.comparingInt(ble_02 -> set.contains(ble_02.c()) ? 0 : 1));
    }

    @Nullable
    private Comparator<ble_0> f() {
        switch (this.g) {
            case b: {
                return ble_0.o;
            }
            case c: {
                return ble_0.o.reversed();
            }
            case d: {
                return ble_0.p;
            }
            case e: {
                return ble_0.p.reversed();
            }
        }
        return null;
    }

    public boolean d() {
        return this.f;
    }
}

