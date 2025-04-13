/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKn
 */
public class bkn_0
implements ajh_1,
bhx_1 {
    public static final String a = "selectedItems";
    public static final String b = "offerFulfillmentRecap";
    public static final String d = "canFulfill";
    public static final String e = "isFull";
    public static final String f = "fulfillButtonText";
    public static final String g = "lastMatchWasError";
    public static final String h = "lastMatchErrorText";
    public static final String[] i = new String[]{"selectedItems", "offerFulfillmentRecap", "canFulfill", "fulfillButtonText", "lastMatchWasError", "lastMatchErrorText"};
    public static final Comparator<bko_0> j = Comparator.comparingInt(bko_0::c);
    public static final Comparator<bko_0> k = Comparator.comparingInt(object -> ((bko_0)object).e());
    public static final Comparator<bko_0> l = Comparator.comparingInt(object -> ((bko_0)object).f());
    private static final int m = 7000;
    @NotNull
    private final bKY n;
    private final List<bko_0> o = new ArrayList<bko_0>();
    private final Map<Long, bko_0> p = new HashMap<Long, bko_0>();
    private int q;
    private faF r = faF.a;
    private final Runnable s = () -> {
        this.r = faF.a;
        fis_1.a().a((ajf_1)this, g, h);
    };

    public bkn_0(@NotNull bKY bKY2) {
        this.n = bKY2;
    }

    public void a(exk_2 exk_22) {
        bmk_1 bmk_12 = (bmk_1)fis_1.a().d("characterSheet", "inventoryDialog");
        if (bmk_12 == null) {
            return;
        }
        this.a(exk_22, bmk_12.f());
    }

    private void a(exk_2 exk_22, long l) {
        if (this.p.containsKey(exk_22.a())) {
            return;
        }
        if (this.q >= this.n.e().r()) {
            return;
        }
        this.r = daw.a(exk_22, this.n.e());
        ado_1.a().b(this.s);
        fis_1.a().a((ajf_1)this, g, h);
        if (this.r != faF.a) {
            ado_1.a().a(this.s, 7000L, 1);
            return;
        }
        bko_0 bko_02 = new bko_0(exk_22, l);
        this.o.add(bko_02);
        this.p.put(exk_22.a(), bko_02);
        this.a(bko_02, bko_02.a());
        fis_1.a().a((ajf_1)this, i);
        fis_1.a().a((ajf_1)exk_22, "movable");
    }

    public void b(exk_2 exk_22) {
        if (!this.p.containsKey(exk_22.a())) {
            return;
        }
        bko_0 bko_02 = this.p.remove(exk_22.a());
        this.o.remove(bko_02);
        this.q -= bko_02.c();
        this.r = faF.a;
        fis_1.a().a((ajf_1)this, i);
        fis_1.a().a((ajf_1)exk_22, "movable");
    }

    public boolean a(long l) {
        return this.p.containsKey(l);
    }

    public void b() {
        TLongHashSet tLongHashSet = euw_2.a.e(bhh_1.b());
        mq_1 mq_12 = this.n.e();
        for (long l : tLongHashSet.toArray()) {
            Object t = euw_2.a.d(l);
            ((epq_2)t).dS().a((TObjectProcedure<exk_2>)((TObjectProcedure)exk_22 -> {
                if (daw.a(exk_22, mq_12) == faF.a) {
                    if (this.p.containsKey(exk_22.a())) {
                        this.a(this.p.get(exk_22.a()), exk_22.e());
                    } else {
                        this.a((exk_2)exk_22, l);
                    }
                }
                return this.q < mq_12.r();
            }));
            if (this.q >= mq_12.r()) break;
        }
    }

    public void a(bko_0 bko_02, int n) {
        int n2 = this.n.e().r() - (this.q - bko_02.c());
        int n3 = Hw.a(n, 0, n2);
        this.q += n3 - bko_02.c();
        bko_02.a(n3);
        fis_1.a().a((ajf_1)this, b, d, f);
    }

    public void a(Consumer<bko_0> consumer) {
        this.o.forEach(consumer);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "selectedItems": {
                return this.o;
            }
            case "offerFulfillmentRecap": {
                return bae.h().a("market.offer.fulfill.recap", this.n.e().p() * (long)this.q, this.q, new fyr_0(elw_1.di).w());
            }
            case "canFulfill": {
                return this.c();
            }
            case "isFull": {
                return this.q == this.n.e().r();
            }
            case "fulfillButtonText": {
                if (this.c()) {
                    return bae.h().a("market.offer.sell", new Object[0]);
                }
                if (this.o.isEmpty()) {
                    return bae.h().a("market.offer.fulfill.no.items", new Object[0]);
                }
                return bae.h().a("market.offer.fulfill.invalid.quantity", new Object[0]);
            }
            case "lastMatchWasError": {
                return this.r != faF.a;
            }
            case "lastMatchErrorText": {
                if (this.r == faF.a) {
                    return null;
                }
                return bae.h().a("market.offer.match.error." + this.r.a(), new Object[0]);
            }
        }
        return this.n.b(string);
    }

    public boolean c() {
        return !this.o.isEmpty() && this.f();
    }

    private boolean f() {
        for (bko_0 bko_02 : this.o) {
            if (bko_02.c() > 0 && bko_02.c() <= bko_02.h().e()) continue;
            return false;
        }
        return true;
    }

    @Override
    public String[] d() {
        return (String[])ArrayUtils.addAll((Object[])i, (Object[])this.n.d());
    }

    @Override
    public bjw_1 a() {
        return this.n.g();
    }

    @NotNull
    public bKY e() {
        return this.n;
    }
}

