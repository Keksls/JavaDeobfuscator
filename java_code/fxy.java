/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface fxy
extends fxx {
    default public boolean bv_() {
        return this.isAutoHorizontalScrolled();
    }

    public boolean isAutoHorizontalScrolled();

    default public void a(@NotNull Boolean bl) {
        this.setAutoHorizontalScrolled(bl);
    }

    public void setAutoHorizontalScrolled(boolean var1);

    public int getMaxCharacters();

    public void setMaxCharacters(int var1);

    @Deprecated
    default public int bw_() {
        return this.getMaxCharacters();
    }

    @Deprecated
    default public void a(int n) {
        this.setMaxCharacters(n);
    }

    default public boolean m() {
        return this.isPassword();
    }

    public boolean isPassword();

    public void setPassword(boolean var1);

    public String getRestrict();

    public void setRestrict(String var1);

    default public boolean n() {
        return this.isEditable();
    }

    public boolean isEditable();

    public void setEditable(boolean var1);

    public String getGhostText();

    default public boolean o() {
        return Cz.t(this.getGhostText());
    }

    default public void b(@Nullable String string) {
        this.setGhostText(string);
    }

    public void setGhostText(@Nullable Object var1);

    default public boolean p() {
        return this.isUnicodeRestrict();
    }

    public boolean isUnicodeRestrict();

    public void setUnicodeRestrict(boolean var1);

    public boolean isDisplayGhostTextOnFocusLost();

    public void setDisplayGhostTextOnFocusLost(boolean var1);

    public boolean isReplaceNullByGhostText();

    public void setReplaceNullByGhostText(boolean var1);

    public fwn<String, ?> getListFilter();

    public void setListFilter(fwn<String, ?> var1);

    public void a(String var1);
}

