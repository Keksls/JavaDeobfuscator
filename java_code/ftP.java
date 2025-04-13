/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class ftP
extends fso
implements fqu {
    public static final String TAG = "RepeatableImage";
    private final ArrayList<fsk_0> d = new ArrayList();
    private fqv e = null;
    private azj_2 f = null;
    private int g = 0;
    private boolean h = false;
    private boolean i = false;
    public static final int a = 1387629604;
    public static final int b = -1156593849;
    public static final int c = 1792677060;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public void add(fyv_0 fyv_02) {
        if (fyv_02 instanceof fim_2 && (this.m_layout != null || !(fyv_02 instanceof fin_2))) {
            fyv_02.release();
            return;
        }
        super.add(fyv_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setHorizontal(boolean bl) {
        if (this.m_layout instanceof fin_2) {
            ((fin_2)this.m_layout).setHorizontal(bl);
        }
    }

    public boolean getHorizontal() {
        if (this.m_layout instanceof fin_2) {
            return ((fin_2)this.m_layout).isHorizontal();
        }
        return false;
    }

    public void setRepeatNumber(int n) {
        if (n != this.g) {
            this.g = n;
            this.h = true;
            this.setNeedsToPreProcess();
        }
    }

    public int getRepeatNumber() {
        return this.g;
    }

    @Override
    public void setPixmap(fqv fqv2) {
        if (fqv2 != this.e) {
            this.e = fqv2;
        }
        this.i = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        if (this.f == azj_22) {
            return;
        }
        this.f = azj_22;
        for (int k = this.d.size() - 1; k >= 0; --k) {
            this.d.get(k).setModulationColor(azj_22);
        }
    }

    @Override
    public azj_2 getModulationColor() {
        return this.f;
    }

    @Override
    public void copyElement(fyo fyo2) {
        ftP ftP2 = (ftP)fyo2;
        super.copyElement(ftP2);
        while (ftP2.m_widgetChildren.size() > 0) {
            ((fvE)ftP2.m_widgetChildren.get(0)).destroySelfFromParent();
        }
        ftP2.setHorizontal(this.getHorizontal());
        ftP2.setRepeatNumber(this.g);
        ftP2.setModulationColor(this.f);
    }

    public void a() {
        if (this.h) {
            while (this.g < this.d.size()) {
                this.d.remove(this.g).destroySelfFromParent();
            }
            if (this.g > this.d.size()) {
                fsk_0 fsk_02;
                if (this.d.size() == 0) {
                    fsk_02 = new fsk_0();
                    fsk_02.onCheckOut();
                    fsk_02.setNonBlocking(true);
                    fsk_02.setModulationColor(this.f);
                    this.add(fsk_02);
                    fsk_02.add(this.e.cloneElementStructure());
                    this.d.add(fsk_02);
                }
                while (this.g > this.d.size()) {
                    fsk_02 = (fsk_0)this.d.get(0).cloneElementStructure();
                    this.add(fsk_02);
                    this.d.add(fsk_02);
                }
            }
            this.h = false;
        }
        if (this.i) {
            for (int k = this.d.size() - 1; k >= 0; --k) {
                this.d.get(k).add(this.e.cloneElementStructure());
            }
            this.i = false;
        }
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.i || this.h) {
            this.a();
            this.invalidateMinSize();
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d.clear();
        this.g = 0;
        this.e = null;
        this.f = null;
        this.h = false;
        this.i = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == 1792677060) {
            this.setRepeatNumber(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Co.b(object));
        } else if (n == -1156593849) {
            this.setModulationColor((azj_2)object);
        } else if (n == 1792677060) {
            this.setRepeatNumber(Co.c(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

