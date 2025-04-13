/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import com.google.common.collect.Ordering;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from aOY
 */
public final class aoy_0 {
    private static final Logger a = Logger.getLogger(aoy_0.class);
    private static final float b = 0.6f;
    private static final TIntObjectHashMap<aov_0> c = new TIntObjectHashMap();
    private static final TIntObjectHashMap<aov_0> d = new TIntObjectHashMap();

    private aoy_0() {
    }

    static void a(bwh_0 bwh_02) {
        aoy_0.b(bwh_02, aPf.a);
    }

    private static void b(bwh_0 bwh_02, aPf aPf2) {
        if (bwh_02 == null) {
            return;
        }
        aoy_0.a(bwh_02, aPf2);
        aoy_0.d(bwh_02);
        aoy_0.f(bwh_02);
    }

    public static void a(bwh_0 bwh_02, blx_1 blx_12) {
        aov_0 aov_02;
        int n = bwh_02.c();
        byte by = bwh_02.d(blx_12.a_());
        aov_0 aov_03 = aov_02 = by == 0 ? (aov_0)c.get(n) : (aov_0)d.get(n);
        if (aov_02 != null) {
            aov_02.c();
        }
    }

    public static void a(bvw_2 bvw_22) {
        Object object;
        if (c.containsKey(bvw_22.c())) {
            return;
        }
        aff_1 aff_12 = aoy_0.b(bvw_22);
        if (aff_12 == null) {
            a.error((Object)("pas de cellule trouv\u00e9e pour repr\u00e9senter le combat " + bvw_22 + " center=" + bvw_22.g().s()));
            return;
        }
        Optional<aov_0> optional = aop_0.a(aff_12, bvw_22, 0);
        if (optional.isPresent()) {
            object = optional.get();
            c.put(bvw_22.c(), object);
            abe_0.d().a((abu)object);
        }
        if (((Optional)(object = aop_0.a(aff_12, bvw_22, 1))).isPresent()) {
            aov_0 aov_02 = (aov_0)((Optional)object).get();
            d.put(bvw_22.c(), (Object)aov_02);
            abe_0.d().a((abu)aov_02);
        }
    }

    private static aff_1 b(bvw_2 bvw_22) {
        boolean bl;
        aff_1 aff_12 = bvw_22.g().s();
        aff_12.a(yz_0.d(aff_12.d(), aff_12.e(), aff_12.f()));
        boolean bl2 = yz_0.j(aff_12.d(), aff_12.e(), aff_12.f());
        boolean bl3 = bl = aoy_0.a(c, aff_12) || aoy_0.a(d, aff_12);
        if (!bl2 || bl) {
            return aoy_0.a((bwh_0)bvw_22, aff_12);
        }
        return aff_12;
    }

    private static boolean a(TIntObjectHashMap<aov_0> tIntObjectHashMap, aff_1 aff_12) {
        return tIntObjectHashMap.valueCollection().stream().anyMatch(aov_02 -> aov_02.G() == aff_12.d() && aov_02.H() == aff_12.e() && aov_02.I() == aff_12.f());
    }

    private static aff_1 a(bwh_0 bwh_02, aff_1 aff_13) {
        Ordering ordering = Ordering.natural().onResultOf(aff_13::e);
        tg_0 tg_02 = bwh_02.g();
        List list = bwh_02.j().stream().map(epq_2::P_).filter(Objects::nonNull).filter(aff_12 -> tg_02.b(aff_12.d(), aff_12.e())).sorted((Comparator<aff_1>)ordering).collect(Collectors.toList());
        return list.isEmpty() ? aff_13 : (aff_1)list.get(0);
    }

    public static void b(bwh_0 bwh_02) {
        aov_0 aov_02;
        aov_0 aov_03 = (aov_0)c.remove(bwh_02.c());
        if (aov_03 != null) {
            aov_03.d();
        }
        if ((aov_02 = (aov_0)d.remove(bwh_02.c())) != null) {
            aov_02.d();
        }
    }

    public static void a(bvw_2 bvw_22, int n, boolean bl) {
        Optional<aov_0> optional = aoy_0.a(bvw_22, n);
        optional.ifPresent(aov_02 -> aov_02.a(bl));
    }

    public static void b(bvw_2 bvw_22, int n, boolean bl) {
        Optional<aov_0> optional = aoy_0.a(bvw_22, n);
        optional.ifPresent(aov_02 -> aov_02.o(bl));
    }

    private static Optional<aov_0> a(bvw_2 bvw_22, int n) {
        byte by = bvw_22.f();
        boolean bl = by == n;
        TIntObjectHashMap<aov_0> tIntObjectHashMap = bl ? c : d;
        Optional<aov_0> optional = Optional.ofNullable((aov_0)tIntObjectHashMap.get(bvw_22.c()));
        if (optional.isEmpty()) {
            a.error((Object)("FightSwordElement for the fight with the id " + bvw_22.c() + " not found."));
        }
        return optional;
    }

