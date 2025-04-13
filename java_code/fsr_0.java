/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fsr
 */
public abstract class fsr_0<Content>
extends fsq_0<Content> {
    public static final String THEME_RENDERABLE_TEMPLATE = "renderableTemplate";
    private ftj_0 m_renderableTemplate;
    private boolean m_hideContainerWithoutItem = false;
    public static final int HIDE_CONTAINER_WITHOUT_ITEM_HASH = -148547300;

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (THEME_RENDERABLE_TEMPLATE.equalsIgnoreCase(string)) {
            return this.m_renderableTemplate;
        }
        return null;
    }

    @NotNull
    public ftj_0 createRenderableElement() {
        ftj_0 ftj_02 = new ftj_0();
        ftj_02.onCheckOut();
        this.m_renderableTemplate.copyElement(ftj_02);
        this.changeAppearanceState(ftj_02, this.m_enabled ? fqp_0.a : fqp_0.c);
        ftj_02.setHideWithoutItem(this.m_hideContainerWithoutItem);
        return ftj_02;
    }

    protected void applyActionOnAppearance(@Nullable ftj_0 ftj_02, @NotNull @NotNull Consumer<@NotNull fqj> consumer) {
        fqj fqj2;
        if (ftj_02 != null && (fqj2 = ftj_02.getAppearance()) != null) {
            consumer.accept(fqj2);
        }
    }

    protected void changeAppearanceState(@Nullable ftj_0 ftj_02, @NotNull @NotNull Function<@NotNull fqj, @NotNull fqp_0> function) {
        this.applyActionOnAppearance(ftj_02, fqj2 -> {
            fqp_0 fqp_02 = (fqp_0)((Object)((Object)function.apply((fqj)fqj2)));
            fqj2.n();
            fqj2.setEnabled(fqp_02, true);
        });
    }

    protected void changeAppearanceState(@Nullable ftj_0 ftj_02, @NotNull fqp_0 fqp_02) {
        this.changeAppearanceState(ftj_02, (fqj fqj2) -> fqp_02);
    }

    protected void refreshEnabledAppearance(ftj_0 ftj_02) {
        if (ftj_02.isEnabledFull()) {
            this.removeDisabledAppearanceState(ftj_02);
        } else {
            this.setDisabledAppearanceState(ftj_02);
        }
    }

    protected void refreshSelectedAppearance(ftj_0 ftj_02, boolean bl) {
        if (bl) {
            this.setSelectedAppearanceState(ftj_02);
        } else {
            this.removeSelectedAppearanceState(ftj_02);
        }
    }

    protected void setDisabledAppearanceState(@Nullable ftj_0 ftj_02) {
        this.changeAppearanceState(ftj_02, (fqj fqj2) -> {
            fqp_0 fqp_02 = fqj2.getCurrentAppearanceState();
            switch (fqp_02) {
                case f: 
                case e: 
                case h: 
                case g: {
                    return fqp_02;
                }
                case d: 
                case b: {
                    return fqp_0.d;
                }
            }
            return fqp_0.c;
        });
    }

    protected void removeDisabledAppearanceState(@Nullable ftj_0 ftj_02) {
        this.changeAppearanceState(ftj_02, (fqj fqj2) -> {
            fqp_0 fqp_02 = fqj2.getCurrentAppearanceState();
            switch (fqp_02) {
                case f: 
                case e: 
                case h: 
                case g: {
                    return fqp_02;
                }
                case d: 
                case b: {
                    return fqp_0.b;
                }
            }
            return fqp_0.a;
        });
    }

    protected void setSelectedAppearanceState(@Nullable ftj_0 ftj_02) {
        this.changeAppearanceState(ftj_02, (fqj fqj2) -> fqj2.getCurrentAppearanceState().a());
    }

    protected void removeSelectedAppearanceState(@Nullable ftj_0 ftj_02) {
        this.changeAppearanceState(ftj_02, (fqj fqj2) -> fqj2.getCurrentAppearanceState().b());
    }

    protected void setMouseOverAppearanceState(@Nullable ftj_0 ftj_02, boolean bl) {
        this.changeAppearanceState(ftj_02, bl ? fqp_0.h : fqp_0.g);
    }

    protected void removeMouseOverAppearanceState(@Nullable ftj_0 ftj_02) {
        this.changeAppearanceState(ftj_02, (fqj fqj2) -> {
            fqp_0 fqp_02 = fqj2.getCurrentAppearanceState();
            switch (fqp_02) {
                case d: 
                case c: 
                case f: 
                case e: {
                    return fqp_02;
                }
                case h: 
                case b: {
                    return fqp_0.b;
                }
            }
            return fqp_0.a;
        });
    }

    protected void setMousePressedAppearanceState(@Nullable ftj_0 ftj_02, boolean bl) {
        this.changeAppearanceState(ftj_02, bl ? fqp_0.f : fqp_0.e);
    }

    protected void removeMouseAppearanceState(@Nullable ftj_0 ftj_02, boolean bl) {
        this.changeAppearanceState(ftj_02, bl ? (this.m_enabled ? fqp_0.b : fqp_0.d) : (this.m_enabled ? fqp_0.a : fqp_0.c));
    }

    public void setHideContainerWithoutItem(boolean bl) {
        this.m_hideContainerWithoutItem = bl;
    }

    public boolean isHideContainerWithoutItem() {
        return this.m_hideContainerWithoutItem;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_renderableTemplate = new ftj_0();
        this.m_renderableTemplate.onCheckOut();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.m_renderableTemplate = null;
        this.m_hideContainerWithoutItem = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fsr_0 fsr_02 = (fsr_0)fyo2;
        fsr_02.m_hideContainerWithoutItem = this.m_hideContainerWithoutItem;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case -148547300: {
                this.setHideContainerWithoutItem(Co.a(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -148547300: {
                this.setHideContainerWithoutItem(Co.b(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

