/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TObjectByteHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectByteProcedure
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TObjectByteHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectByteProcedure;

/*
 * Renamed from aOF
 */
public class aof_0
extends aej_0
implements adR {
    public static final aof_0 a = new aof_0();
    private final TLongObjectHashMap<bNK> b = new TLongObjectHashMap();
    final TByteObjectHashMap<float[]> c = new TByteObjectHashMap();
    private float d = 0.65f;
    private float e = 0.0f;
    private float f = 0.65f;
    private boolean g = true;
    final TObjectByteHashMap<bNK> h = new TObjectByteHashMap();
    boolean i = true;
    private boolean j = true;
    final aoi_0 k = new aoi_0(512);
    private final TLongObjectProcedure<bNK> l = new aog_0(this);
    private final TObjectByteProcedure<bNK> m = new aoh_0(this);
    private static final float n = 0.09803922f;

    protected aof_0() {
    }

    @Override
    public void a(float f2) {
        this.c(f2);
    }

    @Override
    public void b(float f2) {
    }

    private void c(float f2) {
        this.d = f2 < 0.0f ? 0.0f : f2;
        boolean bl = this.g = !auc_1.a(this.e, this.d);
        if (this.g) {
            this.e = this.d;
        }
    }

    public void a(int n) {
        this.f = n;
        this.g = true;
    }

    @Override
    public void a() {
        if (this.j) {
            this.h.clear();
            this.h.ensureCapacity(this.b.size());
            this.j = false;
        }
        this.b.forEachEntry(this.l);
        if (!this.i) {
            return;
        }
        this.i = false;
        this.k.a();
        this.h.forEachEntry(this.m);
        this.k.b();
    }

    @Override
    public int e() {
        return 200;
    }

    @Override
    public boolean d() {
        return auc_1.a(this.d, 0.0f);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        this.k.a(n, n2, fArray);
    }

    @Override
    public void b(int n) {
        if (!this.g && !this.c.isEmpty()) {
            return;
        }
        this.f = 0.8f;
        for (fjz_0 fjz_02 : fjz_0.values()) {
            byte by = this.a(fjz_02);
            if (by <= 0) continue;
            int n2 = by + 1;
            int n3 = 3;
            float[] fArray = new float[n2 * 3];
            this.c.put(by, (Object)fArray);
            for (int k = 0; k < fArray.length; ++k) {
                fArray[k] = 1.0f;
            }
            float f2 = 0.09803922f * this.d;
            for (int k = 0; k < n2; ++k) {
                float f3 = k == 0 || k == n2 - 1 ? f2 * 0.5f : f2;
                fArray[k + n2] = 1.0f - f3;
                float f4 = 1.0f - 0.4f * f3;
                fArray[k + 2 * n2] = f4;
                fArray[k] = f4;
            }
        }
        this.g = false;
        this.i = true;
    }

    public final void a(bNK bNK2) {
        int n = bNK2.aQ().g();
        if (n <= 0) {
            return;
        }
        this.b.put(aof_0.c(bNK2), (Object)bNK2);
        this.j = true;
    }

    public final void b(bNK bNK2) {
        this.b.remove(aof_0.c(bNK2));
        this.j = true;
    }

    private static long c(bNK bNK2) {
        return Hw.c(bNK2.G(), bNK2.H());
    }

    byte d(bNK bNK2) {
        if (!bNK2.at()) {
            return 0;
        }
        if (bNK2.aN() == 0 || bNK2.aN() == 16) {
            return 0;
        }
        return this.a(bNK2.aQ());
    }

    private byte a(fjz_0 fjz_02) {
        return (byte)((float)fjz_02.g() * this.f);
    }
}

