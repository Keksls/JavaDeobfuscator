/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fuK
 */
public class fuk_0
extends frB {
    public static final String TAG = "TextView";
    protected String f;

    @Override
    public fqh_0 getAppearance() {
        return (fqh_0)this.m_appearance;
    }

    public void a(String string) {
        if (string == null) {
            string = "";
        }
        if (this.K != null) {
            this.K = this.K + string;
        } else {
            if (this.f == null) {
                this.f = "";
            }
            this.f = this.f + string;
        }
        this.setNeedsToPreProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public String getStyleTag() {
        return "textWidget";
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        String string = super.setText(object);
        this.f = null;
        return string;
    }

    protected void d() {
        if (this.f != null) {
            this.getTextBuilder().c(this.f);
            this.k();
            this.f = null;
        }
    }

    @Override
    public boolean preProcess(int n) {
        this.d();
        return super.preProcess(n);
    }

    @Override
    public void copyElement(fyo fyo2) {
        fuk_0 fuk_02 = (fuk_0)fyo2;
        if (this.f != null) {
            fuk_02.f = this.f;
        }
        super.copyElement(fyo2);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqh_0 fqh_02 = fqh_0.checkOut();
        fqh_02.setWidget(this);
        this.add(fqh_02);
        this.setTextBuilder(new fxD(new fxN()));
        this.getTextBuilder().a(this);
        this.setMultiline(true);
    }

    @Override
    public boolean appendXMLAttribute(int n, String string, fze fze2) {
        if (n == 3556653) {
            this.a(fze2.a(string, this.m_elementMap));
            return true;
        }
        return super.appendXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean appendPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            this.a(String.valueOf(object));
            return true;
        }
        return super.appendPropertyAttribute(n, object);
    }
}

