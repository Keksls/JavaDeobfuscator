/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fta
 */
public class fta_0
extends ftv_0 {
    private static final Logger e = Logger.getLogger(fta_0.class);
    public static final String TAG = "MasterRootContainer";
    private static final fta_0 f = new fta_0();
    private fvE g;
    private fvE h;
    private fck_2 i;
    private MouseEvent j = null;
    private fck_2 k = null;
    private MouseEvent l = null;
    private fjf_2 m = null;
    private boolean n = false;
    private fvE o;
    private boolean p = false;
    private int q;
    private final TIntHashSet r = new TIntHashSet();
    private ftn_0 s;
    boolean t = true;
    private boolean u = false;
    private final ArrayList<ftc> v = new ArrayList();
    private boolean w = false;

    private fta_0() {
    }

    public static fta_0 getInstance() {
        return f;
    }

    public void a() {
        this.addEventListener(frd_0.p, new ftb_0(this), false);
    }

    @Override
    public void setSize(int n, int n2, boolean bl) {
        this.m = new fjf_2(n, n2);
        this.setNeedsToPreProcess();
    }

    @Override
    public fta_0 getMasterRootContainer() {
        return this;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fvE getMouseOver() {
        return this.g;
    }

    public fck_2 getCurrentMouseEvent() {
        return this.k;
    }

    public MouseEvent getCurrentAWTMouseEvent() {
        return this.l;
    }

    public ftn_0 getPopupContainer() {
        return this.s;
    }

    public boolean isResized() {
        return this.n;
    }

    public boolean isKeyEventConsumed() {
        return this.t;
    }

    public void setKeyEventConsumed(boolean bl) {
        this.t = bl;
    }

    @Override
    public void setElementMap(fyy_0 fyy_02) {
        super.setElementMap(fyy_02);
        this.c.setElementMap(fyy_02);
    }

    @Override
    protected void applyVisibility(boolean bl) {
        boolean bl2 = this.m_visible;
        super.applyVisibility(bl);
        fyt_0.a().a(frb_0.a);
        if (bl2 != bl) {
            for (ftc ftc2 : this.v) {
                if (bl) {
                    ftc2.a(this);
                    continue;
                }
                ftc2.b(this);
            }
        }
    }

    public void a(ftc ftc2) {
        if (!this.v.contains(ftc2)) {
            this.v.add(ftc2);
        }
    }

    public void b(ftc ftc2) {
        this.v.remove(ftc2);
    }

    public void b() {
        this.onCheckIn();
        this.onCheckOut();
        this.setSize(fdn_2.a().f());
        fyX fyX2 = fpm_0.b().j();
        fyX2.a(this.m_entity);
    }

    @Override
    public boolean isInWidgetTree() {
        return true;
    }

    @Override
    public boolean isInTree() {
        return true;
    }

    public boolean isDragging() {
        return this.o != null;
    }

    public fvE getDragged() {
        return this.o;
    }

    public int getDragButton() {
        return this.q;
    }

    public void setDragged(fvE fvE2, int n) {
        this.o = fvE2;
        this.q = n;
    }

    public boolean isShiftPressed() {
        return this.u;
    }

    public void c() {
        if (this.o != null) {
            this.o = null;
            this.q = 0;
            fzn.a().b();
        }
    }

    public void a(fvE fvE2) {
        if (this.o == fvE2) {
            this.o = null;
            this.q = 0;
            fzn.a().c();
        }
        if (this.g == fvE2) {
            this.g = null;
        }
        if (this.h == fvE2) {
            this.h = null;
        }
    }

    public void d() {
        if (this.j != null) {
            this.a(this.j);
        }
    }

    public boolean isMovePointMode() {
        return this.w;
    }

    public void setMovePointMode(boolean bl) {
        this.w = bl;
        fyt_0.a().a(bl ? frb_0.c : frb_0.a);
    }

    public boolean a(MouseEvent mouseEvent) {
        fck_2 fck_22;
        fvE fvE2;
        this.j = mouseEvent;
        this.l = mouseEvent;
        int n = this.m_size.height - mouseEvent.getY();
        int n2 = mouseEvent.getX();
        boolean bl = false;
        if (!fyd_0.a().a(n2, n)) {
            bl = true;
        }
        if (this.o == null && bl) {
            this.l = null;
            return true;
        }
        fyf_0.a().a(n2, n);
        fvE fvE3 = fvE2 = !bl ? this.getWidget(n2, n) : null;
        if (fvE2 != null) {
            if (fvE2 != this || fvE2 != this.g) {
                fyt_0.a().a(fvE2.getCursorType());
            }
            fck_22 = fck_2.a(mouseEvent);
            fck_22.c(fvE2);
            fck_22.c(n2);
            fck_22.d(n);
            fck_22.a(frd_0.u);
            this.k = fck_22;
            this.l = mouseEvent;
            fvE2.dispatchEvent(fck_22);
        }
        if (this.w) {
            fyt_0.a().a(frb_0.c);
        }
        if (fvE2 != this.g) {
            fcm_1 fcm_12;
            if (this.g != null) {
                fck_22 = fck_2.a(mouseEvent);
                fck_22.c(this.g);
                fck_22.c(n2);
                fck_22.d(n);
                fck_22.a(frd_0.z);
                this.k = fck_22;
                this.g.dispatchEvent(fck_22);
                this.k = null;
                fcm_12 = fcm_1.j();
                fcm_12.c(this.g);
                fcm_12.a(frd_0.G);
                this.g.dispatchEvent(fcm_12);
            }
            if (fvE2 != null) {
                fck_22 = fck_2.a(mouseEvent);
                fck_22.c(fvE2);
                fck_22.c(n2);
                fck_22.d(n);
                fck_22.a(frd_0.y);
                this.k = fck_22;
                fvE2.dispatchEvent(fck_22);
                this.k = null;
                fcm_12 = fcm_1.j();
                fcm_12.c(fvE2);
                fcm_12.a(frd_0.F);
                fvE2.dispatchEvent(fcm_12);
            }
            this.g = fvE2;
        }
        if (this.o != null) {
            this.k = fck_2.a(mouseEvent);
            this.k.c(this.o);
            this.k.c(n2);
            this.k.d(n);
            this.k.a(frd_0.w);
            if (!fzn.a().b(this.g, n2, n)) {
                if (this.p) {
                    fck_22 = fck_2.a(this.k);
                    fck_22.a(frd_0.v);
                    this.o.dispatchEvent(fck_22);
                    this.p = false;
                }
                this.o.dispatchEvent(this.k);
            } else {
                this.k.release();
            }
            this.k = null;
        }
        fzd_0.a().a(mouseEvent.getX(), n);
        this.l = null;
        return this.o != null;
    }

    public boolean b(MouseEvent mouseEvent) {
        int n = mouseEvent.getButton();
        if (n == 0) {
            return false;
        }
        this.l = mouseEvent;
        int n2 = mouseEvent.getX();
        int n3 = this.m_size.height - mouseEvent.getY();
        if (!fyd_0.a().a(n2, n3)) {
            this.l = null;
            this.r.add(n);
            return true;
        }
        fyf_0.a().a(n2, n3);
        fvE fvE2 = this.getWidget(n2, n3);
        if (fvE2 == null) {
            fvE2 = this;
        }
        fyc_0.a().c(fvE2);
        fck_2 fck_22 = fck_2.a(mouseEvent);
        fck_22.c(fvE2);
        fck_22.c(n2);
        fck_22.d(n3);
        fck_22.a(frd_0.A);
        this.k = fck_22;
        if (this.o == null && fvE2 != this) {
            this.p = true;
            this.o = fvE2;
            this.q = n;
            fzn.a().a(fvE2, n2, n3);
        }
        fyf_0.a().a(fvE2, fck_22);
        if (this.i != null) {
            this.i.release();
        }
        this.i = fck_2.a(fck_22);
        fvE2.dispatchEvent(fck_22);
        this.k = null;
        this.l = null;
        if (fvE2 != this) {
            this.r.add(n);
        }
        return fvE2 != this;
    }

    public boolean c(MouseEvent mouseEvent) {
        boolean bl;
        int n = mouseEvent.getButton();
        if (n == 0) {
            return false;
        }
        this.l = mouseEvent;
        int n2 = mouseEvent.getX();
        int n3 = this.m_size.height - mouseEvent.getY();
        boolean bl2 = this.q == n;
        boolean bl3 = bl = !fyd_0.a().a(n2, n3);
        if (bl && !bl2) {
            this.l = null;
            return this.r.remove(n);
        }
        fyf_0.a().a(n2, n3);
        fvE fvE2 = this.getWidget(n2, n3);
        if (fvE2 == null) {
            fvE2 = this;
        }
        fck_2 fck_22 = null;
        if (!bl) {
            fck_22 = fck_2.a(mouseEvent);
            fck_22.c(fvE2);
            fck_22.c(n2);
            fck_22.d(n3);
            fck_22.a(frd_0.B);
            fck_22.a(this.i);
            this.k = fck_22;
        }
        if (bl2) {
            fck_2 fck_23 = fck_2.a(mouseEvent);
            fck_23.c(fvE2);
            fck_23.c(n2);
            fck_23.d(n3);
            fck_23.a(frd_0.x);
            this.o.dispatchEvent(fck_23);
            this.o = null;
            this.q = 0;
            fzn.a().c(fvE2, n2, n3);
        }
        if (!bl) {
            fyf_0.a().b(fvE2, fck_22);
            fvE2.dispatchEvent(fck_22);
            this.k = null;
        }
        this.l = null;
        return this.r.remove(n);
    }

    public boolean a(MouseWheelEvent mouseWheelEvent) {
        this.l = mouseWheelEvent;
        int n = mouseWheelEvent.getX();
        int n2 = this.m_size.height - mouseWheelEvent.getY();
        if (!fyd_0.a().a(n, n2)) {
            return true;
        }
        fvE fvE2 = this.getWidget(n, n2);
        if (fvE2 == null) {
            fvE2 = this;
        }
        fck_2 fck_22 = fck_2.a(mouseWheelEvent);
        fck_22.c(fvE2);
        fck_22.c(n);
        fck_22.d(n2);
        fck_22.g(mouseWheelEvent.getWheelRotation());
        fck_22.a(frd_0.E);
        this.k = fck_22;
        fvE2.dispatchEvent(fck_22);
        this.k = null;
        this.l = null;
        return fvE2 != this;
    }

    public boolean a(KeyEvent keyEvent) {
        boolean bl = false;
        if (!fyd_0.a().d() && !fpm_0.b().f().d(keyEvent)) {
            bl = true;
        }
        fzK.a().a(keyEvent);
        if (keyEvent.getKeyCode() == 16) {
            this.u = true;
        }
        if (keyEvent.getKeyCode() == 17) {
            this.setMovePointMode(true);
        }
        if (keyEvent.getKeyCode() == 9) {
            if ((keyEvent.getModifiersEx() & 0x40) == 64) {
                fyc_0.a().d();
            } else {
                fyc_0.a().e();
            }
            return bl;
        }
        return bl |= this.a(keyEvent, frd_0.n);
    }

    public boolean b(KeyEvent keyEvent) {
        boolean bl;
        boolean bl2 = false;
        if (!fyd_0.a().d() && !fpm_0.b().f().d(keyEvent)) {
            bl2 = true;
        }
        fzK.a().b(keyEvent);
        if (keyEvent.getKeyCode() == 16) {
            this.u = false;
        }
        if (keyEvent.getKeyCode() == 17) {
            this.setMovePointMode(false);
        }
        if (bl = this.a(keyEvent, frd_0.o)) {
            fpm_0.b().f().d();
            this.setMovePointMode(false);
        }
        return bl | bl2;
    }

    public boolean c(KeyEvent keyEvent) {
        return this.a(keyEvent, frd_0.p);
    }

    private boolean a(KeyEvent keyEvent, frd_0 frd_02) {
        int n = keyEvent.getKeyCode();
        fvE fvE2 = fyc_0.a().b();
        if (fvE2 == null) {
            return false;
        }
        fcd_2 fcd_22 = fcd_2.l();
        fcd_22.c(fvE2);
        fcd_22.a(keyEvent.getKeyChar());
        fcd_22.a(n);
        fcd_22.b(keyEvent.getModifiersEx());
        fcd_22.a(frd_02);
        this.t = false;
        boolean bl = fvE2.dispatchEvent(fcd_22);
        return this.t || bl;
    }

    @Override
    public boolean preProcess(int n) {
        if (this.n) {
            this.n = false;
        }
        boolean bl = false;
        if (this.m != null) {
            super.setSize(this.m.width, this.m.height, false);
            this.m = null;
            this.n = true;
            bl = true;
        }
        return bl |= super.preProcess(n);
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        Point point = fdn_2.a().b();
        this.m_entity.D().a(0, point.x, point.y + this.m_size.height);
        return bl;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.setTreeDepth(0);
        this.m_nonBlocking = false;
        this.n = false;
        this.m_enableResizeEvents = true;
        this.s = new ftn_0();
        this.s.onCheckOut();
        this.c.a(this.s, 30000);
        fsm_0.a.onCheckOut();
        this.c.a(fsm_0.a, -40000);
        fsm_0.a.setElementMap(new fyy_0("", fpm_0.b().h()));
        fsm_0.a.onChildrenAdded();
        this.setScreenPosition(0, 0);
        this.a();
        this.m_needsScissor = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.o = null;
        this.j = null;
        this.g = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.s = null;
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
    }
}

