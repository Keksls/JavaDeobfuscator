/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bzT
 */
public class bzt_1
extends bzp_1<bzt_1> {
    private final bmr_1 b;
    private final eyz_0 c;
    private final eyz_0 d;
    private final int e;
    private final Consumer<Integer> f;

    public bzt_1(bmr_1 bmr_12, int n, @NotNull Consumer<Integer> consumer) {
        this.b = bmr_12;
        this.c = bmr_12.d(n);
        this.d = this.c.b();
        this.e = n;
        this.f = consumer;
    }

    @Override
    eyz_0 a() {
        return this.c;
    }

    @Override
    bmv_1 e() {
        throw new UnsupportedOperationException("Player does not have a companion npc.");
    }

    @Override
    public boolean b() {
        return super.b() && this.d.c(this.c);
    }

    @Override
    public void a(bzt_1 bzt_12) {
        this.a.clear();
        this.a.addAll(bzt_12.a);
    }

    @Override
    Set<Long> f() {
        HashSet<Long> hashSet = new HashSet<Long>();
        this.c.a().forEach((exh_22, l) -> {
            if (!Objects.equals(this.d.a((exh_2)exh_22), l)) {
                hashSet.add((Long)l);
            }
        });
        return hashSet;
    }

    @Override
    int g() {
        ahh_2 ahh_22 = new ahh_2();
        this.d.a().forEach((exh_22, l) -> {
            if (!this.c.b((long)l)) {
                ahh_22.a();
            }
        });
        return ahh_22.c();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Optional<exh_2> a(exk_2 exk_22, @NotNull exh_2 exh_22) {
        eyr_1 eyr_12;
        eyt_0 eyt_02 = this.b.dC();
        if (eyt_02 == null) {
            return Optional.empty();
        }
        Set<exh_2> set = eyf_1.e(this.b, this.c, exk_22, exh_22);
        ArrayList<Cm> arrayList = new ArrayList<Cm>(set.size());
        for (exh_2 object2 : set) {
            exk_2 exk_23 = this.c.a(eyt_02, object2);
            if (exk_23 == null || !exk_23.aU_()) continue;
            arrayList.add(new Cm<exk_2, exh_2>(exk_23, object2));
        }
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList.sort(Comparator.comparing(cm -> cm.b() == exh_22 ? 0 : 1));
            Cm cm2 = (Cm)arrayList.get(0);
            for (int k = 1; k < arrayList.size(); ++k) {
                Cm cm3 = (Cm)arrayList.get(k);
                arrayList2.add(new bzr_1(bzs_2.c, (exk_2)cm3.a(), null, (exh_2)cm3.b()));
            }
        } else {
            Object var7_9 = null;
        }
        if ((eyr_12 = eZc.a(this.b.U_(), this.b.a_(), (byte)this.e, exh_22, exk_22.a(), true)) != eyr_1.a) {
            aUh.a("equipment.build.error." + eyr_12.name(), new Object[0]);
            return Optional.empty();
        }
        if (this.i()) {
            void var7_10;
            this.a.addAll(arrayList2);
            this.a(exk_22, exh_22, Optional.ofNullable(var7_10));
            this.f.accept(1 + arrayList2.size());
        }
        return Optional.of(exh_22);
    }

    @Override
    public Optional<exh_2> a(@NotNull exh_2 exh_22) {
        exk_2 exk_22 = this.c.a(this.b.dC(), exh_22);
        if (exk_22 == null) {
            return Optional.empty();
        }
        eyr_1 eyr_12 = new bHm().a(this.b.U_(), this.b.a_(), (byte)this.e, exk_22.a(), true);
        if (eyr_12 == eyr_1.a) {
            if (this.i()) {
                bzr_1 bzr_12 = new bzr_1(bzs_2.c, exk_22, null, exh_22);
                this.a.add(bzr_12);
                this.f.accept(1);
            }
            return Optional.of(exh_22);
        }
        aUh.a("equipment.build.error." + eyr_12.name(), new Object[0]);
        return Optional.empty();
    }

    @Override
    void a(@NotNull exk_2 exk_22) {
        exh_2 exh_22 = this.c.a((Long)exk_22.a());
        if (exh_22 != null) {
            this.c.a(um_0.e(Ui.c, exk_22, exh_22.a()));
            cZI.a().b(exh_22);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(@NotNull eyz_0 eyz_02) {
        cc_0<eyr_1, Boolean> cc_02;
        eyt_0 eyt_02 = this.b.dC();
        if (eyt_02 == null) {
            aUh.a("build.error.copy.equipments", new Object[0]);
            return false;
        }
        EnumMap<exh_2, Long> enumMap = new EnumMap<exh_2, Long>(this.c.a());
        this.c.a(true);
        try {
            cc_02 = eZc.a(this.b, (byte)this.e, eyz_02, null);
        }
        finally {
            this.c.a(false);
        }
        if (cc_02.b()) {
            aUh.a("equipment.build.error." + cc_02.d().name(), new Object[0]);
            return false;
        }
        if (!cc_02.c().booleanValue()) {
            aUh.a("build.invalid.items", new Object[0]);
        }
        if (this.i()) {
            this.a(eyt_02, enumMap);
        }
        return true;
    }

    private void a(eyt_0 eyt_02, EnumMap<exh_2, Long> enumMap) {
        for (exh_2 exh_22 : exh_2.z) {
            Optional<exk_2> optional;
            Long l = enumMap.get(exh_22);
            Long l2 = this.c.a(exh_22);
            if (l != null && l2 == null) {
                optional = eyt_02.b(l);
                if (optional.isEmpty()) continue;
                this.a.add(new bzr_1(bzs_2.c, optional.get(), null, exh_22));
                continue;
            }
            if (l2 == null) continue;
            optional = eyt_02.b(l2);
            if (l == null) {
                this.a.add(new bzr_1(bzs_2.a, null, optional.orElse(null), exh_22));
                continue;
            }
            Optional<exk_2> optional2 = eyt_02.b(l);
            if (optional2.isEmpty()) continue;
            this.a.add(new bzr_1(bzs_2.b, optional2.get(), optional.orElse(null), exh_22));
        }
    }
}

