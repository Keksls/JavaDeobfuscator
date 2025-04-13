/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAT
 */
public abstract class fat_1
extends fas_1
implements fbr_1 {
    @Override
    public void a(fqj fqj2, @Nullable fqj fqj3) {
        if (fqj2 != null) {
            fqj2.b(this);
        }
        if (fqj3 != null) {
            fqj3.a(this);
        }
    }

    @Nullable
    public String getStateRelated() {
        fqj fqj2 = this.getAppearanceRelated();
        return fqj2 != null ? fqj2.getCurrentState() : null;
    }

    @Nullable
    public fqp_0 getAppearanceStateRelated() {
        String string = this.getStateRelated();
        return string != null ? fqp_0.valueOf(string) : null;
    }

    @Override
    public void a(String string, String string2) {
        if (Objects.equals(string, string2)) {
            return;
        }
        this.a(true);
    }
}

