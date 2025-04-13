/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJW
 */
class ajw_2
extends akk_2 {
    private static final akf_1[] a = new akf_1[]{new akf_1("filePath", "Path of the file to be loaded (must include .lua and the path is relative to ../src_content/script/)", akg_2.c, false)};

    ajw_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String a() {
        return "loadScript";
    }

    @Override
    public String b() {
        return "Load a script (functions and variables can be used from loader script)";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        String string2 = aks_1.a().e() + string;
        akx_2 akx_22 = this.m();
        akl_1.a.a(string, string2);
        akx_22.a(akl_1.a.b(string));
        akx_22.a(akl_1.a.b(akx_22.j()));
        this.L.LdoFile(string2);
    }
}

