/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;

/*
 * Renamed from azb
 */
public class azb_2 {
    public static aza_1 a(arf_1 arf_12, int n) {
        byte[] byArray = arf_12.a(n);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return new aza_1(ImageIO.read(byteArrayInputStream), true);
    }

    public static aza_1 a(arf_1 arf_12) {
        int n = arf_12.h();
        int n2 = arf_12.h();
        int n3 = (int)arf_12.i();
        byte[] byArray = null;
        if (n3 > 0) {
            byArray = arf_12.a(n3);
        }
        return new aza_1(n, n2, byArray);
    }
}

