/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bwb
 */
class bwb_1 {
    private final TByteObjectHashMap<List<blx_1>> a = new TByteObjectHashMap();

    bwb_1() {
        for (byte by = 0; by < 2; by = (byte)(by + 1)) {
            this.a.put(by, new ArrayList());
        }
    }

    List<blx_1> a(byte by) {
        return (List)this.a.get(by);
    }

    void a(blx_1 blx_12, byte by) {
        ((List)this.a.get(by)).add(blx_12);
    }

    void b(blx_1 blx_12, byte by) {
        ((List)this.a.get(by)).add(0, blx_12);
    }
}

