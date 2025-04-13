/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.EnumMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eVl
 */
public class evl_1 {
    private static final Logger c = Logger.getLogger(evl_1.class);
    public static final evl_1 a = new evl_1();
    public static final int b = 3;
    private final EnumMap<evg_1, TIntObjectHashMap<evk_1>> d = new EnumMap(evg_1.class);

    private evl_1() {
    }

    public void a(@NotNull eun_1 eun_12) {
        this.a(eun_12, evg_1.p);
    }

    public void a(@NotNull evj_1 evj_12) {
        this.a(evj_12, evg_1.m);
    }

    public void a(@NotNull evs_1 evs_12) {
        this.a(evs_12, evg_1.j);
    }

    public void a(@NotNull evp_1 evp_12) {
        this.a(evp_12, evg_1.n);
    }

    public void a(@NotNull euw_1 euw_12) {
        this.a(euw_12, evg_1.i);
    }

    public void a(@NotNull evi_1 evi_12) {
        this.a(evi_12, evg_1.h);
    }

    public void a(@NotNull eux_1 eux_12) {
        this.a(eux_12, evg_1.a);
    }

    public void a(@NotNull eur_1 eur_12) {
        this.a(eur_12, evg_1.C);
    }

    public void a(@NotNull euz_2 euz_22) {
        this.a(euz_22, evg_1.c);
    }

    public void a(@NotNull evr_1 evr_12) {
        this.a(evr_12, evg_1.d);
    }

    public void a(@NotNull euu_1 euu_12) {
        this.a(euu_12, evg_1.e);
    }

    public void a(@NotNull eus_1 eus_12) {
        this.a(eus_12, evg_1.l);
    }

    public void a(@NotNull eut_1 eut_12) {
        this.a(eut_12, evg_1.f);
    }

    public void a(@NotNull euy_1 euy_12) {
        this.a(euy_12, evg_1.g);
    }

    public void a(@NotNull evo_1 evo_12) {
        this.a(evo_12, evg_1.k);
    }

    public void a(@NotNull evd_1 evd_12) {
        this.a(evd_12, evg_1.q);
    }

    public void a(@NotNull evm_1 evm_12) {
        this.a(evm_12, evg_1.r);
    }

    public void a(@NotNull evb_2 evb_22) {
        this.a(evb_22, evg_1.t);
    }

    public void a(@NotNull evn_1 evn_12) {
        this.a(evn_12, evg_1.u);
    }

    public void a(@NotNull evc_2 evc_22) {
        this.a(evc_22, evg_1.w);
    }

    public void a(@NotNull euv_1 euv_12) {
        this.a(euv_12, evg_1.x);
    }

    public void a(@NotNull evg_2 evg_22) {
        this.a(evg_22, evg_1.y);
    }

    public void a(@NotNull evh_1 evh_12) {
        this.a(evh_12, evg_1.z);
    }

    public void a(@NotNull evv_1 evv_12) {
        this.a(evv_12, evg_1.D);
    }

    public void a(@NotNull eva_2 eva_22) {
        this.a(eva_22, evg_1.B);
    }

    @Nullable
    public evk_1 a(@NotNull evg_1 evg_12, int n) {
        TIntObjectHashMap<evk_1> tIntObjectHashMap = this.d.get((Object)evg_12);
        return tIntObjectHashMap != null ? (evk_1)tIntObjectHashMap.get(n) : null;
    }

    @Nullable
    public evp_1 a() {
        TIntObjectHashMap<evk_1> tIntObjectHashMap = this.d.get((Object)evg_1.n);
        return tIntObjectHashMap != null ? (evp_1)tIntObjectHashMap.get(3) : null;
    }

    private void a(@NotNull evk_1 evk_12, evg_1 evg_12) {
        TIntObjectHashMap tIntObjectHashMap = this.d.get((Object)evg_12);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.d.put(evg_12, (TIntObjectHashMap<evk_1>)tIntObjectHashMap);
        }
        if (tIntObjectHashMap.put(evk_12.m(), (Object)evk_12) != null) {
            c.error((Object)new IllegalArgumentException("on essaye d'enregistrer des param\u00e8tres d' IE " + evg_12.toString() + " avec le meme id " + evk_12.m()));
        }
    }

    public String toString() {
        return "IEParametersManager{m_params=" + this.d.size() + "}";
    }
}

