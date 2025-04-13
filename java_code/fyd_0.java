/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from fyD
 */
public class fyd_0 {
    private static final fyd_0 e = new fyd_0();
    public static short a = 1;
    public static short b = (short)10000;
    public static final short c = 20000;
    public static final short d = 30000;
    private final ArrayList<fyb_0> f = new ArrayList();
    private short g = 0;
    private static final Comparator<fyb_0> h = new fye_0();
    private fso i;

    private fyd_0() {
    }

    public static fyd_0 a() {
        return e;
    }

    public void a(fyb_0 fyb_02) {
        if (fyb_02.getModalLevel() > this.g) {
            this.g = fyb_02.getModalLevel();
            fyc_0.a().c();
        }
        this.f.add(fyb_02);
        this.f.sort(h);
    }

    public void b(fyb_0 fyb_02) {
        this.g = this.g + 1 < 20000 ? (short)20000 : (short)(this.g + 1);
        fyb_02.setModalLevel(this.g);
        fyc_0.a().c();
        this.f.add(fyb_02);
        this.f.sort(h);
        fta_0 fta_02 = fta_0.getInstance();
        fsn_0 fsn_02 = fta_02.getLayeredContainer();
        int n = fsn_02.getWidgetPositionInLayer((fvE)fyb_02);
        if (this.f.size() == 1) {
            this.i = new fso();
            this.i.onCheckOut();
            fid_1 fid_12 = new fid_1();
            fid_12.onCheckOut();
            fid_12.setAlign(frk_0.i);
            fid_12.setSize(fta_02.getSize());
            this.i.setLayoutData(fid_12);
            fbf_1 fbf_12 = new fbf_1();
            fbf_12.onCheckOut();
            fbf_12.setColor(fpm_0.b().c());
            this.i.getAppearance().addBasicElement(fbf_12);
            this.i.setSize(fta_02.getSize());
            fsn_02.a(this.i, 26000, n);
        } else {
            fsn_02.setWidgetPositionInLayer(this.i, n - 1);
        }
    }

    public void c(fyb_0 fyb_02) {
        boolean bl;
        if (fyb_02.getModalLevel() == this.g) {
            this.g = 0;
            for (fyb_0 fyb_03 : this.f) {
                if (fyb_03.getModalLevel() <= this.g) continue;
                this.g = fyb_03.getModalLevel();
            }
        }
        if (bl = this.f.remove(fyb_02)) {
            if (this.f.isEmpty()) {
                this.i.destroySelfFromParent();
            } else {
                fyb_0 fyb_03;
                fyb_03 = fta_0.getInstance();
                fsn_0 fsn_02 = ((ftv_0)fyb_03).getLayeredContainer();
                fyb_0 fyb_04 = this.f.get(this.f.size() - 1);
                int n = fsn_02.getWidgetPositionInLayer((fvE)fyb_04);
                int n2 = fsn_02.getWidgetPositionInLayer(this.i);
                fsn_02.setWidgetPositionInLayer(this.i, n - (n2 < n ? 1 : 0));
            }
        }
    }

    public void b() {
        this.f.clear();
    }

    public short c() {
        return this.g;
    }

    public boolean a(int n, int n2) {
        if (!this.f.isEmpty()) {
            fvE fvE2;
            for (fvE2 = fta_0.getInstance().getWidget(n, n2); fvE2 != null && fvE2.getModalLevel() == -1 && fvE2 != fta_0.getInstance(); fvE2 = fvE2.getParentOfType(fvE.class)) {
            }
            if (fvE2 != null) {
                return fvE2.getModalLevel() >= this.f.get(0).getModalLevel();
            }
        }
        return true;
    }

    public boolean d() {
        return this.f.isEmpty();
    }
}

