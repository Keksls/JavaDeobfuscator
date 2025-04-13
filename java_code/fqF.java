/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class fqF
extends fqh_0 {
    public static final String TAG = "TextEditorAppearance";
    @Nullable
    protected azj_2 a;
    private boolean c = false;
    public static final int b = -410102681;

    @Override
    public void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        this.a(fvE2);
    }

    protected void a(fvE fvE2) {
        if (fvE2 instanceof fqf_0 && this.c) {
            fqf_0 fqf_02 = (fqf_0)((Object)fvE2);
            fqf_02.setColor(this.a, "ghostText");
        }
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if ("ghostText".equals(string)) {
            this.setGhostTextColor(azj_22);
        } else {
            super.setColor(azj_22, string);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setGhostTextColor(@Nullable azj_2 azj_22) {
        if (this.c && this.a == azj_22) {
            return;
        }
        this.a = azj_22;
        this.c = true;
        this.a(this.I);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.c = false;
        this.a = null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqF fqF2 = (fqF)fyo2;
        super.copyElement(fqF2);
        if (this.c) {
            fqF2.setGhostTextColor(this.a);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case -410102681: {
                this.setGhostTextColor(fze2.a(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -410102681: {
                this.setGhostTextColor((azj_2)object);
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

