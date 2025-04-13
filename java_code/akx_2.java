/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaObject
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKx
 */
public class akx_2 {
    static final Logger b = Logger.getLogger(akx_2.class);
    private static final int c = -1;
    final int d;
    akz_1 e;
    int f;
    String g;
    private akr_1[] h;
    int i = 0;
    final LuaState j;
    private boolean k = false;
    private final TIntObjectHashMap<akc_1> l = new TIntObjectHashMap();
    private final ConcurrentLinkedQueue<akb_2> m = new ConcurrentLinkedQueue();
    private final ArrayList<ake_1> n = new ArrayList();
    private boolean o = false;
    private Integer p;
    private ArrayList<Object> q;

    akx_2(int n, LuaState luaState, akr_1[] akr_1Array) {
        assert (luaState != null);
        this.d = n;
        this.j = luaState;
        this.e = akz_1.a;
        this.j.openBase();
        this.j.openMath();
        this.j.openTable();
        this.j.openOs();
        this.j.openString();
        this.i = 0;
        this.h = akr_1Array;
    }

    void a(akr_1 ... akr_1Array) {
        if (akr_1Array != null) {
            for (akr_1 akr_12 : akr_1Array) {
                try {
                    akr_12.c(this.j);
                }
                catch (Exception exception) {
                    b.error((Object)exception);
                }
            }
        }
    }

    private void q() {
        if (!this.j.isClosed()) {
            this.j.close();
        }
        this.e = akz_1.f;
        for (int k = 0; k < this.n.size(); ++k) {
            this.n.get(k).a(this);
        }
    }

    void a(LuaState luaState, akd_2 akd_22) {
        String string = null;
        if (!luaState.isClosed() && luaState.getTop() >= 1 && luaState.isString(-1)) {
            string = luaState.toString(-1);
            luaState.pop(1);
        }
        if (string == null) {
            string = "";
        }
        for (int k = 0; k < this.n.size(); ++k) {
            this.n.get(k).a(this, akd_22, string);
        }
        this.f();
    }

    public final void a() {
        if (this.m.isEmpty() && this.l.isEmpty()) {
            this.q();
        }
    }

    public final void b() {
        if (this.m.isEmpty() && this.l.isEmpty()) {
            this.e = akz_1.d;
        }
    }

    final boolean c() {
        return this.o;
    }

    final void a(boolean bl) {
        this.o = bl;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.f;
    }

    public final void f() {
        this.k = true;
    }

    public final akb_2 a(int n, int n2, String string, akr_2[] akr_2Array) {
        if (this.e == akz_1.d) {
            this.e = akz_1.c;
        }
        akb_2 akb_22 = new akb_2(this, n, n2, string, akr_2Array);
        this.m.add(akb_22);
        return akb_22;
    }

    public final int a(String string, akr_2[] akr_2Array) {
        if (this.e == akz_1.d) {
            this.e = akz_1.c;
        }
        akc_1 akc_12 = new akc_1(this, string, akr_2Array);
        this.l.put(akc_12.b(), (Object)akc_12);
        return akc_12.b();
    }

    public final boolean a(aka_2 aka_22) {
        if (aka_22 instanceof akc_1) {
            this.l.remove(aka_22.b());
            return true;
        }
        return aka_22 instanceof akb_2 && this.m.remove(aka_22);
    }

    public final boolean a(int n) {
        if (this.l.remove(n) != null) {
            return true;
        }
        Iterator<akb_2> iterator = this.m.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().b() != n) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    final akz_1 g() {
        return this.e;
    }

    final void a(String string) {
        if (string != null && this.j.LloadString(string) == 0) {
            this.e = akz_1.b;
        } else {
            this.a(this.j, akd_2.a);
        }
    }

    public void a(String string, byte[] byArray) {
        this.g = string;
        if (string != null && this.j.LloadBuffer(byArray, string) == 0) {
            this.e = akz_1.b;
        } else {
            this.a(this.j, akd_2.a);
        }
    }

    final void a(String string, boolean bl) {
        this.g = string;
        if (string != null && this.j.LloadFile(string) == 0) {
            this.e = akz_1.b;
        } else {
            this.a(this.j, akd_2.a);
        }
    }

    final void a(Map<String, Object> map) {
        if (this.e == akz_1.b) {
            if (map != null) {
                for (Map.Entry<String, Object> object : map.entrySet()) {
                    try {
                        this.j.pushObjectValue(object.getValue());
                        this.j.setGlobal(object.getKey());
                    }
                    catch (LuaException ake_12) {
                        b.error((Object)"Impossible de d?finir une variable de contexte pour un script", (Throwable)ake_12);
                    }
                }
            }
            int n = this.j.resume(0);
            this.e = akz_1.e;
            for (ake_1 ake_12 : this.n) {
                ake_12.b(this);
            }
            if (n != 0) {
                this.a(this.j, akd_2.b);
            } else {
                this.a();
            }
        } else if (!this.k) {
            this.j.pushString("No file loaded");
            this.a(this.j, akd_2.c);
        }
    }

    public void b(int n) {
        akc_1 akc_12 = (akc_1)this.l.remove(n);
        if (akc_12 == null) {
            return;
        }
        akc_12.a();
    }

    public void c(int n) {
        this.l.remove(n);
    }

    public void h() {
        this.l.clear();
    }

    public void i() {
        this.l.clear();
        this.m.clear();
    }

