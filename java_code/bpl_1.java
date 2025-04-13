/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpl
 */
public class bpl_1 {
    private static final Logger a = Logger.getLogger(bpl_1.class);

    public static void a(bpg_1 bpg_12, blx_1 blx_12) {
        String string;
        if (bpg_12 == null) {
            return;
        }
        if (!bpg_12.a()) {
            return;
        }
        try {
            string = azs_0.a().a("ANMEquipmentPath");
        }
        catch (gm_0 gm_02) {
            a.error((Object)"", (Throwable)gm_02);
            return;
        }
        biI biI2 = blx_12.bv();
        bpg_12.a(new bpm_1(string, biI2));
    }

    public static void b(bpg_1 bpg_12, blx_1 blx_12) {
        if (bpg_12 == null) {
            return;
        }
        bpi_1[] bpi_1Array = bpg_12.b();
        if (bpi_1Array == null) {
            return;
        }
        biI biI2 = blx_12.bv();
        block5: for (bpi_1 bpi_12 : bpi_1Array) {
            switch (bpi_12.d) {
                case 1: {
                    biI2.g(bpi_12.e);
                    biI2.e(bpi_12.e);
                    continue block5;
                }
                case 2: {
                    biI2.i(bpi_12.e);
                    continue block5;
                }
                case 3: {
                    biI2.e(bpi_12.e);
                }
            }
        }
    }

    public static void c(bpg_1 bpg_12, blx_1 blx_12) {
        if (bpg_12 == null) {
            return;
        }
        biI biI2 = blx_12.bv();
        bpg_12.b(new bpn_1(biI2));
    }

    public static void a(afv afv2, bpj_1 bpj_12) {
        float[] fArray = bpj_12.b.v();
        fArray[0] = fArray[0] * 1.25f;
        fArray[1] = fArray[1] * 1.25f;
        fArray[2] = fArray[2] * 1.25f;
        afv2.a(bpj_12.a, fArray);
    }
}

