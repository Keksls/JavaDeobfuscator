/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntFloatHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntFloatHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from epP
 */
public class epp_2 {
    private static final Logger c = Logger.getLogger(epp_2.class);
    public static final epp_2 a = new epp_2(eqe_1.a);
    private final int d;
    private final float[] e = new float[epr_1.values().length];
    private final byte[] f;
    private final short[] g;
    private eqe_1 h = eqe_1.a;
    private final eou_1 i = new eou_1();
    private final TIntFloatHashMap j = new TIntFloatHashMap();

    public epp_2(int n, float[] fArray, byte[] byArray, short[] sArray) {
        this.d = n;
        this.f = byArray;
        if (this.e.length == fArray.length) {
            System.arraycopy(fArray, 0, this.e, 0, this.e.length);
        }
        if (sArray.length % 3 == 0) {
            this.g = sArray;
        } else {
            c.error((Object)"INITIALISATION ERROR : the natural states array is not well built (%3 != 0 : all entries are not a stateId/level pair) sur une avatarBreed");
            this.g = null;
        }
    }

    public epp_2(eqe_1 eqe_12) {
        this(46, new float[]{1.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f}, Cn.b, Cn.h);
        this.h = eqe_12;
    }

    void a(HashMap<Byte, Float> hashMap) {
        for (Map.Entry<Byte, Float> entry : hashMap.entrySet()) {
            Byte by = entry.getKey();
            this.j.put((int)by.byteValue(), entry.getValue().floatValue());
        }
        this.h = new eqg_1(hashMap);
    }

    int a(eps_0 eps_02) {
        return this.i.a(eps_02);
    }

    public float a(epr_1 epr_12) {
        return this.e[epr_12.ordinal()];
    }

    public int a() {
        return this.i.a(eps_0.l);
    }

    public eke_0 b() {
        return elg_0.a().e(this.d);
    }

    int a(int n, eps_0 eps_02) {
        int n2 = this.i.a(eps_02);
        float f2 = this.j.get((int)eps_02.a());
        return n2 + (int)Math.floor((float)n * f2);
    }

    eqe_1 c() {
        return this.h;
    }

    private efa_0 a(byte by) {
        assert (by >= 0 && by < this.f.length) : "Index de spellElement invalide";
        return efa_0.a(this.f[by]);
    }

    public boolean a(efa_0 efa_02) {
        for (int k = 0; k < this.f.length; ++k) {
            if (this.f[k] != efa_02.a()) continue;
            return true;
        }
        return false;
    }

    public void a(TObjectProcedure<efa_0> tObjectProcedure) {
        for (int k = 0; k < this.f.length; ++k) {
            efa_0 efa_02 = this.a((byte)k);
            if (tObjectProcedure.execute((Object)efa_02)) continue;
            return;
        }
    }

    public void a(eps_0 eps_02, int n) {
        this.i.a(eps_02, n);
    }

    public short[] d() {
        return this.g;
    }
}

