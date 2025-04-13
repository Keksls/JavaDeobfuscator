/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

public final class bKY
extends bKX {
    private static final Map<Integer, bLh> u = new HashMap<Integer, bLh>();
    public static final String a = "isSeller";
    public static final String b = "remainingDuration";
    public static final String d = "sellerNameWithLanguages";
    public static final String e = "shortenedQuantity";
    public static final String k = "itemLevel";
    public static final String l = "isSlotColorsOrderFixed";
    public static final String m = "hasShardSlots";
    public static final String n = "shardSlots";
    public static final String o = "hasAnySublimation";
    public static final String p = "hasBasicSublimation";
    public static final String q = "hasSpecialSublimation";
    public static final String r = "basicSublimationName";
    public static final String s = "formattedSpecialSublimationName";
    public static final String t = "canBeFulfilled";
    private static final String[] v;
    private final mq_1 w;
    private final ww_0 x;
    private final bjw_1 y;
    private final List<bLh> z;
    private final boolean A;

    public bKY(mq_1 mq_12, long l) {
        this.w = mq_12;
        this.x = bKT.a(mq_12.v(), l);
        this.y = bhb_0.d().a(this.w.e());
        this.z = this.k() ? this.w.y().stream().map(u::get).collect(Collectors.toList()) : Collections.emptyList();
        this.A = this.n();
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "isSeller": {
                return bhh_1.b() == this.w.g();
            }
            case "remainingDuration": {
                return bKT.a(this.x);
            }
            case "sellerNameWithLanguages": {
                return bvs_0.a(((bvx_0)ans_0.D().h()).m(), this.w.i(), xz_0.a(this.w.n()), Ow.c((byte)this.w.l()));
            }
            case "shortenedQuantity": {
                int n = this.w.r();
                if (n < 10000) {
                    return n;
                }
                return n / 1000 + "k";
            }
            case "itemLevel": {
                if (this.w.w()) {
                    return this.w.x();
                }
                return this.y.G();
            }
            case "isSlotColorsOrderFixed": {
                return this.k() && this.w.A() && this.w.B();
            }
            case "hasShardSlots": {
                return this.k();
            }
            case "shardSlots": {
                return Collections.unmodifiableList(this.z);
            }
            case "hasAnySublimation": {
                return this.l() || this.m();
            }
            case "hasBasicSublimation": {
                return this.l();
            }
            case "hasSpecialSublimation": {
                return this.m();
            }
            case "basicSublimationName": {
                return bjw_1.a(this.w.D());
            }
            case "formattedSpecialSublimationName": {
                return bia_0.a(this.w.F());
            }
            case "canBeFulfilled": {
                return this.A;
            }
        }
        return super.b(string);
    }

    private boolean k() {
        return this.y.ae() > 0 && this.w.z() != 0;
    }

    private boolean l() {
        return this.w.C() && this.w.D() > 0;
    }

    private boolean m() {
        return this.w.E() && this.w.F() > 0;
    }

    private boolean n() {
        TLongHashSet tLongHashSet = euw_2.a.e(bhh_1.b());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (long l : tLongHashSet.toArray()) {
            Object t = euw_2.a.d(l);
            ((epq_2)t).dS().a((TObjectProcedure<exk_2>)((TObjectProcedure)exk_22 -> {
                if (faD.a(exk_22, this.w) == faF.a) {
                    atomicBoolean.set(true);
                }
                return !atomicBoolean.get();
            }));
            if (!atomicBoolean.get()) continue;
            return true;
        }
        return false;
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])super.d(), (Object[])v);
    }

    @Override
    public long a() {
        return this.w.c();
    }

    @Override
    public long b() {
        return this.w.p();
    }

    @Override
    public int c() {
        return this.w.r();
    }

    @Override
    public exk_2 h() {
        return exk_2.a(this.y);
    }

    public mq_1 e() {
        return this.w;
    }

    public ww_0 f() {
        return this.x;
    }

    public bjw_1 g() {
        return this.y;
    }

    public List<bLh> i() {
        return this.z;
    }

    public boolean j() {
        return this.A;
    }

    static {
        for (faL faL2 : faL.values()) {
            u.put(faL2.a(), new bLh(faL2));
        }
        v = new String[]{a, b, d, e, k, l, n, m, o, p, q, r, s, t};
    }
}

