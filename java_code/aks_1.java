/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aGp$aGs
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 *  org.keplerproject.luajava.LuaStateFactory
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/*
 * Renamed from aKs
 */
public class aks_1
extends agp_2<byte[]>
implements ake_1,
Runnable {
    private static final Logger i = Logger.getLogger((String)"LUA");
    private static final Logger j = Logger.getLogger(aks_1.class);
    public static final String a = "script";
    public static final String b = ".lua";
    public static final String c = "jar:file:";
    public static final String d = "!/";
    private static final int k = 0x200000;
    private static final int l = 30;
    public static final FilenameFilter g = new aku_2();
    private static final aks_1 m = new aks_1();
    private final TIntObjectHashMap<akx_2> n = new TIntObjectHashMap();
    private final List<ake_1> o = new ArrayList<ake_1>();
    private long p;
    private final TObjectProcedure<akx_2> q = new akt_2();
    private final akw_1 r = new akw_1(this);

    private aks_1() {
        super(0x200000L, true);
        ado_1.a().a(this, 30L);
    }

    public static aks_1 a() {
        return m;
    }

    @Override
    protected final agp_2.aGs b(byte[] byArray) {
        return new akv_1(this, byArray);
    }

    @Override
    public final String c() {
        return b;
    }

    @Override
    public final FilenameFilter d() {
        return g;
    }

    public final void a(ake_1 ake_12) {
        if (!this.o.contains(ake_12)) {
            this.o.add(ake_12);
        }
    }

    public final void b(ake_1 ake_12) {
        this.o.remove(ake_12);
    }

    public boolean b() {
        String string = this.e();
        if (!string.startsWith(c)) {
            return true;
        }
        string = string.substring(c.length());
        File file = new File(string = string.substring(0, string.length() - d.length()));
        return file.exists() && file.isFile() && file.canRead();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final akx_2 a(int n) {
        TIntObjectHashMap<akx_2> tIntObjectHashMap = this.n;
        synchronized (tIntObjectHashMap) {
            return (akx_2)this.n.get(n);
        }
    }

    String b(int n) {
        assert (this.e() != null);
        return String.format("%d%s", n, b);
    }

    public final akx_2 a(int n, akr_1[] akr_1Array, boolean bl) {
        assert (this.e() != null);
        return this.a(this.b(n), akr_1Array, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public akx_2 a(String string, akr_1[] akr_1Array, boolean bl) {
        String string2 = this.e() + string;
        akx_2 akx_22 = this.a(akr_1Array);
        akl_1.a.a(string, string2);
        akx_22.a(akl_1.a.b(string));
        akx_22.a(akr_1Array);
        try {
            akx_22.a(string, (byte[])this.c(string));
            akx_22.b(string);
            akx_22.a(bl);
        }
        catch (Exception exception) {
            j.warn((Object)("Impossible de charger le fichier " + string), (Throwable)exception);
            return null;
        }
        if (akx_22.g() != akz_1.b) {
            return null;
        }
        int n = akx_22.d();
        TIntObjectHashMap<akx_2> tIntObjectHashMap = this.n;
        synchronized (tIntObjectHashMap) {
            this.n.put(n, (Object)akx_22);
        }
        return akx_22;
    }

    public final akx_2 a(String string, @Nullable akr_1[] akr_1Array, @Nullable Map<String, Object> map, boolean bl) {
        akx_2 akx_22 = this.b(string, akr_1Array, bl);
        if (akx_22 != null) {
            akx_22.b("Command : " + string);
            akx_22.a(map);
        } else {
            j.error((Object)("Le Script de commande [" + string + "] n'existe pas"));
        }
        return akx_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private akx_2 b(String string, akr_1[] akr_1Array, boolean bl) {
        akx_2 akx_22 = this.a(akr_1Array);
        akx_22.a(akl_1.a.c(string));
        akx_22.a(string);
        akx_22.a(bl);
        if (akx_22.g() != akz_1.b) {
            return null;
        }
        int n = akx_22.d();
        TIntObjectHashMap<akx_2> tIntObjectHashMap = this.n;
        synchronized (tIntObjectHashMap) {
            this.n.put(n, (Object)akx_22);
        }
        return akx_22;
    }

    public final akx_2 a(String string, ake_1 ake_12) {
        return this.a(string, null, null, ake_12, false);
    }

    public final akx_2 a(String string) {
        return this.a(string, (akr_1[])null, (ake_1)null);
    }

    public final akx_2 a(String string, @Nullable ake_1 ake_12, boolean bl) {
        return this.a(string, null, null, ake_12, bl);
    }

    public final akx_2 a(String string, boolean bl) {
        return this.a(string, (ake_1)null, bl);
    }

    public final akx_2 a(int n, ake_1 ake_12) {
        return this.a(n, null, null, ake_12, false);
    }

    public final akx_2 c(int n) {
        return this.a(n, null, null);
    }

    public final akx_2 a(int n, @Nullable ake_1 ake_12, boolean bl) {
        return this.a(n, null, null, ake_12, bl);
    }

    public final akx_2 a(int n, boolean bl) {
        return this.a(n, (ake_1)null, bl);
    }

    public final akx_2 a(int n, @Nullable akr_1[] akr_1Array, @Nullable ake_1 ake_12) {
        return this.a(n, akr_1Array, null, ake_12, false);
    }

    public final akx_2 a(int n, @Nullable akr_1[] akr_1Array, @Nullable Map<String, Object> map, @Nullable ake_1 ake_12, boolean bl) {
        assert (this.e() != null);
        return this.a(this.b(n), akr_1Array, map, ake_12, bl);
    }

    public final akx_2 a(int n, akr_1[] akr_1Array, Map<String, Object> map, boolean bl) {
        return this.a(n, akr_1Array, map, null, bl);
    }

    public final akx_2 a(String string, @Nullable akr_1[] akr_1Array, @Nullable ake_1 ake_12) {
        return this.a(string, akr_1Array, null, ake_12, false);
    }

    public final akx_2 a(String string, akr_1 ... akr_1Array) {
        return this.a(string, akr_1Array, (ake_1)null);
    }

    public final akx_2 a(String string, @Nullable akr_1[] akr_1Array, @Nullable Map<String, Object> map, ake_1 ake_12, boolean bl) {
        akx_2 akx_22 = this.a(string, akr_1Array, bl);
        if (akx_22 != null) {
            if (ake_12 != null) {
                akx_22.a(ake_12);
            }
            akx_22.a(map);
        } else {
            j.warn((Object)("Script [" + string + "] does not exist"));
        }
        return akx_22;
    }

    public final void d(int n) {
        akx_2 akx_22 = this.a(n);
        if (akx_22 != null) {
            akx_22.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final int g() {
        int n = 1;
        TIntObjectHashMap<akx_2> tIntObjectHashMap = this.n;
        synchronized (tIntObjectHashMap) {
            while (this.n.containsKey(n)) {
                ++n;
            }
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e(int n) {
        TIntObjectHashMap<akx_2> tIntObjectHashMap = this.n;
        synchronized (tIntObjectHashMap) {
            this.r.a(n);
            this.n.forEachEntry((TIntObjectProcedure)this.r);
        }
    }

    void f(int n) {
        this.n.remove(n);
    }

    private akx_2 a(akr_1 ... akr_1Array) {
        LuaState luaState = LuaStateFactory.newLuaState();
        int n = this.g();
        akx_2 akx_22 = new akx_2(n, luaState, akr_1Array);
        akx_22.a(akr_1Array);
        akx_22.a(this);
        luaState.pushJavaObject((Object)akx_22);
        luaState.setGlobal(a);
        return akx_22;
    }

    public final void h() {
        ado_1.a().b(this);
    }

    @Override
    public final void run() {
        long l = System.currentTimeMillis();
        int n = (int)(l - this.p);
        this.e(n);
        this.p = l;
    }

    @Override
    public void a(akx_2 akx_22, akd_2 akd_22, String string) {
        for (int k = 0; k < this.o.size(); ++k) {
            assert (this.o.get(k) != null);
            this.o.get(k).a(akx_22, akd_22, string);
        }
        String string2 = akx_22.j();
        String string3 = akx_22.l();
        String string4 = String.format("[LUA] %s (%s) %s", new Object[]{akd_22, string2, string});
        if (!akx_22.c()) {
            i.error((Object)string4);
        }
        j.error((Object)string4, (Throwable)new alq_2(string2, string3, string4));
    }

    @Override
    public void a(akx_2 akx_22) {
        for (int k = 0; k < this.o.size(); ++k) {
            this.o.get(k).a(akx_22);
        }
    }

    @Override
    public void b(akx_2 akx_22) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        TIntObjectHashMap<akx_2> tIntObjectHashMap = this.n;
        synchronized (tIntObjectHashMap) {
            this.n.forEachValue(this.q);
            this.n.clear();
        }
    }
}

