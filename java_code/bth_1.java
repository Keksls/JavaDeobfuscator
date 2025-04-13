/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bTh
 */
public class bth_1
extends btk_1 {
    final List<bss_0<?, ?>> c = new ArrayList();
    boolean d = false;
    private final String e;
    final bSO f;

    protected bth_1(String string, int n, btj_1 btj_12, bSO bSO2) {
        super(n, btj_12);
        this.e = string;
        this.f = bSO2;
    }

    public void c() {
        brx_2.a(new bti_1(this), this.e, this.a, 12);
    }

    @Override
    public List<bss_0<?, ?>> a() {
        return this.c;
    }

    @Override
    public boolean b() {
        return this.d;
    }
}

