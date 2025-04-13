/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TShortObjectProcedure;

public class acz {
    private float b = 1000.0f;
    private boolean c = false;
    private int d;
    private float e = 1.0f;
    private float f = 1.0f;
    private float g = 1.0f;
    private float h = 1.0f;
    private float i = 1.0f;
    private float j = 1.0f;
    private float k = 1.0f;
    private float l = 1.0f;
    private float m = 1.0f;
    private float n = 1.0f;
    private float o = 1.0f;
    private float p = 1.0f;
    final TLongObjectHashMap<acA> q = new TLongObjectHashMap();
    final TShortObjectHashMap<acA> r = new TShortObjectHashMap();
    private final acB s = new acB(this);
    private final acc_0 t = new acc_0(this);
    private static final acz u = new acz();

    private acz() {
    }

    public static acz a() {
        return u;
    }

    public final acA a(long l) {
        return this.q.isEmpty() ? null : (acA)this.q.get(l);
    }

    public final acA a(short s2) {
        return this.r.isEmpty() ? null : (acA)this.r.get(s2);
    }

    public void a(long l, float f2, float f3, float f4, float f5) {
        this.a(l, f2, f3, f4, f5, 1000.0f);
    }

    public void a(long l, float f2, float f3, float f4, float f5, float f6) {
        acA acA2 = (acA)this.q.get(l);
        if (acA2 == null) {
            acA2 = new acA();
            this.q.put(l, (Object)acA2);
        }
        acA2.a(f2, f3, f4, f5, f6);
    }

    public void b(long l) {
        this.q.remove(l);
    }

    public void a(short s2, float f2, float f3, float f4, float f5) {
        this.a(s2, f2, f3, f4, f5, 1000.0f);
    }

    public void a(short s2, float f2, float f3, float f4, float f5, float f6) {
        acA acA2 = (acA)this.r.get(s2);
        if (acA2 == null) {
            acA2 = new acA();
            this.r.put(s2, (Object)acA2);
        }
        acA2.a(f2, f3, f4, f5, f6);
    }

    public final void b() {
        this.q.clear();
        this.r.clear();
    }

    public void a(boolean bl, int n) {
        this.b = n;
        if (this.c != bl) {
            this.m = this.e;
            this.n = this.f;
            this.o = this.g;
            this.p = this.h;
        }
        if (!bl) {
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 1.0f;
        }
        this.c = bl;
        this.d = 0;
    }

    public boolean c() {
        return (float)this.d < this.b;
    }

    public void a(int n) {
        if (!this.q.isEmpty()) {
            this.s.a = n;
            this.q.forEachEntry((TLongObjectProcedure)this.s);
            this.s.a();
        }
        if (!this.r.isEmpty()) {
            this.t.a = n;
            this.r.forEachEntry((TShortObjectProcedure)this.t);
            this.t.a();
        }
        if (this.d == Integer.MAX_VALUE) {
            return;
        }
        this.d += n;
        if ((float)this.d > this.b) {
            this.d = Integer.MAX_VALUE;
            this.e = this.m = this.i;
            this.f = this.n = this.j;
            this.g = this.o = this.k;
            this.h = this.p = this.l;
            return;
        }
        float f2 = (float)this.d / this.b;
        this.e = this.m + (this.i - this.m) * f2;
        this.f = this.n + (this.j - this.n) * f2;
        this.g = this.o + (this.k - this.o) * f2;
        this.h = this.p + (this.l - this.p) * f2;
    }

    public void a(float[] fArray) {
        assert (fArray.length == 4);
        fArray[0] = fArray[0] * this.e;
        fArray[1] = fArray[1] * this.f;
        fArray[2] = fArray[2] * this.g;
        fArray[3] = fArray[3] * this.h;
    }

    public void a(float f2) {
        this.i = 0.3f * f2;
        this.j = 0.3f * f2;
        this.k = 0.3f * f2;
        this.l = f2;
    }
}

