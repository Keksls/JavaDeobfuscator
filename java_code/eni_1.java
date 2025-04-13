/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eNi
 */
public class eni_1
implements enh_1 {
    private static final Logger a = Logger.getLogger(eni_1.class);
    private final TLongObjectHashMap<enj_1> b = new TLongObjectHashMap();
    private eng_1 c = null;
    @Nullable
    private tg_0 d = null;

    @Override
    public void a(eng_1 eng_12) {
        this.c = eng_12;
    }

    @Override
    public void a(@Nullable tg_0 tg_02) {
        this.d = tg_02;
    }

    @Override
    public void a(ekl_0 ekl_02) {
        Object object;
        if (!this.c(ekl_02)) {
            return;
        }
        long l = ekl_02.B_();
        if (!this.b.containsKey(l)) {
            object = ekl_02.v();
            if (object == null) {
                a.error((Object)("Unable to create microbot for null owner. OriginalControllerId : " + l));
                return;
            }
            int n = object.a(eps_0.U) ? object.c(eps_0.U) : 3;
            this.b.put(l, (Object)new enj_1(l, n));
        }
        object = (enj_1)this.b.get(l);
        ((enj_1)object).a(ekl_02, this.d, this.c);
    }

    @Override
    public void b(ekl_0 ekl_02) {
        if (!this.c(ekl_02)) {
            return;
        }
        long l = ekl_02.B_();
        if (!this.b.containsKey(l)) {
            return;
        }
        enj_1 enj_12 = (enj_1)this.b.get(l);
        enj_12.b(ekl_02, this.d, this.c);
    }

    @Override
    @Nullable
    public enj_1 a(long l) {
        return (enj_1)this.b.get(l);
    }

    private boolean c(ekl_0 ekl_02) {
        if (ekl_02 == null) {
            a.error((Object)"Trying to handle a 'null' microbot", (Throwable)new RuntimeException());
            return false;
        }
        if (ekl_02.au() != 4) {
            a.error((Object)("Trying to handle a microbot wich is not a microbot (UserdefineID = " + ekl_02.au() + ")"), (Throwable)new RuntimeException());
            return false;
        }
        if (ekl_02.B_() == 0L) {
            a.error((Object)("Trying to handle a microbot without owner (ownerId=0) : " + ekl_02), (Throwable)new RuntimeException());
            return false;
        }
        return true;
    }
}

