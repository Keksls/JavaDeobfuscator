/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * Renamed from fLc
 */
class flc_1 {
    static int a = 8192;
    static final byte[] b = new byte[a];

    flc_1() {
    }

    public static void a(String[] stringArray) {
        InputStream inputStream = System.in;
        if (stringArray.length > 0) {
            try {
                inputStream = new FileInputStream(stringArray[0]);
            }
            catch (Exception exception) {
                System.err.println(exception);
            }
        }
        fkw_2 fkw_22 = new fkw_2();
        fkv_2 fkv_22 = new fkv_2();
        fku_2 fku_22 = new fku_2();
        fkt_2 fkt_22 = new fkt_2();
        fls_1 fls_12 = new fls_1();
        flb_1 flb_12 = new flb_1();
        fle_1 fle_12 = new fle_1();
        fkx_2 fkx_22 = new fkx_2(fle_12);
        int n = 0;
        fkw_22.d();
        while (true) {
            byte[] byArray;
            int n2;
            Object object;
            boolean bl = false;
            int n22 = fkw_22.a(4096);
            byte[] byArray2 = fkw_22.a;
            try {
                n = inputStream.read(byArray2, n22, 4096);
            }
            catch (Exception exception) {
                System.err.println(exception);
                System.exit(-1);
            }
            fkw_22.b(n);
            if (fkw_22.b(fku_22) != 1) {
                if (n < 4096) break;
                System.err.println("Input does not appear to be an Ogg bitstream.");
                System.exit(1);
            }
            fkv_22.a(fku_22.g());
            fls_12.a();
            flb_12.a();
            if (fkv_22.a(fku_22) < 0) {
                System.err.println("Error reading first page of Ogg bitstream data.");
                System.exit(1);
            }
            if (fkv_22.b(fkt_22) != 1) {
                System.err.println("Error reading initial header packet.");
                System.exit(1);
            }
            if (fls_12.a(flb_12, fkt_22) < 0) {
                System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
                System.exit(1);
            }
            int n3 = 0;
            while (n3 < 2) {
                int n4;
                while (n3 < 2 && (n4 = fkw_22.b(fku_22)) != 0) {
                    if (n4 != 1) continue;
                    fkv_22.a(fku_22);
                    while (n3 < 2 && (n4 = fkv_22.b(fkt_22)) != 0) {
                        if (n4 == -1) {
                            System.err.println("Corrupt secondary header.  Exiting.");
                            System.exit(1);
                        }
                        fls_12.a(flb_12, fkt_22);
                        ++n3;
                    }
                }
                n22 = fkw_22.a(4096);
                byArray2 = fkw_22.a;
                try {
                    n = inputStream.read(byArray2, n22, 4096);
                }
                catch (Exception exception) {
                    System.err.println(exception);
                    System.exit(1);
                }
                if (n == 0 && n3 < 2) {
                    System.err.println("End of file before finding all Vorbis headers!");
                    System.exit(1);
                }
                fkw_22.b(n);
            }
            byte[][] byArray3 = object = flb_12.a;
            int exception = byArray3.length;
            for (n2 = 0; n2 < exception && (byArray = byArray3[n2]) != null; ++n2) {
                System.err.println(new String(byArray, 0, byArray.length - 1));
            }
            System.err.println("\nBitstream is " + fls_12.b + " channel, " + fls_12.c + "Hz");
            System.err.println("Encoded by: " + new String(flb_12.d, 0, flb_12.d.length - 1) + "\n");
            a = 4096 / fls_12.b;
            fle_12.a(fls_12);
            fkx_22.a(fle_12);
            object = new float[1][][];
            int[] object2 = new int[fls_12.b];
            while (!bl) {
                while (!bl && (exception = fkw_22.b(fku_22)) != 0) {
                    if (exception == -1) {
                        System.err.println("Corrupt or missing data in bitstream; continuing...");
                        continue;
                    }
                    fkv_22.a(fku_22);
                    while ((exception = fkv_22.b(fkt_22)) != 0) {
                        if (exception == -1) continue;
                        if (fkx_22.a(fkt_22) == 0) {
                            fle_12.a(fkx_22);
                        }
                        while ((n2 = fle_12.a((float[][][])object, object2)) > 0) {
                            byArray = object[0];
                            int n4 = n2 < a ? n2 : a;
                            for (n3 = 0; n3 < fls_12.b; ++n3) {
                                int n5 = n3 * 2;
                                int n6 = object2[n3];
                                for (int k = 0; k < n4; ++k) {
                                    int n7 = (int)((double)byArray[n3][n6 + k] * 32767.0);
                                    if (n7 > Short.MAX_VALUE) {
                                        n7 = Short.MAX_VALUE;
                                    }
                                    if (n7 < Short.MIN_VALUE) {
                                        n7 = Short.MIN_VALUE;
                                    }
                                    if (n7 < 0) {
                                        n7 |= 0x8000;
                                    }
                                    flc_1.b[n5] = (byte)n7;
                                    flc_1.b[n5 + 1] = (byte)(n7 >>> 8);
                                    n5 += 2 * fls_12.b;
                                }
                            }
                            System.out.write(b, 0, 2 * fls_12.b * n4);
                            fle_12.a(n4);
                        }
                    }
                    if (fku_22.e() == 0) continue;
                    bl = true;
                }
                if (bl) continue;
                n22 = fkw_22.a(4096);
                byArray2 = fkw_22.a;
                try {
                    n = inputStream.read(byArray2, n22, 4096);
                }
                catch (Exception exception2) {
                    System.err.println(exception2);
                    System.exit(1);
                }
                fkw_22.b(n);
                if (n != 0) continue;
                bl = true;
            }
            fkv_22.c();
            fkx_22.a();
            fle_12.a();
            fls_12.b();
        }
        fkw_22.a();
        System.err.println("Done.");
    }
}

