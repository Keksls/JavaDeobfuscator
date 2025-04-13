/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  gnu.trove.map.TLongObjectMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import com.google.common.primitives.Longs;
import gnu.trove.map.TLongObjectMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.BitSet;

final class eJN
extends sj_0 {
    eJN(se_0 se_02) {
        super(se_02);
    }

    @Override
    protected void a(sd_0 sd_02, byte by) {
        long[] lArray = this.c.toArray();
        long[] lArray2 = this.b.toArray();
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap((TLongObjectMap)this.d);
        this.c.clear();
        this.b.clear();
        this.d.clear();
        eJN.b(lArray, (TLongObjectHashMap<sd_0>)tLongObjectHashMap);
        eJN.a(lArray2, (TLongObjectHashMap<sd_0>)tLongObjectHashMap);
        eJN.a(sd_02, lArray2, (TLongObjectHashMap<sd_0>)tLongObjectHashMap);
    }

    private static void a(long[] lArray, TLongObjectHashMap<sd_0> tLongObjectHashMap) {
        Longs.asList((long[])lArray).sort(new ejo_0(tLongObjectHashMap));
    }

    private static void a(sd_0 sd_02, long[] lArray, TLongObjectHashMap<sd_0> tLongObjectHashMap) {
        boolean bl = sd_02 != null && eot.a(sd_02.L());
        for (long l : lArray) {
            sd_0 sd_03 = (sd_0)tLongObjectHashMap.get(l);
            if (sd_03 == null || sd_03.c() != l || sd_03.aj() || sd_03.r()) continue;
            if (bl) {
                sd_0.bs_();
            }
            sd_03.e(sd_02);
        }
    }

    private static void b(long[] lArray, TLongObjectHashMap<sd_0> tLongObjectHashMap) {
        for (long l : lArray) {
            sd_0 sd_02 = (sd_0)tLongObjectHashMap.get(l);
            if (sd_02 == null || sd_02.c() != l) continue;
            sd_02.ai();
        }
    }

    private boolean a(byte by, sd_0 sd_02, BitSet bitSet) {
        ejh_0 ejh_02 = (ejh_0)sd_02;
        if (!ejh_02.bu()) {
            return false;
        }
        boolean bl = false;
        switch (by) {
            case 31: {
                if (ejh_02.H() == null || !ejh_02.H().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 11: {
                if (sd_02.F() == null || !sd_02.F().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 21: {
                if (sd_02.G() == null || !sd_02.G().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 61: {
                if (sd_02.J() == null || !sd_02.J().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 41: {
                if (sd_02.K() == null || !sd_02.K().intersects(bitSet)) break;
                this.b(sd_02);
                bl = true;
            }
        }
        return bl;
    }

    @Override
    protected boolean b(BitSet bitSet, sd_0 sd_02, byte by) {
        if (sd_02 != null && ((ejh_0)sd_02).a(eff_0.f)) {
            return false;
        }
        boolean bl = false;
        for (sd_0 sd_03 : this.a) {
            ejh_0 ejh_02;
            if (!(sd_03 instanceof ejh_0) || sd_02 == (ejh_02 = (ejh_0)sd_03) || sd_02 != null && sd_02.v() == ejh_02 || sd_02 != null && sd_02.X() || sd_02 != null && sd_02.W() && !ejh_02.a(eff_0.a)) continue;
            if (ejh_02.bu()) {
                if (!this.a(by, (sd_0)ejh_02, bitSet)) continue;
                bl = true;
                continue;
            }
            if (ejh_02.T()) {
                if (!this.b(bitSet, by, ejh_02)) continue;
                bl = true;
                continue;
            }
            if (!this.a(bitSet, by, ejh_02)) continue;
            bl = true;
        }
        return bl;
    }
}

