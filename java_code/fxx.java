/*
 * Decompiled with CFR 0.152.
 */
public interface fxx
extends fxz {
    default public boolean bu_() {
        return this.isSelectable();
    }

    public boolean isSelectable();

    public void setSelectable(boolean var1);

    public boolean isSelectOnFocus();

    public void setSelectOnFocus(boolean var1);

    public boolean isEnableOnlySelectablePartInteraction();

    public void setEnableOnlySelectablePartInteraction(boolean var1);
}

