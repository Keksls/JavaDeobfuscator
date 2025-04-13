/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class fqG
extends fqF {
    public static final String TAG = "textEditorPlusAppearance";
    @Nullable
    protected fjf_2 c;
    @Nullable
    protected fjf_2 d;
    public static final int e = 760645769;
    public static final int f = -1514408316;

    @Override
    public void setWidget(fvE fvE2) {
        super.setWidget(fvE2);
        if (fvE2 instanceof fuh_0) {
            fuh_0 fuh_02 = (fuh_0)fvE2;
            if (this.c != null) {
                fuh_02.setSearchButtonDisplaySize(this.c);
            }
            if (this.d != null) {
                fuh_02.setClearButtonDisplaySize(this.d);
            }
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setSearchButtonDisplaySize(@Nullable fjf_2 fjf_22) {
        this.c = fjf_22;
        if (this.I != null && this.I instanceof fuh_0 && fjf_22 != null) {
            ((fuh_0)this.I).setSearchButtonDisplaySize(fjf_22);
        }
    }

    public void setClearButtonDisplaySize(@Nullable fjf_2 fjf_22) {
        this.d = fjf_22;
        if (this.I != null && this.I instanceof fuh_0 && fjf_22 != null) {
            ((fuh_0)this.I).setClearButtonDisplaySize(fjf_22);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.c = null;
        this.d = null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqG fqG2 = (fqG)fyo2;
        super.copyElement(fqG2);
        fqG2.setSearchButtonDisplaySize(fqG2.c);
        fqG2.setClearButtonDisplaySize(fqG2.d);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case 760645769: {
                this.setSearchButtonDisplaySize(fze2.b(string));
                return true;
            }
            case -1514408316: {
                this.setClearButtonDisplaySize(fze2.b(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 760645769: {
                this.setSearchButtonDisplaySize((fjf_2)object);
                return true;
            }
            case -1514408316: {
                this.setClearButtonDisplaySize((fjf_2)object);
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

