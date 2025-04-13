/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dhv
extends dht {
    @NotNull
    private final ebx_0 a;
    private final boolean b;

    public dhv(@NotNull ebx_0 ebx_02, boolean bl, @Nullable Integer n, boolean bl2) {
        super(n, bl2);
        this.a = ebx_02;
        this.b = bl;
    }

    @Override
    public int a() {
        return 17916;
    }

    @NotNull
    public ebx_0 q() {
        return this.a;
    }

    public boolean r() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dhv)) {
            return false;
        }
        dhv dhv2 = (dhv)object;
        if (!dhv2.b(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.r() != dhv2.r()) {
            return false;
        }
        ebx_0 ebx_02 = this.q();
        ebx_0 ebx_03 = dhv2.q();
        return !(ebx_02 == null ? ebx_03 != null : !((Object)((Object)ebx_02)).equals((Object)ebx_03));
    }

    @Override
    protected boolean b(Object object) {
        return object instanceof dhv;
    }

    @Override
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.r() ? 79 : 97);
        ebx_0 ebx_02 = this.q();
        n2 = n2 * 59 + (ebx_02 == null ? 43 : ((Object)((Object)ebx_02)).hashCode());
        return n2;
    }
}

