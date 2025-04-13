/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;

/*
 * Renamed from eul
 */
@Criterion(description="Return the pvp state of a player : -1 = invalid target, 0 = disabled, 1 = prudent, 2 = opportunistic")
public class eul_0
extends esi_0 {
    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof epq_2)) {
            return -1L;
        }
        fhD fhD2 = ((epq_2)object).fE().k();
        if (fhD2 == null) {
            return -1L;
        }
        return fhD2.a();
    }

    @Override
    public Enum c() {
        return eyO.hD;
    }
}

