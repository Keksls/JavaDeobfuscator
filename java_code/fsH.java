/*
 * Decompiled with CFR 0.152.
 */
public class fsH
extends fig_2 {
    final /* synthetic */ fsf_0 a;

    public fsH(fsf_0 fsf_02) {
        this.a = fsf_02;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22 = this.a.g.getVisible() ? this.a.g.getMinSize() : new fjf_2(0, 0);
        switch (this.a.e) {
            case a: 
            case b: {
                fjf_22.height += this.a.f.getMinSize().height;
                fjf_22.width = Math.max(fjf_22.width, this.a.f.getMinSize().width);
                break;
            }
            case c: 
            case d: {
                fjf_22.width += this.a.f.getMinSize().width;
                fjf_22.height = Math.max(fjf_22.height, this.a.f.getMinSize().height);
            }
        }
        return fjf_22;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22 = this.a.g.getVisible() ? this.a.g.getPrefSize() : new fjf_2(0, 0);
        switch (this.a.e) {
            case a: 
            case b: {
                fjf_22.height += this.a.f.getPrefSize().height;
                fjf_22.width = Math.max(fjf_22.width, this.a.f.getPrefSize().width);
                break;
            }
            case c: 
            case d: {
                fjf_22.width += this.a.f.getPrefSize().width;
                fjf_22.height = Math.max(fjf_22.height, this.a.f.getPrefSize().height);
            }
        }
        return fjf_22;
    }

    @Override
    public void a(fso fso2) {
        int n = fso2.m_appearance.getContentHeight();
        int n2 = fso2.m_appearance.getContentWidth();
        switch (this.a.e) {
            case a: {
                this.a.f.setSize(n2, this.a.f.getPrefSize().height);
                this.a.f.setPosition(0, n - this.a.f.getHeight());
                if (!this.a.g.getVisible()) break;
                this.a.g.setSize(n2, n - this.a.f.getHeight());
                this.a.g.setPosition(0, 0);
                break;
            }
            case b: {
                this.a.f.setSize(n2, this.a.f.getPrefSize().height);
                this.a.f.setPosition(0, 0);
                if (!this.a.g.getVisible()) break;
                this.a.g.setSize(n2, n - this.a.f.getHeight());
                this.a.g.setPosition(0, this.a.f.getHeight());
                break;
            }
            case d: {
                this.a.f.setSize(this.a.f.getPrefSize().width, n);
                this.a.f.setPosition(0, 0);
                if (!this.a.g.getVisible()) break;
                this.a.g.setSize(n2 - this.a.f.getWidth(), n);
                this.a.g.setPosition(this.a.f.getWidth(), 0);
                break;
            }
            case c: {
                this.a.f.setSize(this.a.f.getPrefSize().width, n);
                this.a.f.setPosition(n2 - this.a.f.getWidth(), 0);
                if (!this.a.g.getVisible()) break;
                this.a.g.setSize(n2 - this.a.f.getWidth(), n);
                this.a.g.setPosition(0, 0);
            }
        }
    }
}

