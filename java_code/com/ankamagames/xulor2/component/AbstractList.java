/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package com.ankamagames.xulor2.component;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class AbstractList
extends fsr_0<Object>
implements faa_1,
fab_1,
faj_2 {
    public static final String THEME_HORIZONTAL_SCROLLBAR = "horizontalScrollBar";
    public static final String THEME_VERTICAL_SCROLLBAR = "verticalScrollBar";
    private fwk m_filter;
    private boolean m_enableFilterCache = false;
    public ftx_0 m_scrollBar;
    public float m_currentColumnCount = -1.0f;
    public float m_currentRowCount = -1.0f;
    public fjf_2 m_cellSize = new fjf_2();
    public boolean m_adaptCellSizeToContentSize;
    private boolean m_enableDND = true;
    public float m_offset;
    public int m_minDisplayedCells = 1;
    public boolean m_beingLayouted;
    public boolean m_horizontal;
    public boolean m_oppositeScrollBarPosition;
    public int m_showOneMore;
    public boolean m_displayScrollbar;
    public boolean m_autoIdealSize;
    public int m_idealSizeMaxRows = -1;
    public int m_idealSizeMaxColumns = -1;
    public int m_idealSizeMinRows = -1;
    public int m_idealSizeMinColumns = -1;
    private fqu_0 m_listLayoutMode = fqu_0.a;
    public int m_isoColumnCount = 1;
    public boolean m_isoPositiveFactor = true;
    public fra_0 m_scrollBarBehaviour = fra_0.a;
    public ArrayList<Point> m_renderablePositions;
    public ArrayList<ftj_0> m_renderables;
    public ftj_0 m_mouseOverRenderable;
    public fag_2 m_rendererManager = new fag_2();
    public ArrayList<Object> m_items;
    private ArrayList<Object> m_unfilteredItems;
    private ArrayList<Object> m_newItems;
    public frs_0 m_alignment;
    protected String m_contentProperty;
    protected fyy_0 m_contentPropertyElementMap;
    private boolean m_listIsDirty;
    public boolean m_needToUpdateValues;
    protected fbz_2 m_mouseOverMesh;
    private fqv_0 m_scrollMode;
    private boolean m_scrollOnMouseWheel = true;
    private final ArrayList<fac_2> m_collectionContentLoadedListeners = new ArrayList();
    private final ArrayList<fad_2> m_collectionOffsetListeners = new ArrayList();
    private boolean m_listContentLoaded;
    private boolean m_keepOffset = false;
    private final fsh_0 m_scrollRefreshListener = new fsh_0(this);
    public static long LAYOUT_TIME;
    public static final int ALIGN_HASH = 92903173;
    public static final int ADAPT_CELL_SIZE_TO_CONTENT_SIZE_HASH = 496768218;
    public static final int AUTO_IDEAL_SIZE_HASH = -1388513017;
    public static final int CELL_SIZE_HASH = -917611389;
    public static final int HORIZONTAL_HASH = 1387629604;
    public static final int IDEAL_SIZE_MAX_COLUMNS_HASH = -995584913;
    public static final int IDEAL_SIZE_MAX_ROWS_HASH = 199368327;
    public static final int IDEAL_SIZE_MIN_COLUMNS_HASH = 1476414401;
    public static final int IDEAL_SIZE_MIN_ROWS_HASH = 419166325;
    public static final int LIST_FILTER_HASH;
    public static final int ENABLE_FILTER_CACHE = 400843111;
    public static final int LIST_OFFSET_HASH = 237212369;
    public static final int MIN_DISPLAYED_CELLS_HASH = -928803358;
    public static final int MOUSE_OVER_COLOR_HASH = -1504693302;
    public static final int OFFSET_HASH = -1019779949;
    public static final int OPPOSITE_SCROLL_BAR_POSITION_HASH = 560789800;
    public static final int SCROLL_BAR_HASH = 417762822;
    public static final int SCROLL_BAR_BEHAVIOUR_HASH = 1602982231;
    public static final int SHOW_ONE_MORE_HASH = -933261026;
    public static final int WISHED_MIN_SIZE_HASH = -588347635;
    public static final int ENABLE_DND_HASH = -631680873;
    public static final int LIST_LAYOUT_MODE_HASH = -1796676821;
    public static final int ISO_COLUMN_COUNT_HASH = 1324756372;
    public static final int ISO_POSITIVE_FACTOR_HASH = -1509885811;
    public static final int SCROLL_MODE_HASH = 66086416;
    public static final int SCROLL_ON_MOUSE_WHEEL_HASH = -575832990;
    public static final int KEEP_OFFSET_HASH = 1189020792;

    public AbstractList() {
        this(false);
    }

    public AbstractList(boolean bl) {
        this.m_horizontal = bl;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof faf_2) {
            this.m_rendererManager.a((faf_2)fyb_02);
        }
    }

    @Override
    public void addInnerMeshes() {
        if (this.m_mouseOverRenderable != null && this.m_mouseOverMesh != null) {
            this.m_entity.a(this.m_mouseOverMesh.c());
        }
        super.addInnerMeshes();
    }

    @Override
    public void addedToWidgetTree() {
        this.m_scrollBar.addedToWidgetTree();
        super.addedToWidgetTree();
        this.addEventListener(frd_0.I, fzs2 -> {
            fcq_1 fcq_12 = (fcq_1)fzs2;
            fum fum2 = this.m_scrollBar.getSlider();
            if (fcq_12.d() == fum2 || fcq_12.e() == fum2) {
                this.setListOffset(this.sliderValueToOffset(fcq_12.j()));
            }
            return false;
        }, false);
        this.addEventListener(frd_0.E, fzs2 -> {
            fck_2 fck_22 = (fck_2)fzs2;
            return this.mouseWheel(fck_22);
        }, false);
    }

    @Override
    public void removedFromWidgetTree() {
        for (ftj_0 ftj_02 : this.m_renderables) {
            ftj_02.removedFromWidgetTree();
        }
        this.m_scrollBar.removedFromWidgetTree();
        super.removedFromWidgetTree();
    }

    public void addListContentListener(fac_2 fac_22) {
        if (fac_22 != null && !this.m_collectionContentLoadedListeners.contains(fac_22)) {
            this.m_collectionContentLoadedListeners.add(fac_22);
        }
    }

    public void removeListContentLoadListener(fac_2 fac_22) {
        this.m_collectionContentLoadedListeners.remove(fac_22);
    }

    public void addOffsetListener(fad_2 fad_22) {
        if (!this.m_collectionOffsetListeners.contains(fad_22)) {
            this.m_collectionOffsetListeners.add(fad_22);
        }
    }

    public void removeCollectionOffsetListener(fad_2 fad_22) {
        this.m_collectionOffsetListeners.remove(fad_22);
    }

    public boolean getEnableDND() {
        return this.m_enableDND;
    }

    public void setEnableDND(boolean bl) {
        if (this.m_enableDND != bl) {
            this.m_enableDND = bl;
            for (int k = this.m_renderables.size() - 1; k >= 0; --k) {
                this.m_renderables.get(k).setEnableDND(bl);
            }
        }
    }

    public boolean getScrollOnMouseWheel() {
        return this.m_scrollOnMouseWheel;
    }

    public void setScrollOnMouseWheel(boolean bl) {
        this.m_scrollOnMouseWheel = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (ftj_0 ftj_02 : this.m_renderables) {
            ftj_02.setEnabled(bl);
            this.refreshEnabledAppearance(ftj_02);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (int k = this.m_renderables.size() - 1; k >= 0; --k) {
            ftj_0 ftj_02 = this.m_renderables.get(k);
            ftj_02.setNetEnabled(bl);
            this.refreshEnabledAppearance(ftj_02);
        }
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || !this.m_visible || !this.getAppearance().a(n, n2) || fta_0.getInstance().isMovePointMode()) {
            return null;
        }
        Object object = this.m_nonBlocking ? null : this;
        n -= this.getAppearance().getLeftInset();
        n2 -= this.getAppearance().getBottomInset();
        Object object2 = this.m_renderables.iterator();
        while (object2.hasNext()) {
            fvE fvE2;
            fvE fvE3 = object2.next();
            if (fvE3.isUnloading() || (fvE2 = fvE3.getWidget(n - fvE3.getX(), n2 - fvE3.getY())) == null) continue;
            object = fvE2;
        }
        if (this.m_displayScrollbar && !this.m_scrollBar.isUnloading() && (object2 = this.m_scrollBar.getWidget(n - this.m_scrollBar.getX(), n2 - this.m_scrollBar.getY())) != null) {
            object = object2;
        }
        return object;
    }

    public boolean mouseWheel(fck_2 fck_22) {
        if (this.m_scrollOnMouseWheel) {
            float f2 = this.m_offset;
            this.setOffset(this.m_offset + (float)fck_22.z());
            return this.m_offset != f2;
        }
        return false;
    }

    @Override
    public void setOffset(float f2) {
        this.m_scrollBar.getSlider().setValue(this.offsetToSliderValue(f2));
    }

    @Override
    public float getOffset() {
        return this.m_offset;
    }

    private float offsetToSliderValue(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (this.m_currentRowCount == -1.0f || this.m_currentColumnCount == -1.0f) {
            return 1.0f;
        }
        if (this.m_horizontal) {
            float f3 = (float)this.getPotentialColumnCount(this.m_currentRowCount) - this.m_currentColumnCount + (float)this.m_showOneMore;
            if (f2 > f3 + 1.0f) {
                f2 = f3 + 1.0f;
            }
            return f3 == 0.0f ? 0.0f : f2 / f3;
        }
        float f4 = (float)this.getPotentialRowCount(this.m_currentColumnCount) - this.m_currentRowCount + (float)this.m_showOneMore;
        if (f2 > f4 + 1.0f) {
            f2 = f4 + 1.0f;
        }
        return f4 == 0.0f ? 0.0f : 1.0f - f2 / f4;
    }

    private float sliderValueToOffset(float f2) {
        float f3;
        float f4;
        if (this.m_horizontal) {
            f4 = (float)this.getPotentialColumnCount(this.m_currentRowCount) - this.m_currentColumnCount + (float)this.m_showOneMore;
            f3 = f4 * f2;
        } else {
            f4 = (float)this.getPotentialRowCount(this.m_currentColumnCount) - this.m_currentRowCount + (float)this.m_showOneMore;
            f3 = f4 * (1.0f - f2);
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > f4 + 1.0f) {
            f3 = f4 + 1.0f;
        }
        return f3;
    }

    public int getPotentialRowCount(float f2) {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            return 0;
        }
        return (int)Math.ceil((float)arrayList.size() / f2);
    }

    public int getPotentialColumnCount(float f2) {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            return 0;
        }
        return (int)Math.ceil((float)arrayList.size() / f2);
    }

    public void setListOffset(float f2) {
        this.setListOffset(f2, true);
    }

    public void setListOffset(float f2, boolean bl) {
        float f3 = this.m_offset;
        this.m_offset = f2;
        int n = (int)((Math.floor(this.m_offset) - Math.floor(f3)) * (double)(this.m_horizontal ? this.m_currentRowCount : this.m_currentColumnCount));
        boolean bl2 = n != 0;
        float f4 = f2 - f3;
        if (bl2) {
            int n2;
            if (f4 > 0.0f) {
                for (n2 = 0; n2 < n; ++n2) {
                    this.m_renderables.add(this.m_renderables.remove(0));
                }
            } else if (f4 < 0.0f) {
                for (n2 = 0; n2 < -n; ++n2) {
                    this.m_renderables.add(0, this.m_renderables.remove(this.m_renderables.size() - 1));
                }
            }
        }
        if (bl) {
            this.getListLayout().a(false);
        }
        if (bl2 && bl) {
            this.updateValues(n);
        }
        for (fad_2 fad_22 : this.m_collectionOffsetListeners) {
            fad_22.a(f2);
        }
    }

    protected void updateValues() {
        this.updateValues(0);
    }

    protected void updateValues(int n) {
        if (this.m_beingLayouted || this.m_renderables == null) {
            return;
        }
        this.effectiveUpdateValues(n, this.getCurrentOffset());
    }

    public void effectiveUpdateValues(int n, int n2) {
        int n3 = 0;
        int n4 = this.m_renderables.size();
        if (n > 0) {
            n3 = n4 - n;
        } else if (n < 0) {
            n4 = -n;
        }
        while (n3 < n4) {
            if (n3 >= 0 && n3 < this.m_renderables.size()) {
                int n5 = n3 + n2;
                ftj_0 ftj_02 = this.m_renderables.get(n3);
                this.reaffectRenderableContainer(ftj_02, n5);
            }
            ++n3;
        }
    }

    public void reaffectRenderableContainer(ftj_0 ftj_02, int n) {
        ftj_02.setContentProperty(this.m_contentProperty + "#" + n, this.m_contentPropertyElementMap);
        ftj_02.setContent(this.m_scrollMode.a(this.m_items, n));
    }

    protected int getCurrentOffset() {
        if (this.m_horizontal) {
            return Hw.c(this.m_offset) * Hw.d(this.m_currentRowCount);
        }
        return Hw.c(this.m_offset) * Hw.d(this.m_currentColumnCount);
    }

    public fqu_0 getListLayoutMode() {
        return this.m_listLayoutMode;
    }

    public void setListLayoutMode(fqu_0 fqu_02) {
        if (this.m_listLayoutMode == fqu_02) {
            return;
        }
        this.m_listLayoutMode = fqu_02;
        fig_2 fig_22 = null;
        switch (this.m_listLayoutMode) {
            case a: {
                fig_22 = new fry(this);
                break;
            }
            case b: {
                fig_22 = new frz_0(this);
                break;
            }
            case c: {
                fig_22 = new frx_0(this);
            }
        }
        fig_22.onCheckOut();
        this.add(fig_22);
    }

    public int getIsoColumnCount() {
        return this.m_isoColumnCount;
    }

    public void setIsoColumnCount(int n) {
        this.m_isoColumnCount = n;
    }

    public boolean getIsoPositiveFactor() {
        return this.m_isoPositiveFactor;
    }

    public void setIsoPositiveFactor(boolean bl) {
        this.m_isoPositiveFactor = bl;
    }

    public void setListFilter(fwk fwk2) {
        this.m_filter = fwk2;
        if (fwk2 != null) {
            fwk2.a(this.m_enableFilterCache);
        }
    }

    public fwk getListFilter() {
        return this.m_filter;
    }

    public boolean isEnableFilterCache() {
        return this.m_enableFilterCache;
    }

    public void setEnableFilterCache(boolean bl) {
        this.m_enableFilterCache = bl;
        if (this.m_filter != null) {
            this.m_filter.a(bl);
        }
    }

    public boolean isUsePositionTween() {
        return this.m_usePositionTween;
    }

    public void setHorizontal(boolean bl) {
        this.m_horizontal = bl;
        this.m_scrollBar.setHorizontal(bl);
        this.setOffset(this.m_offset);
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public boolean getHorizontal() {
        return this.m_horizontal;
    }

    public void setCellSize(fjf_2 fjf_22) {
        this.m_cellSize = fjf_22;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public boolean getAdaptCellSizeToContentSize() {
        return this.m_adaptCellSizeToContentSize;
    }

    public void setAdaptCellSizeToContentSize(boolean bl) {
        this.m_adaptCellSizeToContentSize = bl;
    }

    @Override
    public void setNeedsScissor(boolean bl) {
        super.setNeedsScissor(bl);
    }

    public fra_0 getScrollbarBehaviour() {
        return this.m_scrollBarBehaviour;
    }

    public void setScrollBar(boolean bl) {
        this.m_scrollBarBehaviour = bl ? fra_0.b : fra_0.c;
    }

    public boolean isScrollBarDisplayed() {
        switch (this.m_scrollBarBehaviour) {
            case b: {
                return true;
            }
            case c: {
                return false;
            }
        }
        return this.m_displayScrollbar;
    }

    public void setScrollBarBehaviour(fra_0 fra_02) {
        this.m_scrollBarBehaviour = fra_02;
    }

    public azj_2 getMouseOverColor() {
        if (this.m_mouseOverMesh == null) {
            return null;
        }
        return this.m_mouseOverMesh.a();
    }

    public void setMouseOverColor(azj_2 azj_22) {
        if (azj_22 != null) {
            if (this.m_mouseOverMesh == null) {
                this.m_mouseOverMesh = new fbz_2();
                this.m_mouseOverMesh.i();
                this.setNeedsToResetMeshes();
            }
            this.m_mouseOverMesh.a(azj_22);
        } else {
            if (this.m_mouseOverMesh != null) {
                if (this.m_entity != null) {
                    this.m_entity.b(this.m_mouseOverMesh.c());
                }
                this.m_mouseOverMesh.h();
            }
            this.m_mouseOverMesh = null;
            this.setNeedsToResetMeshes();
        }
    }

    public int getMinDisplayedCells() {
        return this.m_minDisplayedCells;
    }

    public void setMinDisplayedCells(int n) {
        this.m_minDisplayedCells = n;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public boolean isAutoIdealSize() {
        return this.m_autoIdealSize;
    }

    public void setAutoIdealSize(boolean bl) {
        this.m_autoIdealSize = bl;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public void setAutoIdealSize(boolean bl, int n, int n2) {
        this.m_autoIdealSize = bl;
        this.m_idealSizeMaxRows = n;
        this.m_idealSizeMaxColumns = n2;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public void setAutoIdealSize(boolean bl, int n, int n2, int n3, int n4) {
        this.m_autoIdealSize = bl;
        this.m_idealSizeMaxRows = n;
        this.m_idealSizeMaxColumns = n2;
        this.m_idealSizeMinRows = n3;
        this.m_idealSizeMinColumns = n4;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMaxColumns() {
        return this.m_idealSizeMaxColumns;
    }

    public void setIdealSizeMaxColumns(int n) {
        this.m_idealSizeMaxColumns = n;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMaxRows() {
        return this.m_idealSizeMaxRows;
    }

    public void setIdealSizeMaxRows(int n) {
        this.m_idealSizeMaxRows = n;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMinColumns() {
        return this.m_idealSizeMinColumns;
    }

    public void setIdealSizeMinColumns(int n) {
        this.m_idealSizeMinColumns = n;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMinRows() {
        return this.m_idealSizeMinRows;
    }

    public void setIdealSizeMinRows(int n) {
        this.m_idealSizeMinRows = n;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public void setShowOneMore(boolean bl) {
        this.m_showOneMore = bl ? 1 : 0;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public fqv_0 getScrollMode() {
        return this.m_scrollMode;
    }

    public void setScrollMode(fqv_0 fqv_02) {
        this.m_scrollMode = fqv_02;
    }

    public frs_0 getAlign() {
        return this.m_alignment;
    }

    public void setAlign(frs_0 frs_02) {
        if (this.m_horizontal) {
            if (frs_02.equals((Object)frs_0.b) || frs_02.equals((Object)frs_0.e) || frs_02.equals((Object)frs_0.h)) {
                this.m_alignment = frs_02;
            }
        } else if (frs_02.equals((Object)frs_0.d) || frs_02.equals((Object)frs_0.e) || frs_02.equals((Object)frs_0.f)) {
            this.m_alignment = frs_02;
        }
    }

    public boolean isOppositeScrollBarPosition() {
        return this.m_oppositeScrollBarPosition;
    }

    public void setOppositeScrollBarPosition(boolean bl) {
        this.m_oppositeScrollBarPosition = bl;
    }

    @Deprecated
    public fjf_2 getWishedMinSize() {
        return this.getPrefSize();
    }

    @Deprecated
    public void setWishedMinSize(fjf_2 fjf_22) {
        this.setPrefSize(fjf_22);
    }

    public fjf_2 getIdealSize() {
        return this.getIdealSize(-1, -1);
    }

    public fjf_2 getIdealSize(int n, int n2) {
        fjf_2 fjf_22 = this.getContentIdealSize(n, n2, -1, -1);
        int n3 = fjf_22.width;
        int n4 = fjf_22.height;
        return new fjf_2(n3 += this.m_appearance.getLeftInset() + this.m_appearance.getRightInset(), n4 += this.m_appearance.getTopInset() + this.m_appearance.getBottomInset());
    }

    public fjf_2 getContentIdealSize(int n, int n2, int n3, int n4) {
        int n5 = 10;
        int n6 = 10;
        int n7 = this.size();
        int n8 = n4 == -1 ? Integer.MIN_VALUE : n4;
        int n9 = n2 == -1 ? Integer.MAX_VALUE : n2;
        int n10 = n3 == -1 ? Integer.MIN_VALUE : n3;
        int n11 = n == -1 ? Integer.MAX_VALUE : n;
        int n12 = 0;
        int n13 = 0;
        if (this.m_cellSize.b() == -1.0f || this.m_cellSize.a() == -1.0f) {
            int n14;
            if (this.m_cellSize.a() != -1.0f) {
                n14 = (int)(1.0f / this.m_cellSize.a() * 100.0f);
                n13 = Math.max(n8, Math.min(n9, n14));
                n12 = Math.max(n10, Math.min(n11, this.getPotentialRowCount(n13)));
            } else if (this.m_cellSize.b() != -1.0f) {
                n14 = (int)(1.0f / this.m_cellSize.b() * 100.0f);
                n12 = Math.max(n10, Math.min(n11, n14));
                n13 = Math.max(n8, Math.min(n9, this.getPotentialColumnCount(n12)));
            } else {
                boolean bl;
                n14 = n2 >= 0 || n4 >= 0 ? 1 : 0;
                boolean bl2 = bl = n >= 0 || n3 >= 0;
                if (n14 != 0 && !bl) {
                    n13 = Math.min(Math.max(n2, n4), n7);
                    n12 = this.getPotentialRowCount(n13);
                } else if (n14 == 0 && bl) {
                    n12 = Math.min(Math.max(n, n3), n7);
                    n13 = this.getPotentialColumnCount(n12);
                } else if (n14 != 0 && bl) {
                    if (this.m_horizontal) {
                        n12 = Math.max(n10, Math.min(n, this.getPotentialRowCount(Math.max(1, n8))));
                        n13 = Math.max(n8, Math.min(n2, this.getPotentialColumnCount(n12)));
                    } else {
                        n13 = Math.max(n8, Math.min(n2, this.getPotentialColumnCount(Math.max(1, n10))));
                        n12 = Math.max(n10, Math.min(n, this.getPotentialRowCount(n13)));
                    }
                } else if (this.m_horizontal) {
                    n12 = 1;
                    n13 = n7;
                } else {
                    n13 = 1;
                    n12 = n7;
                }
            }
            n6 = this.m_cellSize.height * n12;
            n5 = this.m_cellSize.width * n13;
        }
        if (n13 * n12 < n7 && this.m_scrollBarBehaviour != fra_0.c || this.m_scrollBarBehaviour == fra_0.b) {
            fjf_2 fjf_22 = this.m_scrollBar.getPrefSize();
            if (this.m_horizontal) {
                n6 += fjf_22.height;
            } else {
                n5 += fjf_22.width;
            }
        }
        return new fjf_2(n5, n6);
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return fqj2 instanceof fqr;
    }

    @Override
    public fqr getAppearance() {
        return (fqr)this.m_appearance;
    }

    public ftx_0 getScrollBar() {
        return this.m_scrollBar;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (this.m_horizontal && THEME_HORIZONTAL_SCROLLBAR.equalsIgnoreCase(string) || !this.m_horizontal && THEME_VERTICAL_SCROLLBAR.equalsIgnoreCase(string)) {
            return this.m_scrollBar;
        }
        return super.getWidgetByThemeElementName(string, bl);
    }

    public int getOffsetByValue(Object object) {
        int n;
        for (n = 0; n < this.getItems().size() && this.getItems().get(n) != object; ++n) {
        }
        if (n == this.getItems().size()) {
            return -1;
        }
        return n;
    }

    public ftj_0 getRenderableByOffset(int n) {
        int n2 = this.m_horizontal ? n - (int)(Math.floor(this.m_offset) * Math.ceil(this.m_currentRowCount)) : n - (int)(Math.floor(this.m_offset) * Math.ceil(this.m_currentColumnCount));
        if (n2 < 0 || n2 >= this.m_renderables.size()) {
            return null;
        }
        return this.m_renderables.get(n2);
    }

    public int getOffsetByRenderable(ftj_0 ftj_02) {
        if (ftj_02 == null || this.m_items == null) {
            return -1;
        }
        int n = this.m_horizontal ? (int)(Math.floor(this.m_offset) * Math.ceil(this.m_currentRowCount)) + this.m_renderables.indexOf(ftj_02) : (int)(Math.floor(this.m_offset) * Math.ceil(this.m_currentColumnCount)) + this.m_renderables.indexOf(ftj_02);
        if (n >= this.m_items.size()) {
            n = -1;
        }
        return n;
    }

    @Override
    public fvE getWidget(String string, int n) {
        if (n >= 0 && n < this.m_renderables.size()) {
            return this.m_renderables.get(n);
        }
        return null;
    }

    public float computeRowCount(int n, int n2) {
        float f2;
        if (this.m_horizontal) {
            if (!this.m_alignment.equals((Object)frs_0.e)) {
                f2 = (float)Math.floor((float)n / (float)n2);
            } else if (this.m_items != null && this.m_items.size() > 0) {
                int n3 = (int)Math.floor((double)n / (double)n2);
                f2 = Math.min(this.m_items.size(), n3);
            } else {
                f2 = 0.0f;
            }
        } else {
            f2 = (float)n / (float)n2;
        }
        return f2;
    }

    public float computeColumnCount(int n, int n2) {
        float f2;
        if (this.m_horizontal) {
            f2 = (float)n / (float)n2;
        } else if (!this.m_alignment.equals((Object)frs_0.e)) {
            f2 = (int)Math.floor((double)n / (double)n2);
        } else if (this.m_items != null && this.m_items.size() > 0) {
            int n3 = (int)Math.floor((double)n / (double)n2);
            f2 = Math.min(this.m_items.size(), n3);
        } else {
            f2 = 0.0f;
        }
        return f2;
    }

    public void updateScrollBarLayout() {
        if (this.m_displayScrollbar) {
            if (this.m_horizontal) {
                float f2 = this.getPotentialColumnCount(this.m_currentRowCount);
                if (this.m_currentRowCount + (float)this.m_showOneMore > 0.0f && f2 - this.m_currentColumnCount + (float)this.m_showOneMore > 0.0f) {
                    this.m_scrollBar.setEnabled(true);
                    this.m_scrollBar.setButtonJump(1.0f / (f2 - this.m_currentColumnCount + (float)this.m_showOneMore));
                    this.m_scrollBar.setSliderSize(this.m_currentColumnCount / (f2 + (float)this.m_showOneMore));
                } else {
                    this.m_scrollBar.setButtonJump(0.0f);
                    this.m_scrollBar.setEnabled(false);
                }
            } else {
                float f3 = this.getPotentialRowCount(this.m_currentColumnCount);
                if (this.m_currentColumnCount + (float)this.m_showOneMore > 0.0f && f3 - this.m_currentRowCount + (float)this.m_showOneMore > 0.0f) {
                    this.m_scrollBar.setEnabled(true);
                    this.m_scrollBar.setButtonJump(1.0f / (f3 - this.m_currentRowCount + (float)this.m_showOneMore));
                    this.m_scrollBar.setSliderSize(this.m_currentRowCount / (f3 + (float)this.m_showOneMore));
                } else {
                    this.m_scrollBar.setButtonJump(0.0f);
                    this.m_scrollBar.setEnabled(false);
                }
            }
        }
    }

    public void computeContent() {
        this.m_items = this.m_newItems;
        this.m_newItems = null;
        this.checkOffsetValidity();
        this.m_listContentLoaded = true;
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public frA getListLayout() {
        return (frA)((Object)this.m_layout);
    }

    @Override
    @NotNull
    public ftj_0 createRenderableElement() {
        ftj_0 ftj_02 = super.createRenderableElement();
        ftj_02.setCollection(this);
        ftj_02.setNonBlocking(this.m_nonBlocking);
        ftj_02.setRendererManager(this.m_rendererManager);
        ftj_02.setEnableDND(this.m_enableDND);
        ftj_02.setEnabled(this.m_enabled);
        ftj_02.setNetEnabled(this.m_netEnabled);
        this.refreshEnabledAppearance(ftj_02);
        frA frA2 = this.getListLayout();
        if (frA2 != null) {
            ftj_02.getAppearance().setShape(frA2.b());
        }
        return ftj_02;
    }

    public int indexOf(@NotNull ftj_0 ftj_02) {
        String string = ftj_02.getContentProperty();
        if (string == null) {
            return -1;
        }
        String string2 = this.m_contentProperty + "#";
        if (!string.startsWith(string2)) {
            return -1;
        }
        try {
            String string3 = string.substring(string2.length());
            return Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public int addRenderableElement(ftj_0 ftj_02) {
        this.m_renderables.add(ftj_02);
        this.add(ftj_02);
        this.m_renderablePositions.add(new Point());
        return this.m_renderables.indexOf(ftj_02);
    }

    public boolean isHorizontal() {
        return this.m_horizontal;
    }

    public ArrayList<Object> getItems() {
        if (this.m_newItems != null) {
            return this.m_newItems;
        }
        return this.m_items;
    }

    @Override
    public Iterable<Object> getUnfilteredContent() {
        return this.m_unfilteredItems;
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.m_contentProperty = string;
        this.m_contentPropertyElementMap = fyy_02;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.m_isATemplate) {
            return;
        }
        this.m_newItems = new ArrayList();
        if (!bl) {
            this.m_unfilteredItems = new ArrayList();
        }
        for (Object object : iterable) {
            if (!bl) {
                this.m_unfilteredItems.add(object);
            }
            if (this.m_filter != null && !this.m_filter.a(object)) continue;
            this.m_newItems.add(object);
        }
        this.setOffset(0.0f);
        this.setNeedsToPreProcess();
        this.setNeedsToResetMeshes();
    }

    public void checkOffsetValidity() {
        this.m_offset = this.m_scrollMode.a(this.m_offset, this.m_items, this.m_horizontal, this.m_currentColumnCount, this.m_currentRowCount, this.m_showOneMore);
    }

    @Override
    public int getTableIndex(ftj_0 ftj_02) {
        return this.m_renderables.indexOf(ftj_02) + Hw.c(this.m_offset) * Hw.d(this.m_horizontal ? this.m_currentRowCount : this.m_currentColumnCount);
    }

    @Override
    public int getItemIndex(Object object) {
        int n = 0;
        if (this.m_items != null) {
            for (Object object2 : this.m_items) {
                if (object2 == object) {
                    return n;
                }
                ++n;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<ftj_0> getRenderables() {
        return this.m_renderables;
    }

    public fjf_2 getCellSize() {
        return this.m_cellSize;
    }

    private void addAndUpdateOffset(Object object, int n) {
        this.m_items.add(n, object);
    }

    @Override
    public void addValue(Object object) {
        if (this.m_items == null) {
            this.m_items = new ArrayList();
        }
        this.addAndUpdateOffset(object, this.m_items.size());
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean addValue(int n, Object object) {
        if (this.m_items == null) {
            this.m_items = new ArrayList();
        }
        if (n >= 0 || n <= this.m_items.size()) {
            this.addAndUpdateOffset(object, n);
            this.m_listIsDirty = true;
            this.setNeedsToPreProcess();
            return true;
        }
        return false;
    }

    @Override
    public int addValue(Object object, Object object2) {
        int n = -1;
        if (this.m_items != null) {
            for (int k = 0; k < this.m_items.size(); ++k) {
                if (object != this.m_items.get(k)) continue;
                this.addAndUpdateOffset(object2, k);
                n = k;
                break;
            }
            if (n != -1) {
                this.m_listIsDirty = true;
                this.setNeedsToPreProcess();
            }
        }
        return n;
    }

    public void moveValuesToIndices(ArrayList<abo_2<Object, Integer>> arrayList, ArrayList<abo_2<Object, Integer>> arrayList2) {
        Point point;
        int n;
        int n2;
        ftj_0 ftj_02;
        int n3;
        int n4;
        Object object;
        int n5;
        ArrayList<ftj_0> arrayList3 = new ArrayList<ftj_0>(this.m_renderables.size());
        ArrayList<Object> arrayList4 = new ArrayList<Object>(this.m_items.size());
        arrayList3.addAll(this.m_renderables);
        arrayList4.addAll(this.m_items);
        int n6 = 400;
        for (n5 = 0; n5 < arrayList.size(); ++n5) {
            object = arrayList.get(n5).a();
            n4 = arrayList.get(n5).b();
            n3 = this.m_items.indexOf(object);
            ftj_02 = this.getRenderableByOffset(n3);
            if (ftj_02 != null) {
                n2 = this.m_renderables.indexOf(ftj_02);
                if (n2 != (n = n2 - n3 + n4)) {
                    ftj_02.removeTweensOfType(fjs_2.class);
                    ftj_02.removeTweensOfType(fjq_2.class);
                    ftj_02.addTween(new fjs_2(null, new Rectangle(0, this.m_cellSize.height, this.m_cellSize.width, 0), ftj_02, false, 0, 400, fjw_2.b));
                    point = this.m_renderablePositions.get(n);
                    ftj_02.addTween(new fjq_2(ftj_02.getX(), ftj_02.getY(), point.x, point.y, ftj_02, 400, 0, fjw_2.a));
                    ftj_02.addTween(new fjs_2(new Rectangle(0, this.m_cellSize.height, this.m_cellSize.width, 0), new Rectangle(0, 0, this.m_cellSize.width, this.m_cellSize.height), ftj_02, true, 400, 400, fjw_2.b));
                }
                if (n >= 0 && n < this.m_renderables.size()) {
                    arrayList3.set(n, ftj_02);
                }
            }
            arrayList4.set(n4, object);
        }
        for (n5 = 0; n5 < arrayList2.size(); ++n5) {
            object = arrayList2.get(n5).a();
            n4 = arrayList2.get(n5).b();
            n3 = this.m_items.indexOf(object);
            if (n3 == n4) continue;
            ftj_02 = this.getRenderableByOffset(n3);
            if (ftj_02 != null) {
                n2 = this.m_renderables.indexOf(ftj_02);
                n = n2 - n3 + n4;
                ftj_02.removeTweensOfType(fjq_2.class);
                point = this.m_renderablePositions.get(n);
                ftj_02.addTween(new fjq_2(ftj_02.getX(), ftj_02.getY(), point.x, point.y, ftj_02, 400, 400, fjw_2.b));
                if (n >= 0 && n < this.m_renderables.size()) {
                    arrayList3.set(n, ftj_02);
                }
            }
            arrayList4.set(n4, object);
        }
        this.m_renderables = arrayList3;
        this.m_items = arrayList4;
    }

    public void moveValueToIndex(Object object, int n) {
        this.moveValueToIndex(object, n, false);
    }

    public void moveValueToIndex(Object object, int n, boolean bl) {
        ftj_0 ftj_02;
        int n2 = this.m_items.indexOf(object);
        if (n < 0 || n >= this.m_items.size() || n2 == n) {
            return;
        }
        if (bl && (ftj_02 = this.getRenderableByOffset(n2)) != null) {
            int n3 = this.m_renderables.indexOf(ftj_02);
            Point point = ftj_02.m_position;
            int n4 = Math.max(0, n3 - n2 + n);
            if (n2 < n) {
                for (int k = n3 + 1; k <= n4; ++k) {
                    ftj_0 ftj_03 = this.m_renderables.get(k);
                    ftj_03.addTween(new fjq_2(ftj_03.getX(), ftj_03.getY(), point.x, point.y, ftj_03, 700, 300, fjw_2.b));
                    point = ftj_03.m_position;
                }
            } else {
                for (int k = n3 - 1; k >= n4; --k) {
                    ftj_0 ftj_04 = this.m_renderables.get(k);
                    ftj_04.addTween(new fjq_2(ftj_04.getX(), ftj_04.getY(), point.x, point.y, ftj_04, 700, 300, fjw_2.b));
                    point = ftj_04.m_position;
                }
            }
            ftj_02.addTween(new fjs_2(null, new Rectangle(0, this.m_cellSize.height, this.m_cellSize.width, 0), ftj_02, false, 0, 700, fjw_2.b));
            ftj_02.addTween(new fjq_2(ftj_02.getX(), ftj_02.getY(), point.x, point.y, ftj_02, 700, 0, fjw_2.a));
            ftj_02.addTween(new fjs_2(new Rectangle(0, this.m_cellSize.height, this.m_cellSize.width, 0), new Rectangle(0, 0, this.m_cellSize.width, this.m_cellSize.height), ftj_02, true, 700, 700, fjw_2.b));
            this.m_renderables.add(n4, this.m_renderables.remove(n3));
        }
        this.m_items.add(n, this.m_items.remove(n2));
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public void moveValue(Object object, Object object2) {
        boolean bl;
        int n = this.m_items.indexOf(object);
        int n2 = this.m_items.indexOf(object2);
        if (n == -1 || n2 == -1) {
            return;
        }
        int n3 = (int)(Math.floor(this.m_offset) * (double)(this.m_horizontal ? this.m_currentRowCount : this.m_currentColumnCount));
        int n4 = (int)(Math.floor(this.m_offset + (this.m_horizontal ? this.m_currentColumnCount : this.m_currentRowCount)) * (double)(this.m_horizontal ? this.m_currentRowCount : this.m_currentColumnCount));
        boolean bl2 = n >= n3 && n <= n4;
        boolean bl3 = bl = n2 >= n3 && n2 <= n4;
        if (bl2 && bl) {
            ftj_0 ftj_02 = this.getRenderableByOffset(n);
            ftj_0 ftj_03 = this.getRenderableByOffset(n2);
            ftj_02.addTween(new fjs_2(null, new Rectangle(ftj_02.getX(), this.m_cellSize.height + ftj_02.getY(), this.m_cellSize.width, 0), ftj_02, false, 0, 250, fjw_2.a));
            ftj_02.addTween(new fjq_2(ftj_02.getX(), ftj_02.getY(), ftj_03.getX(), ftj_03.getY(), ftj_02, 250, 0, fjw_2.a));
            ftj_02.addTween(new fjs_2(new Rectangle(ftj_02.getX(), this.m_cellSize.height + ftj_02.getY(), this.m_cellSize.width, 0), new Rectangle(ftj_02.getX(), ftj_02.getY(), this.m_cellSize.width, this.m_cellSize.height), ftj_02, true, 250, 250, fjw_2.a));
            ftj_03.addTween(new fjs_2(null, new Rectangle(ftj_03.getX(), this.m_cellSize.height + ftj_03.getY(), this.m_cellSize.width, 0), ftj_03, false, 0, 250, fjw_2.a));
            ftj_03.addTween(new fjq_2(ftj_03.getX(), ftj_03.getY(), ftj_02.getX(), ftj_02.getY(), ftj_03, 250, 0, fjw_2.a));
            ftj_03.addTween(new fjs_2(new Rectangle(ftj_03.getX(), this.m_cellSize.height + ftj_03.getY(), this.m_cellSize.width, 0), new Rectangle(ftj_03.getX(), ftj_03.getY(), this.m_cellSize.width, this.m_cellSize.height), ftj_03, true, 250, 250, fjw_2.a));
        } else if (bl2 || bl) {
            if (!bl2) {
                ftj_0 ftj_04 = this.getRenderableByOffset(n2);
                adi_2.a().a(new fru(this, ftj_04, object), 250L, 0, 1L);
                ftj_04.addTween(new fjs_2(null, new Rectangle(ftj_04.getX(), this.m_cellSize.height + ftj_04.getY(), this.m_cellSize.width, 0), ftj_04, false, 0, 250, fjw_2.b));
                ftj_04.addTween(new fjs_2(new Rectangle(ftj_04.getX(), this.m_cellSize.height + ftj_04.getY(), this.m_cellSize.width, 0), new Rectangle(ftj_04.getX(), ftj_04.getY(), this.m_cellSize.width, this.m_cellSize.height), ftj_04, true, 250, 250, fjw_2.b));
            } else {
                ftj_0 ftj_05 = this.getRenderableByOffset(n);
                adi_2.a().a(new frv_0(this, ftj_05, object2), 250L, 0, 1L);
                ftj_05.addTween(new fjs_2(null, new Rectangle(ftj_05.getX(), this.m_cellSize.height + ftj_05.getY(), this.m_cellSize.width, 0), ftj_05, false, 0, 250, fjw_2.b));
                ftj_05.addTween(new fjs_2(new Rectangle(ftj_05.getX(), this.m_cellSize.height + ftj_05.getY(), this.m_cellSize.width, 0), new Rectangle(ftj_05.getX(), ftj_05.getY(), this.m_cellSize.width, this.m_cellSize.height), ftj_05, true, 250, 250, fjw_2.b));
            }
        }
        this.m_items.set(n, object2);
        this.m_items.set(n2, object);
    }

    @Override
    public void removeValue(Object object) {
        this.m_items.remove(object);
        this.m_listIsDirty = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean replaceValue(Object object, Object object2) {
        boolean bl = false;
        if (this.m_items != null) {
            for (int k = 0; k < this.m_items.size(); ++k) {
                if (object != this.m_items.get(k)) continue;
                this.m_items.set(k, object2);
                bl = true;
                break;
            }
            if (bl) {
                this.m_listIsDirty = true;
                this.setNeedsToPreProcess();
            }
            return bl;
        }
        return false;
    }

    @Override
    public Object getValue(int n) {
        if (this.m_items != null) {
            return this.m_items.get(n);
        }
        return null;
    }

    @Override
    public int size() {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public void processEventForSound(fzs fzs2, boolean bl) {
        if (!(fzs2.g() || fzs2.f() != frd_0.j && fzs2.f() != frd_0.k)) {
            fzs2.b(true);
            fza_0.a().b();
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.m_renderables.clear();
        this.m_renderablePositions.clear();
        this.m_items = null;
        this.m_newItems = null;
        if (this.m_filter != null) {
            this.m_filter.a((fsq_0)null);
            this.m_filter.a();
        }
        this.m_filter = null;
        this.m_contentProperty = null;
        this.m_contentPropertyElementMap = null;
        this.m_rendererManager = null;
        if (this.m_mouseOverMesh != null) {
            if (this.m_entity != null) {
                this.m_entity.b(this.m_mouseOverMesh.c());
            }
            this.m_mouseOverMesh.h();
            this.m_mouseOverMesh = null;
        }
        this.m_mouseOverRenderable = null;
        this.m_collectionContentLoadedListeners.clear();
        this.m_collectionOffsetListeners.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_nonBlocking = false;
        this.m_listContentLoaded = false;
        fqr fqr2 = new fqr();
        fqr2.onCheckOut();
        fqr2.setWidget(this);
        this.add(fqr2);
        fry fry2 = new fry(this);
        fry2.onCheckOut();
        this.add(fry2);
        this.m_scrollBar = new ftx_0();
        this.m_scrollBar.onCheckOut();
        this.m_scrollBar.setCanBeCloned(false);
        this.m_scrollBar.setHorizontal(this.m_horizontal);
        this.add(this.m_scrollBar);
        this.m_scrollMode = fqv_0.a;
        if (!this.m_horizontal) {
            this.m_scrollBar.getSlider().setValue(1.0f);
            this.m_alignment = frs_0.b;
        } else {
            this.m_alignment = frs_0.d;
        }
        this.m_renderables = new ArrayList();
        this.m_renderablePositions = new ArrayList();
        this.m_enableDND = true;
        this.m_scrollOnMouseWheel = true;
        this.m_needsScissor = true;
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.m_newItems != null) {
            this.computeContent();
            this.m_needToUpdateValues = true;
            this.setNeedsToPostProcess();
        }
        if (this.m_listIsDirty) {
            super.invalidateMinSize();
            this.invalidate();
            this.m_listIsDirty = false;
        }
        return bl;
    }

    @Override
    public void invalidateMinSize() {
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.m_needToUpdateValues) {
            this.updateValues();
            this.m_needToUpdateValues = false;
        }
        if (this.m_listContentLoaded) {
            for (int k = this.m_collectionContentLoadedListeners.size() - 1; k >= 0; --k) {
                this.m_collectionContentLoadedListeners.get(k).a();
            }
            this.m_listContentLoaded = false;
        }
        return bl;
    }

    public void setKeepOffset(boolean bl) {
        if (this.m_keepOffset == bl) {
            return;
        }
        this.m_keepOffset = bl;
        if (this.m_keepOffset) {
            this.addListContentListener(this.m_scrollRefreshListener);
            this.addOffsetListener(this.m_scrollRefreshListener);
        } else {
            this.removeListContentLoadListener(this.m_scrollRefreshListener);
            this.removeCollectionOffsetListener(this.m_scrollRefreshListener);
        }
    }

    @Override
    public void setHideContainerWithoutItem(boolean bl) {
        super.setHideContainerWithoutItem(bl);
        for (ftj_0 ftj_02 : this.m_renderables) {
            ftj_02.setHideWithoutItem(this.isHideContainerWithoutItem());
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        AbstractList abstractList = (AbstractList)fyo2;
        super.copyElement(fyo2);
        abstractList.setAlign(this.m_alignment);
        abstractList.setAdaptCellSizeToContentSize(this.m_adaptCellSizeToContentSize);
        abstractList.setAutoIdealSize(this.m_autoIdealSize, this.m_idealSizeMaxRows, this.m_idealSizeMaxColumns, this.m_idealSizeMinRows, this.m_idealSizeMinColumns);
        abstractList.setCellSize((fjf_2)this.m_cellSize.clone());
        abstractList.setHorizontal(this.m_horizontal);
        abstractList.setMinDisplayedCells(this.m_minDisplayedCells);
        abstractList.setMouseOverColor(this.getMouseOverColor());
        abstractList.setOffset(this.m_offset);
        abstractList.setOppositeScrollBarPosition(this.m_oppositeScrollBarPosition);
        abstractList.setShowOneMore(this.m_showOneMore > 0);
        abstractList.setScrollBarBehaviour(this.m_scrollBarBehaviour);
        abstractList.setEnableDND(this.m_enableDND);
        abstractList.setListFilter(this.m_filter);
        abstractList.setEnableFilterCache(this.m_enableFilterCache);
        abstractList.setScrollMode(this.m_scrollMode);
        abstractList.setListLayoutMode(this.m_listLayoutMode);
        abstractList.setIsoColumnCount(this.m_isoColumnCount);
        abstractList.setIsoPositiveFactor(true);
        abstractList.setScrollOnMouseWheel(this.m_scrollOnMouseWheel);
        abstractList.m_styleIsDirty = true;
        if (this.m_items != null) {
            abstractList.setContent(this.m_items);
        }
        abstractList.setKeepOffset(this.m_keepOffset);
        abstractList.setNeedsToPreProcess();
        for (int k = abstractList.m_widgetChildren.size() - 1; k >= 0; --k) {
            fvE fvE2 = (fvE)abstractList.m_widgetChildren.get(k);
            if (fvE2 == abstractList.m_scrollBar) continue;
            fvE2.destroySelfFromParent();
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == 496768218) {
            this.setAdaptCellSizeToContentSize(Co.a(string));
        } else if (n == -1388513017) {
            this.setAutoIdealSize(Co.a(string));
        } else if (n == -917611389) {
            this.setCellSize(fze2.b(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else if (n == -995584913) {
            this.setIdealSizeMaxColumns(Co.c(string));
        } else if (n == 199368327) {
            this.setIdealSizeMaxRows(Co.c(string));
        } else if (n == 1476414401) {
            this.setIdealSizeMinColumns(Co.c(string));
        } else if (n == 419166325) {
            this.setIdealSizeMinRows(Co.c(string));
        } else if (n == 237212369) {
            this.setListOffset(Co.c(string));
        } else if (n == -928803358) {
            this.setMinDisplayedCells(Co.c(string));
        } else if (n == -1504693302) {
            this.setMouseOverColor(fze2.a(string));
        } else if (n == -1019779949) {
            this.setOffset(Co.c(string));
        } else if (n == 560789800) {
            this.setOppositeScrollBarPosition(Co.a(string));
        } else if (n == 417762822) {
            this.setScrollBar(Co.a(string));
        } else if (n == 1602982231) {
            this.setScrollBarBehaviour(fra_0.a(string));
        } else if (n == -933261026) {
            this.setShowOneMore(Co.a(string));
        } else if (n == -588347635) {
            this.setPrefSize(fze2.b(string));
        } else if (n == -631680873) {
            this.setEnableDND(Co.a(string));
        } else if (n == -1509885811) {
            this.setIsoPositiveFactor(Co.a(string));
        } else if (n == 1324756372) {
            this.setIsoColumnCount(Co.c(string));
        } else if (n == 66086416) {
            this.setScrollMode(fze2.a(fqv_0.class, string));
        } else if (n == -575832990) {
            this.setScrollOnMouseWheel(Co.a(string));
        } else if (n == -1796676821) {
            this.setListLayoutMode(fze2.a(fqu_0.class, string));
        } else if (n == 400843111) {
            this.setEnableFilterCache(Co.a(string));
        } else if (n == 1189020792) {
            this.setKeepOffset(Co.a(string, false));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 237212369) {
            this.setListOffset(Co.c(object));
        } else if (n == -1019779949) {
            this.setOffset(Co.c(object));
        } else if (n == 417762822) {
            this.setScrollBar(Co.b(object));
        } else if (n == -995584913) {
            this.setIdealSizeMaxColumns(Co.c(object));
        } else if (n == 199368327) {
            this.setIdealSizeMaxRows(Co.c(object));
        } else if (n == 1476414401) {
            this.setIdealSizeMinColumns(Co.c(object));
        } else if (n == 419166325) {
            this.setIdealSizeMinRows(Co.c(object));
        } else if (n == LIST_FILTER_HASH) {
            this.setListFilter((fwk)object);
        } else if (n == 400843111) {
            this.setEnableFilterCache(Co.b(object));
        } else if (n == -631680873) {
            this.setEnableDND(Co.b(object));
        } else if (n == -1509885811) {
            this.setIsoPositiveFactor(Co.b(object));
        } else if (n == 1189020792) {
            this.setKeepOffset(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public String getStyleTag() {
        return "List";
    }

    static {
        LIST_FILTER_HASH = "listFilter".hashCode();
    }
}

