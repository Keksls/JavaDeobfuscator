/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

public class bOl {
    public static final bOl a = new bOl();
    private final TIntObjectHashMap<bOk> b = new TIntObjectHashMap();

    private bOl() {
    }

    public void a(bOk bOk2) {
        this.b.put(bOk2.a(), (Object)bOk2);
    }

    public bOk a(int n) {
        return (bOk)this.b.get(n);
    }

    public boolean a(TObjectProcedure<bOk> tObjectProcedure) {
        return this.b.forEachValue(tObjectProcedure);
    }

    public int a() {
        return this.b.size();
    }

    public String toString() {
        return "SecretManager{m_secrets=" + this.b + "}";
    }
}

