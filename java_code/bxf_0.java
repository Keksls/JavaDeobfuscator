/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXF
 */
class bxf_0
extends akk_2 {
    public bxf_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "runOnItemEquipped";
    }

    @Override
    public String b() {
        return "Run the method on an item equipment event with itemRefId <=> provided itemRefId. Unloaded after execution.";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("itemReferenceId", "Reference Id a ?couter", akg_2.d, false), new akf_1("funcName", "Focntion ? appeler", akg_2.c, false), new akf_1("params", "Param?tres de la fonction ? appeler", akg_2.h, true)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        bym_0 bym_02 = new bym_0(n2);
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        akx_2 akx_22 = this.m();
        aln_2.a().a(bym_02, akx_22, string, akr_2Array, true);
    }
}

