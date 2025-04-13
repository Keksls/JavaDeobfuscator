/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bTf
 */
class btf_1
implements brt_2 {
    final /* synthetic */ btj_1 a;
    final /* synthetic */ int b;
    final /* synthetic */ bSO c;

    btf_1(bSO bSO2, btj_1 btj_12, int n) {
        this.c = bSO2;
        this.a = btj_12;
        this.b = n;
    }

    @Override
    public void a(long l, List<bss_0<?, ?>> list) {
        int n = list.size();
        this.c.Q = (int)Math.ceil((double)l / 12.0);
        if (n <= 0) {
            this.a.a(null);
            return;
        }
        this.c.W.put(this.b, new btg_1(0, null, list));
        this.a.a(null);
    }

    @Override
    public void a() {
        this.a.a();
    }
}

