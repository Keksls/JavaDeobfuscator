/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

public class aYv
extends aXj {
    private final int a;

    public aYv(int n) {
        this.a = n;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Optional<eco_0> optional = brs_0.a.b(this.a);
        if (optional.isEmpty()) {
            aVo.a().d(String.format("Recipe %s doesn't exist", this.a));
            return;
        }
        eco_0 eco_02 = optional.get();
        aVo.a().a(String.format("Materials of recipe (%s) : ", this.a));
        Map<Integer, Cm<Short, Short>> map = eco_02.r();
        map.forEach((n, cm) -> {
            short s2 = (Short)cm.a();
            aVo.a().a(String.format("Id : %s, name : %s, quantity : %s", n, ((ezr_0)eyo_1.g().d((int)n)).e(), s2));
        });
    }
}

