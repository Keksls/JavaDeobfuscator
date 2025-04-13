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

/*
 * Renamed from etN
 */
@Criterion(description="Return the level maximum of the current instance (usefull in dungeons when downscale is forced)", signatures={@Signature(description="Return the level maximum of the current instance as an integer")})
public class etn_0
extends esi_0 {
    public etn_0() {
    }

    public etn_0(ArrayList<aot_2> arrayList) {
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
        return epq_22.dP().isPresent() ? (long)epq_22.dP().get().c() : -1L;
    }

    @Override
    public Enum c() {
        return eyO.hx;
    }
}

