/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bHi
extends exh_1
implements Uo,
ajh_1 {
    private static final Logger l = Logger.getLogger(bHi.class);
    public static final String a = "allItemsView";
    public static final String b = "currentInventoryView";
    public static final String d = "bagListWithoutPockets";
    public static final String e = "typedBagListWithoutPockets";
    public static final String f = "currentBagType";
    public static final String g = "bagTypes";
    private bhs_0 m = bhs_0.a;
    private final bht_0[] n = new bht_0[]{new bht_0(bhs_0.a), new bht_0(bhs_0.b), new bht_0(bhs_0.d)};
    public static final String[] h = new String[]{"currentInventoryView", "bagListWithoutPockets", "typedBagListWithoutPockets", "currentBagType", "bagTypes"};
    private final ewy_2 o = new bhj_0(this);
    private long p;
    private String q;
    private bjl_1<bHg> r;
    bjl_1<bid_0> s;
    private bjl_1<bjw_2> t;

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        try {
            if (string.equals(b)) {
                switch (this.m) {
                    case a: {
                        this.q();
                        this.r();
                        return this.r;
                    }
                    case b: {
                        this.p();
                        return this.s;
                    }
                    case d: {
                        this.a();
                        return this.t;
                    }
                }
                return null;
            }
            if (string.equals(g)) {
                return this.n;
            }
            if (string.equals(f)) {
                return this.m;
            }
            if (string.equals(a)) {
                return new bhb_1(this);
            }
            if (string.equals(d)) {
                return this.b(false);
            }
            if (string.equals(e)) {
                return this.b(false);
            }
        }
        catch (Exception exception) {
            l.error((Object)"Exception levee", (Throwable)exception);
        }
        return null;
    }

    private void p() {
        if (this.s != null && !this.s.b()) {
            return;
        }
        this.s = new bjl_1<bid_0>(this.t());
    }

    private void q() {
        if (this.r != null) {
            return;
        }
        this.r = new bjl_1(Lists.newArrayList((Object[])this.u()));
    }

    private void r() {
        this.r.a().forEach(bHg2 -> {
            if (bHg2 == null) {
                return;
            }
            bHg2.m();
        });
    }

    public void a() {
        if (this.t == null) {
            this.t = new bjl_1<bjw_2>(this.s());
        } else {
            this.t.a(this.s());
        }
    }

    public void b() {
        if (this.s == null || this.s.b()) {
            this.s = new bjl_1<bid_0>(this.t());
        } else {
            this.s.a(this.t());
        }
    }

    private List<bjw_2> s() {
        ArrayList<bjw_2> arrayList = new ArrayList<bjw_2>();
        for (ft_1 ft_12 : bol_1.a) {
            if (!bol_1.f(ft_12)) continue;
            bjw_2 bjw_22 = new bjw_2(ft_12);
            List<fk_2> list = bol_1.b(azu_0.j().k().R(), this.p, ft_12);
            bjw_22.a(this.q);
            bjw_22.a(list.stream().map(fk_2::c).collect(Collectors.toSet()));
            arrayList.add(bjw_22);
        }
        arrayList.sort(bjw_2::a);
        return arrayList;
    }

    List<bid_0> t() {
        ArrayList<bid_0> arrayList = new ArrayList<bid_0>();
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.p);
        if (bmr_12 == null) {
            return new ArrayList<bid_0>();
        }
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        Optional<emy_0> optional = bhh_1.a(end_0.e);
        bid_0 bid_02 = new bid_0("questInventory");
        bid_0 bid_03 = new bid_0("tokenInventory");
        bid_0 bid_04 = new bid_0("accountInventory");
        ArrayList<bHR> arrayList2 = new ArrayList<bHR>();
        ArrayList<bHR> arrayList3 = new ArrayList<bHR>();
        ArrayList<bHR> arrayList4 = new ArrayList<bHR>();
        ewx_22.a(this.a(arrayList2, arrayList3));
        optional.ifPresent(emy_02 -> arrayList4.addAll(this.a((evm_2)emy_02)));
        arrayList3.sort(Comparator.comparing(bHR::c).thenComparing(bHR::b).reversed());
        bid_02.a(arrayList2);
        bid_03.a(arrayList3);
        bid_04.a(arrayList4);
        arrayList.add(bid_03);
        arrayList.add(bid_02);
        arrayList.add(bid_04);
        return arrayList;
    }

    private List<bHR> a(evm_2 evm_22) {
        Map<Integer, Integer> map = evm_22.a();
        ArrayList<bHR> arrayList = new ArrayList<bHR>(map.size());
        map.forEach((n, n2) -> {
            Optional<bjw_1> optional = this.j((int)n);
            optional.ifPresent(bjw_12 -> arrayList.addAll(this.a((bjw_1)bjw_12, n2.shortValue())));
        });
        return arrayList;
    }

    @NotNull
    private Consumer<ewz_2> a(List<bHR> list, List<bHR> list2) {
        bhg_0 bhg_02 = bHJ.a().a(603);
        return ewz_22 -> {
            Optional<bjw_1> optional = this.j(ewz_22.a());
            if (optional.isEmpty()) {
                return;
            }
            List<bHR> list3 = this.a(optional.get(), ewz_22.b());
            if (list3.isEmpty()) {
                return;
            }
            if (list3.get(0).h().U().c(bhg_02)) {
                list2.addAll(list3);
            } else {
                list.addAll(list3);
            }
        };
    }

    private List<bHR> a(bjw_1 bjw_12, short s2) {
        ArrayList<bHR> arrayList = new ArrayList<bHR>();
        short s3 = bjw_12.o();
        while (s2 > 0) {
            short s4 = (short)Math.min(s2, s3);
            exk_2 exk_22 = new exk_2();
            exk_22.b(bjw_12);
            exk_22.a(s4);
            arrayList.add(new bHR(exk_22));
            s2 = (short)(s2 - s4);
        }
        return arrayList;
    }

    private Optional<bjw_1> j(int n) {
        bjw_1 bjw_12 = bhb_0.d().a(n);
        if (bjw_12 == null) {
            return Optional.empty();
        }
        if (bjw_12.V()) {
            return Optional.empty();
        }
        if (!Strings.isNullOrEmpty((String)this.q) && !Cz.o(bjw_12.e()).contains(this.q)) {
            return Optional.empty();
        }
        return Optional.of(bjw_12);
    }

    public void c() {
        fis_1.a().a((ajf_1)this, d, b, a);
    }

    private bHg[] u() {
        return this.b(true);
    }

    private bHg[] b(boolean bl) {
        int n = bl ? 0 : -1;
        bHg[] bHgArray = new bHg[6 + n];
        Object[] objectArray = new exg_2[this.j.size()];
        this.j.values(objectArray);
        for (Object object : objectArray) {
            byte by = ((exg_2)object).e();
            if (by == 0) {
                if (!bl) continue;
                bHgArray[0] = ((bHe)object).b();
                continue;
            }
            if (by <= 0 || by + n >= bHgArray.length) continue;
            bHgArray[by + n] = ((bHe)object).b();
        }
        return bHgArray;
    }

    public byte a(boolean bl) {
        byte by;
        bHg[] bHgArray = this.u();
        if (bl) {
            for (by = 0; by < bHgArray.length; by = (byte)(by + 1)) {
                if (exg_2.a(false, by) || bHgArray[by] != null || !exg_2.a(bl, by)) continue;
                return by;
            }
        }
        for (by = 0; by < bHgArray.length; by = (byte)(by + 1)) {
            if (bHgArray[by] != null || !exg_2.a(bl, by)) continue;
            return by;
        }
        return -1;
    }

    public ArrayList<exk_2> a(List<eco_0> list) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        block0: for (exk_2 exk_22 : this.e()) {
            if (exk_22 == null) continue;
            for (eco_0 eco_02 : list) {
                if (!eco_02.a(exk_22.aT_())) continue;
                arrayList.add(exk_22);
                continue block0;
            }
        }
        arrayList.sort(new bhk_0(this));
        return arrayList;
    }

    public int a(int n) {
        int n2 = 0;
        for (exk_2 exk_22 : this.i(n)) {
            n2 += exk_22.e();
        }
        return n2;
    }

    public boolean b(int n) {
        return !this.i(n).isEmpty();
    }

    public exk_2[] e() {
        Object object;
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        TLongObjectIterator<exg_2> tLongObjectIterator = this.i();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            object = (exg_2)tLongObjectIterator.value();
            for (short s2 = 0; s2 < ((exg_2)object).h(); s2 = (short)(s2 + 1)) {
                exk_2 exk_22 = ((exg_2)object).g().e(s2);
                if (exk_22 == null) continue;
                arrayList.add(exk_22);
            }
        }
        object = new exk_2[arrayList.size()];
        return arrayList.toArray((T[])object);
    }

    public bhs_0 f() {
        return this.m;
    }

    public void a(bhs_0 bhs_02) {
        this.m = bhs_02;
        if (bhs_02 == bhs_0.d) {
            fis_1.a().a("pet", (Object)null, cyt_0.a().f());
        }
        fis_1.a().a((ajf_1)this, f, b);
    }

    @Override
    protected void a(exg_2 exg_22) {
        this.r = new bjl_1(Lists.newArrayList((Object[])this.u()));
        exg_22.b(this);
    }

    @Override
    protected void b(exg_2 exg_22) {
        this.r.a().stream().filter(Objects::nonNull).filter(bHg2 -> bHg2.o().f() == exg_22.f()).findFirst().ifPresent(bgz_0::n);
        this.r = new bjl_1(Lists.newArrayList((Object[])this.u()));
        exg_22.a(this);
    }

    public void g() {
        this.r = new bjl_1(Lists.newArrayList((Object[])this.u()));
        this.c();
    }

    @Override
    public void a(Uk uk) {
        switch (uk.b()) {
            case a: 
            case b: 
            case c: 
            case d: {
                fis_1.a().a((ajf_1)this, a);
            }
        }
    }

    public void a(bmr_1 bmr_12) {
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        ewx_22.a(this.o);
    }

    public void a(long l) {
        this.p = l;
    }

    public ArrayList<exg_2> h() {
        return this.a(i);
    }

    public void a(String string) {
        this.q = string;
        this.q();
        this.r();
        this.r.a().stream().filter(Objects::nonNull).forEach(bHg2 -> bHg2.a(string));
    }

    public bHg b(long l) {
        return this.r.a().stream().filter(bHg2 -> {
            if (bHg2 == null || bHg2.o() == null) {
                return false;
            }
            return bHg2.o().f() == l;
        }).findFirst().orElse(null);
    }
}

