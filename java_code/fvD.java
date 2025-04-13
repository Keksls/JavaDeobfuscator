/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

public class fvD
implements za_0 {
    private int c;
    public final int a = -1;
    private int d = -1;
    private int e = 0;
    private int f;
    private float g = 1.0f;
    final /* synthetic */ fvc_0 b;

    fvD(fvc_0 fvc_02) {
        this.b = fvc_02;
    }

    @Override
    public apv_2 a() {
        return this.b.j;
    }

    @Override
    public void a(apv_2 apv_22) {
    }

    @Override
    public int b() {
        return this.b.getXOffset();
    }

    @Override
    public void a(int n) {
        this.b.b = n;
    }

    @Override
    public int c() {
        return this.b.getYOffset();
    }

    @Override
    public void b(int n) {
        this.b.c = n;
    }

    @Override
    public float d() {
        return this.b.getWorldX();
    }

    @Override
    public float e() {
        return this.b.getWorldY();
    }

    @Override
    public float f() {
        if (this.b.j != null) {
            return this.b.j.L();
        }
        return 0.0f;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        this.b.a(null, this.b.j.i(), this.b.j.j(), 0);
    }

    @Override
    public int g() {
        return this.d;
    }

    @Override
    public boolean h() {
        if (this.d == -1) {
            return true;
        }
        return this.e <= this.d;
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        this.g = acb_02.b().f();
        this.c(n);
        this.b.a(n, this.g);
    }

    @Override
    public void c(int n) {
        this.e += n;
    }

    @Override
    public int i() {
        return this.f;
    }

    @Override
    public void d(int n) {
        this.f = n;
    }

    @Override
    public int j() {
        return this.c;
    }

    @Override
    public void e(int n) {
        this.c = n;
    }

    @Override
    public Entity k() {
        return null;
    }

    @Override
    public void l() {
        this.b.f();
    }

    @Override
    public boolean m() {
        return false;
    }

    public void f(int n) {
        this.e = n;
    }

    public int n() {
        return this.e;
    }

    public void g(int n) {
        this.d = n;
    }

    public float o() {
        return this.g;
    }
}

