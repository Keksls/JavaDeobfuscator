/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ahX
 */
public class ahx_0
implements ahv_0 {
    private static final Logger a = Logger.getLogger(ahx_0.class);
    private final abY b;
    private final abu c;

    public ahx_0(abu abu2, abY abY2) {
        this.c = abu2;
        this.b = abY2;
    }

    @Override
    public void a(float f2, float f3, afd_1 afd_12) {
        afk_2 afk_22 = ahx_0.a(this.b, f2, f3, afd_12);
        if (afk_22 == null) {
            return;
        }
        int n = (int)f2;
        this.c.i();
        int n2 = (int)f3;
        this.c.j();
        if (n < afk_22.b) {
            afd_12.a -= (float)(afk_22.b - n);
        }
        if (n > afk_22.c) {
            afd_12.a -= (float)(afk_22.c - n);
        }
        if (n2 < afk_22.d) {
            afd_12.b -= (float)(afk_22.d - n2);
        }
        if (n2 > afk_22.e) {
            afd_12.b -= (float)(afk_22.e - n2);
        }
    }

    static afk_2 a(abY abY2, float f2, float f3, afd_1 afd_12) {
        afk_2 afk_22 = new afk_2();
        float f4 = f2 + afd_12.a;
        float f5 = f3 + afd_12.b;
        abY2.a(f4, f5, afk_22);
        if (afk_22.e() < 100 && afk_22.f() < 100) {
            a.error((Object)"la vue est trop petite)");
            afd_12.b(0.0f, 0.0f);
            return null;
        }
        return afk_22;
    }
}

