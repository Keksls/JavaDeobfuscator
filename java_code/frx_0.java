/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.component.AbstractList;

/*
 * Renamed from frx
 */
public class frx_0
extends fig_2
implements frA {
    private static final int b = 4;
    private static final int d = 7;
    final /* synthetic */ AbstractList a;

    public frx_0(AbstractList abstractList) {
        this.a = abstractList;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = (int)Math.ceil(this.a.m_cellSize.getWidth() * 4.0);
        int n2 = (int)Math.ceil(this.a.m_cellSize.getHeight() * 7.0);
        return new fjf_2(n, n2);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = (int)Math.ceil(this.a.m_cellSize.getWidth() * 4.0);
        int n2 = (int)Math.ceil(this.a.m_cellSize.getHeight() * 7.0);
        return new fjf_2(n, n2);
    }

    @Override
    public void a(boolean bl) {
        ftj_0 ftj_02;
        int n;
        if (this.a.m_rendererManager == null) {
            return;
        }
        this.a.m_beingLayouted = true;
        int n2 = this.a.m_appearance.getContentWidth();
        int n3 = this.a.m_appearance.getContentHeight();
        int n4 = this.a.m_cellSize.width;
        int n5 = this.a.m_cellSize.height;
        this.a.m_scrollBar.setVisible(false);
        int n6 = this.a.m_items.size();
        if (n6 > this.a.m_renderables.size()) {
            this.a.m_renderables.ensureCapacity(n6);
            this.a.m_renderablePositions.ensureCapacity(n6);
            for (n = this.a.m_renderables.size(); n < n6; ++n) {
                ftj_02 = this.a.createRenderableElement();
                this.a.addRenderableElement(ftj_02);
            }
        }
        for (n = this.a.m_renderables.size() - 1; n >= 0 && n >= n6; --n) {
            ftj_02 = this.a.m_renderables.remove(n);
            if (ftj_02 == this.a.m_mouseOverRenderable) {
                this.a.m_mouseOverRenderable = null;
            }
            this.a.destroy(ftj_02);
        }
        n = 0;
        for (int k = 0; k < 4; ++k) {
            int n7;
            int n8;
            int n9 = k * n4;
            if (k == 0) {
                n8 = 4;
                n7 = n5 * 7 - n5;
            } else if (k == 3) {
                n8 = 4;
                n7 = n5 * 7 - n5 * 3;
            } else {
                n8 = 5;
                n7 = n5 * 7 - n5 * k;
            }
            for (int i2 = 0; i2 < n8; ++i2) {
                if (this.a.m_renderables.size() <= n) continue;
                ftj_0 ftj_03 = this.a.m_renderables.get(n++);
                ftj_03.setPosition(n9, n7);
                ftj_03.setSize(n4, n5);
                n7 -= n5;
            }
        }
        this.a.m_beingLayouted = false;
        float f2 = this.a.m_offset;
        this.a.checkOffsetValidity();
        if ((double)Math.abs(f2 - this.a.m_offset) > 1.0E-4) {
            this.a.setOffset(this.a.m_offset);
        }
        this.a.m_needToUpdateValues |= bl;
        this.setNeedsToPostProcess();
    }

    @Override
    public void a(fso fso2) {
        this.a(true);
    }
}

