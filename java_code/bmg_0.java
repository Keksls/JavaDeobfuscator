/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bMG
 */
public class bmg_0
extends bLO {
    private static final Logger a = Logger.getLogger(bmg_0.class);
    private final bmf_0 b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte a(bmf_0 bmf_02) {
        InputStream inputStream;
        URL uRL;
        String string;
        try {
            string = String.format(azs_0.a().a("fullSubMapPath"), bmf_02.f(), bmf_02.e() / 100);
            try {
                string = arl_1.c(string).toString();
            }
            catch (MalformedURLException malformedURLException) {
                return 1;
            }
        }
        catch (gm_0 gm_02) {
            return 1;
        }
        try {
            uRL = gg_0.d(string);
        }
        catch (MalformedURLException malformedURLException) {
            return 1;
        }
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        try {
            inputStream = uRL.openStream();
        }
        catch (IOException iOException) {
            return 1;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            atg_22.a(bufferedInputStream);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
        }
        catch (Exception exception) {
            byte by = 1;
            return by;
        }
        finally {
            try {
                bufferedInputStream.close();
            }
            catch (IOException iOException) {
                a.warn((Object)iOException);
            }
        }
        ArrayList<aqx_2> arrayList = ath_22.a().d("mapNavigatorBackgroundPart");
        aqx_2 aqx_22 = arrayList.get(0);
        aqx_2 aqx_23 = aqx_22.f("maskLevel");
        return (byte)(aqx_23.e() + 1);
    }

    public bmg_0(bmf_0 bmf_02) {
        super(bmf_02.b(), bmf_02.e(), null, null, null, bmg_0.a(bmf_02), null, null, -1L, true);
        this.b = bmf_02;
    }

    @Override
    public xd_0 f() {
        return super.f();
    }

    @Override
    public azj_2 aX_() {
        bMn bMn2 = (bMn)this.b.h();
        if (bMn2 == null) {
            return bmi_0.d;
        }
        int n = bMs.a.c(bMn2.B());
        if (n == 30) {
            return bmi_0.e;
        }
        if (n == 31) {
            return bmi_0.f;
        }
        if (n == 32) {
            return bmi_0.g;
        }
        if (n == 33) {
            return bmi_0.h;
        }
        return bmi_0.d;
    }

    @Override
    public String bd_() {
        return null;
    }

    @Override
    public String bc_() {
        return bae.h().a(66, (long)this.b.e(), new Object[0]);
    }

    @Override
    public String d() {
        short s2 = this.b.c();
        short s3 = this.b.d();
        if (s2 == -1 || s3 == -1) {
            return null;
        }
        return bae.h().a("recommended.level", s2, s3);
    }

    public bmf_0 h() {
        return this.b;
    }

    @Override
    public boolean c() {
        bLP bLP2 = blg_1.a().b(blh_1.b, this.b.e());
        if (bLP2 == null) {
            return false;
        }
        short s2 = (short)this.b.f();
        cct_1 cct_12 = (cct_1)((fjw_0)fjw_0.e()).c(s2);
        return cct_12.u;
    }

    @Override
    public void a(ble_1 ble_12) {
        bLP bLP2 = blg_1.a().b(blh_1.b, this.b.e());
        ble_12.a(bLP2);
    }
}

