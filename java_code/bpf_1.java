/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bpf
 */
public class bpf_1 {
    private static final bpf_1 a = new bpf_1();
    private final TIntObjectHashMap<bpe_1> b = new TIntObjectHashMap();

    private bpf_1() {
    }

    public static bpf_1 a() {
        return a;
    }

    public bpe_1 a(int n) {
        return (bpe_1)this.b.get(n);
    }

    public void a(bpe_1 bpe_12) {
        this.b.put(bpe_12.c(), (Object)bpe_12);
    }
}

