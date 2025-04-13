/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

@Criterion(description="Return the difficulty of the current dungeon", signatures={@Signature(description="Return the difficulty as an integer, -1 if not in dungeon")})
public class ete
extends esi_0 {
    public ete(ArrayList<aot_2> arrayList) {
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1L;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        return epq_22.dP().isPresent() ? (long)epq_22.dP().get().d() : -1L;
    }

    @Override
    public Enum c() {
        return eyO.gL;
    }
}

