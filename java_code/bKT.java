/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bKT
extends bKX {
    public static final String a = "isSeller";
    public static final String b = "remainingDuration";
    public static final String d = "sellerNameWithLanguages";
    private final mm_0 e;
    private final exk_2 k;
    private final ww_0 l;

    public bKT(mm_0 mm_02, long l) {
        this.e = mm_02;
        this.l = bKT.a(mm_02.s(), l);
        this.k = eyl_1.a(mm_02.e());
    }

    @NotNull
    static ww_0 a(long l, long l2) {
        long l3 = l - l2;
        return new ww_0(l3 / 1000L);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "isSeller": {
                return bhh_1.b() == this.e.h().c();
            }
            case "remainingDuration": {
                return bKT.a(this.l);
            }
            case "sellerNameWithLanguages": {
                my_0 my_02 = this.e.h();
                return bvs_0.a(((bvx_0)ans_0.D().h()).m(), my_02.e(), xz_0.a(my_02.j()), Ow.c((byte)my_02.h()));
            }
        }
        return super.b(string);
    }

    @Nullable
    static String a(ww_0 ww_02) {
        if (ww_02.d() > 0) {
            return bae.h().a("remainingDurationShortMonthDayHour", 0, ww_02.d(), ww_02.c());
        }
        if (ww_02.c() > 0) {
            return bae.h().a("remainingDurationShortMonthDayHour", 0, 0, ww_02.c());
        }
        if (ww_02.b() > 0) {
            return bae.h().a("remainingDurationMinutes", ww_02.b());
        }
        return null;
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])super.d(), (Object[])new String[]{a, b, d});
    }

    @Override
    public long a() {
        return this.e.c();
    }

    @Override
    public long b() {
        return this.e.o();
    }

    @Override
    public int c() {
        return this.e.m();
    }

    public mm_0 e() {
        return this.e;
    }

    @Override
    public exk_2 h() {
        return this.k;
    }

    public ww_0 f() {
        return this.l;
    }
}

