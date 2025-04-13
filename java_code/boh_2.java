/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Renamed from boH
 */
public enum boh_2 {
    a("skin", atm_1.b, (bnh_12, n) -> bnh_12.a((int)n, true), bnh_12 -> bnh_12.ew().a(), bnh_12 -> bnh_12.a(bkw_1.a().b((int)bnh_12.gO(), bnh_12.gX(), (short)bnh_12.bY()), true), bnh_12 -> bkw_1.a().e(bnh_12.gO(), bnh_12.gX())),
    b("hair", atm_1.c, (bnh_12, n) -> bnh_12.b((int)n, true), bnh_12 -> bnh_12.ew().b(), bnh_12 -> bnh_12.b(bkw_1.a().c(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().f(bnh_12.gO(), bnh_12.gX())),
    c("pupil", atm_1.i, (bnh_12, n) -> bnh_12.c((int)n, true), bnh_12 -> bnh_12.ew().c(), bnh_12 -> bnh_12.c(bkw_1.a().d(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().c()),
    d("costumeColor1", atm_1.k, (bnh_12, n) -> bnh_12.a(atm_1.k, (int)n, true), bnh_12 -> bnh_12.ew().d(), bnh_12 -> bnh_12.a(atm_1.k, bkw_1.a().e(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().d()),
    e("costumeColor2", atm_1.l, (bnh_12, n) -> bnh_12.a(atm_1.l, (int)n, true), bnh_12 -> bnh_12.ew().e(), bnh_12 -> bnh_12.a(atm_1.l, bkw_1.a().f(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().e()),
    f("costumeColor3", atm_1.m, (bnh_12, n) -> bnh_12.a(atm_1.m, (int)n, true), bnh_12 -> bnh_12.ew().f(), bnh_12 -> bnh_12.a(atm_1.m, bkw_1.a().g(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().f()),
    g("costumeColor4", atm_1.n, (bnh_12, n) -> bnh_12.a(atm_1.n, (int)n, true), bnh_12 -> bnh_12.ew().g(), bnh_12 -> bnh_12.a(atm_1.n, bkw_1.a().h(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().g()),
    h("costumeColor5", atm_1.o, (bnh_12, n) -> bnh_12.a(atm_1.o, (int)n, true), bnh_12 -> bnh_12.ew().h(), bnh_12 -> bnh_12.a(atm_1.o, bkw_1.a().i(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().h()),
    i("costumeColor6", atm_1.p, (bnh_12, n) -> bnh_12.a(atm_1.p, (int)n, true), bnh_12 -> bnh_12.ew().i(), bnh_12 -> bnh_12.a(atm_1.p, bkw_1.a().j(bnh_12.gO(), bnh_12.gX(), bnh_12.bY()), true), bnh_12 -> bkw_1.a().i());

    private final String j;
    private final atm_1 k;
    private final BiConsumer<bnh_1, Integer> l;
    private final Function<bnh_1, Integer> m;
    private final Consumer<bnh_1> n;
    private final Function<bnh_1, String> o;

    private boh_2(String string2, atm_1 atm_12, BiConsumer<bnh_1, Integer> biConsumer, Function<bnh_1, Integer> function, Consumer<bnh_1> consumer, Function<bnh_1, String> function2) {
        this.j = string2;
        this.k = atm_12;
        this.l = biConsumer;
        this.m = function;
        this.n = consumer;
        this.o = function2;
    }

    public String a() {
        return this.j;
    }

    public atm_1 b() {
        return this.k;
    }

    public void a(bnh_1 bnh_12, int n) {
        this.l.accept(bnh_12, n);
    }

    public int a(bnh_1 bnh_12) {
        return this.m.apply(bnh_12);
    }

    public void b(bnh_1 bnh_12) {
        this.n.accept(bnh_12);
    }

    public String c(bnh_1 bnh_12) {
        return this.o.apply(bnh_12);
    }

    public static Optional<boh_2> a(String string) {
        for (boh_2 boh_22 : boh_2.values()) {
            if (!boh_22.j.equalsIgnoreCase(string)) continue;
            return Optional.of(boh_22);
        }
        return Optional.empty();
    }
}

