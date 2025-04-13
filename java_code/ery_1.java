/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.procedure.TObjectProcedure;
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from eRY
 */
public class ery_1 {
    private static final Logger a = Logger.getLogger(ery_1.class);
    private static final int b = 20;
    private final LinkedList<esa_1> c = new LinkedList();
    private final LinkedList<esb_1> d = new LinkedList();

    public void a(esa_1 esa_12) {
        this.c.addFirst(esa_12);
        while (this.c.size() > 20) {
            this.c.removeLast();
        }
    }

    public void a(esb_1 esb_12) {
        this.d.addFirst(esb_12);
        while (this.d.size() > 20) {
            this.d.removeLast();
        }
    }

    public void a(ery_1 ery_12) {
        this.b(ery_12);
        this.c(ery_12);
    }

    private void b(ery_1 ery_12) {
        int n = ery_12.c.size();
        for (int k = 0; k < n; ++k) {
            this.a(ery_12.c.get(k));
        }
    }

    private void c(ery_1 ery_12) {
        int n = ery_12.d.size();
        for (int k = 0; k < n; ++k) {
            this.a(ery_12.d.get(k));
        }
    }

    public boolean a(TObjectProcedure<esa_1> tObjectProcedure) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            if (tObjectProcedure.execute((Object)this.c.get(k))) continue;
            return false;
        }
        return true;
    }

    public boolean b(TObjectProcedure<esb_1> tObjectProcedure) {
        int n = this.d.size();
        for (int k = 0; k < n; ++k) {
            if (tObjectProcedure.execute((Object)this.d.get(k))) continue;
            return false;
        }
        return true;
    }

    public km_0 a() {
        ko_0 ko_02 = km_0.i();
        this.c.forEach(esa_12 -> {
            kr_0 kr_02 = kp_0.m().a(esa_12.a).a(esa_12.b).a(esa_12.c()).a(esa_12.d());
            ko_02.a(kr_02);
        });
        this.d.forEach(esb_12 -> {
            kv_0 kv_02 = kt_0.j().a(esb_12.a).a(esb_12.b).b(esb_12.c());
            ko_02.a(kv_02);
        });
        return ko_02.j();
    }

    public void a(km_0 km_02) {
        km_02.b().forEach(kp_02 -> this.c.addLast(new esa_1(kp_02.c(), kp_02.f(), kp_02.h(), (short)kp_02.k())));
        km_02.e().forEach(kt_02 -> this.d.addLast(new esb_1(kt_02.c(), kt_02.f(), kt_02.h())));
    }

    public void a(byte[] byArray) {
        try {
            km_0 km_02 = km_0.a(byArray);
            this.a(km_02);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)"Unable to load history", (Throwable)invalidProtocolBufferException);
        }
    }

    public byte[] b() {
        return this.a().toByteArray();
    }

    public String toString() {
        return "GuildStorageHistory{m_itemHistory=" + this.c.size() + ", m_moneyHistory=" + this.d.size() + "}";
    }
}

