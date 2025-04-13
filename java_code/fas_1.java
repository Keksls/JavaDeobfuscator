/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAS
 */
public abstract class fas_1
extends faw_1
implements fbp_1 {
    private fqj a;

    @Override
    public void a(@Nullable fvE fvE2, @Nullable fvE fvE3) {
        if (fvE2 != null) {
            fvE2.removeAppearanceChangeListener(this);
        }
        if (fvE3 != null) {
            fvE3.addAppearanceChangeListener(this);
        } else {
            this.a(this.a, null);
            this.a = null;
        }
    }

    @Nullable
    public fqj getAppearanceRelated() {
        fvE fvE2 = this.getWidgetRelated();
        if (fvE2 == null) {
            return null;
        }
        fqj fqj2 = fvE2.getAppearance();
        if (fqj2 != this.a) {
            this.a(this.a, fqj2);
        }
        this.a = fqj2;
        return fqj2;
    }

    public void a(@Nullable fqj fqj2, @Nullable fqj fqj3) {
    }

    @Override
    public void b(@Nullable fqj fqj2, @Nullable fqj fqj3) {
        if (fqj2 == fqj3) {
            return;
        }
        this.a(true);
    }
}

