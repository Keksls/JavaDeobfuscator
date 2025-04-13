/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eAm
 */
public class eam_0 {
    private static final Logger c = Logger.getLogger(eam_0.class);
    public static final eam_0 a = new eam_0();
    final TLongObjectHashMap<Queue<eal_0>> b = new TLongObjectHashMap();

    private eam_0() {
    }

    public void a(long l, @NotNull eal_0 eal_02) {
        LinkedList<eal_0> linkedList = (LinkedList<eal_0>)this.b.get(l);
        if (linkedList == null) {
            linkedList = new LinkedList<eal_0>();
            this.b.put(l, linkedList);
        }
        linkedList.offer(eal_02);
    }

    public void a(long l) {
        Queue queue = (Queue)this.b.remove(l);
        if (queue == null) {
            return;
        }
        while (!queue.isEmpty()) {
            ((eal_0)queue.poll()).a();
        }
    }
}

