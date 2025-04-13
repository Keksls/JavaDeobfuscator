/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ans
 */
public abstract class ans_2<SoundParam>
extends akk_2 {
    public ans_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    protected void a(int n) {
        if (!this.h()) {
            return;
        }
        SoundParam SoundParam = this.c(n);
        akx_2 akx_22 = this.m();
        this.a(SoundParam, akx_22);
    }

    protected boolean h() {
        return aki_0.h().d();
    }

    protected abstract SoundParam c(int var1);

    protected abstract void a(SoundParam var1, akx_2 var2);
}

