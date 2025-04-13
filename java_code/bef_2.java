/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from beF
 */
class bef_2
implements asb_2<aRI> {
    bef_2() {
    }

    public void a(aRI aRI2) {
        aQV aQV2 = aRI2.e();
        int n = bet_1.a(aQV2);
        ezy_1 ezy_12 = bet_1.b(aQV2);
        eun_1 eun_12 = new eun_1(aRI2.c(), ezy_12, n, this.a(aRI2.d()));
        evl_1.a.a(eun_12);
    }

    private euq_1[] a(aRL[] aRLArray) {
        euq_1[] euq_1Array = new euq_1[aRLArray.length];
        int n = 0;
        int n2 = aRLArray.length;
        for (int k = 0; k < n2; ++k) {
            aRL aRL2 = aRLArray[k];
            euq_1Array[k] = new euq_1(aRL2.a(), aRL2.b(), aRL2.c(), aRL2.d(), aRL2.e(), aRL2.f(), this.a(aRL2.h(), n), aRL2.g());
            n += euq_1Array[k].g().length;
        }
        return euq_1Array;
    }

    private eup_1[] a(ark_0[] ark_0Array, int n) {
        eup_1[] eup_1Array = new eup_1[ark_0Array.length];
        int n2 = ark_0Array.length;
        for (int k = 0; k < n2; ++k) {
            ark_0 ark_02 = ark_0Array[k];
            eup_1Array[k] = new eup_1(ark_02.a(), n + k, ark_02.c(), ark_02.b(), this.a(ark_02.d()));
        }
        return eup_1Array;
    }

    private euo_1[] a(arj_0[] arj_0Array) {
        ArrayList<euo_1> arrayList = new ArrayList<euo_1>();
        for (arj_0 arj_02 : arj_0Array) {
            euo_1 euo_12 = new euo_1(arj_02.a(), arj_02.b(), arj_02.c(), arj_02.d(), false);
            if (euo_12.f() == null) continue;
            arrayList.add(euo_12);
        }
        return arrayList.toArray(new euo_1[arrayList.size()]);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRI)asu_22);
    }
}

