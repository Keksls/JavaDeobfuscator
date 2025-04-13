/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fip
 */
public abstract class fip_0<Spell extends fin_0> {
    protected static fip_0 b = null;
    protected static final Logger c = Logger.getLogger(fip_0.class);
    protected final TIntObjectHashMap<Spell> d = new TIntObjectHashMap();
    protected final TLongObjectHashMap<fio_0<Spell>> e = new TLongObjectHashMap();

    protected fip_0() {
    }

    public static fip_0 d() {
        if (b == null) {
            throw new IllegalStateException("m_instance == null : pas d'instance de SpellManager concret");
        }
        return b;
    }

    public void a(Spell Spell) {
        this.d.put(((fin_0)Spell).i(), Spell);
    }

    protected TIntObjectHashMap<Spell> e() {
        return this.d;
    }

    @Nullable
    public Spell b(int n) {
        return (Spell)((fin_0)this.d.get(n));
    }

    public boolean f() {
        return this.d.isEmpty();
    }

    public abstract fio_0<Spell> b(int var1, short var2);

    public fio_0 a(long l) {
        return (fio_0)this.e.get(l);
    }
}

