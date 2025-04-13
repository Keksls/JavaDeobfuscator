/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

/*
 * Renamed from Zu
 */
public class zu_0
extends zi_0
implements za_0 {
    private ZD c;
    private int d;
    private int e = 3;
    private float f;
    private float g;
    private final aft_2 h = new aft_2();

    static float a(float f2, float f3, int n, int n2) {
        float f4 = (float)n / (float)n2 / 2.0f;
        float f5 = (0.5f - f4) * (1.0f - 2.0f * Math.abs(0.5f - f4));
        f4 = (f4 - f5) * 2.0f;
        return f2 + (f3 - f2) * f4;
    }

    static float c(float f2, float f3, float f4, float f5) {
        f2 = f2 / f5 - 1.0f;
        return -f4 * (f2 * f2 * f2 * f2 - 1.0f) + f3;
    }

    static float d(float f2, float f3, float f4, float f5) {
        return f2 * (f4 - f3) / f5 + f3;
    }

    public zu_0(ayn_2 ayn_22, String string) {
        this(ayn_22, string, -1);
    }

    public zu_0(ayn_2 ayn_22, String string, int n) {
        this(ayn_22, string, new zv_0(), n);
    }

    public zu_0(ayn_2 ayn_22, String string, ZD zD, int n) {
        super(ayn_22, string, n);
        this.n().a((GeometryBackground)null);
        this.n().a(ayn_22);
        this.c = zD;
    }

    public ZD x() {
        return this.c;
    }

    public void a(ZD zD) {
        this.c = zD;
    }

    public float y() {
        return 2.0f;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        this.h.a(f2, f3, -1.0f);
        this.n().a(this.h);
        this.n().a((int)f4, (int)f5);
        this.f = f2;
        this.g = f3;
        this.B();
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        this.c(n);
    }

    @Override
    public void c(int n) {
        super.c(n);
        this.x().a(this, n);
    }

    @Override
    public int i() {
        return this.d;
    }

    @Override
    public void d(int n) {
        this.d = n;
    }

    @Override
    public int j() {
        return this.e;
    }

    @Override
    public void e(int n) {
        this.e = n;
    }

    @Override
    public EntityText n() {
        return super.n();
    }

    @Override
    public void l() {
        this.p();
    }

    void B() {
        this.n().D().a(0, this.f, this.g);
    }

    public float z() {
        return this.f;
    }

    public void b(float f2) {
        this.f = f2;
    }

    public float A() {
        return this.g;
    }

    public void c(float f2) {
        this.g = f2;
    }

    @Override
    public /* synthetic */ Entity k() {
        return this.n();
    }

    static /* synthetic */ int a(zu_0 zu_02) {
        return zu_02.r();
    }

    static /* synthetic */ int b(zu_0 zu_02) {
        return zu_02.r();
    }

    static /* synthetic */ int c(zu_0 zu_02) {
        return zu_02.r();
    }

    static /* synthetic */ int d(zu_0 zu_02) {
        return zu_02.r();
    }

    static /* synthetic */ int e(zu_0 zu_02) {
        return zu_02.r();
    }

    static /* synthetic */ int f(zu_0 zu_02) {
        return zu_02.r();
    }

    static /* synthetic */ int g(zu_0 zu_02) {
        return zu_02.r();
    }
}

