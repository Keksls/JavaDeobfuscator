/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

/*
 * Renamed from chX
 */
public class chx_1
extends chd_1<ctq_2, bvx_2> {
    @Override
    public boolean a(ctq_2 ctq_22) {
        ((bvx_2)this.a).J();
        EnumMap<end_1, aff_1> enumMap = ctq_22.b();
        if (enumMap.isEmpty()) {
            return false;
        }
        for (Map.Entry<end_1, aff_1> entry : enumMap.entrySet()) {
            ((bvx_2)this.a).a(entry.getValue(), entry.getKey());
        }
        return false;
    }
}

