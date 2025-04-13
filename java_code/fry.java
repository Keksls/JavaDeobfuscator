/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.component.AbstractList;
import java.util.ArrayList;

public class fry
extends fig_2
implements frA {
    final /* synthetic */ AbstractList a;

    public fry(AbstractList abstractList) {
        this.a = abstractList;
    }

    public boolean a() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        fjf_2 fjf_22;
        if (this.a.m_autoIdealSize) {
            fjf_22 = this.a.getContentIdealSize(this.a.m_idealSizeMaxRows, this.a.m_idealSizeMaxColumns, this.a.m_idealSizeMinRows, this.a.m_idealSizeMinColumns);
        } else {
            int n = 30;
            int n2 = 30;
            int n3 = this.a.m_horizontal ? this.a.m_minDisplayedCells : 1;
            int n4 = this.a.m_horizontal ? 1 : this.a.m_minDisplayedCells;
            boolean bl = this.a.m_displayScrollbar;
            if (this.a.m_cellSize != null) {
                n = this.a.m_cellSize.width * n3;
                n2 = this.a.m_cellSize.height * n4;
                boolean bl2 = bl = this.a.m_scrollBarBehaviour != fra_0.c && this.a.computeColumnCount(n, this.a.m_cellSize.width) * this.a.computeRowCount(n2, this.a.m_cellSize.height) < (float)this.a.size();
            }
            if (this.a.m_scrollBarBehaviour == fra_0.b || bl) {
                if (this.a.m_horizontal) {
                    n2 += this.a.m_scrollBar.getMinSize().height;
                } else {
                    n += this.a.m_scrollBar.getMinSize().width;
                }
            }
            fjf_22 = new fjf_2(n, n2);
        }
        return fjf_22;
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        fjf_2 fjf_22;
        if (this.a.m_autoIdealSize) {
            fjf_22 = this.a.getContentIdealSize(this.a.m_idealSizeMaxRows, this.a.m_idealSizeMaxColumns, this.a.m_idealSizeMinRows, this.a.m_idealSizeMinColumns);
        } else {
            int n = 30;
            int n2 = 30;
            int n3 = this.a.m_horizontal ? this.a.m_minDisplayedCells : 1;
            int n4 = this.a.m_horizontal ? 1 : this.a.m_minDisplayedCells;
            boolean bl = this.a.m_displayScrollbar;
            if (this.a.m_cellSize != null) {
                n = this.a.m_cellSize.width * n3;
                n2 = this.a.m_cellSize.height * n4;
                boolean bl2 = bl = this.a.m_scrollBarBehaviour != fra_0.c && this.a.computeColumnCount(n, this.a.m_cellSize.width) * this.a.computeRowCount(n2, this.a.m_cellSize.height) < (float)this.a.size();
            }
            if (this.a.m_scrollBarBehaviour == fra_0.b || bl) {
                if (this.a.m_horizontal) {
                    n2 += this.a.m_scrollBar.getPrefSize().height;
                } else {
                    n += this.a.m_scrollBar.getPrefSize().width;
                }
            }
            fjf_22 = new fjf_2(n, n2);
        }
        return fjf_22;
    }

    @Override
    public void a(boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        if (this.a.m_rendererManager == null) {
            return;
        }
        this.a.m_beingLayouted = true;
        int n7 = this.a.m_appearance.getContentWidth();
        int n8 = this.a.m_appearance.getContentHeight();
        ArrayList<Object> arrayList = this.a.getItems();
        int n9 = arrayList == null ? 0 : arrayList.size();
        int n10 = 0;
        int n11 = 0;
        if (this.a.m_adaptCellSizeToContentSize) {
            if (n9 > 0) {
                if (this.a.m_horizontal) {
                    n6 = n7 / n9;
                    n5 = n8;
                } else {
                    n5 = n8 / n9;
                    n6 = n7;
                }
            } else {
                n5 = n8;
                n6 = n7;
            }
        } else {
            n6 = this.a.m_cellSize.a() != -1.0f ? Hw.c((float)n7 * this.a.m_cellSize.a() / 100.0f) : this.a.m_cellSize.width;
            int n12 = n5 = this.a.m_cellSize.b() != -1.0f ? Hw.c((float)n8 * this.a.m_cellSize.b() / 100.0f) : this.a.m_cellSize.height;
        }
        if (n5 == 0 || n6 == 0) {
            return;
        }
        float f2 = this.a.computeRowCount(n8, n5);
        float f3 = this.a.computeColumnCount(n7, n6);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = this.a.m_displayScrollbar;
        switch (this.a.m_scrollBarBehaviour) {
            case c: {
                this.a.m_displayScrollbar = false;
                break;
            }
            case b: {
                this.a.m_displayScrollbar = true;
                break;
            }
            case a: {
                if (this.a.m_horizontal && (float)(this.a.getPotentialColumnCount(f2) + this.a.m_showOneMore) > f3 || !this.a.m_horizontal && (float)(this.a.getPotentialRowCount(f3) + this.a.m_showOneMore) > f2) {
                    this.a.m_displayScrollbar = true;
                    break;
                }
                this.a.m_displayScrollbar = false;
                break;
            }
        }
        if (bl4 != this.a.m_displayScrollbar) {
            this.a.invalidateMinSize();
            this.a.invalidate();
            this.a.setNeedsToPreProcess();
            this.a.setNeedsToMiddleProcess();
            this.a.setNeedsToPostProcess();
        }
        if (this.a.m_displayScrollbar) {
            this.a.m_scrollBar.setVisible(true);
            if (this.a.m_horizontal) {
                n4 = this.a.m_scrollBar.getPrefSize().height;
                if (bl) {
                    this.a.m_scrollBar.setSize(n7, n4);
                }
                n8 -= n4;
                if (!this.a.m_oppositeScrollBarPosition) {
                    if (bl) {
                        this.a.m_scrollBar.setY(n11);
                    }
                    n11 += n4;
                } else if (bl) {
                    this.a.m_scrollBar.setY(n11 + n8);
                }
                if (bl) {
                    this.a.m_scrollBar.setX(n10);
                }
                n5 = this.a.m_cellSize.b() != -1.0f ? Hw.b((float)n8 * this.a.m_cellSize.b() / 100.0f) : this.a.m_cellSize.height;
                f2 = this.a.computeRowCount(n8, n5);
            } else {
                n4 = this.a.m_scrollBar.getPrefSize().width;
                if (bl) {
                    this.a.m_scrollBar.setSize(n4, n8);
                }
                n7 -= n4;
                if (!this.a.m_oppositeScrollBarPosition) {
                    if (bl) {
                        this.a.m_scrollBar.setX(n10 + n7);
                    }
                } else {
                    if (bl) {
                        this.a.m_scrollBar.setX(n10);
                    }
                    n10 += n4;
                }
                if (bl) {
                    this.a.m_scrollBar.setY(n11);
                }
                n6 = this.a.m_cellSize.a() != -1.0f ? Hw.b((float)n7 * this.a.m_cellSize.a() / 100.0f) : this.a.m_cellSize.width;
                f3 = this.a.computeColumnCount(n7, n6);
            }
        } else if (bl) {
            this.a.m_scrollBar.setVisible(false);
        }
        int n13 = n4 = this.a.getItems() == null || this.a.getItems().isEmpty() ? 1 : 0;
        if (n4 == 0 && this.a.m_horizontal && f2 == 0.0f) {
            f2 = 1.0f;
        } else if (n4 == 0 && !this.a.m_horizontal && f3 == 0.0f) {
            f3 = 1.0f;
        }
        float f4 = this.a.m_offset - (float)Hw.c(this.a.m_offset);
        int n14 = this.a.m_horizontal ? (int)((float)n6 * f4) : 0;
        int n15 = !this.a.m_horizontal ? (int)((float)n5 * f4) : 0;
        int n16 = n10;
        n11 = this.a.m_alignment.equals((Object)frs_0.h) ? (int)((float)n11 + (float)n5 * (f2 - 1.0f)) : (this.a.m_alignment.equals((Object)frs_0.e) && this.a.m_horizontal ? (int)((float)n11 + ((float)(n8 - n5) - ((float)n8 - (float)n5 * f2) / 2.0f)) : (n11 += n8 - n5 + n15));
        int n17 = Hw.d(f2) + (this.a.m_horizontal ? 0 : 1);
        int n18 = Hw.d(f3) + (this.a.m_horizontal ? 1 : 0);
        int n19 = Hw.c(f2);
        int n20 = Hw.c(f3);
        int n21 = n3 = this.a.m_horizontal ? n17 - 1 + (n18 - 1) * n19 + 1 : (n17 - 1) * n20 + n18 - 1 + 1;
        if (n3 > this.a.m_renderables.size()) {
            this.a.m_renderables.ensureCapacity(n3);
            this.a.m_renderablePositions.ensureCapacity(n3);
            for (n2 = this.a.m_renderables.size(); n2 < n3; ++n2) {
                ftj_0 ftj_02 = this.a.createRenderableElement();
                this.a.addRenderableElement(ftj_02);
            }
        }
        n2 = Hw.d(this.a.m_currentRowCount) + (this.a.m_horizontal ? 0 : 1);
        int n22 = Hw.d(this.a.m_currentColumnCount) + (this.a.m_horizontal ? 1 : 0);
        if (n22 > n18 || n2 > n17) {
            for (n = this.a.m_renderables.size() - 1; n >= 0 && n >= n18 * n17; --n) {
                ftj_0 ftj_03 = this.a.m_renderables.remove(n);
                if (ftj_03 == this.a.m_mouseOverRenderable) {
                    this.a.m_mouseOverRenderable = null;
                }
                this.a.destroy(ftj_03);
            }
        }
        for (n = 0; n < n17; ++n) {
            n10 = this.a.m_alignment.equals((Object)frs_0.f) ? n16 + n7 - (int)((float)n6 * f3) : (this.a.m_alignment.equals((Object)frs_0.e) ? n16 + (n7 - (int)((float)n6 * f3)) / 2 : n16 - n14);
            for (int k = 0; k < n18; ++k) {
                int n23 = this.a.m_horizontal ? n + k * n19 : n * n20 + k;
                ftj_0 ftj_04 = this.a.m_renderables.get(n23);
                if (ftj_04 != null) {
                    ftj_04.setSize(n6, n5);
                    this.a.m_renderablePositions.get(n23).setLocation(n10, n11);
                    ftj_04.setPosition(n10, n11, !this.a.m_usePositionTween);
                }
                n10 += n6 + 0;
            }
            n11 -= n5 + 0;
        }
        this.a.m_currentColumnCount = f3;
        this.a.m_currentRowCount = f2;
        if (bl && this.a.m_displayScrollbar) {
            this.a.updateScrollBarLayout();
        }
        this.a.m_beingLayouted = false;
        float f5 = this.a.m_offset;
        this.a.checkOffsetValidity();
        if ((double)Math.abs(f5 - this.a.m_offset) > 1.0E-4) {
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

