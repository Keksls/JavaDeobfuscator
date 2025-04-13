/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaObject
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ami
 */
public class ami_0
extends akk_2 {
    private static final String a = "getTweenParticleSystemTime";
    private static final akf_1[] b = new akf_1[]{new akf_1("particleFileId", null, akg_2.d, false), new akf_1("startX", null, akg_2.d, false), new akf_1("startY", null, akg_2.d, false), new akf_1("startZ", null, akg_2.d, false), new akf_1("destX", null, akg_2.d, false), new akf_1("destY", null, akg_2.d, false), new akf_1("destZ", null, akg_2.d, false), new akf_1("angle", null, akg_2.d, false), new akf_1("type", null, akg_2.d, false), new akf_1("timeCoef", null, akg_2.e, true), new akf_1("level", null, akg_2.d, true)};
    private static final akf_1[] c = new akf_1[]{new akf_1("movementDuration", null, akg_2.d, false)};

    public ami_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return b;
    }

    @Override
    public final akf_1[] f() {
        return c;
    }

    @Override
    public void a(int n) {
        LuaObject luaObject = this.m().k().getLuaObject("fightId");
        int n2 = -1;
        if (luaObject.isNumber()) {
            n2 = (int)luaObject.getNumber();
            if (!aij_0.a().c(n2)) {
                this.q(0);
                return;
            }
        }
        int n3 = this.d(0);
        int n4 = this.d(1);
        int n5 = this.d(2);
        int n6 = this.d(3);
        int n7 = this.d(4);
        int n8 = this.d(5);
        int n9 = this.d(6);
        int n10 = this.d(7);
        this.d(8);
        float f2 = n >= 9 ? this.f(9) : -1.0f;
        FreeParticleSystem freeParticleSystem = n >= 10 ? aij_0.a().a(n3, this.d(10)) : aij_0.a().a(n3);
        freeParticleSystem.a(n4, (float)n5, (float)n6);
        freeParticleSystem.a(n2);
        aiu_0 aiu_02 = f2 < 0.0f ? new aiu_0(freeParticleSystem, n7, n8, n9, n10) : new aiu_0(freeParticleSystem, n7, n8, n9, n10, f2);
        this.q((int)aiu_02.f());
        freeParticleSystem.u();
    }
}

