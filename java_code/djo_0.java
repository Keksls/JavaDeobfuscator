/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djo
 */
class djo_0
extends akk_2 {
    djo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "characterDisplayerOpen";
    }

    @Override
    public String b() {
        return "Affiche une fenetre d'interface dans laquelle on place un perso";
    }

    @Override
    public akf_1[] e() {
        return dir_0.G;
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("id", null, akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = ++dir_0.bm;
        String string = dir_0.a(n2);
        fvE fvE2 = (fvE)fpm_0.b().a(string, cfi_0.a("emissaryTutoDialog"), (short)10000);
        String string2 = this.i(1);
        String string3 = this.i(0) + ".anm";
        String string4 = string2.substring(2);
        int n3 = Integer.parseInt(string2.substring(0, 1));
        fis_1.a().a("filePath", (Object)string3, string);
        fis_1.a().a("animName", (Object)string4, string);
        fis_1.a().a("direction", (Object)n3, string);
        frk_0 frk_02 = frk_0.valueOf(this.i(2));
        int n4 = this.d(3);
        int n5 = this.d(4);
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setAlign(frk_02);
        fid_12.setXOffset(n4);
        fid_12.setYOffset(n5);
        fvE2.add(fid_12);
        this.q(n2);
    }
}

