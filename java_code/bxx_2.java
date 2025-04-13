/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxx
 */
public class bxx_2
implements ajh_1,
bHp {
    public static final String a = "furnitureList";
    public static final String b = "furnitureCategoryName";
    public static final String d = "furnitureCompletion";
    public static final String e = "collapsed";
    @NotNull
    private final List<bxb_1> f = new ArrayList<bxb_1>();
    private final bxz_2 g;
    private static final String[] h = new String[]{"collapsed", "furnitureList", "furnitureCategoryName"};
    private boolean i;

    public bxx_2(bxz_2 bxz_22, List<bxb_1> list) {
        this.g = bxz_22;
        this.f.addAll(list);
        this.i = true;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(b)) {
            return bae.h().a(158, (long)this.g.a(), new Object[0]);
        }
        if (string.equals(d)) {
            int n = this.c().a();
            int n2 = n == -1 ? eum_1.a().c() : eum_1.a().d(n);
            return this.f.size() + "/" + n2;
        }
        if (string.equals(e)) {
            return this.i;
        }
        return null;
    }

    @Override
    public boolean a() {
        return this.i;
    }

    @Override
    public void a(boolean bl) {
        this.i = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    public int b() {
        return this.g.b();
    }

    public bxz_2 c() {
        return this.g;
    }

    public void a(bxb_1 bxb_12) {
        this.f.add(bxb_12);
        fis_1.a().a((ajf_1)this, a, d);
    }
}

