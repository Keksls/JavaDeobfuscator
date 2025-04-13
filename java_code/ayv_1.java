/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import org.apache.log4j.Logger;

/*
 * Renamed from ayv
 */
public class ayv_1 {
    static final Logger b = Logger.getLogger(ayv_1.class);
    public static final ayv_1 a = new ayv_1();
    final ayz_1 c = new ayz_1(this);
    private static final int d = 15000;
    private int e = 0;
    final THashMap<Font, THashMap<String, ayx_1>> f = new THashMap();

    private ayv_1() {
    }

    public GlyphVector a(char c2, Font font, FontRenderContext fontRenderContext) {
        return this.a(String.valueOf(c2), font, fontRenderContext);
    }

    public GlyphVector a(String string, Font font, FontRenderContext fontRenderContext) {
        ayx_1 ayx_12;
        THashMap tHashMap = (THashMap)this.f.get((Object)font);
        if (tHashMap == null) {
            tHashMap = new THashMap();
            this.f.put((Object)font, (Object)tHashMap);
        }
        if ((ayx_12 = (ayx_1)tHashMap.get((Object)string)) == null) {
            ayx_12 = ayx_1.a(font.createGlyphVector(fontRenderContext, string), string);
            tHashMap.put((Object)string, (Object)ayx_12);
        }
        ayx_12.a(true);
        return ayx_12.a();
    }

    public void a(int n) {
        this.e += n;
        if (this.e > 15000) {
            if (!this.f.isEmpty()) {
                this.f.forEachValue((TObjectProcedure)new ayw_1(this));
            }
            this.e = 0;
        }
    }
}

