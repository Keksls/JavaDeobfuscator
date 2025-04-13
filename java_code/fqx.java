/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;

public class fqx
extends fqj {
    public static final String a = "progressBar";
    public static final String b = "progressBarBorder";
    public static final String TAG = "progressBarAppearance";
    private fqg_0 e = null;
    private fqg_0 f = null;
    private Insets g = null;
    private frs_0 h = frs_0.e;
    private final fqv[] i = new fqv[9];
    public static final int c = -1072556510;
    public static final int d = 0x2C929929;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            fqv fqv2 = (fqv)fyb_02;
            switch (fqv2.getPosition()) {
                case a: {
                    this.i[0] = fqv2;
                    break;
                }
                case c: {
                    this.i[1] = fqv2;
                    break;
                }
                case e: {
                    this.i[2] = fqv2;
                    break;
                }
                case h: {
                    this.i[3] = fqv2;
                    break;
                }
                case i: {
                    this.i[4] = fqv2;
                    break;
                }
                case j: {
                    this.i[5] = fqv2;
                    break;
                }
                case m: {
                    this.i[6] = fqv2;
                    break;
                }
                case o: {
                    this.i[7] = fqv2;
                    break;
                }
                case q: {
                    this.i[8] = fqv2;
                }
            }
            this.a();
        } else if (fyb_02 instanceof fqg_0) {
            fqg_0 fqg_02 = (fqg_0)fyb_02;
            if (fqg_02.getName() == null || fqg_02.getName().equalsIgnoreCase(a)) {
                fqg_02.addEventListener(frd_0.b, new fqy(this), false);
                this.e = (fqg_0)fyb_02;
                this.d();
            } else if (fqg_02.getName().equals(b)) {
                fqg_02.addEventListener(frd_0.b, new fqz(this), false);
                this.f = (fqg_0)fyb_02;
                this.d();
            }
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        if (this.e != null) {
            this.d();
        } else {
            this.a();
        }
        this.b();
        this.c();
    }

    public void setPosition(frs_0 frs_02) {
        this.h = frs_02;
        this.c();
    }

    public void setInnerBorder(Insets insets) {
        this.g = insets == null ? null : new Insets(insets.top, insets.left, insets.bottom, insets.right);
        this.b();
    }

    public Insets getInnerBorder() {
        return this.g;
    }

    @Override
    public void l() {
        super.l();
        this.e();
        this.f();
    }

    public void a() {
        if (this.I == null || !(this.I instanceof ftv)) {
            return;
        }
        if (this.i[4] == null) {
            return;
        }
        if (this.i[0] != null && this.i[8] != null) {
            ((ftv)this.I).setPixmaps(this.i[0], this.i[1], this.i[2], this.i[3], this.i[4], this.i[5], this.i[6], this.i[7], this.i[8]);
        } else if (this.i[0] == null && this.i[8] == null) {
            ((ftv)this.I).setPixmaps(this.i[4], this.i[4], this.i[4], this.i[4], this.i[4], this.i[4], this.i[4], this.i[4], this.i[4]);
        }
    }

    private void b() {
        if (this.g == null || this.I == null || !(this.I instanceof ftv)) {
            return;
        }
        ftv ftv2 = (ftv)this.I;
        ftv2.setInnerBorder(this.g);
    }

    private void c() {
        if (!(this.I instanceof ftv)) {
            return;
        }
        ftv ftv2 = (ftv)this.I;
        ftv2.setInnerPosition(this.h);
    }

    void d() {
        if (this.I == null || !(this.I instanceof ftv)) {
            return;
        }
        ftv ftv2 = (ftv)this.I;
        if (this.e != null) {
            ftv2.setColor(this.e.getColor(), a);
        }
        if (this.f != null) {
            ftv2.setColor(this.f.getColor(), b);
        }
    }

    private void e() {
        if (this.e != null) {
            this.destroy(this.e);
            this.e = null;
        }
        if (this.f != null) {
            this.destroy(this.f);
            this.f = null;
        }
    }

    private void f() {
        for (int k = 0; k < this.i.length; ++k) {
            if (this.i[k] == null) continue;
            this.destroy(this.i[k]);
            this.i[k] = null;
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqx fqx2 = (fqx)fyo2;
        if (this.g != null) {
            fqx2.setInnerBorder(this.g);
        }
        fqx2.setPosition(this.h);
        super.copyElement(fyo2);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = frs_0.e;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e = null;
        this.f = null;
        for (int k = 0; k < this.i.length; ++k) {
            this.i[k] = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1072556510) {
            this.setInnerBorder(fze2.c(string));
        } else if (n == 0x2C929929) {
            this.setPosition(frs_0.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }
}

