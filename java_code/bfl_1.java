/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfl
 */
public class bfl_1
implements agw_0 {
    public static final bfl_1 a = new bfl_1();

    private bfl_1() {
    }

    public void a(YK yK) {
        asw_2.a().a(new asr_0(), asr_02 -> fgh.a.a(bfl_1.a(asr_02), asr_02.d()));
        yK.b(this);
    }

    public static fga a(asr_0 asr_02) {
        asu_0[] asu_0Array;
        Object[] objectArray;
        fga fga2 = new fga(asr_02.c(), asr_02.e(), asr_02.f(), asr_02.j(), asr_02.k(), asr_02.i(), asr_02.g(), asr_02.h(), UL.a((byte)asr_02.l()));
        aST[] aSTArray = asr_02.m();
        if (aSTArray != null) {
            objectArray = aSTArray;
            int n = objectArray.length;
            for (int k = 0; k < n; ++k) {
                Object object = objectArray[k];
                fga2.a(ffz_0.a(((aST)object).a()), (int)((aST)object).b());
            }
        }
        if ((objectArray = asr_02.n()) != null) {
            for (Object object : objectArray) {
                fga2.a(((ass_0)object).a(), ((ass_0)object).b());
            }
        }
        if ((asu_0Array = asr_02.o()) != null) {
            for (asu_0 asu_02 : asu_0Array) {
                fga2.a(asu_02.a(), asu_02.b());
            }
        }
        return fga2;
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.item", new Object[0]);
    }
}

