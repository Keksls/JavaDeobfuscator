/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fsm
 */
public class fsm_0
extends fvc_0
implements ahD,
ahk_0 {
    public static final fsm_0 a = new fsm_0();
    public static final String TAG = "compass";
    public static final String b = "progressBar";
    public static final String c = "compassOrientation";
    ftv f;
    fsk_0 g;
    fsk_0 h;
    float i;
    private float r;
    private final ArrayList<ahB> s = new ArrayList();
    public static final int d = 92960979;
    public static final int e = -490041217;

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(b)) {
            return this.f;
        }
        if (string.equals(c)) {
            return this.h;
        }
        return null;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    private float getEffectiveProximity() {
        float f2 = 0.05f;
        float f3 = 0.3f;
        return (1.0f - this.r) * 0.3f + 0.05f;
    }

    private void b() {
        float f2 = this.i + (float)Math.PI * 2 * this.getEffectiveProximity() / 2.0f;
        this.f.getProgressBarMesh().b(f2);
        this.f.a();
    }

    public void setAngle(float f2) {
        this.i = f2;
        this.h.getImageMesh().a(afr_2.f, f2);
        this.b();
        this.invalidateMinSize();
        this.setNeedsToPostProcess();
    }

    public void setProximity(float f2) {
        this.r = f2;
        this.f.getProgressBarMesh().a(this.getEffectiveProximity());
        this.b();
    }

    @Override
    public void a(ahB ahB2) {
        ays_2 ays_22;
        this.s.add(ahB2);
        if (!ahB2.q()) {
            ahB2.c(this.getTarget().G(), this.getTarget().H(), this.getTarget().I());
        }
        if ((ays_22 = fze.a().d(ahB2.e())) == null) {
            m_logger.error((Object)("On essai d'ajouter un marqueur avec l'url=" + ahB2.e() + " mais l'icone n'exite pas !!!"));
            return;
        }
        fqv fqv2 = new fqv();
        fqv2.onCheckOut();
        fqv2.setPixmap(new ayo_2(ays_22));
        this.g.add(fqv2);
        this.setVisible(true);
    }

    @Override
    public void b(ahB ahB2) {
        this.s.remove(ahB2);
        this.setVisible(false);
    }

    private float a(float f2, float f3) {
        if (f2 == 0.0f && f3 < 0.0f) {
            f2 = -1.0E-4f;
        }
        if (f2 == 0.0f && f3 == 0.0f) {
            return -1.5707964f;
        }
        float f4 = afq_2.b(f2, f3);
        float f5 = f3 / f4;
        float f6 = -f2 / f4;
        double d2 = Math.acos(f5);
        return (float)((double)Math.signum(f6) * d2) - 1.5707964f;
    }

    public void a(ahg_0 ahg_02, int n) {
        if (this.s.isEmpty()) {
            return;
        }
        ahB ahB2 = this.s.get(0);
        float f2 = this.getTarget().J();
        float f3 = this.getTarget().K();
        float f4 = afq_2.b(ahB2.n() - ahB2.k(), ahB2.o() - ahB2.l());
        float f5 = afq_2.b(f2 - (float)ahB2.h(), f3 - (float)ahB2.i());
        this.setProximity(1.0f - Hw.b(f5 / (f4 * 1.2f), 0.0f, 1.0f));
        float f6 = ahg_02.c(f2, f3);
        float f7 = ahg_02.a(f2, f3, this.getTarget().I());
        int n2 = ahB2.b();
        int n3 = ahB2.c();
        this.setAngle(this.a(f6 - (float)n2, f7 - (float)n3));
    }

    public void a(ahg_0 ahg_02, float f2, float f3) {
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f = null;
        this.h = null;
        this.g = null;
        this.s.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(200, 200));
        this.add(fid_12);
        fsn fsn2 = new fsn(this);
        fsn2.onCheckOut();
        this.add(fsn2);
        this.setVisible(false);
        this.setYOffset(-130);
        this.f = new ftv();
        this.f.onCheckOut();
        this.f.setDisplayType(ftw_0.e);
        this.f.setValue(1.0f);
        this.f.setNonBlocking(true);
        fwo_0 fwo_02 = (fwo_0)this.f.getProgressBarMesh();
        fwo_02.c(0.75f);
        fwo_02.d(0.8f);
        this.add(this.f);
        this.h = new fsk_0();
        this.h.onCheckOut();
        this.h.setNonBlocking(true);
        this.add(this.h);
        this.g = new fsk_0();
        this.g.onCheckOut();
        this.g.setNonBlocking(true);
        this.add(this.g);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fsm_0 fsm_02 = (fsm_0)fyo2;
        fsm_02.setAngle(this.i);
        fsm_02.setProximity(this.r);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92960979) {
            this.setAngle(Co.e(string));
        } else if (n == -490041217) {
            this.setProximity(Co.e(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92960979) {
            this.setAngle(Co.e(object));
        } else if (n == -490041217) {
            this.setProximity(Co.e(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

