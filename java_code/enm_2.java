/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

/*
 * Renamed from enM
 */
public final class enm_2 {
    private static final EnumMap<ens_2, Object> a = new EnumMap(ens_2.class);
    private static final EnumMap<ens_2, Object> b = new EnumMap(ens_2.class);

    private enm_2() {
    }

    public static Map<ens_2, Object> a(boolean bl) {
        return bl ? a : b;
    }

    static {
        a.put(ens_2.bc, (Object)false);
        a.put(ens_2.aD, (Object)false);
        a.put(ens_2.al, (Object)false);
        a.put(ens_2.ap, (Object)false);
        a.put(ens_2.bn, (Object)0);
        a.put(ens_2.bo, (Object)0);
        a.put(ens_2.bp, (Object)0);
        a.put(ens_2.R, (Object)1);
        a.put(ens_2.S, (Object)true);
        a.put(ens_2.T, (Object)true);
        a.put(ens_2.V, (Object)true);
        a.put(ens_2.W, (Object)true);
        a.put(ens_2.Y, (Object)1);
        a.put(ens_2.Z, (Object)1);
        a.put(ens_2.aa, (Object)true);
        for (ens_2 ens_22 : a.keySet()) {
            b.put(ens_22, ens_22.d());
        }
    }
}

