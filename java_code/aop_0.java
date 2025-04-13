/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from aOP
 */
public class aop_0 {
    private static final Logger b = Logger.getLogger(aop_0.class);
    public static final int a = 8;
    static final Comparator<blx_1> c = new aoq_0();
    static final Comparator<blx_1> d = new aor_0();
    static final Comparator<blx_1> e = new aos_0();
    private static final Comparator<blx_1> f = new aot_0();

    static Optional<aov_0> a(aff_1 aff_12, bvw_2 bvw_22, int n) {
        try {
            aov_0 aov_02 = new aov_0(abd_1.c(), aff_12.d(), aff_12.e(), aff_12.f(), bvw_22, (byte)n);
            aov_02.b();
            aov_02.a(new aou_0(bvw_22, aov_02));
            return Optional.of(aov_02);
        }
        catch (Exception exception) {
            b.error((Object)"unable to create fight sword element", (Throwable)exception);
            return Optional.empty();
        }
    }

    static boolean a(bvw_2 bvw_22, blx_1 blx_13, dhg dhg2) {
        if (bvw_22 == null) {
            return false;
        }
        if (blx_13 == null) {
            return false;
        }
        byte by = bvw_22.f();
        List list = bvw_22.g(by).stream().filter(blx_12 -> !blx_12.C_()).sorted(c.thenComparing(e.thenComparing(d))).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        byte by2 = by == 0 ? (byte)1 : 0;
        List list2 = bvw_22.af_().O() ? bvw_22.g(by2).stream().filter(blx_12 -> !blx_12.C_()).sorted(Comparator.comparing(epq_2::a_).reversed()).limit(8L).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList)) : bvw_22.g(by2).stream().filter(blx_12 -> !blx_12.C_()).sorted(c.thenComparing(e.thenComparing(d))).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        int n = ahq_2.b(list, blx_12 -> blx_12.dr());
        int n2 = ahq_2.b(list2, blx_12 -> blx_12.dr());
        if (!list.isEmpty()) {
            biM.b(dhg2, n);
        }
        if (!list2.isEmpty()) {
            biM.c(dhg2, n2);
        }
        boolean bl = blx_13.bv().v();
        biM.a(dhg2, blx_13);
        if (!list.isEmpty()) {
            dhg2.a(list.get(0) instanceof bnh_1);
        }
        if (!list2.isEmpty()) {
            dhg2.b(list2.get(0) instanceof bnh_1);
        }
        aop_0.a(true, list, bl, dhg2);
        aop_0.a(false, list2, bl, dhg2);
        aop_0.b(dhg2, bvw_22);
        aop_0.a(dhg2, bvw_22);
        ani_2 ani_22 = new ani_2();
        dhg2.c(ani_22.a().a((CharSequence)(list.size() + " VS " + list2.size())).b().r());
        ani_22.u();
        return true;
    }

    private static void b(dhg dhg2, bvw_2 bvw_22) {
        ani_2 ani_22 = new ani_2();
        boolean bl = aop_0.a(bvw_22);
        String string = bl ? bae.h().a("fight.placement", new Object[0]) : bae.h().a("desc.inFight", new Object[0]);
        dhg2.g(ani_22.a().a((CharSequence)string).b().r());
    }

    public static void a(dhg dhg2, bvw_2 bvw_22) {
        Object object;
        boolean bl = aop_0.a(bvw_22);
        if (bl) {
            object = bae.h().a("remainingDurationSeconds", bvw_22.A().g());
        } else {
            String string = bvw_22.B();
            String string2 = bae.h().a("fight.turn", bvw_22.z());
            object = string + " - " + string2;
        }
        dhg2.f((String)object);
    }

    private static boolean a(bvw_2 bvw_22) {
        return bvw_22.e() == elp_0.b || bvw_22.e() == elp_0.d;
    }

    public static void a(boolean bl, List<blx_1> list, boolean bl2, dhg dhg2) {
        for (blx_1 blx_12 : list) {
            boolean bl3;
            Object object;
            if (blx_12 instanceof bmv_1) {
                object = bon_1.f((bmv_1)blx_12);
                biM.a(bl2, blx_12, dhg2, (bop_1)object);
                continue;
            }
            if (!(blx_12 instanceof bnh_1)) continue;
            biM.a(blx_12.bv());
            object = biM.a(blx_12);
            String string = (String)blx_12.b("smileyIconUrl");
            boolean bl4 = bl3 = blx_12.ha() || blx_12.ab_();
            if (bl) {
                dhg2.a((String)object, biM.b(blx_12, true), string, null, bl3);
                continue;
            }
            dhg2.b((String)object, biM.b(blx_12, true), string, null, bl3);
        }
    }
}

