/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from anq
 */
public abstract class anq_2<SoundData>
extends ant_2<SoundData> {
    protected final abu a;
    protected final Logger b;

    public anq_2(abu abu2, LuaState luaState, Logger logger) {
        super(luaState);
        this.a = abu2;
        this.b = logger;
    }

    protected boolean g() {
        return this.a.M();
    }

    @Override
    protected boolean h() {
        return super.h() && this.g();
    }

    @Override
    protected boolean a(@NotNull akr_0 akr_02) {
        return this.a.A().a(akr_02.a());
    }

    @NotNull
    protected Optional<amk_1> a(@NotNull akr_0 akr_02, int n) {
        return this.a(akr_02, n, this.a);
    }

    @NotNull
    protected Optional<amk_1> a(@NotNull akr_0 akr_02, int n, int n2) {
        return this.a(akr_02, n, n2, this.a);
    }
}

