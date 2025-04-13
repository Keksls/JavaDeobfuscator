/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKY
 */
class fky_2 {
    fky_2() {
    }

    public static void a(String[] stringArray) {
        flm_1 flm_12 = null;
        try {
            flm_12 = stringArray.length > 0 ? new flm_1(stringArray[0]) : new flm_1(System.in, null, -1);
        }
        catch (Exception exception) {
            System.err.println(exception);
            return;
        }
        if (flm_12.f()) {
            System.out.println("Input bitstream contained " + flm_12.e() + " logical bitstream section(s).");
            System.out.println("Total bitstream playing time: " + flm_12.f(-1) + " seconds\n");
        } else {
            System.out.println("Standard input was not seekable.");
            System.out.println("First logical bitstream information:\n");
        }
        for (int k = 0; k < flm_12.e(); ++k) {
            fls_1 fls_12 = flm_12.h(k);
            System.out.println("\tlogical bitstream section " + (k + 1) + " information:");
            System.out.println("\t\t" + fls_12.c + "Hz " + fls_12.b + " channels bitrate " + flm_12.b(k) / 1000 + "kbps serial number=" + flm_12.c(k));
            System.out.print("\t\tcompressed length: " + flm_12.d(k) + " bytes ");
            System.out.println(" play time: " + flm_12.f(k) + "s");
            flb_1 flb_12 = flm_12.i(k);
            System.out.println(flb_12);
        }
    }
}

