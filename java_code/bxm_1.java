/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bxM
 */
public class bxm_1 {
    public static final int[] a = new int[]{255, 255, 255, 106, 106, 106, 255, 128, 128, 255, 0, 0, 255, 128, 192, 255, 0, 128, 255, 128, 255, 255, 0, 255, 128, 0, 255, 192, 128, 255, 128, 128, 255, 0, 0, 255, 0, 128, 255, 128, 192, 255, 128, 255, 255, 0, 255, 255, 0, 255, 128, 128, 255, 192, 128, 255, 128, 0, 255, 0, 128, 255, 0, 192, 255, 128, 255, 255, 128, 255, 255, 0, 255, 128, 0, 255, 192, 128};
    private static final bxm_1 b = new bxm_1();
    private final ArrayList<azj_2> c = new ArrayList();

    private bxm_1() {
        int n = a.length / 3;
        for (int k = 0; k < n; ++k) {
            azf_2 azf_22 = new azf_2(a[k * 3], a[k * 3 + 1], a[k * 3 + 2], 255);
            this.c.add(azf_22);
            for (float f2 = 0.8f; f2 >= 0.4f; f2 -= 0.2f) {
                azf_2 azf_23 = new azf_2(azf_22);
                azf_23.a(azf_23.t() * f2);
                this.c.add(azf_23);
            }
        }
    }

    public static bxm_1 a() {
        return b;
    }

    public int b() {
        return this.c.size();
    }

    public short a(azj_2 azj_22) {
        return (short)this.c.indexOf(azj_22);
    }

    public azj_2 a(int n) {
        return this.c.get(n);
    }

    public ArrayList<azj_2> c() {
        return this.c;
    }
}

