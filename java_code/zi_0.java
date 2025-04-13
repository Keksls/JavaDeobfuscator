/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

/*
 * Renamed from Zi
 */
public class zi_0
extends zg_0 {
    public static final int a = -1;
    private int c = 0;
    private int d = -1;
    private int e;

    public zi_0(ayn_2 ayn_22, String string) {
        super(ayn_22, string);
        this.f(-1);
    }

    public zi_0(ayn_2 ayn_22, String string, int n) {
        super(ayn_22, string);
        this.f(n);
    }

    public int g() {
        return this.d;
    }

    public void f(int n) {
        assert (n >= -1);
        this.d = n;
    }

    public boolean h() {
        if (this.d == -1) {
            return true;
        }
        return this.c <= this.d + this.e;
    }

    public void q() {
        this.c = 0;
    }

    public void c(int n) {
        if (this.e > 0) {
            this.e -= n;
            if (this.e <= 0) {
                this.n().b(true);
            }
        } else {
            this.c += n;
        }
    }

    public void g(int n) {
        assert (n >= 0);
        this.e = n;
        if (this.e > 0) {
            this.n().b(false);
        }
    }

    protected int r() {
        return this.c;
    }

    public final String s() {
        return this.n().f();
    }

    public final void b(float f2, float f3, float f4, float f5) {
        this.n().a(f2, f3, f4, f5);
    }

    public final void a(ayn_2 ayn_22) {
        this.n().a(ayn_22);
    }

    public final void a(float f2, float f3) {
        this.n().a(new aft_2(f2, f3, 0.0f));
    }

    public final void a(float f2) {
        this.n().e().d(f2);
    }

    public final void h(int n) {
        this.n().a(n);
    }

    public final int t() {
        return this.n().n();
    }

    public final int u() {
        return this.n().k();
    }

    public final void a(aiP aiP2) {
        GeometryBackground geometryBackground = this.n().e();
        geometryBackground.a(aiP2.e(), aiP2.f());
        geometryBackground.b(aiP2.g());
        geometryBackground.a(aiP2.h());
        geometryBackground.c(aiP2.b(), aiP2.c(), aiP2.d(), aiP2.a());
    }

    public final void i(int n) {
        this.n().b(n);
    }

    @Override
    public final void a(boolean bl) {
        this.n().b(bl);
    }

    public final void j(int n) {
        this.n().c(n);
    }

    public final int v() {
        return this.n().h();
    }

    public final int w() {
        return this.n().j();
    }
}

