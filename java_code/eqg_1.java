/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from eqg
 */
class eqg_1
extends eqe_1 {
    private final List<eqe_1> b = new ArrayList<eqe_1>();

    eqg_1(HashMap<Byte, Float> hashMap) {
        for (Map.Entry<Byte, Float> entry : hashMap.entrySet()) {
            Byte by = entry.getKey();
            this.b.add(new eqd_1(by, entry.getValue().floatValue()));
        }
    }

    @Override
    protected void a(eov_1<epa_1> eov_12, short s2, short s3) {
        for (eqe_1 eqe_12 : this.b) {
            eqe_12.a(eov_12, s2, s3);
        }
    }

    @Override
    public int a(eps_0 eps_02, short s2, short s3) {
        int n = 0;
        for (eqe_1 eqe_12 : this.b) {
            n += eqe_12.a(eps_02, s2, s3);
        }
        return n;
    }
}

