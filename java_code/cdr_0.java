/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cDR
 */
public abstract class cdr_0<SS extends cea_1>
implements cea_1 {
    private int c;
    private String d;
    private final ArrayList<ceo_1> e = new ArrayList();
    protected final ArrayList<SS> a = new ArrayList();
    protected cdr_0 b;
    private float f = -1.0f;
    private float g = -1.0f;

    @Override
    public boolean a() {
        for (int k = this.e.size() - 1; k >= 0; --k) {
            if (this.e.get(k).g()) continue;
            return false;
        }
        return true;
    }

    public void a(ceo_1 ceo_12) {
        this.e.add(ceo_12);
    }

    public void a(SS SS) {
        this.a.add(SS);
        SS.a(this);
    }

    public ArrayList<SS> b() {
        return this.a;
    }

    @Override
    public int c() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public String d() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    @Override
    public cdr_0 e() {
        return this.b;
    }

    @Override
    public void a(cdr_0 cdr_02) {
        this.b = cdr_02;
    }

    public cey_2 f() {
        cey_2 cey_22 = new cey_2();
        this.a(cey_22);
        return cey_22;
    }

    protected void a(cey_2 cey_22) {
        cey_22.a = this.c;
        cey_22.g.addAll(this.e);
        cey_22.f = this.d;
    }

    protected void b(cdr_0 cdr_02) {
        cdr_02.c = this.c;
        cdr_02.d = this.d;
        cdr_02.b = this.b;
        cdr_02.f = this.f;
        cdr_02.g = this.g;
    }

    public float g() {
        if (this.f != -1.0f) {
            return this.f;
        }
        if (this.b != null) {
            return this.b.g();
        }
        return 1.0f;
    }

    public void a(float f2) {
        this.f = f2;
    }

    public float h() {
        if (this.g != -1.0f) {
            return this.g;
        }
        if (this.b != null) {
            return this.b.h();
        }
        return -1.0f;
    }

    public void b(float f2) {
        this.g = f2;
    }

    protected boolean i() {
        if (this.b != null) {
            return this.b.i();
        }
        return false;
    }
}

