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
 * Renamed from ayz
 */
class ayz_1
implements TObjectProcedure<ayx_1> {
    final /* synthetic */ ayv_1 a;

    ayz_1(ayv_1 ayv_12) {
        this.a = ayv_12;
    }

    public boolean a(ayx_1 ayx_12) {
        if (!ayx_12.b()) {
            GlyphVector glyphVector = ayx_12.a();
            THashMap tHashMap = (THashMap)this.a.f.get((Object)glyphVector.getFont());
            if (tHashMap != null) {
                tHashMap.remove((Object)ayx_12.c());
            }
            ayx_12.release();
        } else {
            ayx_12.a(false);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ayx_1)object);
    }
}

