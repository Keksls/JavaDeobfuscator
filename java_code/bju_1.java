/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.index.qual.Positive
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJU
 */
public class bju_1
implements ajh_1 {
    public static final String a = "items";
    public static final String b = "itemAmountText";
    private final List<bjt_1> e = new ArrayList<bjt_1>(50);
    private final Map<Integer, bjs_1> f = new HashMap<Integer, bjs_1>();
    public static bju_1 d = new bju_1();

    private bju_1() {
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "items": {
                return this.e;
            }
            case "itemAmountText": {
                return this.f.size() + "/50";
            }
        }
        return null;
    }

    private void e() {
        while (this.e.size() < 50) {
            this.e.add(null);
        }
        while (this.e.size() > 50 && this.e.contains(null)) {
            this.e.remove(null);
        }
        this.e.sort((bjt_12, bjt_13) -> {
            if (bjt_12 == null) {
                return bjt_13 == null ? 0 : 1;
            }
            if (bjt_13 == null) {
                return -1;
            }
            if (bjt_12.k() && !bjt_13.k()) {
                return 1;
            }
            if (!bjt_12.k() && bjt_13.k()) {
                return -1;
            }
            int n = exw_1.n().compare(bjt_12.G(), bjt_13.G());
            if (n != 0) {
                return n;
            }
            return Integer.signum(bjt_13.c() - bjt_12.c());
        });
        fis_1.a().a((ajf_1)this, a, b);
    }

    public boolean a(int n, short s2) {
        return Optional.ofNullable(this.f.get(n)).map(bjs_12 -> bjs_12.c() >= s2).orElse(false);
    }

    public int a() {
        return this.f.size();
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    public void a(List<bjs_1> list) {
        this.f.clear();
        list.forEach(bjs_12 -> this.f.put(bjs_12.a(), (bjs_1)bjs_12));
        this.e.clear();
        this.f.forEach((n, bjs_12) -> this.e.addAll(bjr_1.a(bjs_12)));
        this.e();
    }

    public void a(Collection<bjs_1> collection) {
        collection.forEach(this::b);
        this.e();
    }

    public void a(bjs_1 bjs_12) {
        this.b(bjs_12);
        this.e();
    }

    private void b(bjs_1 bjs_12) {
        if (bjs_12 == null) {
            return;
        }
        int n = bjs_12.a();
        if (this.f.containsKey(n)) {
            bjs_1 bjs_13 = this.f.get(n);
            int n2 = bjs_13.c();
            int n3 = n2 + bjs_12.c();
            bjs_13.a(n3);
            bjs_13.a(bjs_12.e());
        } else {
            this.f.put(n, bjs_12);
        }
        this.e.removeIf(bjt_12 -> bjt_12 != null && bjt_12.aT_() == n);
        this.e.addAll(bjr_1.a(this.f.get(n)));
    }

    public void a(int n, @Positive int n2) {
        this.a((Integer)n, (Integer)n2);
        this.e();
    }

    public void a(Map<Integer, Integer> map) {
        map.forEach(this::a);
        this.e();
    }

    public void a(int n) {
        if (!this.f.containsKey(n)) {
            return;
        }
        this.f.remove(n);
        this.e.removeIf(bjt_12 -> bjt_12 != null && bjt_12.aT_() == n);
        this.e();
    }

    public void b(int n) {
        if (!this.f.containsKey(n)) {
            return;
        }
        this.f.get(n).a(true);
        this.e.stream().filter(Objects::nonNull).filter(bjt_12 -> bjt_12.aT_() == n).forEach(bjt_12 -> bjt_12.a(true));
        this.e();
    }

    public void c(int n) {
        if (!this.f.containsKey(n)) {
            return;
        }
        this.f.get(n).a(false);
        this.e.stream().filter(Objects::nonNull).filter(bjt_12 -> bjt_12.aT_() == n).forEach(bjt_12 -> bjt_12.a(false));
        this.e();
    }

    public void b() {
        this.f.values().forEach(bjs_12 -> bjs_12.a(false));
        this.e.stream().filter(Objects::nonNull).forEach(bjt_12 -> bjt_12.a(false));
        this.e();
    }

    public void c() {
        this.f.clear();
        this.e.clear();
        this.e();
    }

    private void a(Integer n, Integer n2) {
        if (!this.f.containsKey(n)) {
            return;
        }
        bjs_1 bjs_12 = this.f.get(n);
        int n3 = bjs_12.c();
        if (n3 <= n2) {
            this.a(n);
            return;
        }
        int n4 = n3 - n2;
        bjs_12.a(n4);
        this.e.removeIf(bjt_12 -> bjt_12 != null && bjt_12.aT_() == n.intValue());
        this.e.addAll(bjr_1.a(this.f.get(n)));
    }
}

