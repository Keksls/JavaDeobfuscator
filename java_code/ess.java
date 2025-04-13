/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public class ess
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final int b = -1;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        fgb fgb2;
        epq_2 epq_22 = erQ.a(eyJ.b, object, object2, object3, object4);
        if (epq_22 == null) {
            throw new aob_1("Can't get mount gfx id from a null user");
        }
        eyt_0 eyt_02 = epq_22.dC();
        if (eyt_02 == null) {
            return -1L;
        }
        eyz_0 eyz_02 = epq_22.cG();
        if (eyz_02 == null) {
            return -1L;
        }
        Optional<exk_2> optional = eyt_02.b(eyz_02.a(exh_2.y));
        if (optional.isEmpty() || !optional.get().aQ_()) {
            return -1L;
        }
        ffa_0 ffa_02 = (ffa_0)optional.get().f();
        if (ffa_02.e() != 0 && (fgb2 = fgd.a.b(ffa_02.e())) != null) {
            return Long.parseLong(fgb2.d());
        }
        fgb2 = fgd.a.a((Integer)ffa_02.a().c());
        return fgb2 == null ? (long)ffa_02.a().c() : Long.parseLong(fgb2.d());
    }

    @Override
    public Enum c() {
        return eyO.gP;
    }

    static {
        a.add(esa_0.i);
    }
}

