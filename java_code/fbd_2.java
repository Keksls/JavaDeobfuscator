/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.core.vignetting.FocusEntity;
import java.awt.Point;
import java.util.Optional;

/*
 * Renamed from fBd
 */
public class fbd_2
extends fvE {
    public static final String TAG = "focus";
    private final FocusEntity a = FocusEntity.a.c();
    private final faz_2 b = faz_2.checkOut();
    private fbb_2 c = fbb_2.aj;
    private float d;
    private float e;
    private float f;
    private float g;
    private long h;
    private long i;
    private float j;
    private float k;
    private float l;
    private float m;
    private long n;
    private float o;
    private long p;
    private long q;

    public void setCenter(float f2, float f3, float f4, float f5) {
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.setMovePosition(0L, f2, f3, f4, f5);
        this.setNeedsToPreProcess();
    }

    public void setMovePosition(long l, float f2, float f3, float f4, float f5) {
        this.h = 0L;
        this.i = l;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.setNeedsToPreProcess();
    }

    @Override
    public faz_2 getAppearance() {
        return (faz_2)this.m_appearance;
    }

    public void setColor(float f2, float f3, float f4) {
        this.a.a(f2, f3, f4);
    }

    public void setAlpha(float f2) {
        this.n = 0L;
        this.o = f2;
    }

    public void setFadeInDuration(long l) {
        this.p = l;
    }

    public void setFadeOutDuration(long l) {
        this.q = l;
    }

    public void setMouseBlocked(boolean bl) {
        this.b.setMouseBlocked(bl);
    }

    public void setTarget(fbb_2 fbb_22) {
        this.c = fbb_22;
    }

    public void a() {
        this.o = 0.75f;
        this.p = 0L;
        this.q = 0L;
        this.a.e();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h = 0L;
        this.n = 0L;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = 0L;
        this.n = 0L;
        this.b.setWidget(this);
        this.add(this.b);
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean preProcess(int n) {
        this.a(n);
        this.b(n);
        return super.preProcess(n);
    }

    private void a(int n) {
        this.n += (long)n;
        float f2 = Math.min(1.0f, (float)this.n / (float)this.p);
        float f3 = 0.0f;
        float f4 = this.o;
        float f5 = 0.0f + f2 * (f4 - 0.0f);
        this.a.b(f5);
        if (f5 < this.o) {
            this.setNeedsToPreProcess();
        }
    }

    private void b(int n) {
        float f2;
        float f3;
        float f4;
        this.h += (long)n;
        float f5 = Math.min(1.0f, (float)this.h / (float)this.i);
        boolean bl = true;
        float f6 = this.d + f5 * (this.j - this.d);
        if (Math.abs(this.j - f6) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        if (Math.abs(this.k - (f4 = this.e + f5 * (this.k - this.e))) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        if (Math.abs(this.l - (f3 = this.f + f5 * (this.l - this.f))) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        if (Math.abs(this.m - (f2 = this.g + f5 * (this.m - this.g))) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        Point point = Optional.ofNullable(this.c.getPosition()).orElse(fbb_2.ai.getLocation());
        float f7 = (float)point.getX();
        float f8 = (float)point.getY();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f + f7 + f6;
        float f12 = 0.0f + f8 + f4;
        float f13 = 0.0f + f7 + f3;
        float f14 = 0.0f + f8 + f2;
        this.a.b(f11, f12, f13, f14);
        this.b.setCenter(f11, f12, f13, f14);
        if (this.c != aj) {
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void setSize(int n, int n2, boolean bl) {
        super.setSize(n, n2, bl);
        this.a.a((float)n, n2);
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        this.m_entity.a(this.a);
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof faz_2;
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

