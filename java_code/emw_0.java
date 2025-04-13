/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from emw
 */
public class emw_0 {
    public static final emw_0 a = new emw_0();
    private final TLongObjectHashMap<emg_0> b = new TLongObjectHashMap();

    public emg_0 a(long l) {
        return (emg_0)this.b.putIfAbsent(l, (Object)new emg_0());
    }

    public emg_0 a(long l, emg_0 emg_02) {
        return (emg_0)this.b.putIfAbsent(l, (Object)emg_02);
    }

    public emg_0 b(long l) {
        emg_0 emg_02 = (emg_0)this.b.remove(l);
        if (emg_02 == null) {
            return null;
        }
        emg_02.t();
        return emg_02;
    }

    public boolean c(long l) {
        return this.b.containsKey(l);
    }

    @NotNull
    public emg_0 d(long l) {
        emg_0 emg_02 = (emg_0)this.b.get(l);
        if (emg_02 == null) {
            throw new IllegalStateException("Les informations d'account doivent \u00eatre cr\u00e9\u00e9es avant d'en demander l'acc\u00e8s");
        }
        return emg_02;
    }
}

