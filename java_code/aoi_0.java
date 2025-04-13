/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntFloatHashMap
 *  gnu.trove.procedure.TIntFloatProcedure
 */
import gnu.trove.map.hash.TIntFloatHashMap;
import gnu.trove.procedure.TIntFloatProcedure;

/*
 * Renamed from aOI
 */
class aoi_0 {
    final TIntFloatHashMap a;

    aoi_0(int n) {
        this.a = new TIntFloatHashMap(n, 0.9f);
    }

    void a(float[] fArray, int n, int n2, int n3, int n4) {
        for (int k = 0; k < n2; ++k) {
            int n5 = k * n;
            for (int i2 = 0; i2 < n; ++i2) {
                this.a(n3 + i2, n4 + k, fArray[i2 + n5]);
            }
        }
    }

    private void a(int n, int n2, float f2) {
        int n3 = aoi_0.a(n, n2);
        float f3 = this.a.get(n3);
        if (f3 == 0.0f) {
            this.a.put(n3, f2);
        } else {
            this.a.put(n3, f2 * f3);
        }
    }

    public final void a() {
        this.a.clear();
    }

    void a(int n, int n2, float[] fArray) {
        float f2 = this.a.get(aoi_0.a(n, n2));
        if (f2 != 0.0f) {
            fArray[0] = fArray[0] * f2;
            fArray[1] = fArray[1] * f2;
            fArray[2] = fArray[2] * f2;
        }
    }

    void b() {
        this.a.forEachEntry((TIntFloatProcedure)new aoj_0(this));
    }

    private static int a(int n, int n2) {
        return n & 0xFFFF | n2 << 16;
    }
}

