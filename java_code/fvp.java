/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class fvp
extends fvE {
    private static final int f = 32;
    private static final int g = 32;
    private static final int h = 4096;
    private static final int i = 4096;
    protected static final Logger a = Logger.getLogger(fvp.class);
    public static final String TAG = "Video";
    protected fxk_0 b;
    private String j;
    private boolean k;
    private fvr_0 l;
    private boolean m;
    private float n;
    private long o;
    private boolean p;
    private final fyY q = new fvq(this);
    public static final int c = 1332819776;
    public static final int d = -1760125050;
    public static final int e = -630741988;

    protected fvp() {
    }

    public static fvp checkOut() {
        fvv_0 fvv_02 = new fvv_0();
        ((fvp)fvv_02).onCheckOut();
        return fvv_02;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b.f();
        this.b = null;
        this.o = -1L;
        this.p = false;
        this.l = fvr_0.a;
        fpm_0.b().j().b(this.q);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.p = false;
        this.n = 1.0f;
        this.l = fvr_0.a;
        this.m = false;
        this.j = null;
        this.o = 0L;
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        this.setNeedsToPreProcess();
        if (fpm_0.b().j() != null) {
            fpm_0.b().j().a(this.q);
        }
        this.b = new fxk_0();
        this.b.g();
        this.b.a(true);
        this.setMinSize(new fjf_2(32, 32));
        this.setMaxSize(new fjf_2(4096, 4096));
        this.setSize(this.getMinSize());
    }

    protected void setState(fvr_0 fvr_02) {
        this.l = fvr_02;
    }

    public String getVideoPath() {
        return this.j;
    }

    public void setVideoPath(String string) {
        this.j = string;
    }

    public boolean getDebugMode() {
        return this.k;
    }

    public void setDebugMode(boolean bl) {
        this.k = bl;
    }

    public void a() {
        if (this.isPlaying()) {
            return;
        }
        if (this.isPaused()) {
            this.setPaused(false);
            return;
        }
        if (this.b()) {
            this.l = fvr_0.b;
            this.setNeedsToPreProcess();
        } else {
            a.info((Object)"Unable to set video as 'PLAYING'");
        }
    }

    protected abstract boolean b();

    public void setPaused(boolean bl) {
        if (!this.isInitialized()) {
            return;
        }
        if (this.a(bl)) {
            this.l = bl ? fvr_0.c : fvr_0.b;
        }
        this.setNeedsToPreProcess();
    }

    public abstract void setSpu(int var1);

    protected abstract boolean a(boolean var1);

    public abstract boolean c();

    public boolean isPaused() {
        return this.l == fvr_0.c;
    }

    public boolean isPlaying() {
        return this.l == fvr_0.b;
    }

    public abstract void a(float var1);

    public abstract void a(anm_2 var1);

    public boolean isInitialized() {
        return this.l != fvr_0.a;
    }

    public abstract long getVideoDuration();

    protected abstract long getVideoPosition();

    protected abstract ayz_2 getVideoTextureProducer();

    public void setVolume(float f2) {
        if (f2 > this.n) {
            this.m = false;
        }
        this.n = f2;
        this.b(this.m ? 0.0f : f2);
    }

    protected abstract void b(float var1);

    public float getVolume() {
        return this.n;
    }

    public void b(boolean bl) {
        if (bl == this.m) {
            return;
        }
        this.m = bl;
        this.b(this.m ? 0.0f : this.n);
    }

    public boolean isMuted() {
        return this.m;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (!this.isInitialized()) {
            return bl;
        }
        long l = this.getVideoPosition();
        if (this.o != l) {
            this.o = l;
            fct_1 fct_12 = new fct_1(this);
            fct_12.b(this.o);
            fct_12.a(l);
            this.dispatchEvent(fct_12);
        }
        return this.isPlaying() || bl;
    }

    @Override
    public boolean postProcess(int n) {
        super.postProcess(n);
        if (this.getVideoTextureProducer().g() && this.m_appearance != null) {
            this.b.a(this.getVideoTextureProducer(), this.m_appearance.getMargin(), this.m_appearance.getBorder(), this.m_appearance.getPadding());
        }
        return true;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        if (this.m_entity != null && this.b != null && this.b.h() != null) {
            this.m_entity.a(this.b.h());
        }
    }

    @Override
    public void setSize(int n, int n2) {
        super.setSize(n, n2);
        this.b.a(n, n2);
        this.setNeedsToPreProcess();
    }

    public void setOnTimeChange(fdl_1 fdl_12) {
        this.addEventListener(frd_0.L, fdl_12, false);
    }

    public void setKeepRatio(boolean bl) {
        this.p = bl;
        this.b.b(this.p);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1332819776) {
            this.setVideoPath(string);
        } else if (n == -630741988) {
            this.addEventListener(frd_0.L, fze2.a(fdl_1.class, string), false);
        } else if (n == -1760125050) {
            this.setKeepRatio(fze2.a(Boolean.class, string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1332819776) {
            this.setVideoPath((String)object);
        } else if (n == -1760125050) {
            this.setKeepRatio((Boolean)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

