/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from anp
 */
public abstract class anp_2<SoundParam>
extends ans_2<SoundParam> {
    protected final abu a;
    protected final Logger b;

    public anp_2(abu abu2, LuaState luaState, Logger logger) {
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
}