    final void d(int n) {
        if (this.k) {
            switch (this.e) {
                case d: {
                    break;
                }
                case c: {
                    this.e = akz_1.d;
                    break;
                }
                default: {
                    this.n();
                    break;
                }
            }
        } else {
            this.f += n;
            switch (this.e) {
                case d: 
                case a: 
                case b: {
                    break;
                }
                case c: {
                    Iterator<akb_2> iterator = this.m.iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().c()) continue;
                        iterator.remove();
                    }
                    this.b();
                    break;
                }
                case e: {
                    Iterator<akb_2> iterator = this.m.iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().c()) continue;
                        iterator.remove();
                    }
                    this.a();
                    break;
                }
            }
        }
    }

    public String j() {
        return this.g;
    }

    public void b(String string) {
        this.g = string;
    }

    public LuaState k() {
        return this.j;
    }

    public akr_2 c(String string) {
        if (this.j.isClosed()) {
            b.error((Object)("Tente de r?cup?rer une variable (" + string + ") alors que le script est ferm?"));
            return null;
        }
        this.j.getGlobal(string);
        akr_2 akr_22 = null;
        try {
            akr_22 = akr_2.a(this.j, -1);
        }
        catch (LuaException luaException) {
            b.error((Object)("Variable " + string + " inconnue?"), (Throwable)luaException);
        }
        this.j.pop(1);
        return akr_22;
    }

    boolean r() {
        if (!this.j.isFunction(-1) && !this.j.isJavaFunction(-1)) {
            this.j.Lwhere(1);
            this.j.pop(1);
            return false;
        }
        return true;
    }

    public final akr_2[] a(String string, akr_2[] akr_2Array, akq_1 ... akq_1Array) {
        int n;
        if (this.e == akz_1.a || this.e == akz_1.f) {
            b.error((Object)("Script should be load before calling the function : " + string + ", m_state = " + this.e + ", m_source = " + this.g));
            return null;
        }
        if (this.e == akz_1.b) {
            this.j.resume(0);
            this.e = akz_1.c;
        }
        if (akq_1Array != null) {
            for (int k = 0; k < akq_1Array.length; ++k) {
                if (akq_1Array[k] == null) continue;
                akq_1Array[k].a(this.j);
            }
        }
        if (string.contains(".")) {
            String[] stringArray = StringUtils.split((String)string, (String)"\\.");
            this.j.pushString(stringArray[0]);
            this.j.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
            if (!this.j.isTable(-1)) {
                b.error((Object)(stringArray[0] + " n'est pas une librairie connue"));
                this.j.remove(-1);
                switch (this.e) {
                    case e: {
                        this.a();
                        break;
                    }
                    case c: {
                        this.b();
                    }
                }
                return null;
            }
            this.j.pushString(stringArray[1]);
            this.j.getTable(-2);
            this.j.remove(-2);
        } else {
            this.j.getGlobal(string);
        }
        if (!this.r()) {
            b.error((Object)("Fonction inconnue " + string + " dans le script " + this.g + " ligne " + this.l()), (Throwable)new Exception());
            return null;
        }
        int n2 = 0;
        if (akr_2Array != null) {
            n2 = akr_2Array.length;
            for (n = 0; n < n2; ++n) {
                if (akr_2Array[n] == null) {
                    this.j.pushNil();
                    continue;
                }
                akr_2Array[n].a(this.j);
            }
        }
        if (this.j.pcall(n2, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
            this.a(this.j, akd_2.b);
        }
        n = this.j.getTop();
        akr_2[] akr_2Array2 = new akr_2[n];
        for (int k = 0; k < n; ++k) {
            try {
                akr_2Array2[k] = akr_2.a(this.j, -1);
            }
            catch (LuaException luaException) {
                b.error((Object)("Error retrieving a function(" + string + ") result : " + luaException));
            }
            this.j.pop(1);
        }
        return akr_2Array2;
    }

    public String l() {
        String[] stringArray;
        this.j.Lwhere(1);
        String string = this.j.toString(-1);
        this.j.pop(1);
        if (string != null && string.length() > 0 && (stringArray = StringUtils.split((String)string, (char)':')).length > 1) {
            string = stringArray[1];
        }
        return string;
    }

    public void d(String string) {
        this.a(string, null, new akq_1[0]);
    }

    public boolean a(ake_1 ake_12) {
        return this.n.add(ake_12);
    }

    public final void m() {
        this.n.clear();
    }

    public final boolean b(ake_1 ake_12) {
        return this.n.contains(ake_12);
    }

    public final boolean c(ake_1 ake_12) {
        return this.n.remove(ake_12);
    }

    public final void n() {
        this.m.clear();
        this.l.clear();
        this.a();
    }

    public int o() {
        if (this.p == null) {
            this.p = -1;
            LuaObject luaObject = this.j.getLuaObject("fightId");
            if (luaObject != null) {
                if (luaObject.isNumber()) {
                    this.p = (int)luaObject.getNumber();
                } else if (luaObject.isJavaObject()) {
                    try {
                        this.p = Integer.parseInt(luaObject.toString());
                    }
                    catch (NumberFormatException numberFormatException) {
                        b.error((Object)("Impossible de recuperer un id de combat sur un objet non transformable en entier : " + luaObject));
                    }
                }
            }
        }
        return this.p;
    }

    public akr_1[] p() {
        return this.h;
    }

    public void a(Object object) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(object);
    }

    public void a(TObjectProcedure<Object> tObjectProcedure) {
        if (this.q == null) {
            return;
        }
        int n = this.q.size();
        for (int k = 0; k < n; ++k) {
            if (tObjectProcedure.execute(this.q.get(k))) continue;
            return;
        }
    }
}

