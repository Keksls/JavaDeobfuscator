/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJJ
 */
public class bjj_1
extends eyt_0 {
    private final Map<Long, exk_2> d = new HashMap<Long, exk_2>();
    private final Map<Long, exk_2> e = new HashMap<Long, exk_2>();

    private bjj_1() {
    }

    public static bjj_1 a(eyt_0 eyt_02) {
        bjj_1 bjj_12 = new bjj_1();
        bjj_12.b = eyt_02.c();
        bjj_12.c.putAll(eyt_02.a());
        return bjj_12;
    }

    @Override
    public boolean a(@NotNull exk_2 exk_22) {
        long l = exk_22.a();
        if (this.e.containsKey(l)) {
            this.e.remove(l);
        } else {
            this.d.put(l, exk_22);
        }
        return true;
    }

    @Override
    public boolean a(long l, @Nullable ezn_0 ezn_02) {
        if (this.e.containsKey(l)) {
            return this.a(this.e.get(l));
        }
        Object t = euw_2.a.d(this.b);
        if (t == null) {
            return false;
        }
        Object t2 = euu_2.c(((epq_2)t).U_(), l);
        if (t2 == null) {
            return false;
        }
        exk_2 exk_22 = ((epq_2)t2).dS().i(l);
        if (exk_22 != null) {
            return this.a(exk_22);
        }
        return false;
    }

    @Override
    public Optional<exk_2> a(Long l) {
        if (this.d.containsKey(l)) {
            return Optional.of(this.d.remove(l));
        }
        if (!this.c.containsKey(l)) {
            return Optional.empty();
        }
        exk_2 exk_22 = (exk_2)this.c.get(l);
        this.e.put(l, exk_22);
        return Optional.of(exk_22);
    }

    @Override
    public Optional<exk_2> b(Long l) {
        if (this.c.containsKey(l)) {
            return Optional.ofNullable((exk_2)this.c.get(l));
        }
        return Optional.ofNullable(this.d.get(l));
    }

    @Override
    public boolean c(Long l) {
        return this.c.containsKey(l) && !this.e.containsKey(l) || this.d.containsKey(l);
    }

    @Override
    public boolean d(Long l) {
        return this.c.containsKey(l);
    }

    @Override
    public void b(eyt_0 eyt_02) {
        eyt_02.a().forEach((l, exk_22) -> this.d.remove(l));
        this.e.keySet().removeIf(l -> !eyt_02.c((Long)l));
        super.b(eyt_02);
    }

    public String toString() {
        return "TemporaryEquipmentInventory(m_temporarilyAddedItems=" + this.d + ", m_temporarilyRemovedItems=" + this.e + ")";
    }
}

