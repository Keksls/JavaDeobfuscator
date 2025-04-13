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
 * Renamed from bzq
 */
class bzq_1
extends bzo_1 {
    @NotNull
    private final bmr_1 a;

    bzq_1(@NotNull bmr_1 bmr_12) {
        this.a = bmr_12;
    }

    @Override
    @NotNull
    public bmr_1 c() {
        return this.a;
    }

    @Override
    @Nullable
    public eBt d() {
        return null;
    }

    @Override
    public long e() {
        return this.a.a_();
    }

    @Override
    public long f() {
        return this.a.U_();
    }

    @Override
    public String g() {
        return this.a.dp();
    }

    @Override
    public short h() {
        return this.a.dr();
    }

    @Override
    public <T extends blx_1> T j() {
        return (T)this.a;
    }

    @Override
    public boolean i() {
        return this.a.a_() <= 0L || this.a.R() <= 0L;
    }
}

