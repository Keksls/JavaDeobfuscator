/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from azQ
 */
public class azq_1 {
    protected static final Logger a = Logger.getLogger(azq_1.class);

    public void a(gk_0 gk_02, azk_2 azk_22) {
        aze_1 aze_12 = new aze_1();
        azd_1 azd_12 = new azd_1();
        azr_2 azr_22 = azk_22.a(0);
        aze_12.l = (byte)azr_22.g();
        aze_12.k = (short)azr_22.b();
        aze_12.j = (short)azr_22.a();
        aze_12.g = 0;
        aze_12.f = 0;
        aze_12.e = 0;
        aze_12.c = 0;
        aze_12.h = 0;
        aze_12.i = 0;
        aze_12.d = (byte)2;
        aze_12.m = 0;
        aze_12.b = 0;
        azd_12.c = 0;
        azd_12.b = 0;
        String string = "TRUEVISION-XFILE";
        byte[] byArray = "TRUEVISION-XFILE".getBytes();
        System.arraycopy(byArray, 0, azd_12.d, 0, byArray.length);
        try {
            aze_12.a(gk_02);
            gk_02.a(azr_22.h());
            azd_12.a(gk_02);
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during ToStream", (Throwable)iOException);
        }
    }
}

