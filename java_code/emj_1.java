/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eMJ
 */
public class emj_1
extends tg_0 {
    private static final Logger G = Logger.getLogger(emj_1.class);

    @Override
    protected int a(ti_0 ti_02) {
        if (ti_02 == null) {
            return -1;
        }
        byte by = ti_02.Z();
        if (!this.l.d(by)) {
            G.warn((Object)("On ne retrouve pas l'index de la cellule ou est situ\u00e9 l'obstacle " + by));
            return -1;
        }
        return this.l.c(by);
    }
}

