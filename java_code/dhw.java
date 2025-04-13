/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class dhw
extends dfc {
    @NotNull
    private ebx_0 a;

    @Override
    public int a() {
        return 19233;
    }

    @NotNull
    public ebx_0 k() {
        return this.a;
    }

    public dhw(@NotNull ebx_0 ebx_02) {
        if (ebx_02 == null) {
            throw new NullPointerException("step is marked non-null but is null");
        }
        this.a = ebx_02;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dhw)) {
            return false;
        }
        dhw dhw2 = (dhw)object;
        if (!dhw2.b(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ebx_0 ebx_02 = this.k();
        ebx_0 ebx_03 = dhw2.k();
        return !(ebx_02 == null ? ebx_03 != null : !((Object)((Object)ebx_02)).equals((Object)ebx_03));
    }

    protected boolean b(Object object) {
        return object instanceof dhw;
    }

    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        ebx_0 ebx_02 = this.k();
        n2 = n2 * 59 + (ebx_02 == null ? 43 : ((Object)((Object)ebx_02)).hashCode());
        return n2;
    }
}

