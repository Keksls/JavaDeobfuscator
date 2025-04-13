/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aKC
 */
final class akc_1
implements aka_2 {
    public final int a;
    private final String c;
    private final akr_2[] d;
    private ArrayList<alk_2> e;
    final /* synthetic */ akx_2 b;

    akc_1(akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.b = akx_22;
        this.c = string;
        this.d = akr_2Array;
        this.a = ++akx_22.i;
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public void a() {
        if (this.b.j.isClosed()) {
            akx_2.b.error((Object)("Tentative d'execution d'une WaitingTask sur un script ferm? id=" + this.b.d));
            return;
        }
        if (this.c.contains(".")) {
            String[] stringArray = StringUtils.split((String)this.c, (char)'.');
            this.b.j.pushString(stringArray[0]);
            this.b.j.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
            if (!this.b.j.isTable(-1)) {
                akx_2.b.error((Object)(stringArray[0] + " n'est pas une librairie connue"));
                this.b.j.remove(-1);
                switch (this.b.e) {
                    case e: {
                        this.b.a();
                        break;
                    }
                    case c: {
                        this.b.b();
                    }
                }
                return;
            }
            this.b.j.pushString(stringArray[1]);
            this.b.j.getTable(-2);
            this.b.j.remove(-2);
        } else {
            this.b.j.pushString(this.c);
            this.b.j.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
        }
        if (this.b.r()) {
            int n = this.d == null ? 0 : this.d.length;
            for (int k = 0; k < n; ++k) {
                this.d[k].a(this.b.j);
            }
            if (this.b.j.pcall(n, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
                this.b.a(this.b.j, akd_2.b);
            }
        } else {
            akx_2.b.error((Object)("Fonction inconnue " + this.c + " dans le script " + this.b.g));
        }
        this.b.j.pop(this.b.j.getTop());
        switch (this.b.e) {
            case e: {
                this.b.a();
                break;
            }
            case c: {
                this.b.b();
            }
        }
    }
}

