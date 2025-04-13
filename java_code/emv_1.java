/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eMV
 */
public final class emv_1
implements emw_1 {
    private static final Logger a = Logger.getLogger(emv_1.class);

    @Override
    public boolean a(els_0<? extends epq_2> els_02) {
        boolean bl = false;
        boolean bl2 = false;
        TByteHashSet tByteHashSet = new TByteHashSet();
        Collection<? extends epq_2> collection = els_02.ar();
        for (epq_2 epq_22 : collection) {
            if (epq_22.Y() == -1) {
                a.error((Object)els_02.a("[FIGHT_REFACTOR] On a un fighter inPlay avec un teamId \u00e0 -1 " + epq_22 + " - " + aho_2.a(8)));
                continue;
            }
            tByteHashSet.add(epq_22.Y());
            if (!(bl2 |= epq_22.gY() == 0 || epq_22.gY() == 5) || !(bl |= tByteHashSet.size() >= els_02.ai())) continue;
            break;
        }
        return bl && bl2;
    }

    @Override
    public byte b(els_0<? extends epq_2> els_02) {
        HashSet<Byte> hashSet = new HashSet<Byte>();
        HashSet<Byte> hashSet2 = new HashSet<Byte>();
        HashSet<Byte> hashSet3 = new HashSet<Byte>();
        for (epq_2 epq_22 : els_02.j()) {
            boolean bl;
            boolean bl2;
            if (epq_22.f(eoz_1.au)) continue;
            if (epq_22.Y() == -1) {
                a.error((Object)els_02.a("Fighter " + epq_22 + " has team id -1"));
                continue;
            }
            boolean bl3 = bl2 = epq_22.o() || epq_22.f(eoz_1.aF);
            if (bl2) {
                hashSet2.add(epq_22.Y());
            }
            boolean bl4 = bl = epq_22.gY() == 0 || epq_22.gY() == 5;
            if (bl) {
                hashSet.add(epq_22.Y());
            }
            if (!bl2 || !bl) continue;
            hashSet3.add(epq_22.Y());
        }
        if (hashSet2.isEmpty()) {
            a.error((Object)els_02.c("No teams still have in play fighters at the end of the fight, so this fight has no winner"));
            return -1;
        }
        if (hashSet2.size() == 1) {
            return (Byte)hashSet2.iterator().next();
        }
        if (hashSet.isEmpty()) {
            a.error((Object)els_02.c("Impossible case : this fight does not contain any players"));
            return -1;
        }
        Iterator<epq_2> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            byte by = (Byte)((Object)iterator.next());
            if (hashSet3.contains(by)) continue;
            hashSet2.remove(by);
        }
        if (hashSet2.size() == 1) {
            return (Byte)hashSet2.iterator().next();
        }
        a.error((Object)els_02.c("The fight is over but has either no alive player teams or more than 1 (teamWithInPlayerFighters=" + Arrays.toString(hashSet2.toArray()) + ")"));
        return -1;
    }
}

