/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;

/*
 * Renamed from bGP
 */
public final class bgp_1 {
    private static final Logger b = Logger.getLogger(bgp_1.class);
    private static final int c = 82;
    public static final String a = "BagIn-1";

    private bgp_1() {
    }

    public static boolean a(long l, exk_2 exk_22, BiConsumer<Long, aff_1> biConsumer) {
        boolean bl = bgp_1.a();
        if (!bgp_1.b() && !bl) {
            aUh.a("error.deploy.notInBag", new Object[0]);
            return false;
        }
        czu_0 czu_02 = bgp_1.c();
        if (azu_0.j().c(czu_02)) {
            azu_0.j().b(czu_02);
            return false;
        }
        bFZ bFZ2 = bfv_0.b().e(l);
        if (bFZ2 == null) {
            b.error((Object)("[IE Deploy] TemplateId=" + l + " inconnu"));
            return false;
        }
        if (bFZ2 instanceof bel_0 && bl) {
            aUh.a("error.cannotDeployMerchantDisplayInHavenWorld", new Object[0]);
            bFZ2.release();
            return false;
        }
        bFZ2.i(false);
        bFZ2.aI_();
        for (ph_0 ph_02 : bFZ2.av_()) {
            if (!(ph_02 instanceof ahv)) continue;
            ahv ahv2 = (ahv)ph_02;
            ahs.d().a(ahv2);
        }
        bgf_1 bgf_12 = bFZ2.aG_();
        czu_02.a(bgf_12);
        czu_02.b(() -> {
            bgp_1.d(bFZ2);
            biConsumer.accept(exk_22.a(), bgf_12.aB().b());
            bFZ2.release();
        });
        czu_02.a(() -> {
            bst_1 bst_12 = czu_02.c();
            if (bst_12 != null && bst_12.a()) {
                aUh.a(bst_12.b(), new Object[0]);
            }
            bgp_1.d(bFZ2);
            bFZ2.release();
        });
        czu_02.a(cZV.a);
        azu_0.j().a(czu_02);
        return true;
    }

    private static void d(bFZ bFZ2) {
        for (ph_0 ph_02 : bFZ2.av_()) {
            if (!(ph_02 instanceof ahv)) continue;
            ahv ahv2 = (ahv)ph_02;
            ahs.d().b(ahv2);
        }
    }

    public static boolean a(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        long l2 = bos_22.d();
        if (l2 <= 0L) {
            return false;
        }
        return l == cci_2.a.b(l2);
    }

    public static boolean a(long l, BiConsumer<Long, bgv_1> biConsumer) {
        bFZ bFZ2;
        boolean bl = bgp_1.a();
        if (!bgp_1.b() && !bl) {
            aUh.a("error.deploy.notInBag", new Object[0]);
            return false;
        }
        czu_0 czu_02 = bgp_1.c();
        if (azu_0.j().c(czu_02)) {
            czu_02.f();
        }
        if ((bFZ2 = bfv_0.b().e(l)) == null) {
            b.error((Object)("[IE Deploy] TemplateId=" + l + " inconnu"));
            return false;
        }
        if (bFZ2 instanceof bel_0 && bl) {
            aUh.a("error.cannotDeployMerchantDisplayInHavenWorld", new Object[0]);
            bFZ2.release();
            return false;
        }
        bFZ2.a(czu_02.d());
        bFZ2.i(false);
        bFZ2.aI_();
        for (ph_0 ph_02 : bFZ2.av_()) {
            if (!(ph_02 instanceof ahv)) continue;
            ahv ahv2 = (ahv)ph_02;
            ahs.d().a(ahv2);
        }
        bgf_1 bgf_12 = bFZ2.aG_();
        czu_02.a(bgf_12);
        czu_02.b(() -> biConsumer.accept(l, new bgv_1(bgf_12.aB().b(), bgf_12.F())));
        czu_02.c(() -> {
            for (ph_0 ph_02 : bFZ2.av_()) {
                if (!(ph_02 instanceof ahv)) continue;
                ahv ahv2 = (ahv)ph_02;
                ahs.d().b(ahv2);
            }
            bFZ2.release();
        });
        czu_02.a(() -> {
            bst_1 bst_12 = czu_02.c();
            if (bst_12 != null && bst_12.a()) {
                aUh.a(bst_12.b(), new Object[0]);
            }
            for (ph_0 ph_02 : bFZ2.av_()) {
                if (!(ph_02 instanceof ahv)) continue;
                ahv ahv2 = (ahv)ph_02;
                ahs.d().b(ahv2);
            }
            bFZ2.release();
        });
        czu_02.a(cZV.a);
        if (!azu_0.j().c(czu_02)) {
            azu_0.j().a(czu_02);
        } else {
            bFZ2.aB().c();
        }
        return true;
    }

    public static boolean a() {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        long l = bos_22.d();
        if (l <= 0L) {
            return false;
        }
        long l2 = bmr_12.T_();
        return l2 == cci_2.a.b(l);
    }

    public static boolean b() {
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12.di() == bmr_12.dj();
    }

    public static czu_0 c() {
        if (bgp_1.b()) {
            return cxm_0.a();
        }
        return czb_0.a();
    }

    public static boolean a(adt_1 adt_12, bgf_1 bgf_12) {
        dhK dhK2 = (dhK)adt_12;
        KeyEvent keyEvent = dhK2.k();
        if (keyEvent == null) {
            return false;
        }
        if (keyEvent.getKeyCode() != 82) {
            return true;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        bgf_12.aN_();
        return false;
    }

    public static boolean a(bFZ bFZ2) {
        OptionalInt optionalInt = bgp_1.e(bFZ2);
        if (optionalInt.isEmpty()) {
            return false;
        }
        int n = optionalInt.getAsInt();
        bjw_1 bjw_12 = bhb_0.d().a(n);
        if (bjw_12 == null) {
            return false;
        }
        bjs_2 bjs_22 = bht_1.a(bjw_12);
        return bjs_22 != null;
    }

    public static boolean b(bFZ bFZ2) {
        OptionalInt optionalInt = bgp_1.e(bFZ2);
        if (optionalInt.isEmpty()) {
            return false;
        }
        return bgo_1.a(optionalInt.getAsInt());
    }

    private static OptionalInt e(bFZ bFZ2) {
        if (bFZ2 == null) {
            return OptionalInt.empty();
        }
        Optional<Integer> optional = eum_1.a().a(bFZ2.aC());
        return optional.map(OptionalInt::of).orElse(OptionalInt.empty());
    }

    public static List<String> c(bFZ bFZ2) {
        bgf_1 bgf_12 = bFZ2.aH_();
        if (bgf_12 == null) {
            return null;
        }
        if (bgf_12.aM_()) {
            return null;
        }
        try {
            return Lists.newArrayList((Object[])new String[]{String.format(azs_0.a().a("pictoIconPath"), a)});
        }
        catch (gm_0 gm_02) {
            b.error((Object)gm_02);
            return null;
        }
    }
}

