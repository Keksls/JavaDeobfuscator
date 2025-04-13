/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fzo
implements fzl_0 {
    private static final Logger a = Logger.getLogger(fzo.class);
    private fsv_0 b = null;
    private fvE c = null;
    private ftj_0 d;
    private fsv_0 e;
    private boolean f;
    private int g = -1;
    private Object h = null;

    public fzo(ftj_0 ftj_02) {
        this.d = ftj_02;
    }

    @Override
    public void a(int n, int n2, fvE fvE2) {
        ftj_0 ftj_02;
        if (!this.f && this.b.isDragEnabled() && (n < (ftj_02 = this.d).getDisplayX() || n > ftj_02.getDisplayX() + ftj_02.getWidth() || n2 < ftj_02.getDisplayY() || n2 > ftj_02.getDisplayY() + ftj_02.getHeight())) {
            if (this.b == null || this.b.isUnloading()) {
                return;
            }
            this.e = (fsv_0)this.b.cloneElementStructure();
            if (this.e == null) {
                a.warn((Object)"probl\u00e8me au clone du dnd container, le clone est null");
                return;
            }
            this.e.setCopy(true);
            this.e.setSize(this.b.getSize());
            this.e.setNonBlocking(true);
            this.e.setLayoutData(null);
            this.b.a(this.h);
            if (this.e.isDisplayCopy()) {
                fta_0.getInstance().getLayeredContainer().a(this.e, 30000);
            }
            this.f = true;
        }
        if (this.f && this.e != null) {
            this.e.setPosition(n - this.e.getWidth() / 2, n2 - this.e.getHeight() / 2);
            if (fvE2 != null && !(fvE2 instanceof ftj_0)) {
                fvE2 = fvE2.getParentOfType(ftj_0.class);
            }
            if (fvE2 != this.c) {
                if (this.c != null) {
                    this.b.a(((ftj_0)this.c).getDragNDropable(), this.h);
                    this.c = null;
                }
                if (fvE2 != null) {
                    this.c = fvE2;
                    this.b.b(((ftj_0)this.c).getDragNDropable(), this.h);
                }
            }
        }
    }

    @Override
    public void b(int n, int n2, fvE fvE2) {
        if (this.f) {
            abo_1 abo_12;
            fsv_0 fsv_02 = null;
            if (fvE2 != null) {
                fsv_02 = fvE2 instanceof fsv_0 ? (fsv_0)fvE2 : (fsv_0)fvE2.getParentOfType(fsS.class);
                if (fsv_02 == null) {
                    if (!(fvE2 instanceof ftj_0)) {
                        abo_12 = fvE2.getParentOfType(ftj_0.class);
                        if (abo_12 instanceof ftj_0) {
                            fsv_02 = ((ftj_0)abo_12).getDragNDropable();
                        }
                    } else {
                        fsv_02 = ((ftj_0)fvE2).getDragNDropable();
                    }
                }
                if (fsv_02 == null) {
                    fsv_02 = fvE2.getParentOfType(fsv_0.class);
                }
            }
            if (fsv_02 != null && fsv_02.isDropValid(this.b, this.h)) {
                fsv_02.a(this.b, this.h, this.g);
            } else if (fsv_02 != this.b) {
                abo_12 = fcx_1.a(fta_0.getInstance().getCurrentAWTMouseEvent(), this.b, this.h);
                this.d.dispatchEvent((fzs)abo_12);
            }
        }
        this.a();
    }

    @Override
    public void a() {
        if (this.e != null) {
            this.e.destroySelfFromParent();
            this.e = null;
        }
        this.b = null;
        this.c = null;
        this.g = -1;
        this.h = null;
    }

    @Override
    public boolean b() {
        boolean bl = this.f;
        this.a();
        this.d = null;
        return bl;
    }

    @Override
    public boolean a(fvE fvE2, int n, int n2) {
        if (fvE2 == null) {
            return false;
        }
        if (!this.d.a()) {
            return false;
        }
        if (fvE2 != this.d && !fvE2.hasInParentHierarchy(this.d)) {
            return false;
        }
        return this.d.getItem() != null;
    }

    @Override
    public void a(int n, int n2) {
        this.g = this.d.getItemValueIndex();
        this.h = this.d.getItemValue();
        this.b = this.d.getDragNDropable();
        this.f = false;
        this.c = null;
    }

    @Override
    public Object c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return this.b != null && this.b.isDragEnabled();
    }

    @Override
    public boolean e() {
        return this.b != null && this.b.isDropEnabled();
    }
}

