/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bci
 */
public class bci_0
extends alb_2 {
    private final bnh_1 m;
    private long n = Long.MIN_VALUE;
    private ake_1 o;

    public bci_0(int n, bnh_1 bnh_12, @Nullable String string, long l) {
        super(alc_1.q(), 0, 0);
        this.m = bnh_12;
        this.a(new bye_0(this));
        if (string != null) {
            THashMap tHashMap = new THashMap(1);
            tHashMap.put((Object)string, (Object)l);
            this.a((Map<String, Object>)tHashMap);
        }
        this.e(n);
    }

    public void a(ake_1 ake_12) {
        this.o = ake_12;
    }

    public bnh_1 r() {
        return this.m;
    }

    public void d(long l) {
        this.n = l;
    }

    public long s() {
        return this.n;
    }

    @Override
    public void a(akx_2 akx_22, akd_2 akd_22, String string) {
        if (this.o != null) {
            this.o.a(akx_22, akd_22, string);
        }
        super.a(akx_22, akd_22, string);
    }

    @Override
    public void b(akx_2 akx_22) {
        if (this.o != null) {
            this.o.b(akx_22);
        }
        super.b(akx_22);
    }

    @Override
    public void a(akx_2 akx_22) {
        if (this.o != null) {
            this.o.a(akx_22);
        }
        super.a(akx_22);
    }
}

