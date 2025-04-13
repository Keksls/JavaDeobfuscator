/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boi
 */
public class boi_1
implements ajh_1 {
    public static final String a = "slots";
    public static final boi_1 b = new boi_1();
    public static final String d = "characterCount";
    public static final String e = "maxCharacterCount";
    public static final String f = "characterLimitInfo";
    public static final String g = "characterCountText";
    private final List<bof_1> h = new ArrayList<bof_1>();
    private final List<bok_2> i = new ArrayList<bok_2>();
    private final List<bof_1> j = new ArrayList<bof_1>();
    private byte k = 0;
    private int l;
    private int m;

    private boi_1() {
        enp_2.a.a((ens_2 ens_22, Object object) -> {
            if (ens_22 != ens_2.n) {
                return;
            }
            this.a(this.k, this.h.stream().map(bof_1::b).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList()));
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void a() {
        List<bok_2> list = this.i;
        synchronized (list) {
            this.i.clear();
            for (int k = 1; k <= 13; ++k) {
                this.i.add(new bok_2(k));
            }
            Collections.sort(this.i);
        }
        this.c();
    }

    public synchronized void a(byte by, List<blx_1> list) {
        this.h.clear();
        this.k = by;
        this.l = enp_2.a.b(ens_2.n) + this.k;
        this.m = list.size();
        list.sort(Comparator.comparing(blx_1::cf));
        for (ajf_1 ajf_12 : list) {
            bog_1 bog_12 = new bog_1((blx_1)ajf_12);
            this.h.add(bog_12);
        }
        if (this.m < this.l) {
            for (int k = 0; k < this.l - this.m; ++k) {
                ajf_1 ajf_12;
                ajf_12 = k == 0 ? new bog_1(null) : new boj_1();
                this.h.add((bof_1)ajf_12);
            }
        }
        this.c();
    }

    private void c() {
        this.j.clear();
        this.j.addAll(this.h);
        if (this.m >= this.l && this.k < this.i.size()) {
            this.j.add(this.i.get(this.k));
        }
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            this.j.get(k).a(k);
        }
        fis_1.a().a((ajf_1)this, a, d, e, f, g);
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.j;
        }
        if (string.equals(d)) {
            return this.m;
        }
        if (string.equals(e)) {
            return this.l;
        }
        if (string.equals(f)) {
            return bae.h().a("characterChoice.character.number", enp_2.a.b(ens_2.n), 13);
        }
        if (string.equals(g)) {
            return bae.h().a("characterChoice.character.count", this.m, this.l);
        }
        return null;
    }

    public boolean b() {
        return this.l > 0 && this.m > this.l;
    }

    public int a(blx_1 blx_12) {
        if (blx_12 == null) {
            return -1;
        }
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            bof_1 bof_12 = this.h.get(k);
            if (!bof_12.b().isPresent() || bof_12.b().get().a_() != blx_12.a_()) continue;
            return k;
        }
        return -1;
    }

    public Optional<blx_1> b(blx_1 blx_12) {
        if (blx_12 == null) {
            return Optional.empty();
        }
        boolean bl = false;
        for (int k = this.h.size() - 1; k >= 0; --k) {
            bof_1 bof_12 = this.h.get(k);
            if (bl) {
                return bof_12.b();
            }
            if (!bof_12.b().isPresent() || bof_12.b().get().a_() != blx_12.a_()) continue;
            bl = true;
        }
        return Optional.empty();
    }

    public Optional<blx_1> c(blx_1 blx_12) {
        if (blx_12 == null) {
            return Optional.empty();
        }
        boolean bl = false;
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            bof_1 bof_12 = this.h.get(k);
            if (bl) {
                return bof_12.b();
            }
            if (!bof_12.b().isPresent() || bof_12.b().get().a_() != blx_12.a_()) continue;
            bl = true;
        }
        return Optional.empty();
    }

    public void a(blx_1 blx_12, blx_1 blx_13) {
        int n = this.a(blx_12);
        int n2 = this.a(blx_13);
        bof_1 bof_12 = this.h.get(n);
        bof_1 bof_13 = this.h.set(n2, bof_12);
        this.h.set(n, bof_13);
        bof_12.a(false);
        bof_13.a(false);
        this.c();
    }
}

