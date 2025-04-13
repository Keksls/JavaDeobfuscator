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

public class esu
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
        fgj fgj2;
        epq_2 epq_22 = erQ.a(eyJ.b, object, object2, object3, object4);
        if (epq_22 == null) {
            throw new aob_1("Can't get pet gfx id from a null user");
        }
        eyt_0 eyt_02 = epq_22.dC();
        if (eyt_02 == null) {
            return -1L;
        }
        eyz_0 eyz_02 = epq_22.cG();
        if (eyz_02 == null) {
            return -1L;
        }
        Optional<exk_2> optional = eyt_02.b(eyz_02.a(exh_2.w));
        if (optional.isEmpty() || !optional.get().aQ_()) {
            return -1L;
        }
        ffa_0 ffa_02 = (ffa_0)optional.get().f();
        if (ffa_02.e() != 0 && (fgj2 = fgl.a.b((Integer)ffa_02.e())) != null) {
            return Long.parseLong(fgj2.c());
        }
        fgj2 = fgl.a.a((Integer)ffa_02.a().c());
        return fgj2 == null ? (long)ffa_02.a().c() : Long.parseLong(fgj2.c());
    }

    @Override
    public Enum c() {
        return eyO.gQ;
    }

    static {
        a.add(esa_0.i);
    }
}

