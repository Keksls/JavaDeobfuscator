/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fIN
 */
public class fin_1
extends fyg_0 {
    private static Logger e = Logger.getLogger(fin_1.class);
    public static final String TAG = "TabItem";
    private ftI f = null;
    private boolean g = false;
    private fso h = null;
    private fqv i = null;
    private String j = null;
    private Boolean k = true;
    private boolean l = true;
    private final ArrayList<fio_1> m = new ArrayList();
    private boolean n = false;
    public static final int a = 3556653;
    public static final int b = -1609594047;
    public static final int c = 466743410;
    public static final int d = 1408414817;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof ftI) {
            fut_0 fut_02;
            boolean bl = this.f != null;
            this.setButton((ftI)fyb_02, true);
            if (bl && (fut_02 = this.getParentOfType(fut_0.class)) != null) {
                fut_02.a(this);
            }
            return;
        }
        if (fyb_02 instanceof fso) {
            this.h = (fso)fyb_02;
            return;
        }
        if (fyb_02 instanceof fqv) {
            if (this.f != null) {
                this.f.setPixmap((fqv)fyb_02);
            }
            this.i = (fqv)fyb_02;
        }
        super.add(fyb_02);
    }

    public void a(fio_1 fio_12) {
        if (!this.m.contains(fio_12)) {
            this.m.add(fio_12);
        }
    }

    public void b(fio_1 fio_12) {
        this.m.remove(fio_12);
    }

    public void a(boolean bl) {
        for (int k = this.m.size() - 1; k >= 0; --k) {
            this.m.get(k).a(bl);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean a() {
        return this.g;
    }

    public ftI getButton() {
        return this.f;
    }

    public void setButton(ftI ftI2) {
        this.setButton(ftI2, false);
    }

    public void setButton(ftI ftI2, boolean bl) {
        this.f = ftI2;
        this.f.setEnabled(this.k);
        this.f.setVisible(this.l);
        this.a(this.l);
        this.g = bl;
        if ((!this.g || this.n) && this.j != null) {
            this.f.setText(this.j);
        }
    }

    public fso getData() {
        return this.h;
    }

    public void setData(fso fso2) {
        this.h = fso2;
    }

    public String getText() {
        return this.j;
    }

    public void setText(String string) {
        this.j = string;
        if (this.f != null) {
            this.f.setText(this.j);
        }
    }

    public void setEnabled(boolean bl) {
        this.k = bl;
        if (this.f != null) {
            this.f.setEnabled(this.k);
        }
    }

    private void setVisible(boolean bl) {
        boolean bl2 = bl != this.l;
        this.l = bl;
        if (this.f != null) {
            this.f.setVisible(this.l);
            if (bl2) {
                this.a(bl2);
            }
        }
    }

    public boolean isKeepButtonParameters() {
        return this.n;
    }

    public void setKeepButtonParameters(boolean bl) {
        this.n = bl;
    }

    public void b() {
        if (this.f != null && this.i != null) {
            this.f.setPixmap(this.i);
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fin_1 fin_12 = (fin_1)fyo2;
        super.copyElement(fin_12);
        fin_12.f = this.f;
        fin_12.g = this.g;
        fin_12.j = this.j;
        fin_12.k = this.k;
        fin_12.l = this.l;
        fin_12.n = this.n;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3556653) {
            this.setText(fze2.a(string, this.m_elementMap));
        } else if (n == -1609594047) {
            this.setEnabled(Co.a(string));
        } else if (n == 466743410) {
            this.setVisible(Co.a(string));
        } else if (n == 1408414817) {
            this.setKeepButtonParameters(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            this.setText(String.valueOf(object));
        } else if (n == -1609594047) {
            this.setEnabled(Co.b(object));
        } else if (n == 466743410) {
            this.setVisible(Co.b(object));
        } else if (n == 1408414817) {
            this.setKeepButtonParameters(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.h != null) {
            this.h.release();
            this.h = null;
        }
        this.m.clear();
        if (this.f != null) {
            this.f = null;
        }
        this.g = false;
        this.n = false;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    public boolean isVisible() {
        return this.l;
    }
}

