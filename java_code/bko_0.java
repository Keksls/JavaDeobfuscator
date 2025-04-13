/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKo
 */
public final class bko_0
implements ajh_1,
exs_1 {
    public static final String a = "quantity";
    private final exk_2 b;
    private final long d;
    private int e;

    public bko_0(exk_2 exk_22, long l) {
        this.b = exk_22;
        this.d = l;
        this.e = 0;
    }

    void a(int n) {
        this.e = Hw.a(n, 0, (int)this.b.e());
        fis_1.a().a((ajf_1)this, a);
    }

    public int a() {
        return this.b.e();
    }

    short e() {
        Short s2 = this.b.F();
        return s2 != null ? s2.shortValue() : this.b.T().G();
    }

    int f() {
        if (!this.b.y()) {
            return -1;
        }
        eZw eZw2 = this.b.C();
        if (eZw2.b() == 0) {
            return 0;
        }
        int n = 0;
        for (eze_0 eze_02 : eZw2.c().values()) {
            if (eze_02.c() != tc_0.e) continue;
            ++n;
        }
        return 10 * eZw2.b() + n;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e > 0 ? Integer.valueOf(this.e) : null;
        }
        return this.b.b(string);
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public exk_2 h() {
        return this.b;
    }

    public long b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String toString() {
        return "MarketOfferFulfillmentView.ItemWithQuantity(m_item=" + this.h() + ", m_characterUid=" + this.b() + ", m_quantity=" + this.c() + ")";
    }
}

