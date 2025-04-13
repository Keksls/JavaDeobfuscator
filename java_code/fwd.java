/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.ArrayList;

public class fwd
extends fwc {
    public static final String TAG = "basicColorPicker";
    ArrayList<fru_0> g;
    ArrayList<fso> h;
    private ArrayList<fbf_1> i;
    boolean j = true;
    int k = 0;
    private fzu l;
    public static final int d = 1387629604;
    public static final int e = 1810594434;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isHorizontal() {
        return this.j;
    }

    public void setHorizontal(boolean bl) {
        if (this.j == bl) {
            return;
        }
        this.j = bl;
        this.invalidateMinSize();
    }

    public int getNumByLines() {
        return this.k;
    }

    public void setNumByLines(int n) {
        if (this.k == n) {
            return;
        }
        this.k = n;
        this.invalidateMinSize();
    }

    @Override
    protected void a() {
        fyb_0 fyb_02;
        int n;
        int n2 = this.g.size();
        int n3 = this.a.size();
        for (n = n2; n < n3; ++n) {
            fyb_02 = fso.checkOut();
            ((fso)fyb_02).getAppearance().setMargin(new Insets(1, 1, 0, 0));
            fic_1 fic_12 = new fic_1();
            fic_12.onCheckOut();
            fic_12.setAdaptToContentSize(true);
            ((fso)fyb_02).add(fic_12);
            fso fso2 = fso.checkOut();
            fid_1 fid_12 = new fid_1();
            fid_12.onCheckOut();
            fid_12.setSize(new fjf_2(100.0f, 100.0f));
            fso2.add(fid_12);
            fbf_1 fbf_12 = new fbf_1();
            fbf_12.onCheckOut();
            fso2.getAppearance().add(fbf_12);
            fso2.getAppearance().setMargin(new Insets(1, 1, 1, 1));
            fru_0 fru_02 = new fru_0();
            fru_02.onCheckOut();
            fru_02.setElementMap(this.m_elementMap);
            String string = this.getStyle();
            fru_02.setStyle(TAG + (string != null ? string : "") + "$button");
            fru_02.setPrefSize(new fjf_2(20, 15));
            fid_1 fid_13 = new fid_1();
            fid_13.onCheckOut();
            fid_13.setSize(new fjf_2(100.0f, 100.0f));
            fru_02.add(fid_13);
            fru_02.onChildrenAdded();
            ((fvE)fyb_02).add(fso2);
            ((fvE)fyb_02).add(fru_02);
            this.add(fyb_02);
            this.g.add(fru_02);
            this.i.add(fbf_12);
            this.h.add((fso)fyb_02);
        }
        for (n = n3; n < n2; ++n) {
            this.g.remove(this.g.size() - 1);
            this.i.remove(this.i.size() - 1);
            fyb_02 = this.h.remove(this.h.size() - 1);
            fyb_02.destroySelfFromParent();
        }
        if (n2 != n3) {
            this.invalidateMinSize();
        }
        assert (this.g.size() == this.a.size()) : "m_buttons devrait avoir la m\u00eame taille que m_colors";
        for (n = 0; n < n3; ++n) {
            fyb_02 = this.i.get(n);
            ((fbf_1)fyb_02).setColor((azj_2)this.a.get(n));
        }
    }

    private void b() {
        this.l = new fwe(this);
        this.addEventListener(frd_0.C, this.l, false);
    }

    @Override
    public void copyElement(fyo fyo2) {
        fwd fwd2 = (fwd)fyo2;
        super.copyElement(fwd2);
        fwd2.k = this.k;
        fwd2.j = this.j;
        fwd2.removeEventListener(frd_0.C, this.l, false);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g = null;
        this.i = null;
        this.h = null;
        this.l = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fwf fwf2 = new fwf(this);
        fwf2.onCheckOut();
        this.add(fwf2);
        this.k = 0;
        this.j = true;
        this.g = new ArrayList();
        this.i = new ArrayList();
        this.h = new ArrayList();
        this.b();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == 1810594434) {
            this.setNumByLines(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Co.b(object));
        } else if (n == 1810594434) {
            this.setNumByLines(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

