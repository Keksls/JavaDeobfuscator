/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import org.apache.log4j.Logger;

/*
 * Renamed from fuq
 */
public class fuq_0
extends fvc_0
implements YT {
    private static final Logger d = Logger.getLogger(fuq_0.class);
    public static final String TAG = "smiley";
    public static final String a = "animatedElementViewer";
    private String e;
    private boolean f;
    private boolean g = true;
    public static int b = Integer.MIN_VALUE;
    private frO h;
    private float i;

    public void a(String string, String string2) {
        this.a(string, string2, true);
    }

    public void a(String string, String string2, boolean bl) {
        this.e = string;
        fyy_0 fyy_02 = fpm_0.b().h().d(this.e);
        assert (fyy_02 != null) : "Impossible de charger un smiley";
        this.h = (frO)fyy_02.a(a);
        if (this.h == null) {
            throw new Exception("On a charg\u00e9 un Widget de Smiley, mais il n'a pas de widget d'animatedElementViewer...");
        }
        this.f = bl;
        this.setAnimation(string2);
        this.i = this.h.getAnimatedElement().as();
    }

    public void setAnimation(String string) {
        this.h.setAnimName(string);
    }

    public void setTarget(aby_0 aby_02) {
        this.setTarget((abu)aby_02);
    }

    public void setTarget(abu abu2) {
        if (abu2 == this.j) {
            return;
        }
        if (this.j != null && this.j instanceof abu) {
            ((abu)this.j).b(this);
        }
        super.setTarget(abu2);
        if (abu2 != null) {
            abu2.a(this);
            this.setTargetIsVisible(abu2.at());
        }
    }

    @Override
    public void f() {
        if (this.f) {
            this.c();
        } else {
            this.setSmileyIsVisible(false);
        }
    }

    public void setSmileyIsVisible(boolean bl) {
        if (this.g == bl) {
            return;
        }
        this.g = bl;
        this.bi_();
    }

    @Override
    protected void bi_() {
        this.setVisible(this.k && this.g);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
    }

    @Override
    public afe_1 getComputedPosition(int n, int n2, int n3) {
        afe_1 afe_12 = super.getComputedPosition(n, n2, n3);
        int n4 = afe_12.a();
        int n5 = afe_12.b();
        afe_12.b(n4, n5);
        return afe_12;
    }

    @Override
    public void a(YQ yQ, int n, int n2, int n3) {
        this.bi_();
        super.a(yQ, n, n2, 0);
    }

    @Override
    protected void a(int n, float f2) {
        super.a(n, f2);
        float f3 = f2 - 0.5f + this.i;
        this.h.setScale(f3);
        float f4 = 1.0f;
        long l = this.getWatcherContainerAdviser().n();
        int n2 = this.getDuration();
        if (l < (long)(n2 / 4)) {
            f4 = (float)l / ((float)n2 / 4.0f);
        } else if (l > (long)(n2 * 3 / 4)) {
            f4 = 1.0f - ((float)l - (float)(3 * n2) / 4.0f) / ((float)n2 - (float)(3 * n2) / 4.0f);
        }
        Material material = (Material)Material.d.d();
        material.a(f4, f4, f4, f4);
        this.h.setMaterial(material);
        material.u();
    }

    private static float a(float f2, float f3, float f4, float f5) {
        f2 = f2 / f5 - 1.0f;
        return -f4 * (f2 * f2 * f2 * f2 - 1.0f) + f3;
    }

    public void setDuration(int n) {
        this.l.g(n);
    }

    public void b() {
        this.l.f(0);
        this.bi_();
    }

    public frO getAnimatedElementViewer() {
        return this.h;
    }

    public int getAdviserId() {
        return this.l.i();
    }

    public String getWidgetId() {
        return this.e;
    }

    public void c() {
        fpm_0.b().o(this.e);
    }

    @Override
    public void a(boolean bl, YU yU) {
        this.setTargetIsVisible(bl);
    }

    @Override
    public float getWorldX() {
        if (this.j != null) {
            return this.j.J();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.j != null) {
            return this.j.K();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.j != null) {
            return this.j.L();
        }
        return 0.0f;
    }

    public int getDuration() {
        return this.l.g();
    }

    @Override
    public void removedFromWidgetTree() {
        super.removedFromWidgetTree();
        if (this.j != null && this.j instanceof abu) {
            ((abu)this.j).b(this);
        }
    }
}

