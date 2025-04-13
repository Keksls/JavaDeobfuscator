/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class eFF {
    private static final Logger a = Logger.getLogger(eFF.class);
    private static final eFF b = new eFF();
    private final TIntObjectHashMap<eFy> c = new TIntObjectHashMap();

    public static eFF a() {
        return b;
    }

    private eFF() {
        this.a(eFD.ad());
        this.a(eFH.ai());
        this.a(eFI.ai());
        this.a(eFJ.ai());
        this.a(eFC.ai());
        this.a(efl_0.ai());
        this.a(efm_0.ai());
        this.a(eFN.ad());
        this.a(eFO.ad());
        this.a(eFP.ad());
        this.a(eFQ.ai());
        this.a(eFG.ad());
        this.a(eFK.ai());
    }

    void a(eFy eFy2) {
        if (this.c.containsKey(eFy2.i())) {
            throw new IllegalArgumentException("On ne peut pas ajouter un defaultEffect alors qu'un autre est deja enregistr\u00e9 avec le meme id");
        }
        this.c.put(eFy2.i(), (Object)eFy2);
    }

    public boolean a(int n) {
        return this.c.containsKey(n);
    }

    public eFy b(int n) {
        return (eFy)this.c.get(n);
    }
}

