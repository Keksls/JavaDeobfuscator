/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eUu
 */
public class euu_2 {
    private static final Logger a = Logger.getLogger(euu_2.class);

    private euu_2() {
    }

    public static boolean a() {
        return enp_2.a.d(ens_2.aD);
    }

    public static boolean b() {
        return enp_2.a.d(ens_2.al);
    }

    public static boolean c() {
        return enp_2.a.d(ens_2.bb);
    }

    public static <T extends epq_2> T a(long l) {
        long l2 = euv_2.a.b(l);
        if (l2 > 0L) {
            return euw_2.a.d(l2);
        }
        return null;
    }

    public static enX a(long l, long l2) {
        if (euu_2.b(l) != enX.a) {
            return enX.b;
        }
        if (l2 <= 0L) {
            return enX.a;
        }
        boolean bl = enp_2.a.d(ens_2.t);
        if (!bl && eoe_0.k.contains(l2)) {
            return enX.c;
        }
        if (eoe_0.o.contains(l2)) {
            return enX.c;
        }
        return enX.a;
    }

    public static enX b(long l) {
        if (l <= 0L) {
            return enX.a;
        }
        boolean bl = enp_2.a.d(ens_2.t);
        if (!bl && eoe_0.k.contains(l)) {
            return enX.b;
        }
        if (eoe_0.n.contains(l)) {
            return enX.b;
        }
        return enX.a;
    }

    public boolean c(long l) {
        a.error((Object)new Exception("Can't check with common, try with client or server HeroUtils"));
        return false;
    }

    public static aff_1 d(long l) {
        Object t = euw_2.a.d(euv_2.a.b(l));
        return t != null ? ((epq_2)t).P_() : new aff_1();
    }

    public static int e(long l) {
        Object t = euw_2.a.d(euv_2.a.b(l));
        return t != null ? ((epq_2)t).G() : 0;
    }

    public static int f(long l) {
        Object t = euw_2.a.d(euv_2.a.b(l));
        return t != null ? ((epq_2)t).H() : 0;
    }

    public static int g(long l) {
        Object t = euw_2.a.d(euv_2.a.b(l));
        return t != null ? ((epq_2)t).I() : (short)0;
    }

