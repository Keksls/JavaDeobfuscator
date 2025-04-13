/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eMB
 */
public final class emb_0 {
    private emb_0() {
    }

    public static <T extends epq_2> boolean a(emx_1<T> emx_12, epq_2 epq_23) {
        if (!epq_23.f(erl_2.bg)) {
            return true;
        }
        byte by = epq_23.Y();
        boolean bl = emx_12.j().stream().filter(epq_22 -> epq_22.Y() != by).anyMatch(epq_22 -> epq_22.f(erl_2.be));
        return !bl;
    }

    public static <T extends epq_2> boolean a(emx_1<T> emx_12, T t, byte by) {
        if (t.gY() == 1) {
            return true;
        }
        for (epq_2 epq_22 : emx_12.j()) {
            byte by2;
            if (epq_22.Y() != by || epq_22.f(erl_2.be) || (by2 = epq_22.gY()) != 1) continue;
            return false;
        }
        return true;
    }

    public static <T extends epq_2> boolean a(elv_0<T> elv_02, T t, byte by) {
        if (elv_02.af_().H()) {
            return true;
        }
        if (!(t instanceof Xe)) {
            return true;
        }
        Xe xe2 = (Xe)((Object)t);
        if (!xe2.a(Xd.b)) {
            return true;
        }
        long l = xe2.b(Xd.b);
        Optional<Byte> optional = elv_02.j().stream().filter(Xe.class::isInstance).map(Xe.class::cast).filter(xe -> xe.a(Xd.b)).filter(xe -> xe.b(Xd.b) == l).findFirst().map(xe -> ((elw_0)((Object)xe)).Y());
        if (optional.isEmpty()) {
            return true;
        }
        Byte by2 = optional.get();
        return by2 == by;
    }

    public static <T extends epq_2> boolean b(elv_0<T> elv_02, T t, byte by) {
        if (elv_02.af_().I()) {
            return true;
        }
        if (t == null) {
            return true;
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(t.T_());
        if (!fjv_02.a()) {
            return true;
        }
        faX faX2 = t.fE().m();
        if (faX2 == null) {
            return true;
        }
        boolean bl = t.f(erl_2.bi);
        boolean bl2 = t.f(erl_2.bj);
        Collection collection = elv_02.g(by);
        for (epq_2 epq_22 : collection) {
            if (epq_22 == null) continue;
            boolean bl3 = bl && epq_22.f(erl_2.bj);
            if (!(bl3 = bl3 || bl2 && epq_22.f(erl_2.bi))) continue;
            return false;
        }
        return true;
    }

    public static <T extends epq_2> ema_1 c(elv_0<T> elv_02, T t, byte by) {
        boolean bl;
        if (!elv_02.af_().J()) {
            return ema_1.a;
        }
        fgy_0 fgy_02 = null;
        byte by2 = -1;
        for (epq_2 epq_22 : elv_02.j()) {
            fgy_02 = emb_0.a(epq_22);
            if (fgy_02 == null) continue;
            by2 = epq_22.Y();
            break;
        }
        if (fgy_02 == null) {
            return ema_1.a;
        }
        boolean bl2 = by == by2;
        boolean bl3 = emb_0.a(fgy_02, t) && fgy_02.F() != 0;
        boolean bl4 = bl = emb_0.b(fgy_02, t) && fgy_02.F() != 0;
        if (bl2 && bl) {
            return ema_1.g;
        }
        if (!bl2 && bl3) {
            return ema_1.h;
        }
        return ema_1.a;
    }

    private static <T extends epq_2> boolean a(fgy_0 fgy_02, T t) {
        fbl_0 fbl_02 = t.fE().m().F().c(fgy_02.F());
        return fbl_02 == fbl_0.b;
    }

    private static <T extends epq_2> boolean b(fgy_0 fgy_02, T t) {
        fbl_0 fbl_02 = t.fE().m().F().c(fgy_02.F());
        return fbl_02 == fbl_0.a;
    }

    @Nullable
    private static <T extends epq_2> fgy_0 a(T t) {
        if (t.gY() != 1) {
            return null;
        }
        return t.aa_();
    }
}

