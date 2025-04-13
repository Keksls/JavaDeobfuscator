/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class fvR
implements fzu {
    final /* synthetic */ fvp_0 a;

    fvR(fvp_0 fvp_02) {
        this.a = fvp_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        if (!this.a.f) {
            this.a.e = new Point(fck_22.a(this.a.c.getContainer()), fck_22.b(this.a.c.getContainer()));
        }
        int n = fck_22.a(this.a.c.getContainer()) - this.a.e.x;
        int n2 = fck_22.b(this.a.c.getContainer()) - this.a.e.y;
        int n3 = this.a.c.getX() + this.a.c.getWidth();
        int n4 = this.a.c.getY() + this.a.c.getHeight();
        int n5 = this.a.c.getWidth();
        int n6 = this.a.c.getHeight();
        int n7 = this.a.c.getX();
        int n8 = this.a.c.getY();
        switch (this.a.d) {
            case f: {
                n5 = Math.min(this.a.setCheckedWidth(this.a.c.getWidth() + n), this.a.g.getWidth() - this.a.c.getX());
                break;
            }
            case b: {
                n6 = Math.min(this.a.setCheckedHeight(this.a.c.getHeight() + n2), this.a.g.getHeight() - this.a.c.getY());
                break;
            }
            case h: {
                n6 = Math.min(this.a.setCheckedHeight(this.a.c.getHeight() - n2), n4);
                n8 = n4 - n6;
                break;
            }
            case c: {
                n5 = Math.min(this.a.setCheckedWidth(this.a.c.getWidth() + n), this.a.g.getWidth() - this.a.c.getX());
                n6 = Math.min(this.a.setCheckedHeight(this.a.c.getHeight() + n2), this.a.g.getHeight() - this.a.c.getY());
                break;
            }
            case a: {
                n6 = Math.min(this.a.setCheckedHeight(this.a.c.getHeight() + n2), this.a.g.getHeight() - this.a.c.getY());
                n5 = Math.min(this.a.setCheckedWidth(this.a.c.getWidth() - n), n3);
                n7 = n3 - n5;
                break;
            }
            case g: {
                n5 = Math.min(this.a.setCheckedWidth(this.a.c.getWidth() - n), n3);
                n7 = n3 - n5;
                n6 = Math.min(this.a.setCheckedHeight(this.a.c.getHeight() - n2), n4);
                n8 = n4 - n6;
                break;
            }
            case i: {
                n6 = Math.min(this.a.setCheckedHeight(this.a.c.getHeight() - n2), n4);
                n8 = n4 - n6;
                n5 = Math.min(this.a.setCheckedWidth(this.a.c.getWidth() + n), this.a.g.getWidth() - this.a.c.getX());
                break;
            }
            case d: {
                n5 = Math.min(this.a.setCheckedWidth(this.a.c.getWidth() - n), n3);
                n7 = n3 - n5;
                break;
            }
        }
        this.a.c.setSize(n5, n6);
        this.a.c.setPosition(n7, n8);
        this.a.e = new Point(fck_22.a(this.a.c.getContainer()), fck_22.b(this.a.c.getContainer()));
        if (this.a.c.getContainer() != null) {
            this.a.c.getContainer().invalidateMinSize();
        }
        this.a.f = true;
        return false;
    }
}

