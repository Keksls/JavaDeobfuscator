/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public abstract class bPH
implements ajh_1 {
    public static final String a = "deckSelectedActiveSpells";
    public static final String b = "deckSelectedPassiveSpells";
    private final bpr_0[] e = new bpr_0[fiK.a.length];
    private final bpr_0[] f = new bpr_0[fiK.b.length];
    public static final String[] d = new String[]{"deckSelectedActiveSpells", "deckSelectedPassiveSpells"};

    protected bPH() {
        int n;
        for (n = 0; n < this.e.length; ++n) {
            this.e[n] = new bpr_0((byte)n, fiK.a[n], false);
        }
        for (n = 0; n < this.f.length; ++n) {
            this.f[n] = new bpr_0((byte)n, fiK.b[n], true);
        }
    }

    protected abstract List<Integer> a();

    protected abstract List<Integer> b();

    @Nullable
    protected abstract bpl_0 a(int var1);

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "deckSelectedActiveSpells": {
                return this.e;
            }
            case "deckSelectedPassiveSpells": {
                return this.f;
            }
        }
        return null;
    }

    public void c() {
        this.a(this.e, this.a());
        this.a(this.f, this.b());
        fis_1.a().a((ajf_1)this, this.d());
    }

    private void a(bpr_0[] bpr_0Array, List<Integer> list) {
        for (int k = 0; k < Math.min(bpr_0Array.length, list.size()); ++k) {
            bpr_0 bpr_02 = bpr_0Array[k];
            if (bpr_02 == null) continue;
            int n = list.get(k);
            bpl_0 bpl_02 = this.a(n);
            bpr_02.a(bpl_02);
            fis_1.a().a((ajf_1)bpr_02, "isLocked");
        }
    }

    public bpr_0 a(byte by) {
        return this.e[by];
    }

    public bpr_0 b(byte by) {
        return this.f[by];
    }

    public bpr_0 a(bpl_0 bpl_02) {
        if (((bph_0)bpl_02.r()).w()) {
            return this.f();
        }
        return this.e();
    }

    private bpr_0 e() {
        for (bpr_0 bpr_02 : this.e) {
            if (bpr_02.b() != null || bpr_02.a()) continue;
            return bpr_02;
        }
        return null;
    }

    private bpr_0 f() {
        for (bpr_0 bpr_02 : this.f) {
            if (bpr_02.b() != null || bpr_02.a()) continue;
            return bpr_02;
        }
        return null;
    }

    public Optional<bpr_0> b(int n) {
        for (bpr_0 bpr_02 : this.e) {
            if (bpr_02.b() == null || bpr_02.b().w() != n) continue;
            return Optional.of(bpr_02);
        }
        for (bpr_0 bpr_02 : this.f) {
            if (bpr_02.b() == null || bpr_02.b().w() != n) continue;
            return Optional.of(bpr_02);
        }
        return Optional.empty();
    }

    @Override
    public String[] d() {
        return d;
    }
}

