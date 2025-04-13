/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from azP
 */
public class azp_1
extends azk_1 {
    private static final Logger a = Logger.getLogger(azp_1.class);

    @Override
    @Nullable
    protected azk_2 a(arf_1 arf_12) {
        try {
            aze_1 aze_12 = new aze_1();
            aze_12.a(arf_12);
            azs_2 azs_22 = null;
            if (aze_12.f != 0) {
                int n;
                if (aze_12.l != 4 && aze_12.l != 8) {
                    n = aze_12.g + 7 >> 3;
                    int n2 = aze_12.f * n;
                    arf_12.e(n2);
                } else {
                    azs_22 = new azs_2(aze_12.f);
                    for (n = 0; n < aze_12.f; ++n) {
                        byte by = arf_12.a();
                        byte by2 = arf_12.a();
                        byte by3 = arf_12.a();
                        azs_22.a(new azf_2(-1, (int)by3, (int)by2, (int)by));
                    }
                }
            }
            byte[] byArray = this.b(arf_12, (int)aze_12.j, (int)aze_12.k, (int)aze_12.l);
            arf_12.close();
            return azp_1.a(aze_12, azs_22, byArray);
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    private static azk_2 a(aze_1 aze_12, azs_2 azs_22, byte[] byArray) {
        azr_2 azr_22 = new azr_2(aze_12.j, aze_12.k, aze_12.h, aze_12.i, aze_12.l, azs_22, byArray);
        azk_2 azk_22 = new azk_2(abc_1.b, azr_22);
        byte by = azr_22.g() >= 32 ? (byte)18 : 2;
        azr_22.a(by);
        azr_22.u();
        return azk_22;
    }

    @Override
    protected int a() {
        return 18;
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        aze_1 aze_12 = new aze_1();
        aze_12.a(arf_12);
        return new afe_1(aze_12.j, aze_12.k);
    }
}

