/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class euT
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public euT(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null) {
            return 0L;
        }
        efi_0 efi_02 = (efi_0)ejh_02.k();
        if (efi_02 == null) {
            return 0L;
        }
        if (!(efi_02 instanceof fie_0)) {
            return 0L;
        }
        return ((fie_0)efi_02).p();
    }

    @Override
    public Enum c() {
        return eyO.gn;
    }

    @Override
    public boolean a() {
        return true;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
    }
}

