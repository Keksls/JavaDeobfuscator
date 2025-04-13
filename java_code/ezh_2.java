/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.function.Consumer;

/*
 * Renamed from ezh
 */
public final class ezh_2 {
    public static final ezh_2 a = new ezh_2();
    private final TIntObjectHashMap<ezv_2> b = new TIntObjectHashMap();

    private ezh_2() {
    }

    public void a(ezv_2 ezv_22) {
        this.a(ezv_22.b(), ezv_22);
    }

    public ezv_2 a(int n, ezv_2 ezv_22) {
        return (ezv_2)this.b.put(n, (Object)ezv_22);
    }

    public <T extends ezv_2> T a(int n) {
        return (T)((ezv_2)this.b.get(n));
    }

    public boolean b(int n) {
        return this.b.containsKey(n);
    }

    public void a(Consumer<ezv_2> consumer) {
        this.b.forEachValue(ezv_22 -> {
            consumer.accept((ezv_2)ezv_22);
            return true;
        });
    }

    public String toString() {
        return "AptitudeBonusModelManager{m_bonusById=" + this.b + "}";
    }
}

