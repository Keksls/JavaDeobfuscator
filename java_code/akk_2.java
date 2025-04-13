/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.JavaFunction
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKk
 */
public abstract class akk_2
extends JavaFunction
implements hs_1 {
    private static final Logger a = Logger.getLogger(akk_2.class);
    private static final int b = -1;
    protected int e = 0;
    private final akf_1[] c = this.e();
    private final akf_1[] d = this.f();

    public akk_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String b() {
        return "NO Description... Please Dev, implement me!";
    }

    public Collection<akf_1> c() {
        Object[] objectArray = this.e();
        return objectArray != null ? Lists.newArrayList((Object[])objectArray) : Lists.newArrayList();
    }

    public Collection<akf_1> d() {
        Object[] objectArray = this.f();
        return objectArray != null ? Lists.newArrayList((Object[])objectArray) : Lists.newArrayList();
    }

    @Nullable
    public abstract akf_1[] e();

    @Nullable
    public abstract akf_1[] f();

    public final void i() {
        assert (this.a() != null);
        super.register(this.a());
    }

    public final int execute() {
        int n;
        this.e = 0;
        int n2 = this.h();
        if (n2 >= 0) {
            try {
                this.a(n2);
            }
            catch (LuaException luaException) {
                throw this.b(luaException.toString());
            }
        } else {
            this.a(a, "Fonction " + this.getClass().getSimpleName() + " non ex\u00e9cut\u00e9e");
        }
        int n3 = n = this.d == null ? 0 : this.d.length;
        if (n != this.e) {
            boolean bl = this.g();
            if (this.e < n && !bl) {
                this.a(a, " nombre de valeur de retour incorrect (attendu " + (bl ? ">=" : "") + n + " lu: " + this.e + " )");
            }
        }
        return this.e;
    }

    private boolean g() {
        return this.d[this.d.length - 1].e() == akg_2.h;
    }

    final String j() {
        try {
            return this.m().j();
        }
        catch (LuaException luaException) {
            a.error((Object)"No script", (Throwable)luaException);
            return "<inconnu>";
        }
    }

    final String k() {
        try {
            return this.m().l();
        }
        catch (LuaException luaException) {
            a.error((Object)"No script", (Throwable)luaException);
            return "-1";
        }
    }

    private LuaException b(String string) {
        return new LuaException(this.c(string));
    }

    private String c(String string) {
        String string2 = "<inconnu>";
        try {
            string2 = this.m().j();
        }
        catch (Exception exception) {
            a.warn((Object)"pas de script associ? a cette fonction");
        }
        return "fichier=" + string2 + " ligne=" + this.k() + " " + string;
    }

    protected final void a(Logger logger, String string) {
        String string2 = this.j();
        String string3 = this.k();
        String string4 = String.format("[LUA] (%s:%s) %s", string2, string3, string);
        logger.error((Object)string4, (Throwable)new alp_2(string2, string3, string4));
    }

    protected abstract void a(int var1);

    private int h() {
        akf_1[] akf_1Array = this.c;
        if (akf_1Array == null) {
            return this.b(0, 0);
        }
        int n = 0;
        int n2 = 0;
        for (int k = 0; k < akf_1Array.length; ++k) {
            ++n2;
            if (!akf_1Array[k].d()) {
                ++n;
            }
            if (akf_1Array[k].e() != akg_2.h) continue;
            n2 = Integer.MAX_VALUE;
        }
        if (n2 < n) {
            n2 = n;
        }
        return this.b(n, n2);
    }

    private int b(int n, int n2) {
        assert (n <= n2);
        int n3 = this.L.getTop() - 1;
        if (n3 >= n && n3 <= n2) {
            for (int k = 0; k < n; ++k) {
                if (this.b(k)) continue;
                return -k - 1;
            }
            return n3;
        }
        String string = n == n2 ? String.format("(attendu: %d, lu: %d)", n, n3) : (n2 == Integer.MAX_VALUE ? String.format("(attendu au moins: %d, lu: %d)", n, n3) : String.format("(attendu: %d-%d, lu: %d)", n, n2, n3));
        this.a(a, "nombre de param?tre incorrect " + string);
        return -1;
    }

    private boolean b(int n) {
        assert (n >= 0);
        akf_1[] akf_1Array = this.c;
        if (akf_1Array == null) {
            this.a(a, "La fonction n'attend pas de param?tre");
            return false;
        }
        if (n < akf_1Array.length) {
            akg_2 akg_22 = akf_1Array[n].e();
            if (this.L.isNil(n + 2)) {
                this.a(a, " param?tre " + n + " est null");
                return false;
            }
            if (!akg_22.a(this.L, n + 2)) {
                String string = String.format("mauvais type d'argument #%d: (definition: %s, fonction:%s)", n, akg_22, this.L.typeName(this.L.type(n + 2)));
                this.a(a, string);
                return false;
            }
        }
        return true;
    }

    public akr_2[] a(int n, int n2) {
        int n3 = n2 - n;
        if (n3 <= 0) {
            return null;
        }
        akr_2[] akr_2Array = new akr_2[n3];
        for (int k = 0; k < n3; ++k) {
            int n4 = n + k + 2;
            akr_2Array[k] = akr_2.a(this.L, n4);
        }
        return akr_2Array;
    }

    public final int d(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (int)((Long)this.L.toJavaObject(n + 2)).longValue();
        }
        return this.L.toInteger(n + 2);
    }

    public final double e(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (Double)this.L.toJavaObject(n + 2);
        }
        return this.L.toNumber(n + 2);
    }

    public final float f(int n) {
        return (float)this.e(n);
    }

    public final long g(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (Long)this.L.toJavaObject(n + 2);
        }
        if (this.L.isNumber(n + 2)) {
            return (long)this.L.toNumber(n + 2);
        }
        return 0L;
    }

    protected final Object h(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return this.L.toJavaObject(n + 2);
        }
        return null;
    }

    public final String i(int n) {
        assert (n >= 0);
        return this.L.toString(n + 2);
    }

    public final akr_2[] j(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        akr_2[] akr_2Array = new akr_2[this.L.objLen(n2)];
        for (int k = 0; k < akr_2Array.length; ++k) {
            this.L.pushNumber((double)(k + 1));
            this.L.getTable(n2);
            akr_2Array[k] = akr_2.a(this.L, -1);
            this.L.pop(1);
        }
        return akr_2Array;
    }

    public final String k(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return this.L.toJavaObject(n + 2).toString();
        }
        return this.L.toString(n + 2);
    }

    public final boolean l(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (Boolean)this.L.toJavaObject(n + 2);
        }
        return this.L.toBoolean(n + 2);
    }

    public boolean m(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isTable(n2);
    }

    public boolean n(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isNumber(n2);
    }

    public boolean o(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isString(n2);
    }

    public boolean p(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isBoolean(n2);
    }

    private void a(akg_2 akg_22) {
        assert (akg_22 != null);
        if (this.d == null) {
            return;
        }
        if (this.e >= this.d.length - 1 && this.g()) {
            return;
        }
        akg_2 akg_23 = this.d[this.e].e();
        if (!akg_23.a(akg_22)) {
            throw this.b("Type de valeur de retour incorrecte :" + akg_23 + "attendue: " + akg_22);
        }
    }

    protected final void a(boolean bl) {
        this.a(akg_2.f);
        this.L.pushBoolean(bl);
        ++this.e;
    }

    protected final void q(int n) {
        this.a(akg_2.d);
        this.L.pushNumber((double)n);
        ++this.e;
    }

    protected final void a(Object object) {
        this.a(akg_2.a);
        this.L.pushJavaObject(object);
        ++this.e;
    }

    protected final void a(float f2) {
        this.a(akg_2.e);
        this.L.pushNumber((double)f2);
        ++this.e;
    }

    protected final void b(long l) {
        this.a(akg_2.b);
        this.L.pushObjectValue((Object)l);
        ++this.e;
    }

    protected final void a(double d2) {
        this.a(akg_2.e);
        this.L.pushNumber(d2);
        ++this.e;
    }

    protected final void a(byte[] byArray) {
        this.a(akg_2.c);
        this.L.pushString(byArray);
        ++this.e;
    }

    protected final void a(String string) {
        this.a(akg_2.c);
        this.L.pushString(string);
        ++this.e;
    }

    protected final void l() {
        this.L.pushNil();
        ++this.e;
    }

    protected final akx_2 m() {
        assert (this.L != null);
        this.L.getGlobal("script");
        akx_2 akx_22 = (akx_2)this.L.toJavaObject(-1);
        this.L.pop(1);
        return akx_22;
    }
}

