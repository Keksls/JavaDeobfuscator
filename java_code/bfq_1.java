/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/*
 * Renamed from bfq
 */
class bfq_1
implements asb_2<asx_0> {
    final /* synthetic */ bfp_2 a;

    bfq_1(bfp_2 bfp_22) {
        this.a = bfp_22;
    }

    public void a(asx_0 asx_02) {
        fdj_0 fdj_02 = fdj_0.a(asx_02.d());
        int n = asx_02.c();
        int n2 = asx_02.f();
        int n3 = asx_02.h();
        boolean bl = asx_02.i();
        EnumSet<fdf_0> enumSet = EnumSet.noneOf(fdf_0.class);
        if (asx_02.j()) {
            enumSet.add(fdf_0.a);
        }
        if (asx_02.k()) {
            enumSet.add(fdf_0.b);
        }
        if (asx_02.l()) {
            enumSet.add(fdf_0.c);
        }
        String[] stringArray = asx_02.e();
        fde fde2 = fdj_02.C.b(n, n2, n3, bl, enumSet);
        fde2.a(asx_02.g());
        ArrayList<aot_2> arrayList = bfp_2.a(stringArray);
        if (!UM.a(fdj_02, arrayList)) {
            bfp_2.a.error((Object)("La loi " + fdj_02 + " n'a pas des param\u00e8tres du bon type"));
            return;
        }
        fde2.a((List<aot_2>)arrayList);
        int[] nArray = asx_02.m();
        if (nArray.length == 0) {
            fdo_0.a.a(fde2);
            return;
        }
        for (int n4 : nArray) {
            fdo_0.a.a(n4, fde2);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((asx_0)asu_22);
    }
}

