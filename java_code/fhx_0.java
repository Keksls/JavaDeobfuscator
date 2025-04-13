/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Renamed from fhX
 */
public class fhx_0 {
    private final fhv_0 a;
    private final epq_2 b;

    public fhx_0(fhv_0 fhv_02, epq_2 epq_22) {
        this.a = fhv_02;
        this.b = epq_22;
    }

    public List<exk_2> a() {
        Set<epq_2> set = this.c();
        return this.a(set);
    }

    public int b() {
        return this.a().stream().mapToInt(exk_2::e).sum();
    }

    private Set<epq_2> c() {
        return this.a.a() ? euw_2.a.g(this.b.U_()) : Collections.singleton(this.b);
    }

    private List<exk_2> a(Set<epq_2> set) {
        Set<Integer> set2 = this.a.c();
        Set<Long> set3 = this.a.d();
        return set.stream().flatMap(epq_22 -> epq_22.dS().j().stream()).flatMap(exg_22 -> exg_22.b(exk_22 -> !set3.contains(exk_22.a()) && (set2.isEmpty() || set2.contains(exk_22.aT_()))).stream()).filter(exk_22 -> this.a.b() == null || this.a.b().test((exk_2)exk_22)).sorted(this.a.e().a()).collect(Collectors.toList());
    }

    public static fhy_0 a(long l, epq_2 epq_22) {
        return fhx_0.a(l, epq_22.U_(), epq_22.R());
    }

    public static fhy_0 a(long l, long l2, long l3) {
        Cm<Long, exk_2> cm = euu_2.h(l2, l);
        if (cm != null) {
            return new fhy_0(cm.b(), fhz_0.a, cm.a());
        }
        cm = euu_2.j(l2, l);
        if (cm != null) {
            return new fhy_0(cm.b(), fhz_0.b, cm.a());
        }
        eBt eBt2 = eBo.a.c(l3, l);
        if (eBt2 != null) {
            exk_2 exk_22 = (exk_2)eBt2.h().e(l);
            return new fhy_0(exk_22, fhz_0.e, eBt2.b());
        }
        return new fhy_0(null, fhz_0.f, -1L);
    }

    public static fhy_0 a(int n, long l, long l2) {
        Optional<Cm<Long, exk_2>> optional = euu_2.a(l, n);
        if (optional.isPresent()) {
            Cm<Long, exk_2> cm = optional.get();
            return new fhy_0(cm.b(), fhz_0.a, cm.a());
        }
        optional = euu_2.b(l, n);
        if (optional.isPresent()) {
            Cm<Long, exk_2> cm = optional.get();
            return new fhy_0(cm.b(), fhz_0.b, cm.a());
        }
        Optional<eBt> optional2 = eBo.a.c(l2, n);
        if (optional2.isEmpty()) {
            return new fhy_0(null, fhz_0.f, -1L);
        }
        eBt eBt2 = optional2.get();
        exk_2 exk_22 = (exk_2)eBt2.h().c(n);
        return new fhy_0(exk_22, fhz_0.e, eBt2.b());
    }
}

