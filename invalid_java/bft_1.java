/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bft
 */
public class bft_1
implements agw_0 {
    public static final bft_1 a = new bft_1();

    private bft_1() {
    }

    public void a(YK yK) {
        asw_2.a().a(new asz_0(), asz_02 -> fgh.a.a(bft_1.a(asz_02), asz_02.d()));
        yK.b(this);
    }

    /*
     * WARNING - void declaration
     */
    public static fge a(asz_0 asz_02) {
        int[] nArray;
        atd_0[] atd_0Array;
        Object[] objectArray;
        fgg fgg2 = new fgg(asz_02.c(), asz_02.e(), asz_02.f(), asz_02.g(), asz_02.h(), asz_02.i(), asz_02.j(), asz_02.k(), asz_02.l());
        aTc[] aTcArray = asz_02.m();
        if (aTcArray != null) {
            objectArray = aTcArray;
            int n = objectArray.length;
            for (int k = 0; k < n; ++k) {
                Object object = objectArray[k];
                fgg2.a(ffz_0.a(((aTc)object).a()), (int)((aTc)object).b());
            }
        }
        if ((objectArray = asz_02.n()) != null) {
            for (Object object : objectArray) {
                fgg2.a(((aTb)object).a(), ((aTb)object).b());
            }
        }
        if ((atd_0Array = asz_02.o()) != null) {
            for (atd_0 object : atd_0Array) {
                fgg2.a(object.a(), object.b());
            }
        }
        if (asz_02.p() != null) {
            for (aTe aTe2 : asz_02.p()) {
                fgg2.a(aTe2.a(), ww_0.a(aTe2.b()));
            }
        }
        if ((nArray = asz_02.q()) != null) {
            void var8_26;
            int[] nArray2 = nArray;
            int n = nArray2.length;
            boolean bl = false;
            while (var8_26 < n) {
                int n2 = nArray2[var8_26];
                fgg2.i(n2);
                ++var8_26;
            }
        }
        if (asz_02.r() != null) {
            void var8_28;
            ata_0[] ata_0Array = asz_02.r();
            int n = ata_0Array.length;
            boolean bl = false;
            while (var8_28 < n) {
                ata_0 ata_02 = ata_0Array[var8_28];
                fgg2.a(ata_02.a(), ata_02.b(), ata_02.c());
                ++var8_28;
            }
        }
        return fgg2;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.item", new Object[0]);
    }
}

