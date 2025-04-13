/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKR
 */
public final class akr_2 {
    private final Object a;
    private final akg_2 b;

    public akr_2(Object object) {
        if (object == null) {
            this.b = akg_2.i;
            this.a = object;
            return;
        }
        if (object instanceof String) {
            this.b = akg_2.c;
            this.a = object;
            return;
        }
        if (object instanceof Boolean) {
            this.b = akg_2.f;
            this.a = object;
            return;
        }
        if (object instanceof Double) {
            this.b = akg_2.e;
            this.a = object;
            return;
        }
        if (object instanceof Integer) {
            this.b = akg_2.d;
            this.a = object;
            return;
        }
        if (object instanceof Long) {
            this.b = akg_2.b;
            this.a = object;
            return;
        }
        if (object instanceof Float) {
            this.b = akg_2.e;
            this.a = ((Float)object).doubleValue();
            return;
        }
        if (object instanceof Short) {
            this.b = akg_2.d;
            this.a = ((Short)object).intValue();
            return;
        }
        if (object instanceof Byte) {
            this.b = akg_2.d;
            this.a = ((Byte)object).intValue();
            return;
        }
        if (object instanceof Character) {
            this.b = akg_2.c;
            this.a = ((Character)object).toString();
            return;
        }
        this.b = akg_2.a;
        this.a = object;
    }

    public akg_2 a() {
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public void a(LuaState luaState) {
        switch (this.a()) {
            case e: {
                luaState.pushNumber(((Double)this.b()).doubleValue());
                break;
            }
            case d: {
                luaState.pushNumber((double)((Integer)this.b()).intValue());
                break;
            }
            case f: {
                luaState.pushBoolean(((Boolean)this.b()).booleanValue());
                break;
            }
            case c: {
                luaState.pushString((String)this.b());
                break;
            }
            case a: 
            case b: {
                luaState.pushJavaObject(this.b());
                break;
            }
            case i: {
                luaState.pushNil();
            }
        }
    }

    public static akr_2 a(LuaState luaState, int n) {
        if (luaState.isNumber(n)) {
            return new akr_2(luaState.toNumber(n));
        }
        if (luaState.isBoolean(n)) {
            return new akr_2(luaState.toBoolean(n));
        }
        if (luaState.isString(n)) {
            return new akr_2(luaState.toString(n));
        }
        if (luaState.isObject(n)) {
            return new akr_2(luaState.toJavaObject(n));
        }
        if (luaState.isNil(n)) {
            return new akr_2(null);
        }
        throw new LuaException("Valeur de type inconnu dans un script Lua");
    }
}

