/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fvO
 */
class fvo_0
implements fzu {
    final /* synthetic */ fvM a;

    fvo_0(fvM fvM2) {
        this.a = fvM2;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        if (!this.a.d.isMovable() || this.a.f) {
            return false;
        }
        if (!this.a.e) {
            this.a.g = fck_22.a(this.a.d);
            this.a.h = fck_22.b(this.a.d);
            this.a.e = true;
        }
        int n = this.a.d.getX();
        int n2 = this.a.d.getY();
        if (this.a.k) {
            n = fck_22.a(this.a.d.getContainer()) - this.a.g;
        }
        if (this.a.l) {
            n2 = fck_22.b(this.a.d.getContainer()) - this.a.h;
        }
        if (this.a.d.isStickWithinRootContainer()) {
            int n3 = n - this.a.d.getX();
            int n4 = n2 - this.a.d.getY();
            int n5 = this.a.getX(this.a.i);
            int n6 = this.a.getY(this.a.i);
            int n7 = this.a.getX(this.a.d);
            int n8 = this.a.getY(this.a.d);
            int n9 = Math.min(50, this.a.m_size.width);
            int n10 = Math.min(50, this.a.m_size.height);
            if (this.a.k) {
                if (this.a.d.getStickFullyWithinRootContainer()) {
                    if (this.a.d.getX() + n3 < 0) {
                        n = 0;
                    } else if (this.a.d.getX() + this.a.d.getWidth() + n3 > this.a.i.getWidth()) {
                        n = this.a.i.getWidth() - this.a.d.getWidth();
                    }
                } else if (n5 + n3 + this.a.m_size.width - n9 < 0) {
                    n = -n7 - this.a.m_size.width + n9;
                } else if (n5 + n3 + n9 > this.a.i.getWidth()) {
                    n = this.a.i.getWidth() - (n7 + n9);
                }
            }
            if (this.a.l) {
                if (this.a.d.getStickFullyWithinRootContainer()) {
                    if (this.a.d.getY() + n4 < 0) {
                        n2 = 0;
                    } else if (this.a.d.getY() + this.a.d.getHeight() + n4 > this.a.i.getHeight()) {
                        n2 = this.a.i.getHeight() - this.a.d.getHeight();
                    }
                } else if (n6 + n4 + this.a.m_size.height - n10 < 0) {
                    n2 = -n8 - this.a.m_size.height + n10;
                } else if (n6 + n4 + n10 > this.a.i.getHeight()) {
                    n2 = this.a.i.getHeight() - (n8 + n10);
                }
            }
        }
        if (this.a.d.getStickData() != null) {
            Point point = new Point(n, n2);
            fbf_2.a().a(this.a.d, this.a.d.getX(), this.a.d.getY(), n, n2, point, fta_0.getInstance().isShiftPressed());
            n = point.x;
            n2 = point.y;
            if (fck_22.a(this.a.d.getContainer()) <= 0) {
                this.a.d.dispatchEvent(new fcw_2(this.a.d, frs_0.d));
            } else if (fck_22.a(this.a.d.getContainer()) >= this.a.d.getContainer().getWidth()) {
                this.a.d.dispatchEvent(new fcw_2(this.a.d, frs_0.f));
            } else if (fck_22.b(this.a.d.getContainer()) <= 0) {
                this.a.d.dispatchEvent(new fcw_2(this.a.d, frs_0.h));
            } else if (fck_22.b(this.a.d.getContainer()) >= this.a.d.getContainer().getHeight()) {
                this.a.d.dispatchEvent(new fcw_2(this.a.d, frs_0.b));
            }
        }
        this.a.d.setPosition(n, n2);
        if (this.a.d.getContainer() != null) {
            this.a.d.getContainer().invalidateMinSize();
        }
        return false;
    }
}

