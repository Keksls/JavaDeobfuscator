/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;

/*
 * Renamed from ayX
 */
public final class ayx_2
extends ayv_2 {
    private final aft_2 b = new aft_2();
    private final aft_2 c;
    private final afj_1 d = new afj_1();
    private final Matrix44 e;
    private boolean f;

    public ayx_2() {
        this.c = new aft_2();
        this.e = Matrix44.a();
        this.b();
    }

    @Override
    public void b() {
        this.b.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.c.a(0.0f, 0.0f, 0.0f, 1.0f);
        this.d.g();
        this.a.b();
        this.e.b();
        this.f = false;
    }

    @Override
    public Matrix44 a() {
        this.o();
        return this.a;
    }

    @Override
    public float c() {
        return this.c.a;
    }

    @Override
    public float d() {
        return this.c.b;
    }

    @Override
    public float e() {
        return this.b.a;
    }

    @Override
    public float f() {
        return this.b.b;
    }

    public void a(aft_2 aft_22) {
        this.c.a((aeg_2)aft_22);
        this.f = true;
    }

    @Override
    public void a(float f2, float f3, float f4) {
        this.c.a(f2, f3, f4);
        this.f = true;
    }

    public void b(aft_2 aft_22) {
        this.c.d(aft_22);
        this.f = true;
    }

    public void c(float f2, float f3, float f4) {
        this.c.b(f2, f3, f4, 0.0f);
        this.f = true;
    }

    public aft_2 g() {
        return new aft_2(this.c);
    }

    public aft_2 h() {
        return this.c;
    }

    public void a(afj_1 afj_12) {
        this.d.a((aeg_2)afj_12);
        this.f = true;
    }

    public void b(afj_1 afj_12) {
        this.d.c(afj_12);
        this.f = true;
    }

    public afj_1 i() {
        return new afj_1(this.d);
    }

    public afj_1 j() {
        return this.d;
    }

    public void c(aft_2 aft_22) {
        this.b.a((aeg_2)aft_22);
        this.f = true;
    }

    @Override
    public void b(float f2, float f3, float f4) {
        this.b.a(f2, f3, f4);
        this.f = true;
    }

    public void d(aft_2 aft_22) {
        this.b.d(aft_22);
        this.f = true;
    }

    public aft_2 k() {
        return new aft_2(this.b);
    }

    public aft_2 l() {
        return this.b;
    }

    public Matrix44 m() {
        return this.e;
    }

    public void n() {
        this.f = true;
    }

    private void o() {
        if (!this.f) {
            return;
        }
        this.a.a(this.d);
        if (!this.e.e()) {
            this.a.c(this.e);
        }
        this.a.d(this.c);
        this.a.f(this.b);
        this.f = false;
    }

    public void a(ayx_2 ayx_22) {
        this.d.a((aeg_2)ayx_22.d);
        this.b.a((aeg_2)ayx_22.b);
        this.c.a((aeg_2)ayx_22.c);
        this.a.a(ayx_22.a);
        this.e.a(ayx_22.e);
        this.f = ayx_22.f;
    }
}

