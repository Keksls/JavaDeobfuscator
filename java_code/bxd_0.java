/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TLongArrayList;
import java.util.List;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXd
 */
class bxd_0
extends akk_2 {
    bxd_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setEnvironmentAps";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("APS Id", null, akg_2.e, false), new akf_1("level", null, akg_2.e, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        TLongArrayList tLongArrayList = new TLongArrayList();
        List list = ccm_1.g().b();
        bmr_1 bmr_12 = azu_0.j().k();
        int n4 = list.size();
        for (int k = 0; k < n4; ++k) {
            cch_1 cch_12 = (cch_1)list.get(k);
            long l = Hw.c(cch_12.a(), cch_12.b());
            if (tLongArrayList.contains(l)) continue;
            tLongArrayList.add(l);
            int n5 = cch_12.a() * 18;
            int n6 = cch_12.b() * 18;
            FreeParticleSystem freeParticleSystem = aij_0.a().a(n2, n3);
            freeParticleSystem.a(n5, (float)n6, (float)yz_0.d(n5, n6, bmr_12.P_().f()));
            aik_0.a().b(freeParticleSystem);
        }
        ccm_1.g().b(new bXe(n2, n3, tLongArrayList));
    }
}

