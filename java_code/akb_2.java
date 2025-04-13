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
 * Renamed from aKB
 */
public final class akb_2
implements aka_2 {
    public final int a;
    private final int c;
    private int d;
    private int e;
    private final String f;
    private final akr_2[] g;
    private ArrayList<alk_2> h;
    final /* synthetic */ akx_2 b;

    akb_2(akx_2 akx_22, int n, int n2, String string, akr_2[] akr_2Array) {
        this.b = akx_22;
        this.c = n;
        this.d = akx_22.f + n;
        this.e = n2;
        this.f = string;
        this.g = akr_2Array;
        this.a = ++akx_22.i;
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public void a() {
        if (this.f.contains(".")) {
            String[] stringArray = StringUtils.split((String)this.f, (char)'.');
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
            this.b.j.pushString(this.f);
            this.b.j.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
        }
        if (this.b.r()) {
            int n = this.g == null ? 0 : this.g.length;
            for (int k = 0; k < n; ++k) {
                this.g[k].a(this.b.j);
            }
            if (this.b.j.pcall(n, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
                this.b.a(this.b.j, akd_2.b);
            }
        } else {
            akx_2.b.error((Object)("Fonction inconnue " + this.f + " dans le script " + this.b.g));
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

    boolean c() {
        if (this.b.f >= this.d) {
            this.a();
            if (this.e == -1) {
                this.d += this.c;
            } else {
                --this.e;
                if (this.e > 0) {
                    this.d += this.c;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}

