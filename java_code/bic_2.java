/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from biC
 */
public class bic_2
extends bik_2 {
    public bic_2(int n) {
        super(n);
    }

    @Override
    protected boolean a() {
        return bxr_2.a.b(this.e) == eos_1.c;
    }

    @Override
    protected boolean b() {
        return bxr_2.a.b(this.e) == eos_1.b;
    }

    @Override
    public String c() {
        String string;
        int n;
        bxr_2 bxr_22 = bxr_2.a;
        fie_0 fie_02 = fih_0.a().a(2428);
        fie_0 fie_03 = fih_0.a().a(2214);
        edh_0 edh_02 = new edh_0(fie_02, eDk.a, (short)bxr_22.c(this.e));
        ArrayList<String> arrayList = edh_02.a();
        edh_0 edh_03 = new edh_0(fie_03, eDk.a, (short)bxr_22.d(this.e));
        ArrayList<String> arrayList2 = edh_03.a();
        ani_2 ani_22 = new ani_2();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            string = arrayList.get(n);
            if (ani_22.q() != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)string);
        }
        n2 = arrayList2.size();
        for (n = 0; n < n2; ++n) {
            string = arrayList2.get(n);
            if (ani_22.q() != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)string);
        }
        return ani_22.r();
    }

    public bhv_2 t() {
        return new bhv_2(this.e, bxr_2.a.b(this.e), this.c());
    }
}

