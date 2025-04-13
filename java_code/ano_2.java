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
 * Renamed from ano
 */
public abstract class ano_2<SoundParam>
extends anr_2<SoundParam> {
    protected final abu a;
    protected final Logger b;

    public ano_2(abu abu2, LuaState luaState, Logger logger) {
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

