/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzo
 */
public abstract class bzo_1 {
    public static bzo_1 a(@NotNull bmr_1 bmr_12) {
        return new bzq_1(bmr_12);
    }

    public static bzo_1 a(@NotNull eBt eBt2) {
        return new bzp_2(eBt2);
    }

    @Contract(pure=true)
    public boolean a() {
        return this.c() != null;
    }

    @Contract(pure=true)
    public boolean b() {
        return this.d() != null;
    }

    @Contract(pure=true)
    @Nullable
    public abstract bmr_1 c();

    @Contract(pure=true)
    @Nullable
    public abstract eBt d();

    @Contract(pure=true)
    public abstract long e();

    @Contract(pure=true)
    public abstract long f();

    @Contract(pure=true)
    public abstract String g();

    @Contract(pure=true)
    public abstract short h();

    @Contract(pure=true)
    public abstract boolean i();

    public abstract <T extends blx_1> T j();
}

