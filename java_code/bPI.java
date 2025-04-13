/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class bPI
extends bPH {
    private static final Comparator<bpl_0> e = Comparator.comparingInt(bpl_02 -> ((bph_0)bpl_02.r()).F());
    private final List<bpl_0> f = new ArrayList<bpl_0>();
    private final List<bpl_0> g = new ArrayList<bpl_0>();

    public void a(bmv_1 bmv_12) {
        bpa_0 bpa_02 = bmv_12.cJ();
        bpa_02.a(bmv_12.cW().g(), bmv_12.dr(), bmv_12);
        for (bpl_0 bpl_02 : bpa_02.c()) {
            if (((bph_0)bpl_02.r()).w()) {
                this.g.add(bpl_02);
                continue;
            }
            this.f.add(bpl_02);
        }
        this.f.sort(e);
        this.g.sort(e);
    }

    @Override
    protected List<Integer> a() {
        return this.f.stream().map(fio_0::w).collect(Collectors.toList());
    }

    @Override
    protected List<Integer> b() {
        return this.g.stream().map(fio_0::w).collect(Collectors.toList());
    }

    @Override
    @Nullable
    protected bpl_0 a(int n) {
        for (bpl_0 bpl_02 : this.f) {
            if (bpl_02.w() != n) continue;
            return bpl_02;
        }
        for (bpl_0 bpl_02 : this.g) {
            if (bpl_02.w() != n) continue;
            return bpl_02;
        }
        return null;
    }
}