    public static <T extends epq_2> T b(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            exh_1 exh_12;
            Object t = euw_2.a.d(l3);
            if (t == null || (exh_12 = ((epq_2)t).dS()) == null || !exh_12.c(l2)) continue;
            return t;
        }
        return null;
    }

    public static <T extends epq_2> T c(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            exh_1 exh_12;
            Object t = euw_2.a.d(l3);
            if (t == null || (exh_12 = ((epq_2)t).dS()) == null || !exh_12.j(l2)) continue;
            return t;
        }
        return null;
    }

    public static boolean a(long l, TObjectObjectProcedure<epq_2, exk_2> tObjectObjectProcedure) {
        for (long l2 : euw_2.a.e(l)) {
            Object t = euw_2.a.d(l2);
            if (t == null || ((epq_2)t).dS() == null || ((epq_2)t).dS().a((TObjectProcedure<exk_2>)((TObjectProcedure)exk_22 -> tObjectObjectProcedure.execute(t, exk_22)))) continue;
            return false;
        }
        return true;
    }

    @Nullable
    public static <T extends epq_2> T d(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            Object t = euw_2.a.d(l3);
            if (!((epq_2)t).dC().c(l2)) continue;
            return t;
        }
        return null;
    }

    @Nullable
    public static <T extends epq_2> T e(long l, long l2) {
        for (epq_2 epq_22 : euw_2.a.g(l)) {
            if (!epq_22.dC().d(l2)) continue;
            return (T)epq_22;
        }
        return null;
    }

    public static <T extends epq_2> T f(long l, long l2) {
        T t = euu_2.c(l, l2);
        if (t != null) {
            return t;
        }
        return euu_2.d(l, l2);
    }

    @Nullable
    public static exk_2 g(long l, long l2) {
        Cm<Long, exk_2> cm = euu_2.h(l, l2);
        if (cm != null) {
            return cm.b();
        }
        return null;
    }

    public static Optional<Cm<Long, exk_2>> a(long l, int n) {
        for (long l2 : euw_2.a.e(l)) {
            exh_1 exh_12;
            Object t = euw_2.a.d(l2);
            if (t == null || (exh_12 = ((epq_2)t).dS()) == null) continue;
            for (exg_2 exg_22 : exh_12.j()) {
                if (!exg_22.a(n)) continue;
                return Optional.of(new Cm<Long, exk_2>(l2, exg_22.c(n)));
            }
        }
        return Optional.empty();
    }

    public static Cm<Long, exk_2> h(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            exh_1 exh_12;
            Object t = euw_2.a.d(l3);
            if (t == null || (exh_12 = ((epq_2)t).dS()) == null || !exh_12.j(l2)) continue;
            return new Cm<Long, exk_2>(l3, exh_12.f(l2).c(l2));
        }
        return null;
    }

    @Nullable
    public static exk_2 i(long l, long l2) {
        Cm<Long, exk_2> cm = euu_2.j(l, l2);
        if (cm != null) {
            return cm.b();
        }
        return null;
    }

    public static Optional<Cm<Long, exk_2>> b(long l, int n) {
        for (long l2 : euw_2.a.e(l)) {
            eyt_0 eyt_02;
            Object t = euw_2.a.d(l2);
            if (t == null || (eyt_02 = ((epq_2)t).dC()) == null || !eyt_02.a(n)) continue;
            return Optional.of(new Cm<Long, exk_2>(l2, eyt_02.b(n)));
        }
        return Optional.empty();
    }

    public static Cm<Long, exk_2> j(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            Optional<exk_2> optional;
            eyt_0 eyt_02;
            Object t = euw_2.a.d(l3);
            if (t == null || (eyt_02 = ((epq_2)t).dC()) == null || !(optional = eyt_02.b(l2)).isPresent()) continue;
            return new Cm<Long, exk_2>(l3, optional.get());
        }
        return null;
    }

    public static exk_2 k(long l, long l2) {
        exk_2 exk_22 = euu_2.g(l, l2);
        if (exk_22 != null) {
            return exk_22;
        }
        return euu_2.i(l, l2);
    }

    public static exg_2 l(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            exh_1 exh_12;
            Object t = euw_2.a.d(l3);
            if (t == null || (exh_12 = ((epq_2)t).dS()) == null || !exh_12.c(l2)) continue;
            return exh_12.l(l2);
        }
        return null;
    }

    public static exg_2 m(long l, long l2) {
        for (long l3 : euw_2.a.e(l)) {
            exh_1 exh_12;
            Object t = euw_2.a.d(l3);
            if (t == null || (exh_12 = ((epq_2)t).dS()) == null || !exh_12.j(l2)) continue;
            return exh_12.f(l2);
        }
        return null;
    }

    public static int a(epq_2 epq_22, evt_1 evt_12) {
        TLongHashSet tLongHashSet = euw_2.a.e(epq_22.U_());
        return tLongHashSet.size() * evt_12.j();
    }

    public static long a(faU faU2, evt_1 evt_12) {
        TLongHashSet tLongHashSet = euw_2.a.e(faU2.U_());
        return evt_12.l() * tLongHashSet.size();
    }

    public static <T extends epq_2> void a(T t, Consumer<T> consumer) {
        if (t == null) {
            return;
        }
        if (consumer == null) {
            return;
        }
        boolean bl = euv_2.a.a(t);
        if (bl) {
            euu_2.a(t.U_(), consumer);
        } else {
            consumer.accept(t);
        }
    }

    public static <T extends epq_2> void a(long l, Consumer<T> consumer) {
        euu_2.b(l, consumer);
        euu_2.c(l, consumer);
    }

    private static <T extends epq_2> void b(long l, Consumer<T> consumer) {
        long l2 = euv_2.a.b(l);
        Object t = euw_2.a.d(l2);
        if (t == null) {
            return;
        }
        try {
            consumer.accept(t);
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)"[HERO PROCEDURE] Exception raised when executing procedure on leader", (Throwable)runtimeException);
        }
    }

    private static <T extends epq_2> void c(long l, Consumer<T> consumer) {
        long l2 = euv_2.a.b(l);
        euw_2.a.b(l, epq_22 -> {
            if (epq_22.a_() == l2) {
                return true;
            }
            try {
                consumer.accept(epq_22);
            }
            catch (RuntimeException runtimeException) {
                a.error((Object)"[HERO PROCEDURE] Exception raised when executing procedure on hero", (Throwable)runtimeException);
            }
            return true;
        });
    }

    public static <T extends epq_2> T h(long l) {
        return euw_2.a.d(euv_2.a.b(l));
    }
}

