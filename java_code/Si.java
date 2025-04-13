/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public abstract class Si<FX extends Sl> {
    private final TIntObjectHashMap<FX> a = new TIntObjectHashMap();

    protected Si() {
    }

    public void a(FX FX) {
        this.a.put(FX.i(), FX);
    }

    public FX a(int n) {
        return (FX)((Sl)this.a.get(n));
    }
}

