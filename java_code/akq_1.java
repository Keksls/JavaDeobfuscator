/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.HashMap;
import java.util.Map;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKQ
 */
public class akq_1 {
    private final String b;
    private final Map<String, Object> c = new HashMap<String, Object>();

    public akq_1() {
        this.b = null;
    }

    public akq_1(String string) {
        this.b = string;
    }

    public final void a(String string, Object object) {
        this.c.put(string, object);
    }

    public final String a() {
        return this.b;
    }

    public final void a(LuaState luaState) {
        assert (this.b != null);
        if (this.b.length() == 0) {
            for (Map.Entry<String, Object> entry : this.c.entrySet()) {
                new akr_2(entry.getValue()).a(luaState);
                luaState.setGlobal(entry.getKey());
            }
        } else {
            luaState.newTable();
            for (Map.Entry<String, Object> entry : this.c.entrySet()) {
                luaState.pushString(entry.getKey());
                new akr_2(entry.getValue()).a(luaState);
                luaState.setTable(-3);
            }
            luaState.setGlobal(this.b);
        }
    }
}

