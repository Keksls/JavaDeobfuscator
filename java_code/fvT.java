/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.ArrayList;

public class fvT
extends fvE
implements ahD,
ahk_0 {
    private static final fvT c = new fvT();
    public static final String TAG = "WorldPositionMarker";
    public static int a;
    private static String d;
    private float e;
    private float f;
    private EntityGroup g;
    private final ArrayList<ahB> h = new ArrayList();
    private final ArrayList<XulorParticleSystem> i = new ArrayList();
    private static final afj_1 j;

    private fvT() {
    }

    public static fvT getInstance() {
        return c;
    }

    public static void setParticlePath(String string) {
        d = string;
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        this.m_entity.a((Entity)this.g);
    }

    @Override
    public void a(ahB ahB2) {
        this.h.add(ahB2);
        XulorParticleSystem xulorParticleSystem = fdp_2.a().a(String.format(d, ahB2.d()), 0);
        xulorParticleSystem.D().a(new ayx_2());
        this.i.add(xulorParticleSystem);
    }

    @Override
    public void b(ahB ahB2) {
        if (this.h.remove(ahB2)) {
            XulorParticleSystem xulorParticleSystem = this.i.remove(this.i.size() - 1);
            xulorParticleSystem.Z();
            xulorParticleSystem.u();
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    private int getOnScreenX(float f2, float f3, int n, int n2) {
        int n3 = this.getAppearance().getContentHeight() - n2;
        int n4 = this.getAppearance().getContentWidth() - n;
        float f4 = (float)n3 / (float)n4;
        float f5 = f3 - (float)(n3 / 2);
        float f6 = f2 - (float)(n4 / 2);
        float f7 = f5 / f6;
        if (Math.abs(f7) < f4) {
            return f6 > 0.0f ? n4 : 0;
        }
        return (int)(Math.signum(f6) * (float)n3 / 2.0f / Math.abs(f7)) + n4 / 2;
    }

    private int getOnScreenY(float f2, float f3, int n, int n2) {
        int n3 = this.getAppearance().getContentHeight() - n2;
        int n4 = this.getAppearance().getContentWidth() - n;
        float f4 = (float)n3 / (float)n4;
        float f5 = f3 - (float)(n3 / 2);
        float f6 = f2 - (float)(n4 / 2);
        float f7 = f5 / f6;
        if (Math.abs(f7) > f4) {
            return f5 > 0.0f ? n3 : 0;
        }
        return (int)(Math.signum(f5) * (float)n4 / 2.0f * Math.abs(f7)) + n3 / 2;
    }

    private void a(ahB ahB2, XulorParticleSystem xulorParticleSystem, float f2, float f3) {
        float f4 = (float)ahB2.b() - this.e;
        float f5 = (float)ahB2.c() - this.f;
        int n = this.getOnScreenX((float)((int)f4) + f2, (float)((int)f5) + f3, 50, 50);
        int n2 = this.getOnScreenY((float)((int)f4) + f2, (float)((int)f5) + f3, 50, 50);
        ayx_2 ayx_22 = (ayx_2)xulorParticleSystem.D().c(0);
        float f6 = (float)n - f2;
        float f7 = (float)n2 - f3;
        float f8 = this.a(f6, f7) - (float)Math.PI;
        j.a(afr_2.f, f8);
        ayx_22.a(n + 25, n2 + 25, 0.0f);
        ayx_22.a(j);
        xulorParticleSystem.D().e();
        this.g.a(xulorParticleSystem);
    }

    private float a(float f2, float f3) {
        if (f2 == 0.0f && f3 < 0.0f) {
            f2 = -1.0E-4f;
        }
        float f4 = afq_2.b(f2, f3);
        float f5 = f3 / f4;
        float f6 = -f2 / f4;
        double d2 = Math.acos(f5);
        return (float)((double)Math.signum(f6) * d2);
    }

    public void a() {
        this.h.clear();
        for (int k = this.i.size() - 1; k >= 0; --k) {
            XulorParticleSystem xulorParticleSystem = this.i.remove(0);
            xulorParticleSystem.Z();
            xulorParticleSystem.u();
        }
    }

    public void a(ahg_0 ahg_02, int n) {
        float f2 = (float)this.m_appearance.getContentWidth() / 2.0f;
        float f3 = (float)this.m_appearance.getContentHeight() / 2.0f;
        this.g.c();
        for (int k = this.h.size() - 1; k >= 0; --k) {
            ahB ahB2 = this.h.get(k);
            XulorParticleSystem xulorParticleSystem = this.i.get(k);
            this.a(ahB2, xulorParticleSystem, f2, f3);
            xulorParticleSystem.a((float)n / 1000.0f);
            xulorParticleSystem.b(this.g);
        }
    }

    public void a(ahg_0 ahg_02, float f2, float f3) {
        this.e = ahg_02.c(f2, f3);
        this.f = ahg_02.d(f2, f3);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g.u();
        this.g = null;
        this.a();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        this.add(fid_12);
        this.m_nonBlocking = true;
        assert (this.g == null);
        this.g = (EntityGroup)EntityGroup.a.d();
        this.g.p = this;
        this.g.D().a(new ayx_2());
    }

    static {
        j = new afj_1();
    }
}

