/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eBx {
    private static final Logger a = Logger.getLogger(eBx.class);

    private eBx() {
    }

    public static Optional<ezi_1> a(epq_2 epq_22) {
        if (!epq_22.a(eqr_1.d) || epq_22.R_() == null) {
            return Optional.empty();
        }
        return eBx.a(epq_22.U_(), epq_22.dr(), epq_22.R_());
    }

    public static Optional<ezi_1> a(eBt eBt2) {
        return eBx.a(eBt2.f(), eBt2.d(), eBt2.h());
    }

    private static Optional<ezi_1> a(long l, short s2, exq_2 exq_22) {
        short s3 = euw_2.a.i(l);
        boolean bl = exq_22.a(exk_22 -> exk_22.aQ_() || exk_22.c() <= s3 || exk_22.a(ext_1.k));
        ezi_1 ezi_12 = ezi_1.b((short)Math.min(s2, s3));
        if (ezi_12.a() <= s2 && (!bl || exq_22.m())) {
            if (eZh.a(ezi_12.a()).a().isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(ezi_12);
        }
        return Optional.empty();
    }

    public static exk_2 a(exh_2 exh_22, int n) {
        return exk_2.a(Hw.c((int)exh_22.A, n), eyo_1.g().d(n));
    }

    public static Optional<eBl> a(@NotNull epq_2 epq_22, @NotNull epq_2 epq_23, @NotNull exk_2 exk_22, byte by, boolean bl) {
        if (!exk_22.aQ_() && exk_22.c() > euw_2.a.i(epq_22.U_())) {
            return Optional.of(eBl.c);
        }
        if (exk_22.aa() && exk_22.n().a().g()) {
            return Optional.of(eBl.d);
        }
        if (!exk_22.T().U() || !exk_22.T().a(exh_2.a(by))) {
            return Optional.of(eBl.e);
        }
        if (bl && exk_22.T().a(exz_1.c) != null && !exk_22.T().a(exz_1.c).b(epq_23, epq_23, exk_22, epq_23.Q_())) {
            return Optional.of(eBl.g);
        }
        if (exk_22.e() > 1) {
            return Optional.of(eBl.i);
        }
        if (!exf_1.a(exk_22)) {
            return Optional.of(eBl.h);
        }
        if (!exk_22.aQ_() && epq_23.dr() < exk_22.c()) {
            return Optional.of(eBl.c);
        }
        return Optional.empty();
    }

    @NotNull
    public static Optional<eBl> a(@NotNull epq_2 epq_22, @NotNull epq_2 epq_23, @NotNull exk_2 exk_22, byte by) {
        if (epq_22.ak() && epq_22.ck() != null && epq_22.ck().e() != elp_0.b) {
            return Optional.of(eBl.b);
        }
        if (epq_22.a(erl_2.aB)) {
            return Optional.of(eBl.f);
        }
        Optional<eBl> optional = eBx.a(epq_22, epq_23, exk_22, by, true);
        if (optional.isPresent()) {
            return optional;
        }
        exq_2 exq_22 = epq_23.R_();
        if (exq_22 != null && exq_22.a(by)) {
            return Optional.of(eBl.j);
        }
        if (exq_22 != null && exq_22.e(exk_22.a()) != null) {
            a.error((Object)("[Companion] Item with unique ID " + exk_22.a() + " is already present in companion " + epq_23 + " inventory (player = " + epq_22 + ";item=" + exk_22.aq() + ")"));
            return Optional.of(eBl.k);
        }
        if (exq_22 != null && !exf_1.a(exq_22, null, exk_22)) {
            return Optional.of(eBl.l);
        }
        return Optional.empty();
    }

    public static List<exk_2> a(@NotNull epq_2 epq_22, @NotNull epq_2 epq_23, exq_2 exq_22) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        exq_22.a((exk_22, n) -> {
            if (exk_22.aU_() && eBx.a(epq_22, epq_23, exk_22, n.byteValue(), true).isPresent()) {
                arrayList.add((exk_2)exk_22);
            }
        });
        return arrayList;
    }

    public static short b(eBt eBt2) {
        return (short)Math.min(euw_2.a.i(eBt2.f()), eBt2.d());
    }

    public static boolean a(eBt eBt2, exk_2 exk_22) {
        short s2 = eBx.b(eBt2);
        if (exk_22.aQ_() || exk_22.a(ext_1.k)) {
            return true;
        }
        if (exk_22.w() && exk_22.x().c() > s2) {
            return false;
        }
        return exk_22.c() <= s2;
    }

    public static Map<Integer, exk_2> c(eBt eBt2) {
        HashMap<Integer, exk_2> hashMap = new HashMap<Integer, exk_2>();
        eBt2.h().a((exk_22, n) -> hashMap.put((Integer)n, (exk_2)exk_22));
        return hashMap;
    }

    public static List<exk_2> a(Map<Integer, exk_2> map, exq_2 exq_22) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        map.forEach((n, exk_22) -> {
            exk_2 exk_23 = (exk_2)exq_22.e(n.shortValue());
            if (exk_23 == null || exk_23.a() != exk_22.a()) {
                arrayList.add((exk_2)exk_22);
            }
        });
        return arrayList;
    }
}

