/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bGx
 */
public final class bgx_0
extends bgw_0<bat_2> {
    public bgx_0(bat_2 bat_22) {
        super(bat_22);
    }

    @Override
    public boolean n() {
        return ((bat_2)this.a).ab() == 0;
    }

    @Override
    public ffs at_() {
        return ffs.a;
    }

    @Override
    public void a(oq_0 oq_02) {
        if (oq_02.a() == 3) {
            xc_2 xc_22 = (xc_2)oq_02;
            ArrayList<tm_2> arrayList = xc_22.a.a;
            int[] nArray = new int[arrayList.size()];
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                tm_2 tm_22 = arrayList.get(k);
                nArray[k] = tm_22.a;
            }
            ((bat_2)this.a).b(nArray);
            ((bat_2)this.a).u();
        }
    }
}

