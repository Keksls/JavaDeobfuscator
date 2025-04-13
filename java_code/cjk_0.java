/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.ParseException;
import org.apache.log4j.Logger;

/*
 * Renamed from cJK
 */
@fpw_0
public class cjk_0 {
    protected static final Logger a = Logger.getLogger(cjk_0.class);
    public static final String PACKAGE = "wakfu.split";
    public static short b;
    public static short c;
    public static long d;
    public static long e;
    private static long f;
    private static exk_2 g;
    private static brk_1 h;
    private static bHN i;
    private static short j;
    private static Long k;
    private static long l;
    private static bvk_1 m;
    private static String n;
    private static bmk_1 o;
    private static bmk_1 p;

    public static long getCurrentQuantity(fug_0 fug_02) {
        try {
            return Oy.d().f(fug_02.getText());
        }
        catch (ParseException parseException) {
            a.error((Object)"Error reversing number format", (Throwable)parseException);
            return 0L;
        }
    }

    public static void decreaseSplitCountToOne(fzs fzs2, fug_0 fug_02) {
        cjk_0.a(fug_02, 1L, true);
    }

    public static void decreaseSplitCount(fzs fzs2, fug_0 fug_02) {
        if (fug_02.getText().isEmpty()) {
            return;
        }
        long l = cjk_0.getCurrentQuantity(fug_02);
        cjk_0.a(fug_02, --l, true);
    }

