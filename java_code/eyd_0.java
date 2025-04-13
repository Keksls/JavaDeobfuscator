/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eyd
 */
@Criterion(description="Return true if the triggering effect is an INDIRECT effect", signatures={@Signature})
public class eyd_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyd_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null) {
            return -1;
        }
        if (ejh_02.a(eff_0.G)) {
            return -1;
        }
        efi_0 efi_02 = (efi_0)ejh_02.k();
        if (efi_02 == null) {
            return -1;
        }
        int n = efi_02.G_();
        boolean bl = n == 12 || n == 11;
        return bl ? -1 : 0;
    }

    @Override
    public Enum c() {
        return eyO.hC;
    }

    static {
        a.add(esa_0.i);
    }
}

