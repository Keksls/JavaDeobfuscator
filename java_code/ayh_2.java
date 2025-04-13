/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.font.GlyphVector;

/*
 * Renamed from ayh
 */
class ayh_2 {
    final THashMap<String, ayg_1> a = new THashMap();
    final /* synthetic */ aya_1 b;

    ayh_2(aya_1 aya_12) {
        this.b = aya_12;
    }

    public void a(String string) {
        ayg_1 ayg_12 = (ayg_1)this.a.remove((Object)string);
        if (ayg_12 != null) {
            ayg_12.c();
        }
    }

    public void a() {
        this.a.forEachValue((TObjectProcedure)new ayi_1(this));
        this.a.clear();
    }

    public ayg_1 b(String string) {
        ayg_1 ayg_12 = (ayg_1)this.a.get((Object)string);
        if (ayg_12 == null) {
            GlyphVector glyphVector = ayv_1.a.a(string, this.b.w, this.b.j());
            ayg_12 = new ayg_1(this.b, string, glyphVector, this);
            this.a.put((Object)ayg_12.a(), (Object)ayg_12);
        }
        return ayg_12;
    }
}

