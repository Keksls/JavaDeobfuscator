/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKr
 */
public class bkr_0
extends bkx_0 {
    public static final String a = "item";
    public static final String b = "price";
    public static final String d = "quantity";
    public static final String e = "sellDuration";
    public static final String f = "totalProfit";
    public static final String g = "cashAfterTaxes";
    public static final String h = "isSaleValid";
    public static final String i = "sellButtonText";
    private static final String[] j = new String[]{"item", "price", "quantity", "sellDuration", "totalProfit", "cashAfterTaxes", "isSaleValid", "sellButtonText"};
    private static final String[] k = (String[])ArrayUtils.addAll((Object[])bkx_0.A, (Object[])new String[]{"totalProfit", "cashAfterTaxes", "isSaleValid", "sellButtonText"});
    @Nullable
    private exk_2 l;
    private long m = 0L;
    private int n = 0;
    @NotNull
    private bLg o = bky_0.A;

    private void a(String ... stringArray) {
        fis_1.a().a((ajf_1)this, stringArray);
    }

    public void a(@Nullable exk_2 exk_22) {
        boolean bl = exk_22 != null && this.l != null && exk_22.aT_() == this.l.aT_();
        this.l = exk_22;
        if (exk_22 != null) {
            this.a(exk_22, bl);
            this.b(exk_22, bl);
            if (!bLc.a(bWe.bd)) {
                this.o = bky_0.A;
            }
            bky_0.a().u().a(this.l.m());
        } else {
            this.m = 0L;
            bky_0.a().u().i();
        }
    }

    private void a(@NotNull exk_2 exk_22, boolean bl) {
        long l;
        bLb bLb2 = bLc.b(bWe.bb);
        switch (bLb2) {
            case b: {
                l = this.m;
                break;
            }
            case d: {
                l = bl ? this.m : 0L;
                break;
            }
            case g: {
                l = Optional.ofNullable(bjo_1.a().a(exk_22)).orElse(0L);
                break;
            }
            default: {
                l = 0L;
            }
        }
        this.m = Hw.a(l, 0L, 999999999999L);
    }

    private void b(@NotNull exk_2 exk_22, boolean bl) {
        int n;
        bLb bLb2 = bLc.b(bWe.bc);
        switch (bLb2) {
            case a: {
                n = 0;
                break;
            }
            case d: {
                n = bl ? this.n : 0;
                break;
            }
            case e: {
                n = 1;
                break;
            }
            case f: {
                n = exk_22.e();
                break;
            }
            default: {
                n = this.n;
            }
        }
        this.n = Hw.a(n, 0, (int)exk_22.e());
    }

    public void a(long l, boolean bl) {
        this.m = Hw.a(l, 0L, 999999999999L);
        if (bl) {
            this.a(b);
        }
        this.a(k);
    }

    public void a(int n, boolean bl) {
        this.n = Hw.a(n, 0, this.c());
        if (bl) {
            this.a(d);
        }
        this.a(k);
    }

    public void a(@NotNull bLg bLg2) {
        this.o = bLg2;
        this.a(e);
        this.a(k);
    }

    public void b() {
        this.a(b, d);
        this.a(k);
    }

    public int c() {
        return this.l == null ? 0 : (int)this.l.e();
    }

    public boolean e() {
        return this.l != null && this.m > 0L && this.n > 0 && this.n <= this.c() && this.o != null && this.p() && bky_0.a().e();
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "item": {
                return this.l;
            }
            case "price": {
                return this.m > 0L ? Long.valueOf(this.m) : null;
            }
            case "quantity": {
                return this.n > 0 ? Integer.valueOf(this.n) : null;
            }
            case "sellDuration": {
                return this.o;
            }
            case "totalProfit": {
                return (long)this.n * this.m - this.o();
            }
            case "cashAfterTaxes": {
                return this.n();
            }
            case "isSaleValid": {
                return this.e();
            }
            case "sellButtonText": {
                if (this.e()) {
                    return bae.h().a("market.put.up.for.sale", new Object[0]);
                }
                if (this.m <= 0L) {
                    return bae.h().a("market.sell.no.price.defined", new Object[0]);
                }
                if (this.n <= 0) {
                    return bae.h().a("market.sell.no.quantity.defined", new Object[0]);
                }
                if (!bky_0.a().e()) {
                    return bae.h().a("market.sell.maximum.reached", new Object[0]);
                }
                return bae.h().a("market.tax.too.high", new Object[0]);
            }
        }
        return super.b(string);
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])super.d(), (Object[])j);
    }

    @Nullable
    public exk_2 f() {
        return this.l;
    }

    @Override
    public long a() {
        return this.m;
    }

    @Override
    public int i() {
        return this.n;
    }

    @Override
    @NotNull
    public bLg j() {
        return this.o;
    }
}

