/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from boL
 */
public class bol_1
extends ebk_0 {
    public static void a(ft_1 ft_12, List<Integer> list) {
        bhh_1.a(end_0.i).ifPresent(emy_02 -> list.forEach(n -> ((ebo_0)emy_02).a(ft_12, (int)n)));
    }

    public static void a(ft_1 ft_12, int n) {
        bhh_1.a(end_0.i).ifPresent(emy_02 -> {
            ((ebo_0)emy_02).b(ft_12, n);
            azu_0.j().K().c(new cmo(ft_12, Collections.singleton(n)));
        });
    }

    public static void a(ft_1 ft_12, Set<Integer> set) {
        bhh_1.a(end_0.i).ifPresent(emy_02 -> {
            ((ebo_0)emy_02).a(ft_12, set);
            azu_0.j().K().c(new cmo(ft_12, set));
        });
    }

    public static List<Integer> a(ft_1 ft_12) {
        return bol_1.b(ft_12).stream().map(fk_2::c).collect(Collectors.toList());
    }

    public static Collection<fk_2> b(ft_1 ft_12) {
        Optional optional = bhh_1.a(end_0.i);
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        Collection<fk_2> collection = ebo_02.d(ft_12);
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        return collection;
    }

    public static boolean a(int n, ft_1 ... ft_1Array) {
        for (ft_1 ft_12 : ft_1Array) {
            if (!bol_1.b(ft_12, n)) continue;
            return true;
        }
        Optional optional = bhh_1.a(end_0.i);
        if (optional.isEmpty()) {
            return false;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        for (ft_1 ft_13 : ft_1Array) {
            if (!ebo_02.d(ft_13).stream().anyMatch(fk_22 -> fk_22.c() == n)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(int n, ft_1 ... ft_1Array) {
        Optional optional = bhh_1.a(end_0.i);
        if (optional.isEmpty()) {
            return false;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        bjw_1 bjw_12 = bhb_0.d().a(n);
        if (bjw_12 == null) {
            return true;
        }
        for (ft_1 ft_12 : ft_1Array) {
            boolean bl = ebo_02.d(ft_12).stream().anyMatch(bol_1.a(bjw_12));
            if (!bl) continue;
            return true;
        }
        return false;
    }

    @NotNull
    private static Predicate<fk_2> a(bjw_1 bjw_12) {
        return fk_22 -> {
            bjw_1 bjw_13 = bhb_0.d().a(fk_22.c());
            if (bjw_13 == null || bjw_12 == null) {
                return true;
            }
            return bjw_13.C() == bjw_12.C();
        };
    }

    public static boolean c(int n, ft_1 ... ft_1Array) {
        Optional optional = bhh_1.a(end_0.i);
        if (optional.isEmpty()) {
            return false;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        for (ft_1 ft_12 : ft_1Array) {
            if (!ebo_02.e(ft_12).contains(n)) continue;
            return true;
        }
        return false;
    }

    @NotNull
    public static fk_2 a(long l, long l2, ft_1 ft_12) {
        List<fk_2> list = bol_1.b(l, l2, ft_12);
        if (list.isEmpty()) {
            return ebm_0.b;
        }
        return list.get(0);
    }

    public static List<fk_2> b(long l, long l2, ft_1 ft_12) {
        Optional<emy_0> optional = ena_0.a().a(l, end_0.i);
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        Optional<fv_2> optional2 = ebo_02.b(l2, ft_12);
        return optional2.map(fv_2::b).orElse(Collections.emptyList());
    }

    public static void a(long l, long l2, ft_1 ft_12, fk_2 fk_22) {
        Optional<emy_0> optional = ena_0.a().a(l, end_0.i);
        if (optional.isEmpty()) {
            return;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        ebo_02.a(l2, ft_12, fk_22);
    }

    public static void a(long l, long l2, ft_1 ft_12, fv_2 fv_22) {
        Optional<emy_0> optional = ena_0.a().a(l, end_0.i);
        if (optional.isEmpty()) {
            return;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        ebo_02.a(l2, ft_12, fv_22);
    }

    public static void b(long l, long l2, ft_1 ft_12, fk_2 fk_22) {
        Optional<emy_0> optional = ena_0.a().a(l, end_0.i);
        if (optional.isEmpty()) {
            return;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        ebo_02.b(l2, ft_12, fk_22);
    }

    public static String c(ft_1 ft_12) {
        switch (ft_12) {
            case a: {
                return "SmallMount";
            }
            case b: {
                return "SmallPet";
            }
            case c: {
                return "SmallCostume";
            }
            case d: {
                return "SmallRun";
            }
            case f: {
                return "SmallAura";
            }
            case e: {
                return "SmallFinisher";
            }
            case k: {
                return "SmallCape";
            }
            case h: {
                return "SmallHelmet";
            }
            case l: {
                return "SmallBoot";
            }
            case i: {
                return "SmallChest";
            }
            case j: {
                return "SmallShoulder";
            }
            case m: {
                return "SmallBigSword";
            }
            case n: {
                return "SmallShield";
            }
        }
        return "SmallStar";
    }

    public static int d(ft_1 ft_12) {
        switch (ft_12) {
            case c: {
                return 0;
            }
            case b: {
                return 1;
            }
            case a: {
                return 2;
            }
            case d: {
                return 3;
            }
            case e: {
                return 4;
            }
            case f: {
                return 5;
            }
            case h: {
                return 6;
            }
            case j: {
                return 7;
            }
            case i: {
                return 8;
            }
            case k: {
                return 9;
            }
            case l: {
                return 10;
            }
            case m: {
                return 11;
            }
            case n: {
                return 12;
            }
        }
        return 20;
    }

    public static List<ft_1> a(exh_2[] exh_2Array) {
        return Arrays.stream(exh_2Array).map(bol_1::a).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }

    public static Optional<ft_1> a(exh_2 exh_22) {
        if (exh_22 == null) {
            return Optional.empty();
        }
        switch (exh_22) {
            case a: {
                return Optional.of(ft_1.h);
            }
            case d: {
                return Optional.of(ft_1.j);
            }
            case f: {
                return Optional.of(ft_1.i);
            }
            case m: {
                return Optional.of(ft_1.l);
            }
            case n: {
                return Optional.of(ft_1.k);
            }
            case p: {
                return Optional.of(ft_1.m);
            }
            case q: {
                return Optional.of(ft_1.n);
            }
        }
        return Optional.empty();
    }

    public static String e(ft_1 ft_12) {
        switch (ft_12) {
            case a: {
                return bae.h().a("contentLoader.mountSkin", new Object[0]);
            }
            case b: {
                return bae.h().a("cosmetics.name.pet", new Object[0]);
            }
            case c: {
                return bae.h().a(exh_2.x.B, new Object[0]);
            }
            case d: {
                return bae.h().a("cosmetics.name.sprint", new Object[0]);
            }
            case f: {
                return bae.h().a("cosmetics.name.aura", new Object[0]);
            }
            case e: {
                return bae.h().a("cosmetics.name.finisher", new Object[0]);
            }
            case h: {
                return bae.h().a("cosmetics.name.head", new Object[0]);
            }
            case i: {
                return bae.h().a("cosmetics.name.chest", new Object[0]);
            }
            case j: {
                return bae.h().a("cosmetics.name.shoulder", new Object[0]);
            }
            case k: {
                return bae.h().a("cosmetics.name.back", new Object[0]);
            }
            case l: {
                return bae.h().a("cosmetics.name.boots", new Object[0]);
            }
            case m: {
                return bae.h().a("cosmetics.name.weapon1", new Object[0]);
            }
            case n: {
                return bae.h().a("cosmetics.name.weapon2", new Object[0]);
            }
        }
        return bae.h().a("menu", new Object[0]);
    }

    public static boolean f(ft_1 ft_12) {
        switch (ft_12) {
            case g: 
            case o: {
                return false;
            }
        }
        List<Long> list = enp_2.a.h(ens_2.cF);
        return !list.contains(ft_12.getNumber());
    }

    public static boolean a(ffa_0 ffa_02, fk_2 fk_22) {
        if (!fk_22.f() || fk_22.g() == 0) {
            return false;
        }
        boolean bl = fk_22.c() != 0;
        Optional<fge> optional = fgh.a.e(fk_22.g());
        if (optional.isEmpty()) {
            return false;
        }
        fge fge2 = optional.get();
        if (!bl) {
            return fge2.b() == ffa_02.a().b();
        }
        fgj fgj2 = fgl.a.b((Integer)fk_22.c());
        if (fgj2 == null) {
            return fge2.b() == ffa_02.a().b();
        }
        fge fge3 = fgh.a.b(fgj2.d());
        if (fge3 == null) {
            return false;
        }
        return fge3.d(fk_22.g());
    }

    public static boolean a(exk_2 exk_22) {
        return Arrays.stream(exk_22.U().h()).anyMatch(exh_22 -> bol_1.a(exh_22).isPresent());
    }

    public static int a(long l, long l2, bjw_1 bjw_12) {
        Optional optional = ena_0.a().b(l, end_0.i);
        int n2 = bjw_12.C();
        if (optional.isEmpty()) {
            return n2;
        }
        exh_2 exh_22 = bjw_12.F().h()[0];
        Optional<ft_1> optional2 = bol_1.a(exh_22);
        if (optional2.isEmpty()) {
            return n2;
        }
        Optional<fk_2> optional3 = ((ebo_0)optional.get()).c(l2, optional2.get());
        if (optional3.isEmpty()) {
            return n2;
        }
        return optional3.map(fk_2::c).map(n -> bhb_0.d().a((int)n)).filter(bjw_13 -> bjw_13.F().d() == bjw_12.F().d()).map(ezr_0::C).orElse(n2);
    }

    public static int b(exk_2 exk_22) {
        return exk_22.l() > 0 ? exk_22.l() : exk_22.aT_();
    }

    public static Optional<exh_2> g(ft_1 ft_12) {
        switch (ft_12) {
            case h: {
                return Optional.of(exh_2.a);
            }
            case i: {
                return Optional.of(exh_2.f);
            }
            case j: {
                return Optional.of(exh_2.d);
            }
            case k: {
                return Optional.of(exh_2.n);
            }
            case l: {
                return Optional.of(exh_2.m);
            }
            case m: {
                return Optional.of(exh_2.p);
            }
            case n: {
                return Optional.of(exh_2.q);
            }
            case b: {
                return Optional.of(exh_2.w);
            }
            case a: {
                return Optional.of(exh_2.y);
            }
        }
        return Optional.empty();
    }
}

