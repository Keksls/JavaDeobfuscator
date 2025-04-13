/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fAW
 */
public abstract class faw_1
extends faq_2 {
    private static final Logger a = LoggerFactory.getLogger(faw_1.class);
    private String c;
    private fvE m;
    public static final int b = -1399201153;

    @Nullable
    public fvE getWidgetRelated() {
        fvE fvE2;
        if (this.c == null) {
            fvE2 = this.getParentOfType(fvE.class);
        } else {
            fyb_0 fyb_02 = this.getElementMap().a(this.c);
            if (fyb_02 instanceof fvE) {
                fvE2 = (fvE)fyb_02;
            } else if (fyb_02 instanceof faf_2) {
                faf_2 faf_22 = (faf_2)fyb_02;
                Optional<ftj_0> optional = faf_22.getManager().e().stream().filter(this::hasInParentHierarchy).findFirst();
                if (optional.isPresent()) {
                    fvE2 = optional.get();
                } else {
                    a.warn("Element with following id : {} is {} and any {} can't be found in hierarchy", new Object[]{this.c, fyb_02.getClass().getName(), ftj_0.class.getName()});
                    fvE2 = null;
                }
            } else if (fyb_02 != null) {
                a.warn("Element with following id : {} is {} and not {}!", new Object[]{this.c, fyb_02.getClass().getName(), fvE.class.getName()});
                fvE2 = null;
            } else {
                a.warn("Unable to find {} with following id : {}", (Object)fvE.class.getName(), (Object)this.c);
                fvE2 = null;
            }
        }
        if (fvE2 != this.m) {
            this.a(this.m, fvE2);
        }
        this.m = fvE2;
        return fvE2;
    }

    public void a(@Nullable fvE fvE2, @Nullable fvE fvE3) {
    }

    @Nullable
    public String getWidgetId() {
        return this.c;
    }

    public void setWidgetId(@Nullable String string) {
        if (Objects.equals(this.c, string)) {
            return;
        }
        this.c = string;
        this.a(true);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c = null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        faw_1 faw_12 = (faw_1)fyo2;
        faw_12.c = this.c;
        super.copyElement(fyo2);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case -1399201153: {
                this.setWidgetId(string);
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -1399201153: {
                this.setWidgetId(String.valueOf(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

