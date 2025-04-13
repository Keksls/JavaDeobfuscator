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

/*
 * Renamed from esL
 */
public final class esl_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public esl_0(ArrayList<aot_2> arrayList) {
    }

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
        eqq_1 eqq_12 = (eqq_1)object;
        if (eqq_12 == null) {
            return -1L;
        }
        Object t = euw_2.a.d(eqq_12.a_());
        if (t == null) {
            return -1L;
        }
        Optional<emy_0> optional = ena_0.a().a(((epq_2)t).U_(), end_0.b);
        if (optional.isEmpty()) {
            return -1L;
        }
        ebe_0 ebe_02 = (ebe_0)optional.get();
        return ebe_02.j();
    }

    @Override
    public Enum c() {
        return eyO.gg;
    }

    static {
        a.add(esa_0.i);
    }
}

