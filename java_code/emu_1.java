/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from eMU
 */
public final class emu_1
implements emw_1 {
    private static final Logger a = Logger.getLogger(emu_1.class);

    @Override
    public boolean a(els_0<? extends epq_2> els_02) {
        boolean bl = false;
        TByteHashSet tByteHashSet = new TByteHashSet();
        Collection<? extends epq_2> collection = els_02.ar();
        for (epq_2 epq_22 : collection) {
            if (epq_22.Y() == -1) {
                a.error((Object)els_02.a("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId \u00e0 -1 " + epq_22 + " - " + aho_2.a(8)));
                continue;
            }
            tByteHashSet.add(epq_22.Y());
            if (!(bl |= tByteHashSet.size() >= els_02.ai())) continue;
            break;
        }
        return bl;
    }
}

