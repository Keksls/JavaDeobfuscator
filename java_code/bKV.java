/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bKV
extends bKX {
    private static final float k = 0.4f;
    public static final String a = "sellTime";
    public static final String b = "type";
    public static final String d = "styleForType";
    public static final String e = "isExpired";
    @NotNull
    private final mE l;
    private final exk_2 m;
    private final Date n;

    public bKV(mE mE2, long l) {
        this.l = mE2;
        this.m = eyl_1.a(mE2.o());
        this.n = bKV.a(mE2, l);
    }

    private static Date a(mE mE2, long l) {
        wt_0 wt_02 = new wt_0(wc_0.p().a());
        long l2 = l - mE2.m();
        return wt_02.b(new ww_0(l2 / 1000L)).i();
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "formattedPrice": {
                if (this.i()) {
                    return new ani_2().c().a(super.b("formattedPrice")).d().r();
                }
                return super.b("formattedPrice");
            }
            case "sellTime": {
                Locale locale = bae.h().f().a();
                DateFormat dateFormat = DateFormat.getDateInstance(1, locale);
                dateFormat.setTimeZone(wt_0.a);
                return dateFormat.format(this.n);
            }
            case "type": {
                return bae.h().a("market.history.element.type." + this.l.e().ordinal(), new Object[0]);
            }
            case "styleForType": {
                return this.e();
            }
            case "isExpired": {
                return this.i();
            }
        }
        return super.b(string);
    }

    private boolean i() {
        return this.l.e() == mI.a || this.l.e() == mI.c;
    }

    public String e() {
        switch (this.l.e()) {
            case a: 
            case c: {
                return "textTagRed";
            }
            case b: 
            case d: {
                return "textTagGreen";
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])super.d(), (Object[])new String[]{a, b, d, e});
    }

    @Override
    public long a() {
        return this.l.c();
    }

    @Override
    public long b() {
        return this.l.i();
    }

    @Override
    public int c() {
        return this.l.k();
    }

    @NotNull
    public mE f() {
        return this.l;
    }

    @Override
    public exk_2 h() {
        return this.m;
    }

    public Date g() {
        return this.n;
    }
}

