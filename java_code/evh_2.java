/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Optional;

/*
 * Renamed from eVH
 */
public class evh_2 {
    private final epq_2 a;
    private final evs_1 b;
    private final evt_1 c;

    public evh_2(epq_2 epq_22, evs_1 evs_12, evt_1 evt_12) {
        this.a = epq_22;
        this.b = evs_12;
        this.c = evt_12;
    }

    public boolean a() {
        if (this.c.i() <= 0 || this.c.j() <= 0) {
            return true;
        }
        Object r2 = eyo_1.g().d(this.c.i());
        boolean bl = ((ezr_0)r2).b(ext_1.b);
        boolean bl2 = ((ezr_0)r2).b(ext_1.u);
        if (bl) {
            return this.c();
        }
        if (bl2) {
            return this.e();
        }
        return this.d();
    }

    public boolean b() {
        long l = 0L;
        TLongHashSet tLongHashSet = euw_2.a.e(this.a.U_());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            Object t = euw_2.a.d(tLongIterator.next());
            l += ((epq_2)t).cq();
        }
        return l >= euu_2.a((faU)this.a, this.c);
    }

    private boolean c() {
        TLongHashSet tLongHashSet = euw_2.a.e(this.a.U_());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            ewt_2 ewt_22 = (ewt_2)euw_2.a.d(tLongIterator.next());
            ewx_2 ewx_22 = (ewx_2)ewt_22.a(ewl_1.a);
            Optional<ewz_2> optional = Optional.ofNullable(ewx_22.a(this.c.i()));
            if (optional.isEmpty()) {
                return false;
            }
            if (optional.get().b() >= this.c.j()) continue;
            return false;
        }
        return true;
    }

    private boolean d() {
        int n = 0;
        TLongHashSet tLongHashSet = euw_2.a.e(this.a.U_());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            Object t = euw_2.a.d(tLongIterator.next());
            exh_1 exh_12 = ((epq_2)t).dS();
            n += exh_12.h(this.c.i());
        }
        return n >= euu_2.a(this.a, this.c);
    }

    private boolean e() {
        Optional optional = ena_0.a().b(this.a.U_(), end_0.e);
        if (optional.isEmpty()) {
            return false;
        }
        evm_2 evm_22 = (evm_2)optional.get();
        return evm_22.a(this.c.i()) >= this.c.j();
    }

    public String toString() {
        return "TeleporterChecker{m_player=" + this.a + ", m_info=" + this.b + ", m_exit=" + this.c.a() + "}";
    }
}

