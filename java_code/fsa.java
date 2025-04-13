/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

public class fsa
extends fig_2 {
    final /* synthetic */ fru_0 a;

    public fsa(fru_0 fru_02) {
        this.a = fru_02;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22;
        fjf_2 fjf_23 = this.a.a != null ? this.a.a.getMinSize() : new fjf_2();
        fjf_2 fjf_24 = fjf_22 = this.a.b != null ? this.a.b.getMinSize() : new fjf_2();
        if (this.a.d == frm_0.d || this.a.d == frm_0.c) {
            fjf_23.height = Math.max(fjf_23.height, fjf_22.height);
            fjf_23.width += fjf_22.width;
            if (this.a.a != null && this.a.b != null) {
                fjf_23.width += this.a.getAppearance().getGap();
            }
        } else {
            fjf_23.height += fjf_22.height;
            fjf_23.width = Math.max(fjf_23.width, fjf_22.width);
            if (this.a.a != null && this.a.b != null) {
                fjf_23.height += this.a.getAppearance().getGap();
            }
        }
        return fjf_23;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22;
        fjf_2 fjf_23 = this.a.a != null ? this.a.a.getPrefSize() : new fjf_2();
        fjf_2 fjf_24 = fjf_22 = this.a.b != null ? this.a.b.getPrefSize() : new fjf_2();
        if (this.a.d == frm_0.d || this.a.d == frm_0.c) {
            fjf_23.height = Math.max(fjf_23.height, fjf_22.height);
            fjf_23.width += fjf_22.width;
            if (this.a.a != null && this.a.b != null) {
                fjf_23.width += this.a.getAppearance().getGap();
            }
        } else {
            fjf_23.height += fjf_22.height;
            fjf_23.width = Math.max(fjf_23.width, fjf_22.width);
            if (this.a.a != null && this.a.b != null) {
                fjf_23.height += this.a.getAppearance().getGap();
            }
        }
        return fjf_23;
    }

    @Override
    public void a(fso fso2) {
        fjf_2 fjf_22 = new fjf_2(0, 0);
        Point point = new Point(0, 0);
        fjf_2 fjf_23 = new fjf_2(0, 0);
        Point point2 = new Point(0, 0);
        if (this.a.b != null && this.a.b.getVisible()) {
            fjf_22 = this.a.b.getPrefSize();
            fjf_22.a(this.a.m_appearance.getContentWidth(), this.a.m_appearance.getContentHeight());
        }
        if (this.a.a != null && this.a.a.getVisible()) {
            fjf_23 = this.a.a.getPrefSize();
            switch (this.a.d) {
                case a: {
                    point2.y += fjf_22.height;
                    if (this.a.b == null) break;
                    point2.y += this.a.getAppearance().getGap();
                    break;
                }
                case b: {
                    point.y += fjf_23.height;
                    if (this.a.b == null) break;
                    point.y += this.a.getAppearance().getGap();
                    break;
                }
                case c: {
                    point2.x += fjf_22.width;
                    if (this.a.b == null) break;
                    point2.x += this.a.getAppearance().getGap();
                    break;
                }
                case d: {
                    point.x += fjf_23.width;
                    if (this.a.b == null) break;
                    point.x += this.a.getAppearance().getGap();
                }
            }
        }
        int n = 0;
        int n2 = 0;
        switch (this.a.d) {
            case a: 
            case b: {
                if (fjf_22.width > fjf_23.width) {
                    point2.x += (fjf_22.width - fjf_23.width) / 2;
                } else {
                    point.x += (fjf_23.width - fjf_22.width) / 2;
                }
                n = fjf_22.height + fjf_23.height;
                n2 = Math.max(fjf_22.width, fjf_23.width);
                if (this.a.b == null || this.a.a == null) break;
                n += this.a.getAppearance().getGap();
                break;
            }
            case c: 
            case d: {
                if (fjf_22.height > fjf_23.height) {
                    point2.y += (fjf_22.height - fjf_23.height) / 2;
                } else {
                    point.y += (fjf_23.height - fjf_22.height) / 2;
                }
                n = Math.max(fjf_22.height, fjf_23.height);
                n2 = fjf_22.width + fjf_23.width;
                if (this.a.b == null || this.a.a == null) break;
                n2 += this.a.getAppearance().getGap();
            }
        }
        point.x += this.a.c.a(n2, this.a.m_appearance.getContentWidth());
        point2.x += this.a.c.a(n2, this.a.m_appearance.getContentWidth());
        point.y += this.a.c.b(n, this.a.m_appearance.getContentHeight());
        point2.y += this.a.c.b(n, this.a.m_appearance.getContentHeight());
        if (this.a.a != null) {
            this.a.a.setSize(fjf_23);
            this.a.a.setPosition(point2);
        }
        if (this.a.b != null) {
            this.a.b.setSize(fjf_22);
            this.a.b.setPosition(point);
        }
    }
}

