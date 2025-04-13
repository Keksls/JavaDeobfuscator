/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fKm
 */
public class fkm_1 {
    public static String a(String string, String string2, String string3) {
        return string + "." + string2 + "." + string3;
    }

    public static String a(float[] fArray) {
        int n = (int)(fArray[0] * 255.0f);
        int n2 = (int)(fArray[1] * 255.0f);
        int n3 = (int)(fArray[2] * 255.0f);
        return fkm_1.a(n, n2, n3);
    }

    public static String a(azj_2 azj_22) {
        int n = azj_22.c();
        int n2 = azj_22.d();
        int n3 = azj_22.e();
        return fkm_1.a(n, n2, n3);
    }

    @NotNull
    private static String a(int n, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n < 16) {
            stringBuilder.append('0');
        }
        stringBuilder.append(Integer.toHexString(n));
        if (n2 < 16) {
            stringBuilder.append('0');
        }
        stringBuilder.append(Integer.toHexString(n2));
        if (n3 < 16) {
            stringBuilder.append('0');
        }
        stringBuilder.append(Integer.toHexString(n3));
        return stringBuilder.toString();
    }

    public static void a(fvE fvE2) {
        int n = (int)(fpm_0.b().j().E() - (float)fvE2.getWidth());
        int n2 = (int)(fpm_0.b().j().F() - (float)fvE2.getHeight());
        int n3 = Hw.a(fvE2.getX(), 0, n);
        int n4 = Hw.a(fvE2.getY(), 0, n2);
        fvE2.setPosition(n3, n4);
    }
}

