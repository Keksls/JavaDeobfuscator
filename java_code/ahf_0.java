/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ahF
 */
public class ahf_0
implements YQ,
ahh_0 {
    private float b;
    private float c;
    private float d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;
    private int g;
    private ArrayList<YR> h;

    public ahf_0() {
    }

    public ahf_0(float f2, float f3, float f4) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public ahf_0(ahh_0 ahh_02) {
        this(ahh_02.J(), ahh_02.K(), ahh_02.L());
    }

    @Override
    public float aj() {
        return 0.0f;
    }

    @Override
    public short I() {
        return (short)Hw.c(this.d);
    }

    @Override
    public float L() {
        return this.d;
    }

    @Override
    public int G() {
        return Hw.b(this.b);
    }

    @Override
    public int H() {
        return Hw.b(this.c);
    }

    @Override
    public float J() {
        return this.b;
    }

    @Override
    public float K() {
        return this.c;
    }

    @Override
    public void b(float f2, float f3) {
        this.b = f2;
        this.c = f3;
    }

    @Override
    public void b(float f2, float f3, float f4) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override
    public int i() {
        return this.e;
    }

    @Override
    public int j() {
        return this.f;
    }

    @Override
    public void d(int n) {
        if (this.e == n) {
            return;
        }
        this.e = n;
        this.a();
    }

    @Override
    public void e(int n) {
        if (this.f == n) {
            return;
        }
        this.f = n;
        this.a();
    }

    @Override
    public void f(int n) {
        if (this.g == n) {
            return;
        }
        this.g = n;
        this.a();
    }

    @Override
    public int k() {
        return this.g;
    }

    @Override
    public boolean l() {
        return this.e != Integer.MIN_VALUE && this.f != Integer.MIN_VALUE;
    }

    @Override
    public void a(YR yR) {
        if (this.h == null) {
            this.h = new ArrayList(1);
        }
        this.h.add(yR);
    }

    @Override
    public void b(YR yR) {
        if (this.h == null) {
            return;
        }
        this.h.remove(yR);
        if (this.h.isEmpty()) {
            this.h = null;
            this.e = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
        }
    }

    protected void a() {
        if (this.h != null) {
            for (int k = 0; k < this.h.size(); ++k) {
                this.h.get(k).a(this, this.e, this.f, this.g);
            }
        }
    }

    @Override
    public boolean at() {
        return true;
    }
}

