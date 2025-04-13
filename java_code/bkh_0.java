/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKh
 */
public class bkh_0
extends bkx_0 {
    public static final String a = "isSearchingItem";
    public static final String b = "item";
    public static final String d = "unitPrice";
    public static final String e = "quantity";
    public static final String f = "sellDuration";
    public static final String g = "itemHasShards";
    public static final String h = "itemHasXp";
    public static final String i = "itemLevel";
    public static final String j = "slotColorsFixedOrder";
    public static final String k = "selectedSlotColors";
    public static final String l = "allSlotColors";
    public static final String m = "availableSublimations";
    public static final String n = "selectedBasicSublimation";
    public static final String o = "basicSublimationIsSelected";
    public static final String p = "itemCanHaveSpecialSublimation";
    public static final String q = "specialSublimations";
    public static final String r = "selectedSpecialSublimation";
    public static final String s = "specialSublimationIsSelected";
    public static final String t = "offerCost";
    public static final String u = "remainingCash";
    public static final String v = "isOfferCreationValid";
    public static final String w = "createOfferButtonText";
    private static final String[] B = new String[]{"isSearchingItem", "item", "unitPrice", "quantity", "sellDuration", "itemHasShards", "itemHasXp", "slotColorsFixedOrder", "selectedSlotColors", "allSlotColors", "availableSublimations", "selectedBasicSublimation", "specialSublimations", "selectedSpecialSublimation", "offerCost", "remainingCash", "isOfferCreationValid", "createOfferButtonText", "itemCanHaveSpecialSublimation", "basicSublimationIsSelected", "specialSublimationIsSelected"};
    private static final String[] C = (String[])ArrayUtils.addAll((Object[])bkx_0.A, (Object[])new String[]{"offerCost", "remainingCash", "isOfferCreationValid", "createOfferButtonText"});
    @NotNull
    private String D = "";
    private bjw_1 E;
    private long F;
    private int G;
    @NotNull
    private bLg H = bky_0.A;
    private short I = (short)-1;
    private boolean J;
    private final bku_0 K = new bku_0();

    private void a(String ... stringArray) {
        fis_1.a().a((ajf_1)this, stringArray);
    }

    @Override
    public long a() {
        return this.F;
    }

    public void a(@NotNull String string) {
        this.D = Cz.e(string);
        bhc_1.a().a(this.D);
        this.a(new String[]{a});
    }

    public void a(bjw_1 bjw_12) {
        boolean bl = bjw_12 != null && this.E != null && bjw_12.n() == this.E.n();
        this.E = bjw_12;
        this.d(bl);
        this.e(bl);
        if (!bLc.a(bWe.bg)) {
            this.H = bky_0.A;
        }
        if (!bLc.a(bWe.bi)) {
            this.a((short)-1);
        }
        if (!bLc.a(bWe.bh)) {
            this.J = false;
            this.b(true);
            this.b((bLj)null);
            this.K.b((String)null);
        }
        bky_0.a().u().a(this.E.n());
        this.a(this.d());
    }

    private void d(boolean bl) {
        long l;
        bLb bLb2 = bLc.b(bWe.be);
        switch (bLb2) {
            case b: {
                l = this.F;
                break;
            }
            case d: {
                l = bl ? this.F : 0L;
                break;
            }
            case g: {
                l = bjo_1.a().a(this.E, 0L);
                break;
            }
            default: {
                l = 0L;
            }
        }
        this.F = Hw.a(l, 0L, 999999999999L);
    }

    private void e(boolean bl) {
        int n;
        bLb bLb2 = bLc.b(bWe.bf);
        switch (bLb2) {
            case a: {
                n = 0;
                break;
            }
            case d: {
                n = bl ? this.G : 0;
                break;
            }
            case e: {
                n = 1;
                break;
            }
            case f: {
                n = this.E.o();
                break;
            }
            default: {
                n = this.G;
            }
        }
        this.G = Hw.a(n, 0, 999999);
    }

    public void b() {
        this.a(d, e);
        this.a(C);
    }

    public void a(long l, boolean bl) {
        this.F = Hw.a(l, 0L, 999999999999L);
        if (bl) {
            this.a(new String[]{d});
        }
        this.a(C);
    }

    public void a(int n, boolean bl) {
        this.G = Hw.a(n, 0, 999999);
        if (bl) {
            this.a(new String[]{e});
        }
        this.a(C);
    }

    public void a(bLg bLg2) {
        this.H = bLg2;
        this.a(new String[]{f});
        this.a(C);
    }

    public void a(short s2) {
        this.I = Hw.a(s2, (short)-1, this.u());
        this.a(new String[]{i});
    }

    public void a(boolean bl) {
        this.J = bl;
        this.a(new String[]{j});
    }

    public void b(boolean bl) {
        this.J = false;
        this.K.a();
        this.c();
        this.c(false);
        if (bl) {
            this.a((bLj)null);
            this.K.a((String)null);
        }
        this.a(j, k, l, m, n, o, q, r, s);
    }

    public void c() {
        this.K.b();
        this.a(new String[]{k});
    }

    public void c(boolean bl) {
        this.K.a(bl);
        this.a(m, q);
    }

    public void a(bLj bLj2) {
        this.K.a(bLj2);
        this.a(n, o);
    }

    public void b(@Nullable bLj bLj2) {
        if (bLj2 == null || bLj2.e() != this.E.M()) {
            this.K.b((bLj)null);
        } else {
            this.K.b(bLj2);
        }
        this.a(r, s);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "isSearchingItem": {
                return !this.D.isEmpty();
            }
            case "item": {
                return this.E;
            }
            case "unitPrice": {
                return this.F > 0L ? Long.valueOf(this.F) : null;
            }
            case "quantity": {
                return this.G > 0 ? Integer.valueOf(this.G) : null;
            }
            case "sellDuration": {
                return this.H;
            }
            case "itemHasShards": {
                return this.r();
            }
            case "itemHasXp": {
                return this.s();
            }
            case "itemLevel": {
                return this.I >= 0 ? Short.valueOf(this.I) : null;
            }
            case "slotColorsFixedOrder": {
                return this.J;
            }
            case "selectedSlotColors": {
                return this.K.f();
            }
            case "allSlotColors": {
                return this.K.k();
            }
            case "availableSublimations": {
                return this.K.g();
            }
            case "selectedBasicSublimation": {
                return this.K.d();
            }
            case "basicSublimationIsSelected": {
                return this.K.p() != null;
            }
            case "itemCanHaveSpecialSublimation": {
                return this.t();
            }
            case "specialSublimations": {
                if (this.E == null) {
                    return Collections.emptyList();
                }
                if (this.E.M() == exw_1.f) {
                    return this.K.i();
                }
                if (this.E.M() == exw_1.h) {
                    return this.K.j();
                }
                return Collections.emptyList();
            }
            case "selectedSpecialSublimation": {
                return this.K.e();
            }
            case "specialSublimationIsSelected": {
                return this.K.q() != null;
            }
            case "offerCost": {
                return (long)this.G * this.F;
            }
            case "remainingCash": {
                return this.n() - (long)this.i() * this.a();
            }
            case "isOfferCreationValid": {
                return this.e();
            }
            case "createOfferButtonText": {
                if (this.e()) {
                    return bae.h().a("market.create.offer", new Object[0]);
                }
                if (this.F <= 0L) {
                    return bae.h().a("market.sell.no.price.defined", new Object[0]);
                }
                if (this.G <= 0) {
                    return bae.h().a("market.sell.no.quantity.defined", new Object[0]);
                }
                return bae.h().a("market.offer.deposit.too.high", new Object[0]);
            }
        }
        return super.b(string);
    }

    public boolean e() {
        return this.E != null && this.F > 0L && this.F <= 999999999999L && this.G > 0 && this.G <= 999999 && this.H != null && this.q() && bky_0.a().g();
    }

    private boolean r() {
        return this.E != null && this.E.ae() > 0;
    }

    private boolean s() {
        if (this.E == null) {
            return false;
        }
        if (fgh.a.b(this.E.n()) != null) {
            return true;
        }
        if (this.E.p() instanceof biu_1) {
            return true;
        }
        return this.E.W() > 0;
    }

    private boolean t() {
        if (this.E == null) {
            return false;
        }
        return this.E.M() == exw_1.f || this.E.M() == exw_1.h;
    }

    private short u() {
        if (this.E == null) {
            return -1;
        }
        fge fge2 = fgh.a.b(this.E.n());
        if (fge2 != null) {
            return fge2.i();
        }
        if (this.E.p() instanceof biu_1) {
            return 245;
        }
        if (this.E.W() > 0) {
            return 100;
        }
        return -1;
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])super.d(), (Object[])B);
    }

    public faz_0 f() {
        faz_0 faz_02 = new faz_0().a(this.E.n()).a(this.F).b(this.G).a(this.H.a());
        if (this.s() && this.I != -1) {
            faz_02.a(this.I);
        }
        if (this.r()) {
            faz_02.a(this.K.c());
            faz_02.a(this.J);
            if (this.K.p() != null) {
                faz_02.c(this.K.p().b());
            }
        }
        if (this.t() && this.K.q() != null) {
            faz_02.d(this.K.q().b());
        }
        return faz_02;
    }

    @Nullable
    public bLj a(String string, boolean bl) {
        return this.K.a(string, bl);
    }

    @NotNull
    public String g() {
        return this.D;
    }

    public bjw_1 h() {
        return this.E;
    }

    @Override
    public int i() {
        return this.G;
    }

    @Override
    @NotNull
    public bLg j() {
        return this.H;
    }

    public short k() {
        return this.I;
    }

    public boolean l() {
        return this.J;
    }

    public bku_0 m() {
        return this.K;
    }
}

