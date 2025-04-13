/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public interface fxz
extends fpz_0,
fqf_0,
fqm {
    public boolean isJustify();

    public void setJustify(boolean var1);

    public void setHorizontalAlignment(fro_0 var1);

    public void setVerticalAlignment(fro_0 var1);

    default public boolean q() {
        return this.isBrightenColor();
    }

    public boolean isBrightenColor();

    public void setBrightenColor(boolean var1);

    default public boolean r() {
        return this.isDarkenColor();
    }

    public boolean isDarkenColor();

    public void setDarkenColor(boolean var1);

    public int getMinWidth();

    public void setMinWidth(int var1);

    public int getMaxWidth();

    public void setMaxWidth(int var1);

    default public boolean s() {
        return this.isMultiline();
    }

    public boolean isMultiline();

    public void setMultiline(boolean var1);

    public int getMaxLines();

    public void setMaxLines(int var1);

    public frh_0 getOrientation();

    public void setOrientation(frh_0 var1);

    public String getText();

    default public boolean t() {
        return Cz.t(this.getText());
    }

    @Nullable
    default public String c(@Nullable String string) {
        return this.setText(string);
    }

    @Nullable
    public String setText(@Nullable Object var1);

    default public boolean u() {
        return this.isUseHighContrast();
    }

    public boolean isUseHighContrast();

    public void setUseHighContrast(boolean var1);

    default public boolean v() {
        return this.isEnableShrinking();
    }

    public boolean isEnableShrinking();

    public void setEnableShrinking(boolean var1);

    public void setZoom(float var1);

    public void setDisplayCharDelay(long var1);

    default public boolean w() {
        return this.isEnableAutoZoomShrink();
    }

    public boolean isEnableAutoZoomShrink();

    public void setEnableAutoZoomShrink(boolean var1);
}

