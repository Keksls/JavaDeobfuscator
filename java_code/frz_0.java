/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.component.AbstractList;

/*
 * Renamed from frz
 */
public class frz_0
extends fig_2
implements frA {
    final /* synthetic */ AbstractList a;

    public frz_0(AbstractList abstractList) {
        this.a = abstractList;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        int n = (int)Math.ceil((float)this.a.m_items.size() / (float)this.a.m_isoColumnCount);
        int n2 = (int)Math.ceil(this.a.m_cellSize.getWidth() / 2.0 * (double)(n + this.a.m_isoColumnCount));
        int n3 = (int)Math.ceil(this.a.m_cellSize.getHeight() / 2.0 * (double)(n + this.a.m_isoColumnCount));
        return new fjf_2(n2, n3);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        int n = (int)Math.ceil((float)this.a.m_items.size() / (float)this.a.m_isoColumnCount);
        int n2 = (int)Math.ceil(this.a.m_cellSize.getWidth() / 2.0 * (double)(n + this.a.m_isoColumnCount));
        int n3 = (int)Math.ceil(this.a.m_cellSize.getHeight() / 2.0 * (double)(n + this.a.m_isoColumnCount));
        return new fjf_2(n2, n3);
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
        int n6 = (int)Math.min(Math.floor((float)(n2 / n4) * 2.0f), Math.floor((float)(n3 / n5) * 2.0f)) - this.a.m_isoColumnCount + 1;
        int n7 = n6 * this.a.m_isoColumnCount;
        if (n7 > this.a.m_renderables.size()) {
            this.a.m_renderables.ensureCapacity(n7);
            this.a.m_renderablePositions.ensureCapacity(n7);
            for (n = this.a.m_renderables.size(); n < n7; ++n) {
                ftj_02 = this.a.createRenderableElement();
                this.a.addRenderableElement(ftj_02);
            }
        }
        for (n = this.a.m_renderables.size() - 1; n >= 0 && n >= n7; --n) {
            ftj_02 = this.a.m_renderables.remove(n);
            if (ftj_02 == this.a.m_mouseOverRenderable) {
                this.a.m_mouseOverRenderable = null;
            }
            this.a.destroy(ftj_02);
        }
        for (n = 0; n < this.a.m_isoColumnCount; ++n) {
            int n8;
            int n9;
            if (n < this.a.m_isoColumnCount / 2) {
                n9 = 0;
                n8 = this.a.m_isoPositiveFactor ? -n5 * (2 * n - this.a.m_isoColumnCount + 1) : n5 * (2 * n - this.a.m_isoColumnCount) + n3;
            } else {
                n8 = 0;
                n9 = this.a.m_isoPositiveFactor ? (int)((float)n5 / 2.0f * (float)(2 * n - this.a.m_isoColumnCount + 1)) : (int)((float)n5 / 2.0f * (float)(2 * n - this.a.m_isoColumnCount - 1)) + n3;
            }
            for (int k = 0; k < n6; ++k) {
                int n10 = (this.a.m_isoColumnCount - n - 1) * n6 + k;
                ftj_0 ftj_03 = this.a.m_renderables.get(n10);
                ftj_03.setPosition(n8, n9);
                ftj_03.setSize(n4, n5);
                n8 += n4 / 2;
                n9 += this.a.m_isoPositiveFactor ? n5 / 2 : -n5 / 2;
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

    @Override
    public fqq_0 b() {
        return fqq_0.b;
    }
}

