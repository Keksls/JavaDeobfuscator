/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzK
 */
public class bzk_2
extends bzu_1<bzk_2> {
    private final bzo_1 a;
    private final ezj_1 b;
    private final boolean c;
    private final List<bzn_1> d = new ArrayList<bzn_1>();
    private final List<bzm_1> e = new ArrayList<bzm_1>();
    @NotNull
    private final bzp_1 f;
    @NotNull
    private final bzv_1 g;
    @NotNull
    private final bzi_2 h;

    public bzk_2(bzo_1 bzo_12, ble_0 ble_02, boolean bl) {
        this(bzo_12, ble_02.b(), bl);
    }

    public bzk_2(bzo_1 bzo_12, ezj_1 ezj_12, boolean bl) {
        this.a = bzo_12;
        this.b = ezj_12;
        this.c = bl;
        this.f = this.a(bzo_12);
        this.g = new bzv_1(this.a.c(), this.b.e(), () -> this.a(bzn_1.c, 1));
        this.h = new bzi_2(this.a.c(), this.b.e(), () -> this.a(bzn_1.d, 1));
    }

    private bzp_1 a(bzo_1 bzo_12) {
        if (bzo_12.b()) {
            return new bzo_2(this.a.d(), (bmv_1)this.a.j(), n -> this.a(bzn_1.b, (int)n));
        }
        return new bzt_1(this.a.c(), this.b.e(), n -> this.a(bzn_1.b, (int)n));
    }

    private void a(bzn_1 bzn_12, int n) {
        for (int k = 0; k < n; ++k) {
            this.d.add(bzn_12);
        }
    }

    @Override
    public boolean b() {
        if (!this.i()) {
            return false;
        }
        return this.c || this.j();
    }

    public boolean a(int n) {
        switch (n) {
            case 0: {
                return this.f.b();
            }
            case 1: {
                return this.g.b();
            }
            case 2: {
                return this.h.b();
            }
        }
        return false;
    }

    private boolean j() {
        return this.k() || this.f.b() || this.g.b() || this.h.b();
    }

    private boolean k() {
        if (this.e.isEmpty()) {
            return false;
        }
        bzm_1 bzm_12 = this.e.get(0);
        return !bzm_12.a.equals(this.b.b()) || bzm_12.b != this.b.c() || bzm_12.c != this.b.d();
    }

    public boolean a() {
        return !this.c || this.j();
    }

    public Optional<Integer> e() {
        if (this.d.isEmpty()) {
            return Optional.empty();
        }
        switch (this.d.get(this.d.size() - 1)) {
            case a: {
                return Optional.empty();
            }
            case b: {
                return Optional.of(0);
            }
            case c: {
                return Optional.of(1);
            }
            case d: {
                return Optional.of(2);
            }
        }
        return Optional.empty();
    }

    @Override
    public void c() {
        if (this.d.isEmpty()) {
            return;
        }
        bzn_1 bzn_12 = this.d.remove(this.d.size() - 1);
        switch (bzn_12) {
            case a: {
                if (this.e.isEmpty()) {
                    return;
                }
                this.a(this.e.remove(this.e.size() - 1));
                return;
            }
            case b: {
                this.f.c();
                return;
            }
            case c: {
                this.g.c();
                return;
            }
            case d: {
                this.h.c();
                return;
            }
        }
    }

    @Override
    private void a(@NotNull bzm_1 bzm_12) {
        this.e.remove(bzm_12);
        this.a(() -> cZI.a().a(bzm_12.a, bzm_12.b, bzm_12.c));
    }

    @Override
    public void d() {
        this.a(true);
    }

    @Override
    public void a(boolean bl) {
        this.a(() -> {
            if (this.c) {
                bzk_2.l();
            } else {
                this.c(bl);
            }
        });
    }

    private static void l() {
        cZI.a().s();
    }

    private void c(boolean bl) {
        if (!this.e.isEmpty()) {
            this.a(this.e.get(0));
            this.e.clear();
        }
        this.d.clear();
        this.f.d();
        this.g.d();
        this.h.d();
        if (bl && this.a.a()) {
            this.a.c().b(this.a.c().cK());
        }
    }

    @Override
    public void a(bzk_2 bzk_22) {
        this.d.clear();
        this.d.addAll(bzk_22.d);
        this.e.clear();
        this.e.addAll(bzk_22.e);
        this.f.a(bzk_22.f);
        this.g.a(bzk_22.g);
        this.h.a(bzk_22.h);
    }

    public boolean a(@NotNull String string, short s2, int n) {
        bzm_1 bzm_12 = new bzm_1(this.b.b(), (short)this.b.c(), this.b.d());
        if (this.b.f() && s2 != this.b.c()) {
            return false;
        }
        this.b.a(string);
        this.b.a(s2);
        this.b.b(n);
        this.f.a().a(s2);
        this.g.a().a(s2);
        this.h.a().b(s2);
        cZI.a().w();
        if (this.i()) {
            this.e.add(bzm_12);
            this.a(bzn_1.a, 1);
        }
        return true;
    }

    public boolean f() {
        if (this.a.a()) {
            return this.a(this.a.c());
        }
        return this.a(this.a.d());
    }

    public boolean b(int n) {
        if (this.a.a()) {
            switch (n) {
                case 0: {
                    return ezp_1.a(this.a.c(), this.b.e(), this.f.a()).isEmpty();
                }
                case 1: {
                    return ezp_1.a((epq_2)this.a.c(), this.g.a()).isEmpty();
                }
                case 2: {
                    return ezp_1.a((epq_2)this.a.c(), this.h.a()).isEmpty();
                }
            }
            return true;
        }
        if (n == 0) {
            eBt eBt2 = this.a.d();
            return eBx.a(euu_2.h(eBt2.f()), this.f.e(), eBt2.h()).isEmpty();
        }
        return true;
    }

    private boolean a(bmr_1 bmr_12) {
        Object object;
        Object object2;
        boolean bl = true;
        List<Long> list = ezp_1.a(bmr_12, this.b.e(), this.f.a());
        if (!list.isEmpty()) {
            if (list.get(0) == -1L) {
                aUh.a("build.error.save.generic", -1L);
            } else {
                object2 = list.stream().map(l -> bmr_12.dC().b((Long)l)).filter(Optional::isPresent).map(Optional::get).map(exk_2::N).collect(Collectors.joining(", "));
                aUh.a("build.error.save.equipments.ui", list.size(), object2);
                aUh.b();
            }
            bl = false;
        }
        if (!(object2 = ezp_1.a((epq_2)bmr_12, this.g.a())).isEmpty()) {
            if ((long)object2.get(0).intValue() == -1L) {
                aUh.a("build.error.save.generic", -1L);
            } else {
                object = object2.stream().map(n -> bae.h().a(3, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
                aUh.a("build.error.save.spells.ui", object2.size(), object);
                aUh.b();
            }
            bl = false;
        }
        if (!(object = ezp_1.a((epq_2)bmr_12, this.h.a())).isEmpty()) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
            Object object3 = object.iterator();
            while (object3.hasNext()) {
                int n2 = (Integer)object3.next();
                if (n2 > 0) {
                    arrayList.add(n2);
                    continue;
                }
                arrayList2.add(-n2);
            }
            object3 = arrayList.stream().map(n -> bae.h().a(146, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
            if (!arrayList.isEmpty()) {
                aUh.a("build.error.save.aptitudes.bonus.ui", arrayList.size(), object3);
                aUh.b();
            }
            String string = arrayList2.stream().map(n -> bae.h().a(147, (long)n.intValue(), new Object[0])).collect(Collectors.joining(", "));
            if (!arrayList2.isEmpty()) {
                aUh.a("build.error.save.aptitudes.category.ui", arrayList2.size(), string);
                aUh.b();
            }
            bl = false;
        }
        return bl;
    }

    private boolean a(eBt eBt2) {
        List<exk_2> list = eBx.a(euu_2.h(eBt2.f()), this.f.e(), eBt2.h());
        if (!list.isEmpty()) {
            String string = list.stream().map(exk_2::N).collect(Collectors.joining(", "));
            aUh.a("build.error.save.equipments.ui", list.size(), string);
        }
        if (this.f.g() > azu_0.j().k().da().o()) {
            aUh.a("build.error.not.enough.inventory.space", new Object[0]);
            return false;
        }
        return list.isEmpty();
    }

    public Pw b(boolean bl) {
        if (this.a.a()) {
            clz_0 clz_02 = new clz_0(this.a.e(), this.c, this.b);
            if (bl || this.f.b()) {
                clz_02.a(this.f.a());
            }
            if (bl || this.g.b()) {
                clz_02.a(this.g.a());
            }
            if (bl || this.h.b()) {
                clz_02.a(this.h.a());
            }
            return clz_02;
        }
        List<eBm> list = ((bzo_2)this.f).h();
        return new cma(this.a.e(), list);
    }

    public Set<Long> g() {
        return this.f.f();
    }

    @Nullable
    public exk_2 a(long l) {
        return this.f.a(l);
    }

    public Optional<exh_2> a(exk_2 exk_22, @NotNull exh_2 exh_22) {
        return this.f.a(exk_22, exh_22);
    }

    public Optional<exh_2> a(@NotNull exh_2 exh_22) {
        return this.f.a(exh_22);
    }

    @Override
    public void a(@NotNull exk_2 exk_22) {
        this.f.b(exk_22);
    }

    public boolean a(@NotNull eyz_0 eyz_02) {
        return this.f.a(eyz_02);
    }

    public boolean a(@NotNull bpl_0 bpl_02, @NotNull bpr_0 bpr_02) {
        return this.g.a(bpl_02, bpr_02);
    }

    public boolean a(@NotNull bpr_0 bpr_02) {
        return this.g.a(bpr_02);
    }

    public boolean a(@NotNull fiO fiO2) {
        return this.g.a(fiO2);
    }

    public void a(@NotNull bkx_2 bkx_22, int n) {
        this.h.a(bkx_22, n);
    }

    @Override
    public void a(@NotNull ezx_2 ezx_22) {
        this.h.a(ezx_22);
    }

    public boolean h() {
        return this.c;
    }
}