    public static void a(int n) {
        aov_0 aov_02;
        aov_0 aov_03 = (aov_0)c.get(n);
        if (aov_03 != null) {
            aov_03.aG();
        }
        if ((aov_02 = (aov_0)d.get(n)) != null) {
            aov_02.aG();
        }
    }

    static void a() {
        aoz_0 aoz_02 = new aoz_0();
        c.forEachValue((TObjectProcedure)aoz_02);
        d.forEachValue((TObjectProcedure)aoz_02);
        c.clear();
        d.clear();
    }

    public static void a(bwh_0 bwh_02, aPf aPf2) {
        switch (aPf2) {
            case a: {
                aoy_0.a(bwh_02.j());
                break;
            }
            case b: {
                aoy_0.b(bwh_02.j());
            }
        }
    }

    public static void c(bwh_0 bwh_02) {
        Collection collection = bwh_02.j();
        for (blx_1 blx_12 : collection) {
            blx_12.bv().ce();
            blx_12.bv().cf();
        }
    }

    public static void d(bwh_0 bwh_02) {
        ss_0 ss_02 = bwh_02.i();
        if (bwh_02 instanceof bvx_2) {
            apw_0.a().c(((bvx_2)bwh_02).ad());
        }
        if (ss_02 != null) {
            for (sr_0 sr_02 : ss_02.f()) {
                aoy_0.a(sr_02);
            }
            aoy_0.b();
        }
        apw_0.a().b();
    }

    public static void e(bwh_0 bwh_02) {
        ss_0 ss_02 = bwh_02.i();
        bvx_2 bvx_22 = (bvx_2)bwh_02;
        eke_0 eke_02 = bvx_22.ad();
        apw_0.a().a((sr_0)eke_02, bwh_02);
        if (ss_02 != null) {
            for (sr_0 sr_02 : ss_02.f()) {
                aoy_0.a(bwh_02, sr_02);
            }
        }
        aoy_0.b();
        apw_0.a().b();
    }

    public static void f(bwh_0 bwh_02) {
        aiD aiD2 = bwh_02.q();
        if (aiD2 != null) {
            aiD2.c();
        }
    }

    public static void g(bwh_0 bwh_02) {
        aiD aiD2 = bwh_02.q();
        if (aiD2 != null) {
            aiD2.b();
        }
    }

    private static void a(Collection<blx_1> collection) {
        for (blx_1 blx_12 : collection) {
            aoy_0.c(blx_12);
        }
    }

    private static void b(Collection<blx_1> collection) {
        for (blx_1 blx_12 : collection) {
            aoy_0.b(blx_12);
        }
    }

    static void a(blx_1 blx_12) {
        biI biI2 = blx_12.bv();
        biI2.e(biI2.aw());
        if (blx_12.bV()) {
            return;
        }
        biI2.c(true);
    }

    static void b(blx_1 blx_12) {
        blx_12.bv().f(false);
        blx_12.bv().e(0.6f);
        if (blx_12.bV()) {
            return;
        }
        blx_12.bv().c(!blx_12.ab_());
    }

    static void c(blx_1 blx_12) {
        blx_12.bv().c(false);
        blx_12.bv().f(false);
    }

    static void b() {
        ((aNF)ans_0.D().c()).a(apw_0.a());
    }

    static void a(bwh_0 bwh_02, sr_0 sr_02) {
        if (bwh_02.e(sr_02)) {
            apw_0.a().a(sr_02, bwh_02);
        }
    }

    static void a(sr_0 sr_02) {
        apw_0.a().c(sr_02);
    }

    public static void h(bwh_0 bwh_02) {
        aPc.f().a(ans_0.D().c().b().f());
        abY abY2 = ans_0.D().c().b();
        bvx_2 bvx_22 = (bvx_2)bwh_02;
        blx_1 blx_12 = bvx_22.A().H();
        if (blx_12 != null) {
            abY2.a(blx_12.bv());
            abY2.r();
        }
        abY2.a(true);
        aed.a.a((aei_0)((Object)bwh_02.q()));
    }

    public static void i(bwh_0 bwh_02) {
        ans_0.D().c().i(aPc.f().h());
        abY abY2 = ans_0.D().c().b();
        abY2.a(azu_0.j().k().bv());
        abY2.a(false);
        AlphaMaskCommand.c(false);
        HideFightOccluders.a(0);
        aed.a.b((aei_0)((Object)bwh_02.q()));
    }

    public static void a(ArrayList<abz_0> arrayList) {
        apa_0 apa_02 = new apa_0(arrayList);
        c.forEachValue((TObjectProcedure)apa_02);
        d.forEachValue((TObjectProcedure)apa_02);
    }
}

