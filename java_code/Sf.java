/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public class Sf {
    public static final Sf a = new Sf();
    private final TIntObjectHashMap<Sd> b = new TIntObjectHashMap();

    private Sf() {
    }

    public void a(Sd sd) {
        this.b.put(sd.c(), (Object)sd);
    }

    public <D extends Sd> D a(int n) {
        return (D)((Sd)this.b.get(n));
    }

    public String toString() {
        return "DialogManager{m_dialogs=" + this.b.size() + "}";
    }
}

