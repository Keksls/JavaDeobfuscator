/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ant
 */
public abstract class ant_2<SoundData>
extends ans_2<SoundData> {
    public ant_2(LuaState luaState) {
        super(luaState);
    }

    protected abstract boolean a(@NotNull akr_0 var1);

    @NotNull
    protected Optional<amk_1> b(@NotNull akr_0 akr_02, int n) {
        return this.a(akr_02, n, 100, Optional.empty());
    }

    @NotNull
    protected Optional<amk_1> b(@NotNull akr_0 akr_02, int n, int n2) {
        return this.a(akr_02, n, n2, Optional.empty());
    }

    @NotNull
    protected Optional<amk_1> a(@NotNull akr_0 akr_02, int n, @NotNull alo_1 alo_12) {
        return this.a(akr_02, n, 100, alo_12);
    }

    @NotNull
    protected Optional<amk_1> a(@NotNull akr_0 akr_02, int n, int n2, @NotNull alo_1 alo_12) {
        return this.a(akr_02, n, n2, Optional.of(alo_12));
    }

    @NotNull
    private Optional<amk_1> a(@NotNull akr_0 akr_02, int n, int n2, @NotNull Optional<alo_1> optional) {
        if (!this.a(akr_02)) {
            return Optional.empty();
        }
        long l = System.currentTimeMillis();
        if (!amU.a().a(l, akr_02.a())) {
            return Optional.empty();
        }
        amU.a().b(l, akr_02.a());
        float f2 = akr_02.b() * (float)n2 / 100.0f;
        amk_1 amk_12 = optional.isPresent() ? aki_0.h().a(akr_02.a(), f2, akr_02.i(), 1, -1L, -1L, n, optional.get(), akr_02.e()) : aki_0.h().a(akr_02.a(), f2, akr_02.i(), 1, -1L, -1L, n);
        return Optional.ofNullable(amk_12);
    }
}

