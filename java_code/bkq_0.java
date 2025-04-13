/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKq
 */
public final class bkq_0
implements ajh_1 {
    public static final String a = "quantity";
    public static final String b = "quantityRecap";
    public static final String d = "totalPurchasePrice";
    public static final String e = "canPurchase";
    public static final String[] f = new String[]{"quantity", "quantityRecap", "totalPurchasePrice", "canPurchase"};
    @NotNull
    private final bKT g;
    private int h;

    public bkq_0(@NotNull bKT bKT2) {
        this.g = bKT2;
        this.a(bKT2.e().m() == 1 ? 1 : 0);
    }

    public void a(int n) {
        this.h = Hw.a(n, 0, this.a());
        fis_1.a().a((ajf_1)this, f);
    }

    public int a() {
        return this.g.c();
    }

    public boolean b() {
        return this.h > 0;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "quantity": {
                return this.h > 0 ? Integer.valueOf(this.h) : null;
            }
            case "totalPurchasePrice": {
                return (long)this.h * this.g.b();
            }
            case "canPurchase": {
                return this.b();
            }
        }
        return this.g.b(string);
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])f, (Object[])this.g.d());
    }

    @NotNull
    public bKT c() {
        return this.g;
    }

    public int e() {
        return this.h;
    }
}

