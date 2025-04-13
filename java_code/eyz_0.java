/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eYZ
 */
public class eyz_0 {
    protected static final Logger a = Logger.getLogger(eyz_0.class);
    private final Map<exh_2, Long> c = new EnumMap<exh_2, Long>(exh_2.class);
    protected final List<eZa> b = new ArrayList<eZa>();
    private final List<Uo> d = new ArrayList<Uo>();
    private short e;
    private boolean f = false;

    public void a(exh_2 exh_22, Long l) {
        this.c.put(exh_22, l);
        for (eZa eZa2 : this.b) {
            try {
                eZa2.a(exh_22, l);
            }
            catch (Exception exception) {
                a.error((Object)("[Builds] An error occurred while calling onItemChanged of listener of class " + eZa2.getClass().getSimpleName()), (Throwable)exception);
            }
        }
    }

    @Nullable
    public Long a(exh_2 exh_22) {
        return this.c.get(exh_22);
    }

    @Nullable
    public exh_2 a(long l) {
        for (Map.Entry<exh_2, Long> entry : this.c.entrySet()) {
            if (entry.getValue() != l) continue;
            return entry.getKey();
        }
        return null;
    }

    public Long b(exh_2 exh_22) {
        return this.a(exh_22, (ezn_0)null);
    }

    public Long a(exh_2 exh_22, @Nullable ezn_0 ezn_02) {
        Long l = this.c.get(exh_22);
        this.a(l, ezn_02);
        return l;
    }

    @Nullable
    public exh_2 a(Long l) {
        return this.a(l, null);
    }

    @Nullable
    public exh_2 a(Long l, @Nullable ezn_0 ezn_02) {
        if (l == null || l == 0L) {
            return null;
        }
        exh_2 exh_22 = this.a((long)l);
        if (exh_22 == null) {
            return null;
        }
        this.c.remove(exh_22);
        for (eZa eZa2 : this.b) {
            try {
                eZa2.a(exh_22, l, ezn_02);
            }
            catch (Exception exception) {
                a.error((Object)("[Builds] An error occurred while calling onItemRemoved of listener of class " + eZa2.getClass().getSimpleName()), (Throwable)exception);
            }
        }
        return exh_22;
    }

    @Nullable
    public exk_2 a(eyt_0 eyt_02, int n) {
        for (Map.Entry<exh_2, Long> entry : this.c.entrySet()) {
            Optional<exk_2> optional = eyt_02.b(entry.getValue());
            if (!optional.isPresent() || optional.get().aT_() != n) continue;
            return optional.get();
        }
        return null;
    }

    public List<exk_2> b(eyt_0 eyt_02, int n) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        for (Map.Entry<exh_2, Long> entry : this.c.entrySet()) {
            Optional<exk_2> optional = eyt_02.b(entry.getValue());
            if (!optional.isPresent() || optional.get().aT_() != n) continue;
            arrayList.add(optional.get());
        }
        return arrayList;
    }

    @Nullable
    public exk_2 a(eyt_0 eyt_02, exh_2 exh_22) {
        Optional<exk_2> optional = eyt_02.b(this.a(exh_22));
        return optional.orElse(null);
    }

    public Map<exh_2, Long> a() {
        return this.c;
    }

    public eyz_0 b() {
        eyz_0 eyz_02 = new eyz_0();
        eyz_02.e = this.e;
        eyz_02.c.clear();
        eyz_02.c.putAll(this.c);
        return eyz_02;
    }

    public void a(eyz_0 eyz_02) {
        this.e = eyz_02.e;
        this.c.clear();
        this.c.putAll(eyz_02.c);
    }

    public void b(eyz_0 eyz_02) {
        this.c.clear();
        this.c.putAll(eyz_02.c);
    }

    public void a(short s2) {
        this.e = s2;
        for (eZa eZa2 : this.b) {
            try {
                eZa2.a(this);
            }
            catch (Exception exception) {
                a.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    public short c() {
        return this.e;
    }

    public boolean a(epq_2 epq_22) {
        if (epq_22 == null) {
            return false;
        }
        return this.e <= epq_22.dt() - 1;
    }

    public void a(eZa eZa2) {
        if (!this.b.contains(eZa2)) {
            this.b.add(eZa2);
        }
    }

    public boolean a(exk_2 exk_22) {
        if (exk_22 == null) {
            return false;
        }
        return this.b(exk_22.a());
    }

    public boolean b(long l) {
        return this.c.containsValue(l);
    }

    public void b(eZa eZa2) {
        this.b.remove(eZa2);
    }

    public void a(Uo uo) {
        this.d.add(uo);
    }

    public void b(Uo uo) {
        this.d.remove(uo);
    }

    public void a(Uk uk) {
        for (Uo uo : this.d) {
            try {
                uo.a(uk);
            }
            catch (Exception exception) {
                a.error((Object)("Error during process of inventory event " + uk + " with observer " + uo), (Throwable)exception);
            }
        }
    }

    public boolean c(eyz_0 eyz_02) {
        return this.e != eyz_02.e || !this.c.equals(eyz_02.c);
    }

    public String toString() {
        return "EquipmentSheet{m_items=" + this.c + ", m_level=" + this.e + "}";
    }

    public boolean d() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }
}

