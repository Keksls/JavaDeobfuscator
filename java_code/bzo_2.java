/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bzO
 */
public class bzo_2
extends bzp_1<bzo_2> {
    private final eBt b;
    private final bmv_1 c;
    private final Map<Integer, Long> d;
    private final Consumer<Integer> e;

    bzo_2(eBt eBt2, bmv_1 bmv_12, Consumer<Integer> consumer) {
        this.b = eBt2;
        this.c = bmv_12;
        this.d = eBt2.h().a();
        this.e = consumer;
    }

    @Override
    public boolean b() {
        return super.b() && !this.d.equals(this.b.h().a());
    }

    @Override
    eyz_0 a() {
        throw new UnsupportedOperationException("Companion does not have equipment sheet.");
    }

    @Override
    bmv_1 e() {
        return this.c;
    }

    @Override
    public void a(bzo_2 bzo_22) {
        throw new UnsupportedOperationException("Cannot copy modifications of companion equipment modifications.");
    }

    @Override
    Set<Long> f() {
        HashSet<Long> hashSet = new HashSet<Long>();
        this.b.h().a((C exk_22, Integer n) -> {
            Long l = this.d.get(n);
            if (l == null || l.longValue() != exk_22.a()) {
                hashSet.add(exk_22.a());
            }
        });
        return hashSet;
    }

    @Override
    int g() {
        ahh_2 ahh_22 = new ahh_2();
        this.d.forEach((n, l) -> {
            if (!this.b.h().d((long)l)) {
                ahh_22.a();
            }
        });
        return ahh_22.c();
    }

    List<eBm> h() {
        LinkedHashMap<exh_2, eBm> linkedHashMap = new LinkedHashMap<exh_2, eBm>();
        for (bzr_1 bzr_12 : this.a) {
            if (bzr_12.a() == bzs_2.c) {
                eBm eBm2 = (eBm)linkedHashMap.get(bzr_12.d());
                if (eBm2 != null && eBm2.b()) {
                    linkedHashMap.remove(bzr_12.d());
                    continue;
                }
                linkedHashMap.put(bzr_12.d(), eBm.a(bzr_12.d()));
                continue;
            }
            linkedHashMap.put(bzr_12.d(), eBm.a(bzr_12.d(), bzr_12.c().a()));
        }
        return new ArrayList<eBm>(linkedHashMap.values());
    }

    @Override
    public Optional<exh_2> a(exk_2 exk_22, @NotNull exh_2 exh_22) {
        Object object;
        Optional<ezi_1> optional = eBx.a(this.b);
        Set<exh_2> set = eyf_1.a(this.b.h(), exk_22, exh_22);
        exq_2 exq_22 = this.b.h();
        ArrayList<Cm<exk_2, exh_2>> arrayList = new ArrayList<Cm<exk_2, exh_2>>(set.size());
        for (exh_2 object22 : set) {
            object = (exk_2)exq_22.e(object22.A);
            if (object == null || !((exk_2)object).aU_()) continue;
            arrayList.add(new Cm<exk_2, exh_2>((exk_2)object, object22));
        }
        Optional<eBl> optional2 = this.a(exk_22, exh_22, arrayList);
        if (optional2.isPresent()) {
            if (((eBl)((Object)optional2.get())).a() != null) {
                aUh.a("equipment.build.error." + ((eBl)((Object)optional2.get())).a().name(), new Object[0]);
            } else {
                aUh.a("build.equipment.companion.error." + ((eBl)((Object)optional2.get())).name(), new Object[0]);
            }
            return Optional.empty();
        }
        ArrayList<bzr_1> arrayList2 = new ArrayList<bzr_1>();
        if (!arrayList.isEmpty()) {
            arrayList.sort(Comparator.comparing(cm -> cm.b() == exh_22 ? 0 : 1));
            object = (Cm)arrayList.get(0);
            for (int ua_02 = 0; ua_02 < arrayList.size(); ++ua_02) {
                Cm cm2 = (Cm)arrayList.get(ua_02);
                exq_22.b(((exh_2)cm2.b()).A);
                if (ua_02 <= 0) continue;
                arrayList2.add(new bzr_1(bzs_2.c, (exk_2)cm2.a(), null, (exh_2)cm2.b()));
            }
        } else {
            object = null;
        }
        if (!exq_22.a(exk_22, (short)exh_22.A)) {
            aUh.a("build.equipment.companion.error." + eBl.a.name(), new Object[0]);
            bzo_2.a(exq_22, arrayList);
            return Optional.empty();
        }
        try {
            exq_22.b(exk_22, exh_22.A);
        }
        catch (ua_0 list) {
            return Optional.empty();
        }
        List<exk_2> list = optional.map(bzo_2::a).orElse(List.of());
        cxo_0.a(this.b, list);
        if (this.i()) {
            this.a.addAll(arrayList2);
            this.a(exk_22, exh_22, Optional.ofNullable(object));
            this.e.accept(1 + arrayList2.size());
        }
        return Optional.of(exh_22);
    }

    private static List<exk_2> a(ezi_1 ezi_12) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        Map<exh_2, Integer> map = eZh.a(ezi_12.a()).a();
        for (Map.Entry<exh_2, Integer> entry : map.entrySet()) {
            arrayList.add(eBx.a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static void a(exq_2 exq_22, List<Cm<exk_2, exh_2>> list) {
        for (Cm<exk_2, exh_2> cm : list) {
            bzo_2.a(exq_22, cm.a(), cm.b());
        }
    }

    private static void a(exq_2 exq_22, exk_2 exk_22, exh_2 exh_22) {
        try {
            exq_22.b(exk_22, exh_22.A);
        }
        catch (ua_0 ua_02) {
            // empty catch block
        }
    }

    private Optional<eBl> a(@NotNull exk_2 exk_22, @NotNull exh_2 exh_22, @NotNull List<Cm<exk_2, exh_2>> list) {
        Optional<eBl> optional = eBx.a(euu_2.h(this.b.f()), this.c, exk_22, exh_22.A);
        if (optional.isPresent()) {
            return optional;
        }
        if (list.isEmpty()) {
            return Optional.empty();
        }
        exq_2 exq_22 = this.b.h();
        for (Cm<exk_2, exh_2> cm : list) {
            if (exq_22.f(cm.a())) continue;
            return Optional.of(eBl.a);
        }
        return Optional.empty();
    }

    @Override
    public Optional<exh_2> a(@NotNull exh_2 exh_22) {
        exq_2 exq_22 = this.b.h();
        exk_2 exk_22 = (exk_2)exq_22.e(exh_22.A);
        if (exk_22 == null) {
            return Optional.empty();
        }
        if (!exq_22.f(exk_22)) {
            return Optional.empty();
        }
        exq_22.b(exh_22.A);
        cxo_0.a(this.b, exk_22);
        if (this.i()) {
            bzr_1 bzr_12 = new bzr_1(bzs_2.c, exk_22, null, exh_22);
            this.a.add(bzr_12);
            this.e.accept(1);
        }
        return Optional.of(exh_22);
    }

    @Override
    void a(@NotNull exk_2 exk_22) {
        short s2 = this.b.h().f(exk_22.a());
        exh_2 exh_22 = exh_2.a((byte)s2);
        if (s2 > 0 && exh_22 != null) {
            this.b.h().b(s2);
            cxo_0.a(this.b, exk_22);
            cZI.a().b(exh_22);
        }
    }

    @Override
    boolean a(@NotNull eyz_0 eyz_02) {
        throw new UnsupportedOperationException("Cannot copy equipment sheet to companion equipment.");
    }
}

