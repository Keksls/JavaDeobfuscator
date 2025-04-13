/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectLongHashMap
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.map.hash.TObjectLongHashMap;
import gnu.trove.procedure.TObjectIntProcedure;

/*
 * Renamed from aDl
 */
class adl_2
implements TObjectIntProcedure<String> {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ TObjectLongHashMap b;
    final /* synthetic */ TObjectLongHashMap c;
    final /* synthetic */ TObjectLongHashMap d;
    final /* synthetic */ String e;
    final /* synthetic */ adk_1 f;

    adl_2(adk_1 adk_12, StringBuilder stringBuilder, TObjectLongHashMap tObjectLongHashMap, TObjectLongHashMap tObjectLongHashMap2, TObjectLongHashMap tObjectLongHashMap3, String string) {
        this.f = adk_12;
        this.a = stringBuilder;
        this.b = tObjectLongHashMap;
        this.c = tObjectLongHashMap2;
        this.d = tObjectLongHashMap3;
        this.e = string;
    }

    public boolean a(String string, int n) {
        this.a.append(n).append(" x ").append(string).append(" - ").append(this.b.get((Object)string)).append(" / ").append(this.c.get((Object)string) / (long)n).append(" / ").append(this.d.get((Object)string)).append(this.e);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, int n) {
        return this.a((String)object, n);
    }
}