    public static void keyType(fzs fzs2, fug_0 fug_02) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).j() == '\n') {
            cjk_0.validSplit(fzs2);
            return;
        }
        if (fug_02.getText().isEmpty()) {
            return;
        }
        long l = cjk_0.getCurrentQuantity(fug_02);
        cjk_0.a(fug_02, l, false);
    }

    private static void a(fug_0 fug_02, long l, boolean bl) {
        if (l < 0L) {
            l = 0L;
            bl = true;
        } else if (l > f) {
            l = f;
            bl = true;
        }
        cjk_0.l = l;
        if (bl) {
            fug_02.c(Oy.d().a(cjk_0.l));
        }
    }

    public static void increaseSplitCount(fzs fzs2, fug_0 fug_02) {
        if (fug_02.getText().isEmpty()) {
            return;
        }
        long l = cjk_0.getCurrentQuantity(fug_02);
        cjk_0.a(fug_02, ++l, true);
    }

    public static void increaseSplitCountToMax(fzs fzs2, fug_0 fug_02) {
        cjk_0.a(fug_02, f, true);
    }

    public static void validSplit(fzs fzs2) {
        long l = 0L;
        short s2 = 0;
        if (cjk_0.a()) {
            l = cjk_0.l;
        } else {
            s2 = (short)cjk_0.l;
        }
        fpm_0.b().o("splitStackDialog");
        if (s2 > 0 || l > 0L) {
            switch (j) {
                case 16942: 
                case 17119: 
                case 18612: {
                    break;
                }
                case 17553: {
                    dgL dgL2 = new dgL();
                    dgL2.a_(j);
                    dgL2.a(g);
                    dgL2.f(s2);
                    dgL2.b(d);
                    dgL2.c(e);
                    dgL2.e(c);
                    add_2.b().a(dgL2);
                    return;
                }
                case 16393: 
                case 16774: {
                    dfc dfc2 = new dfc();
                    dfc2.a(l);
                    dfc2.a_(j);
                    add_2.b().a(dfc2);
                    return;
                }
                case 18118: 
                case 19489: {
                    dgL dgL3 = new dgL();
                    dgL3.a_(j);
                    dgL3.a(g);
                    dgL3.f(s2);
                    dgL3.c(e);
                    dgL3.e(c);
                    add_2.b().a(dgL3);
                    return;
                }
                case 16838: 
                case 17530: 
                case 17989: 
                case 19544: {
                    dgL dgL4 = new dgL();
                    dgL4.a_(j);
                    dgL4.a(g.a());
                    dgL4.a(s2);
                    dgL4.e(c);
                    add_2.b().a(dgL4);
                    return;
                }
                case 16071: {
                    dgL dgL5 = new dgL();
                    dgL5.a(g);
                    dgL5.f(s2);
                    dgL5.a_(j);
                    add_2.b().a(dgL5);
                    return;
                }
                case 16751: {
                    dfb_0 dfb_02 = new dfb_0();
                    dfb_02.a(i);
                    dfb_02.b(c);
                    dfb_02.b(e);
                    dfb_02.c(s2);
                    dfb_02.a_(16751);
                    add_2.b().a(dfb_02);
                    return;
                }
                case 19934: {
                    dhi_0 dhi_02 = new dhi_0((bMi)fis_1.a().d("pet", "petDialog"), g);
                    dhi_02.f(s2);
                    add_2.b().a(dhi_02);
                    return;
                }
                case 17822: {
                    dfG dfG2 = new dfG(h);
                    dfG2.a(s2);
                    add_2.b().a(dfG2);
                    return;
                }
                case 17093: 
                case 17543: {
                    dgL dgL6 = new dgL();
                    dgL6.e(c);
                    dgL6.c(b);
                    dgL6.b(d);
                    dgL6.c(e);
                    dgL6.a(o);
                    dgL6.a(g);
                    dgL6.f(s2);
                    dgL6.a(n);
                    dgL6.a_(j);
                    add_2.b().a(dgL6);
                    return;
                }
                case 16358: {
                    dgL dgL7 = new dgL();
                    dgL7.e(c);
                    dgL7.c(e);
                    dgL7.b(p);
                    dgL7.f(s2);
                    dgL7.a(g);
                    dgL7.a_(j);
                    add_2.b().a(dgL7);
                    return;
                }
                case 18696: {
                    dgj_0 dgj_02 = new dgj_0();
                    dgj_02.a(m);
                    dgj_02.b(s2);
                    dgj_02.a_(18696);
                    add_2.b().a(dgj_02);
                    return;
                }
            }
            if (bvz_2.a.a()) {
                fpm_0.b().o("splitStackDialog");
                if (s2 > 0) {
                    dgf_0 dgf_02 = new dgf_0();
                    dgf_02.b(k);
                    dgf_02.a(g);
                    dgf_02.c(s2);
                    dgf_02.a_(j);
                    add_2.b().a(dgf_02);
                }
            } else {
                dgL dgL8 = new dgL();
                dgL8.e(c);
                dgL8.c(b);
                dgL8.b(d);
                dgL8.c(e);
                dgL8.a(o);
                dgL8.a(g);
                dgL8.f(s2);
                dgL8.a_(j);
                add_2.b().a(dgL8);
            }
        }
    }

    private static boolean a() {
        return j == 16707 || j == 16393 || j == 16774;
    }

    public static void setMaxQuantity(long l) {
        f = l;
        if (cjk_0.l > l) {
            cjk_0.l = l;
        }
    }

    public static void setMessageType(short s2) {
        j = s2;
    }

    public static void setExchangeId(long l) {
        k = l;
    }

    public static void setMerchantItem(bHN bHN2) {
        i = bHN2;
    }

    public static void setItem(exk_2 exk_22) {
        g = exk_22;
        l = exk_22.e();
    }

    public static void setIngredientView(brk_1 brk_12) {
        h = brk_12;
        l = h.b();
    }

    public static void setExchangeEntryView(bvk_1 bvk_12) {
        m = bvk_12;
        l = 1L;
    }

    public static void setSourceUniqueId(long l) {
        d = l;
    }

    public static void setSourcePosition(short s2) {
        b = s2;
    }

    public static void setDestinationPosition(short s2) {
        c = s2;
    }

    public static void setDestinationUniqueId(long l) {
        e = l;
    }

    public static short getSourcePosition() {
        return b;
    }

    public static short getDestinationPosition() {
        return c;
    }

    public static long getSourceUniqueId() {
        return d;
    }

    public static long getDestinationUniqueId() {
        return e;
    }

    public static long getMaxQuantity() {
        return f;
    }

    public static exk_2 getItem() {
        return g;
    }

    public static bHN getMerchantItem() {
        return i;
    }

    public static short getMessageType() {
        return j;
    }

    public static Long getExchangeId() {
        return k;
    }

    public static bmk_1 getDestinationCharacter() {
        return p;
    }

    public static void setDestinationCharacter(bmk_1 bmk_12) {
        p = bmk_12;
    }

    public static bmk_1 getSourceCharacter() {
        return o;
    }

    public static void setSourceCharacter(bmk_1 bmk_12) {
        o = bmk_12;
    }

    public static void setTargetCompartmentId(String string) {
        n = string;
    }
}

