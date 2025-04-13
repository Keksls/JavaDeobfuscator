/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  gnu.trove.map.hash.TObjectLongHashMap
 *  gnu.trove.procedure.TObjectIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import gnu.trove.map.hash.TObjectLongHashMap;
import gnu.trove.procedure.TObjectIntProcedure;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import org.apache.log4j.Logger;

/*
 * Renamed from aDk
 */
class adk_1
implements Runnable {
    private static final Logger a = Logger.getLogger(adk_1.class);
    private static final int b = 30;
    private final LinkedBlockingQueue<adt_1> c = new LinkedBlockingQueue();

    adk_1() {
    }

    @Override
    public void run() {
        boolean bl;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        BooleanSupplier booleanSupplier = () -> atomicInteger.incrementAndGet() > 30 && ado_1.a().d();
        do {
            bl = this.a(booleanSupplier);
            atomicInteger.set(0);
            ado_1.a().e();
            ado_1.a().f();
        } while (bl);
    }

    private boolean a(BooleanSupplier booleanSupplier) {
        do {
            adt_1 adt_12;
            if ((adt_12 = this.c.poll()) == null) continue;
            try {
                adk_1.b(adt_12);
            }
            catch (Throwable throwable) {
                a.error((Object)("Error during execution of message " + adt_12), throwable);
            }
        } while (!booleanSupplier.getAsBoolean() && !this.c.isEmpty());
        return !this.c.isEmpty();
    }

    private static void b(adt_1 adt_12) {
        if (adt_12.l() == null) {
            String string = adt_12.getClass().getSimpleName();
            a.error((Object)("Destinataire invalide pour un message de type " + string + ", destinataire : null"));
            return;
        }
        try {
            adt_12.m();
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)("Exception lev\u00e9e lors de l'\u00e9x\u00e9cution d'un message (id=" + adt_12.a() + "): "), (Throwable)runtimeException);
        }
    }

    boolean a(adt_1 adt_12) {
        return this.c.offer(adt_12);
    }

    int a() {
        return this.c.size();
    }

    void b() {
        this.c.clear();
    }

    public String a(String string) {
        Object object;
        TObjectIntHashMap tObjectIntHashMap = new TObjectIntHashMap();
        TObjectLongHashMap tObjectLongHashMap = new TObjectLongHashMap();
        TObjectLongHashMap tObjectLongHashMap2 = new TObjectLongHashMap();
        TObjectLongHashMap tObjectLongHashMap3 = new TObjectLongHashMap();
        Iterator<adt_1> iterator = this.c.iterator();
        long l = System.currentTimeMillis();
        while (iterator.hasNext()) {
            object = iterator.next();
            String string2 = object.getClass().getSimpleName();
            long l2 = l - ((adt_1)object).n();
            tObjectIntHashMap.adjustOrPutValue((Object)string2, 1, 1);
            long l3 = tObjectLongHashMap.contains((Object)string2) ? tObjectLongHashMap.get((Object)string2) : l2;
            long l4 = tObjectLongHashMap2.contains((Object)string2) ? tObjectLongHashMap2.get((Object)string2) : l2;
            tObjectLongHashMap.put((Object)string2, Math.min(l3, l2));
            tObjectLongHashMap2.put((Object)string2, Math.max(l4, l2));
            tObjectLongHashMap3.adjustOrPutValue((Object)string2, l2, l2);
        }
        if (!tObjectIntHashMap.isEmpty()) {
            object = new StringBuilder();
            if (!tObjectIntHashMap.isEmpty()) {
                tObjectIntHashMap.forEachEntry((TObjectIntProcedure)new adl_2(this, (StringBuilder)object, tObjectLongHashMap, tObjectLongHashMap3, tObjectLongHashMap2, string));
            }
            return ((StringBuilder)object).toString();
        }
        return "(empty)";
    }

    public String toString() {
        return "AtomicWorker{m_messages=" + this.c.size() + "}";
    }
}

