/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bTg
 */
public class btg_1
extends btk_1 {
    private final List<bss_0<?, ?>> c = new ArrayList();

    btg_1(int n, btj_1 btj_12, List<bss_0<?, ?>> list) {
        super(n, btj_12);
        this.c.addAll(list);
    }

    @Override
    public List<bss_0<?, ?>> a() {
        return this.c;
    }

    @Override
    public boolean b() {
        return true;
    }
}

