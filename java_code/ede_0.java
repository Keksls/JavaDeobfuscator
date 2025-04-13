/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eDE
 */
public class ede_0
extends eDq<eDw> {
    private final boolean k;

    public ede_0(eDw eDw2, int n, short s2, boolean bl) {
        super(eDw2, n, s2);
        this.k = bl;
    }

    @Override
    protected int a(efh_0 efh_02, ani_2 ani_22, eDp eDp2) {
        return eDp2.a(ani_22, efh_02, this, objectArray -> {
            if (!this.k) {
                return objectArray;
            }
            Object[] objectArray2 = new Object[((Object[])objectArray).length];
            for (int k = 0; k < ((Object[])objectArray).length; ++k) {
                Object object = objectArray[k];
                if (!(object instanceof Hz)) {
                    objectArray2[k] = object;
                    continue;
                }
                Hz hz = (Hz)object;
                double d2 = hz.a() * 2.0;
                double d3 = Math.floor(hz.doubleValue()) * 2.0;
                objectArray2[k] = new Hz((long)d3, d2);
            }
            return objectArray2;
        });
    }
}

