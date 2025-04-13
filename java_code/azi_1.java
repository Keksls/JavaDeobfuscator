/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from azI
 */
public class azi_1
extends azk_1 {
    private static final Logger d = Logger.getLogger(azi_1.class);

    @Override
    protected azk_2 a(arf_1 arf_12) {
        try {
            int n;
            arf_12.e(4);
            short s2 = arf_12.b();
            short s3 = arf_12.b();
            int n2 = arf_12.c();
            int n3 = arf_12.c();
            int n4 = arf_12.c();
            aza_2 aza_22 = new aza_2();
            aza_22.a(arf_12);
            abc_1 abc_12 = new abc_1(aza_22.j.c);
            if (abc_12.a() == abc_1.a("DXT1")) {
                n = 8;
            } else if (abc_12.a() == abc_1.a("DXT2") || abc_12.a() == abc_1.a("DXT3") || abc_12.a() == abc_1.a("DXT4") || abc_12.a() == abc_1.a("DXT5")) {
                n = 16;
            } else {
                d.error((Object)("Unsupported format " + abc_12.toString()));
                return null;
            }
            assert (aza_22.h == 1) : "DDSM file can't have mipmaps";
            int n5 = aza_22.e;
            int n6 = aza_22.d;
            int n7 = (n5 + 3) / 4 * ((n6 + 3) / 4) * n;
            byte[] byArray = new byte[n7];
            arf_12.b(byArray);
            azr_2 azr_22 = new azr_2((int)s2, (int)s3, 32, null, byArray);
            byte[] byArray2 = new byte[n3];
            arf_12.b(byArray2);
            azr_22.a(byArray2, (byte)1);
            azk_2 azk_22 = new azk_2(abc_12, azr_22);
            azr_22.u();
            return azk_22;
        }
        catch (IOException iOException) {
            d.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        arf_12.e(4);
        return new afe_1(arf_12.b(), arf_12.b());
    }

    @Override
    protected int a() {
        return 8;
    }
}

