/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.ParseException;
import org.apache.log4j.Logger;

@fpw_0
public class cHI {
    protected static final Logger a = Logger.getLogger(cHI.class);
    public static final String PACKAGE = "wakfu.merchant.tax";

    public static void priceChangedWithIntCap(fzs fzs2) {
        long l;
        abo_1 abo_12;
        if (fzs2 instanceof fcd_2 && ((fca_2)(abo_12 = (fcd_2)fzs2)).q() && !((fcd_2)abo_12).b('V')) {
            return;
        }
        abo_12 = (fug_0)fzs2.e();
        String string = ((fug_0)abo_12).getText();
        if (string.isEmpty()) {
            string = "0";
        }
        try {
            l = Hw.e(bae.h().f(string));
        }
        catch (ParseException parseException) {
            a.error((Object)"Error reversing number format", (Throwable)parseException);
            l = 0L;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(16863);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void priceChanged(fzs fzs2) {
        long l;
        abo_1 abo_12;
        if (fzs2 instanceof fcd_2 && ((fca_2)(abo_12 = (fcd_2)fzs2)).q() && !((fcd_2)abo_12).b('V')) {
            return;
        }
        abo_12 = (fug_0)fzs2.e();
        String string = ((fug_0)abo_12).getText();
        if (string.isEmpty()) {
            string = "0";
        }
        try {
            l = bae.h().f(string);
        }
        catch (ParseException parseException) {
            a.error((Object)"Error reversing number format", (Throwable)parseException);
            l = 0L;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(16863);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void packChanged(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bhq_0 bhq_02 = (bhq_0)fcf_22.l();
            dez_0 dez_02 = new dez_0();
            dez_02.a(bhq_02.b());
            dez_02.a_(17774);
            add_2.b().a(dez_02);
        }
    }

    public static void durationChanged(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bho_0 bho_02 = (bho_0)fcf_22.l();
            dey_0 dey_02 = new dey_0();
            dey_02.a(bho_02.b());
            dey_02.a_(17750);
            add_2.b().a(dey_02);
        }
    }

    public static void valid(fzs fzs2) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        bHN bHN2 = (bHN)fis_1.a().e("merchantItem");
        if (bHN2.p() <= 0L) {
            return;
        }
        dfc.d((short)17949);
    }

    public static void cancel(fzs fzs2) {
        dfc.d((short)19987);
    }
}

