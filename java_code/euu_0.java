/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euU
 */
public class euu_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null || ejh_02.k() == null) {
            return 0L;
        }
        return ((efi_0)ejh_02.k()).G_();
    }

    @Override
    public Enum c() {
        return eyO.gS;
    }

    static {
        a.add(esa_0.i);
    }
}

