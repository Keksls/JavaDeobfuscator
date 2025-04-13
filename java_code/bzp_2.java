/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzp
 */
class bzp_2
extends bzo_1 {
    @NotNull
    private final eBt a;
    @NotNull
    private final bmv_1 b;

    bzp_2(@NotNull eBt eBt2) {
        this.a = eBt2;
        this.b = bqV.a(eBt2);
    }

    @Override
    @Nullable
    public bmr_1 c() {
        return null;
    }

    @Override
    @NotNull
    public eBt d() {
        return this.a;
    }

    @Override
    public long e() {
        return this.a.b();
    }

    @Override
    public long f() {
        return this.a.f();
    }

    @Override
    public String g() {
        return bqV.b(this.a);
    }

    @Override
    public short h() {
        return eBx.b(this.a);
    }

    @Override
    public <T extends blx_1> T j() {
        return (T)this.b;
    }

    @Override
    public boolean i() {
        return false;
    }
}

