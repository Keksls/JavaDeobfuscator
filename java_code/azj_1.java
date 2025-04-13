/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from azJ
 */
public class azj_1
extends azk_1 {
    private static final Logger a = Logger.getLogger(azj_1.class);

    @Override
    protected azk_2 a(arf_1 arf_12) {
        try {
            int n;
            arf_12.e(4);
            aza_2 aza_22 = new aza_2();
            aza_22.a(arf_12);
            abc_1 abc_12 = new abc_1(aza_22.j.c);
            if (abc_12.a() == abc_1.a("DXT1")) {
                n = 8;
            } else if (abc_12.a() == abc_1.a("DXT2") || abc_12.a() == abc_1.a("DXT3") || abc_12.a() == abc_1.a("DXT4") || abc_12.a() == abc_1.a("DXT5")) {
                n = 16;
            } else {
                a.error((Object)("Unsupported format " + abc_12.toString()));
                return null;
            }
            azr_2[] azr_2Array = new azr_2[aza_22.h];
            int n2 = aza_22.e;
            int n3 = aza_22.d;
            for (int k = 0; k < aza_22.h; ++k) {
                int n4 = (n2 + 3) / 4 * ((n3 + 3) / 4) * n;
                byte[] byArray = new byte[n4];
                arf_12.b(byArray);
                azr_2Array[k] = new azr_2(n2, n3, 32, null, byArray);
                n3 /= 2;
                if ((n2 /= 2) == 0) {
                    n2 = 1;
                }
                if (n3 != 0) continue;
                n3 = 1;
            }
            azk_2 azk_22 = new azk_2(abc_12, azr_2Array);
            for (azr_2 azr_22 : azr_2Array) {
                azr_22.u();
            }
            return azk_22;
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        arf_12.e(4);
        aza_2 aza_22 = new aza_2();
        aza_22.a(arf_12);
        return new afe_1(aza_22.e, aza_22.d);
    }

    @Override
    protected int a() {
        return 128;
    }
}

